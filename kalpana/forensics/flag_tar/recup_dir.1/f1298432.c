ithin collections. The API also has the concept of
# aliases for collections which is typically used to access the default
# collection. While it would be possible for an application developer to use a
# snap-specific collection and mediate by object path, application developers
# are meant to instead to treat collections (typically the default collection)
# as a database of key/value attributes each with an associated secret that
# applications may query. Because AppArmor does not mediate member data,
# typical and recommended usage of the API does not allow for application
# isolation. For details, see:
# - https://standards.freedesktop.org/secret-service/ch03.html
#
dbus (receive, send)
    bus=session
    path=/org/freedesktop/secrets{,/**}
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),

dbus (receive, send)
    bus=session
    path=/org/freedesktop/secrets{,/**}
    interface=org.freedesktop.Secret.{Collection,Item,Prompt,Service,Session}
    peer=(label=unconfined),

# KWallet's client API is still in use in KDE/Plasma. It's DBus API relies upon
# member data for access to its 'folders' and 'entries' and it therefore does
# not allow for application isolation via AppArmor. For details, see:
# - https://cgit.kde.org/kdelibs.git/tree/kdeui/util/kwallet.h?h=v4.14.33
#
dbus (receive, send)
    bus=session
    path=/modules/kwalletd{,5}
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),

dbus (receive, send)
    bus=session
    path=/modules/kwalletd{,5}
    interface=org.kde.KWallet
    peer=(label=unconfined),

# Description: Allow owning a name on DBus public bus

#include <abstractions/###DBUS_ABSTRACTION###>

# register on DBus
dbus (send)
    bus=###DBUS_BUS###
    path=/org/freedesktop/DBus
    interface=org.freedesktop.DBus
    member="{Request,Release}Name"
    peer=(name=org.freedesktop.DBus, label=unconfined),

dbus (send)
    bus=###DBUS_BUS###
    path=/org/freedesktop/DBus
    interface=org.freedesktop.DBus
    member="GetConnectionUnix{ProcessID,User}"
    peer=(name=org.freedesktop.DBus, label=unconfined),

dbus (send)
    bus=###DBUS_BUS###
    path=/org/freedesktop/DBus
    interface=org.freedesktop.DBus
    member="GetConnectionCredentials"
    peer=(name=org.freedesktop.DBus, label=unconfined),

# bind to a well-known DBus name: ###DBUS_NAME###
dbus (bind)
    bus=###DBUS_BUS###
    name=###DBUS_NAME###,

# For KDE applications and some other cases, also support alternation for:
# - using org.kde.foo-PID as the 'well-known' name
# - using org.foo.cmd_<num>_<num> as the 'well-known' name
# Note, snapd does not allow declaring a 'well-known' name that ends with
# '-[0-9]+' or that contains '_'. Parallel installs of DBus services aren't
# supported at this time, but if they were, this could allow a parallel
# install'swell-known name to overlap with the normal install.
dbus (bind)
    bus=###DBUS_BUS###
    name=###DBUS_NAME###{_,-}[1-9]{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9]}{,_[1-9]{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9_]}{,[0-9]}},

# Allow us to talk to dbus-daemon
dbus (receive)
    bus=###DBUS_BUS###
    path=###DBUS_PATH###
    peer=(name=org.freedesktop.DBus, label=unconfined),
dbus (send)
    bus=###DBUS_BUS###
    path=###DBUS_PATH###
    interface=org.freedesktop.DBus.Properties
    peer=(name=org.freedesktop.DBus, label=unconfined),

# Allow us to introspect org.freedesktop.DBus (needed by pydbus)
dbus (send)
    bus=###DBUS_BUS###
    interface=org.freedesktop.DBus.Introspectable
    member=Introspect
    peer=(name=org.freedesktop.DBus, label=unconfined),

# Description: allows observing NetworkManager settings. This grants access to
# listing MAC addresses, previous networks, etc but not secrets.
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager{,/{ActiveConnection,Devices}/*}"
    interface="org.freedesktop.DBus.Properties"
    member="Get{,All}"
    peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager"
    interface="org.freedesktop.NetworkManager"
    member="GetDevices"
    peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings"
    interface="org.freedesktop.NetworkManager.Settings"
    member="ListConnections"
    peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings{,/*}"
    interface="org.freedesktop.NetworkManager.Settings{,.Connection}"
    member="GetSettings"
    peer=(label=###SLOT_SECURITY_TAGS###),

# receive signals for updated settings and properties
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager{,/{ActiveConnection,Devices}/*}"
    interface=org.freedesktop.DBus.Properties
    member=PropertiesChanged
    peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager{,/{ActiveConnection,Devices}/*}"
    interface="org.freedesktop.NetworkManger{,.*}"
    member=StateChanged
    peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager"
    interface=org.freedesktop.NetworkManger
    member="Device{Added,Removed}"
    peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings"
    interface=org.freedesktop.NetworkManger.Settings
    member=PropertiesChanged
    peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings/*"
    interface="org.freedesktop.NetworkManager.Settings.Connection"
    member=PropertiesChanged
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager{,/{ActiveConnection,Devices}/*}"
    interface="org.freedesktop.DBus.Properties"
    member="Get{,All}"
    peer=(label=###PLUG_SECURITY_TAGS###),
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager"
    interface="org.freedesktop.NetworkManager"
    member="Get{,All}Devices"
    peer=(label=###PLUG_SECURITY_TAGS###),
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings"
    interface="org.freedesktop.NetworkManager.Settings"
    member="ListConnections"
    peer=(label=###PLUG_SECURITY_TAGS###),
dbus (receive)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings/*"
    interface="org.freedesktop.NetworkManager.Settings.Connection"
    member="GetSettings"
    peer=(label=###PLUG_SECURITY_TAGS###),

# send signals for updated settings and properties from above
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager{,/{ActiveConnection,Devices}/*}"
    interface=org.freedesktop.DBus.Properties
    member=PropertiesChanged
    peer=(name=org.freedesktop.NetworkManger,label=###PLUG_SECURITY_TAGS###),
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager{,/{ActiveConnection,Devices}/*}"
    interface="org.freedesktop.NetworkManger{,.*}"
    member=StateChanged
    peer=(name=org.freedesktop.NetworkManger,label=###PLUG_SECURITY_TAGS###),
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager"
    interface=org.freedesktop.NetworkManger
    member="Device{Added,Removed}"
    peer=(name=org.freedesktop.NetworkManger,label=###PLUG_SECURITY_TAGS###),
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings"
    interface=org.freedesktop.NetworkManger.Settings
    member=PropertiesChanged
    peer=(name=org.freedesktop.NetworkManger,label=###PLUG_SECURITY_TAGS###),
dbus (send)
    bus=system
    path="/org/freedesktop/NetworkManager/Settings/*"
    interface="org.freedesktop.NetworkManager.Settings.Connection"
    member=PropertiesChanged
    peer=(name=org.freedesktop.NetworkManger,label=###PLUG_SECURITY_TAGS###),

# Description: Allow access to PackageKit service which gives
# privileged access to native package management on the system

#include <abstractions/dbus-strict>

# Allow communication with the main PackageKit end point.
dbus (receive, send)
        bus=system
        path=/org/freedesktop/PackageKit
        interface=org.freedesktop.PackageKit
        peer=(label=unconfined),
dbus (receive, send)
        bus=system
        path=/org/freedesktop/PackageKit
        interface=org.freedesktop.PackageKit.Offline
        peer=(label=unconfined),
dbus (send)
        bus=system
        path=/org/freedesktop/PackageKit
        interface=org.freedesktop.DBus.Properties
        member=Get{,All}
        peer=(label=unconfined),
dbus (receive)
        bus=system
        path=/org/freedesktop/PackageKit
        interface=org.freedesktop.DBus.Properties
        member=PropertiesChanged
        peer=(label=unconfined),
dbus (send)
	bus=system
	path=/org/freedesktop/PackageKit
	interface=org.freedesktop.DBus.Introspectable
	member=Introspect
	peer=(label=unconfined),

# Allow communication with PackageKit transactions.  Transactions are
# exported with random object paths that currently take the form
# "/{number}_{hexstring}".  If PackageKit (or a reimplementation of
# packagekitd) changes this, then these rules will need to change too.
dbus (receive, send)
        bus=system
        path=/[0-9]*_[0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f]
        interface=org.freedesktop.PackageKit.Transaction
        peer=(label=unconfined),
dbus (send)
        bus=system
        path=/[0-9]*_[0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f]
        interface=org.freedesktop.DBus.Properties
        member=Get{,All}
        peer=(label=unconfined),
dbus (receive)
        bus=system
        path=/[0-9]*_[0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f]
        interface=org.freedesktop.DBus.Properties
        member=PropertiesChanged
        peer=(label=unconfined),
dbus (send)
	bus=system
        path=/[0-9]*_[0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f]
	interface=org.freedesktop.DBus.Introspectable
	member=Introspect
	peer=(label=unconfined),

# Description: Allow operating as the ofono service. This gives privileged
# access to the system.

# to create ppp network interfaces
capability net_admin,

# To check present devices
/run/udev/data/+usb:* r,
/run/udev/data/+usb-serial:* r,
/run/udev/data/+pci:* r,
/run/udev/data/+platform:* r,
/run/udev/data/+pnp:* r,
/run/udev/data/c* r,
/run/udev/data/n* r,
/sys/bus/usb/devices/ r,
# FIXME snapd should be querying udev and adding the /sys and /run/udev accesses
# that are assigned to the snap, but we are not there yet.
/sys/bus/usb/devices/** r,

# To get current seat, used to know user preferences like default SIM in
# multi-SIM devices.
/run/systemd/seats/{,*} r,

# Access to modem ports
# FIXME snapd should be more dynamic to avoid conflicts between snaps trying to
# access same ports.
/dev/tty[^0-9]* rw,
/dev/cdc-* rw,
/dev/modem* rw,
/dev/dsp rw,
/dev/chnlat11 rw,
/dev/socket/rild* rw,
# ofono puts ppp on top of the tun device
/dev/net/tun rw,

network netlink raw,
network netlink dgram,
network bridge,
network inet,
network inet6,
network packet,
network bluetooth,

include <abstractions/nameservice>
/run/systemd/resolve/stub-resolv.conf r,

# DBus accesses
include <abstractions/dbus-strict>

# systemd-resolved (not yet included in nameservice abstraction)
#
# Allow access to the safe members of the systemd-resolved D-Bus API:
#
#   https://www.freedesktop.org/wiki/Software/systemd/resolved/
#
# This API may be used directly over the D-Bus system bus or it may be used
# indirectly via the nss-resolve plugin:
#
#   https://www.freedesktop.org/software/systemd/man/nss-resolve.html
#
dbus send
     bus=system
     path="/org/freedesktop/resolve1"
     interface="org.freedesktop.resolve1.Manager"
     member="Resolve{Address,Hostname,Record,Service}"
     peer=(name="org.freedesktop.resolve1"),

dbus (send)
    bus=system
    path=/org/freedesktop/DBus
    interface=org.freedesktop.DBus
    member={Request,Release}Name
    peer=(name=org.freedesktop.DBus, label=unconfined),

# Allow binding the service to the requested connection name
dbus (bind)
    bus=system
    name="org.ofono",

# Allow traffic to/from our path and interface with any method for unconfined
# clients to talk to our ofono services.
dbus (receive, send)
    bus=system
    path=/{,**}
    interface=org.ofono.*
    peer=(label=unconfined),

# Description: Can access the download manager.

#include <abstractions/dbus-session-strict>

# allow communicating with download-manager service
dbus (send)
     bus=session
     interface="org.freedesktop.DBus.Introspectable"
     path=/
     member=Introspect
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
     bus=session
     interface="org.freedesktop.DBus.Introspectable"
     path=/com/canonical/applications/download/**
     member=Introspect
     peer=(label=###SLOT_SECURITY_TAGS###),
# Allow DownloadManager to send us signals, etc
dbus (receive)
     bus=session
     interface=com.canonical.applications.Download{,er}Manager
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive, send)
     bus=session
     path=/com/canonical/applications/download/@{PROFILE_DBUS}/**
     interface=com.canonical.applications.Download
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive)
     bus=session
     path=/com/canonical/applications/download/@{PROFILE_DBUS}/**
     interface=org.freedesktop.DBus.Properties
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive, send)
     bus=session
     path=/com/canonical/applications/download/@{PROFILE_DBUS}/**
     interface=com.canonical.applications.GroupDownload
     peer=(label=###SLOT_SECURITY_TAGS###),
# Be explicit about the allowed members we can send to
dbus (send)
     bus=session
     path=/
     interface=com.canonical.applications.DownloadManager
     member=createDownload
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
     bus=session
     path=/
     interface=com.canonical.applications.DownloadManager
     member=createDownloadGroup
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (receive, send)
     bus=session
     path=/
     interface=com.canonical.applications.DownloadManager
     member=getAllDownloads
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
     bus=session
     path=/
     interface=com.canonical.applications.DownloadManager
     member=getAllDownloadsWithMetadata
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
     bus=session
     path=/
     interface=com.canonical.applications.DownloadManager
     member=defaultThrottle
     peer=(label=###SLOT_SECURITY_TAGS###),
dbus (send)
     bus=session
     path=/
     interface=com.canonical.applications.DownloadManager
     member=isGSMDownloadAllowed
     peer=(label=###SLOT_SECURITY_TAGS###),
type: account-key
authority-id: canonical
public-key-sha3-384: d-JcZF9nD9eBw7bwMnH61x-bklnQOhQud1Is6o_cn2wTj8EYDi9musrIT9z2MdAa
account-id: generic
name: models
since: 2017-07-27T00:00:00.0Z
body-length: 717
sign-key-sha3-384: -CvQKAwRQ5h3Ffn10FILJoEZUXOv6km9FwA80-Rcj-f-6jadQ89VRswHNiEB9Lxk

AcbBTQRWhcGAARAAoRakbLAMMoPeMz5MLCzAR6ALu/xxP9PuCdkknHH5lJrKE2adFj22DMwjWKj6
0pZU1Ushv4r7eb1NmFfl7a6Pz5ert+O5Qt53feK30+yiZF+Pgsx46SVTGy8QvicxhDhChdJ7ugW2
Vbz8dXDT9gv1E5hLl2BiuxxZHtMMTitO3bCtQcM/YwUeFljZZYd1FwxtgolnA5IUcHomIEQ5Xw6X
dCYGNkVjenb8aLBfi/ZZ84LHQjSbo3b87KP7syeEH2uuFJ2W8ZwGfUCll84gF+lYiLO6BQk8psIR
aRqnPfdjeuYg0ZLhdNV2Gu6GTNYMSrGLJ4vafAoIoMOifeIfK/DjN0XpfUIYwrM3UIvssEaLyE0L
i30PN5bpmmyfj5EDkJj9DqHzBly1kc20ciEtVCwOUijhQr4UjjfPiJFyed1/yndY1z/L85iATcsb
mwAw/wOyHKge/mlVztXV2H8DywcLV8Kbo5/ZZzcdKhDgL9URosQ5bMeYDPWwPsS02exHFl150dpR
p6MmeSCFPiQQjDrM3nWXLv/uemBE1IgX5q2eW6kJbSvRn519O3OrFEs2NBMEgvE3mIvewNlxFbDj
96Oj54Zh3rVtYu/g9yo2Bb2uf9gpOGS6TxrqN3aP5FigZzxkMCGFG8UOOFI7k2eQjMd8va5V8JTZ
ijWZgBjDB1YuQ1MAEQEAAQ==

AcLDXAQAAQoABgUCWYuUigAKCRDUpVvql9g3IOobH/wLm7sfLu3A/QWrdrMB1xRe6JOKuOQoNEt0
Vhg8q4MgOt1mxPzBUMGBJCcq9EiTYaUT4eDXSJL1OKFgh42oK5uY+GLsPWamxBY1Rg6QoESjJPcS
2niwTOjjTdpIrZ5M3pKRmxTxT+Wsq9j+1t4jvy/baI6+uO6KQh0UIMyOEhG+uJ8aJ2OcF3uV5gtF
fL1Y4Jr1Ir/4B2K7s8OhlrO1Yw3woB+YIkOjJ6oAOfQx5B/p1vK4uXOCIZarcfYX4XOhNgvPGaeL
O+NHk3GwTmEBngs49E8zq8ii8OoqIT6YzUd4taqHvZD4inTlw6MKGld7myCbZVZ3b0NXosplwYXa
jVL9ZBWTJukcIs4jEJ0XkTEuwvOpiGbtXdmDDlOSYkhZQdmQn3CIveGLRFa6pCi9a/jstyB+4sgk
MnwmJxEg8L3i1OvjgUM8uexCfg4cBVP9fCKuaC26uAXUiiHz7mIZhVSlLXHgUgMn5jekluPndgRZ
D2mGG0WscTMTb9uOpbLo6BWCwM7rGaZQgVSZsIj1cise05fjGpOozeqDhG25obcUXxhIUStztc9t
Z9MwSz9xdsUqV8XztEhkgfc7dh2fPWluiE9hLrdzyoU1xE6syujm8HE+bIJnDFYoE/Kw6WqIEm/3
mWhnOmi9uZsMBErKZKO4sqcLfR/zIn2Lx0ivg/yZzHHnDY5hwdrhQtn+AHCb+QJ9AJVte9hI+kt+
Fv8neohiMTCY8XxjrdB3QBPGesVsIMI5zAd14X4MqNKBYb4Ucg8YCIj7WLkQHbHO1GQwhPY8Tl9u
QqysZo/WnLVuvaruEBsBBGUJ7Ju5GtFKdWMdoH3YQmYHdxxxK37NPqBY70OrTSFJU5QT6PGFSvif
aMDg0X/aRj2uE3vgTI5hdqI4JYv1Mt1gYOPv4AMx/o/2q9dVENFYMTXcYBITMScUVV8NzmH8SNge
w7AWUPlQvWGZbTz62lYXHuUX1cdzz37B0LrEjh1ZC1V8emzfkLzEFYP/qUk1c4NjKsTjj5d463Gq
cn31Mr83tt5l7HWwP8bvTMIj98bOIJapsncGOzPYhs8cjZeOy0Q7EcvHjGRrj26CGWZacT3f0A0e
kb66ocAxV4nH1FDsfn8KdLKFgmSmW6SXkD2nqY94/pommJzUBF6s54DijZMXqHRwIRyPA8ymrCGt
t4shJh7dobC8Tg6RA84Bf9HkeqI97PQYFYMuNX0U59x2s0IQsOAYjH53NIf/jSPC4GDvLs7k+O76
R2PJK1VN6/ckJZAb3Rum5Ak5sbLTpRAVHIAVU1NAjHc5lYUHhxXJmJsbw6Jawb9Xb3T96s+WdD3Y
062upMY95pr0ZPf1tVGgzpcVCEw7yAOw+SkMksx+

# Description: Can set time and date via systemd' timedated D-Bus interface.
# Can read all properties of /org/freedesktop/timedate1 D-Bus object; see
# https://www.freedesktop.org/wiki/Software/systemd/timedated/; This also
# gives full access to the RTC device nodes and relevant parts of sysfs.

#include <abstractions/dbus-strict>

# Introspection of org.freedesktop.timedate1
# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/timedate1
    interface=org.freedesktop.DBus.Introspectable
    member=Introspect,

dbus (send)
    bus=system
    path=/org/freedesktop/timedate1
    interface=org.freedesktop.timedate1
    member="Set{Time,LocalRTC}"
    peer=(label=unconfined),

# Read all properties from timedate1
# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/timedate1
    interface=org.freedesktop.DBus.Properties
    member=Get{,All},

# Receive timedate1 property changed events
dbus (receive)
    bus=system
    path=/org/freedesktop/timedate1
    interface=org.freedesktop.DBus.Properties
    member=PropertiesChanged
    peer=(label=unconfined),

# As the core snap ships the timedatectl utility we can also allow
# clients to use it now that they have access to the relevant
# D-Bus methods for setting the time via timedatectl's set-time and
# set-local-rtc commands.
/usr/bin/timedatectl{,.real} ixr,

# Silence this noisy denial. systemd utilities look at /proc/1/environ to see
# if running in a container, but they will fallback gracefully. No other
# interfaces allow this denial, so no problems with silencing it for now. Note
# that allowing this triggers a 'ptrace trace peer=unconfined' denial, which we
# want to avoid.
deny @{PROC}/1/environ r,

# Allow write access to system real-time clock
# See 'man 4 rtc' for details.

capability sys_time,

/dev/rtc[0-9]* rw,

# Access to the sysfs nodes are needed by rtcwake for example
# to program scheduled wakeups in the future.
/sys/class/rtc/*/ rw,
/sys/class/rtc/*/** rw,

# As the core snap ships the hwclock utility we can also allow
# clients to use it now that they have access to the relevant
# device nodes. Note: some invocations of hwclock will try to
# write to the audit subsystem. We omit 'capability audit_write'
# and 'capability net_admin' here. Applications requiring audit
# logging should plug 'netlink-audit'.
/sbin/hwclock ixr,

# Description: Can query network status information. This is restricted because
# it gives privileged read-only access to networking information and should
# only be used with trusted apps.

# network-observe can't allow this otherwise we are basically network-control,
# but don't explicitly deny since someone might try to use network-control with
# network-observe and that shouldn't fail weirdly
#capability net_admin,

#include <abstractions/nameservice>
/run/systemd/resolve/stub-resolv.conf r,

# systemd-resolved (not yet included in nameservice abstraction)
#
# Allow access to the safe members of the systemd-resolved D-Bus API:
#
#   https://www.freedesktop.org/wiki/Software/systemd/resolved/
#
# This API may be used directly over the D-Bus system bus or it may be used
# indirectly via the nss-resolve plugin:
#
#   https://www.freedesktop.org/software/systemd/man/nss-resolve.html
#
#include <abstractions/dbus-strict>
dbus send
     bus=system
     path="/org/freedesktop/resolve1"
     interface="org.freedesktop.resolve1.Manager"
     member="Resolve{Address,Hostname,Record,Service}"
     peer=(name="org.freedesktop.resolve1"),

#include <abstractions/ssl_certs>

# see loaded kernel modules
@{PROC}/modules r,

@{PROC}/@{pid}/net/ r,
@{PROC}/@{pid}/net/** r,

# used by sysctl, et al (sysctl net)
@{PROC}/sys/ r,
@{PROC}/sys/net/ r,
@{PROC}/sys/net/core/ r,
@{PROC}/sys/net/core/** r,
@{PROC}/sys/net/ipv{4,6}/ r,
@{PROC}/sys/net/ipv{4,6}/** r,
@{PROC}/sys/net/netfilter/ r,
@{PROC}/sys/net/netfilter/** r,
@{PROC}/sys/net/nf_conntrack_max r,

# networking tools
/{,usr/}{,s}bin/arp ixr,
/{,usr/}{,s}bin/bridge ixr,
/{,usr/}{,s}bin/ifconfig ixr,
/{,usr/}{,s}bin/ip ixr,
/{,usr/}{,s}bin/ipmaddr ixr,
/{,usr/}{,s}bin/iptunnel ixr,
/{,usr/}{,s}bin/netstat ixr,   # -p not supported
/{,usr/}{,s}bin/nstat ixr,     # allows zeroing
#/{,usr/}{,s}bin/pppstats ixr,  # needs sys_module
/{,usr/}{,s}bin/route ixr,
/{,usr/}{,s}bin/routel ixr,
/{,usr/}{,s}bin/rtacct ixr,
/{,usr/}{,s}bin/ss ixr,
/{,usr/}{,s}bin/sysctl ixr,
/{,usr/}{,s}bin/tc ixr,

# arp
network netlink dgram,

# ip, et al
/etc/iproute2/{,**} r,

# ping - child profile would be nice but seccomp causes problems with that
/{,usr/}{,s}bin/ping ixr,
/{,usr/}{,s}bin/ping6 ixr,
capability net_raw,
capability setuid,
network inet raw,
network inet6 raw,

# route
/etc/networks r,
/etc/ethers r,

/etc/rpc r,

# network devices
/sys/devices/**/net/** r,

# for receiving kobject_uevent() net messages from the kernel
network netlink raw,

# Description: Allow operating as the bluez service. This gives privileged
# access to the system.

network bluetooth,

capability net_admin,
capability net_bind_service,

# libudev
network netlink raw,

# File accesses
/sys/bus/usb/drivers/btusb/     r,
/sys/bus/usb/drivers/btusb/**   r,
/sys/class/bluetooth/           r,
/sys/devices/**/bluetooth/      rw,
/sys/devices/**/bluetooth/**    rw,
/sys/devices/**/id/chassis_type r,

# TODO: use snappy hardware assignment for this once LP: #1498917 is fixed
/dev/rfkill rw,

# DBus accesses
#include <abstractions/dbus-strict>
dbus (send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member={Request,Release}Name
   peer=(name=org.freedesktop.DBus, label=unconfined),

dbus (send)
  bus=system
  path=/org/freedesktop/*
  interface=org.freedesktop.DBus.Properties
  peer=(label=unconfined),

# Allow binding the service to the requested connection name
dbus (bind)
    bus=system
    name="org.bluez",

# Allow binding the service to the requested connection name
dbus (bind)
    bus=system
    name="org.bluez.obex",

# Allow binding the service to the requested connection name
dbus (bind)
    bus=system
    name="org.bluez.mesh",

# Allow traffic to/from our interface with any method for unconfined clients
# to talk to our bluez services. For the org.bluez interface we don't specify
# an Object Path since according to the bluez specification these can be
# anything (https://git.kernel.org/pub/scm/bluetooth/bluez.git/tree/doc).
dbus (receive, send)
    bus=system
    interface=org.bluez.*
    peer=(label=unconfined),
dbus (receive, send)
    bus=system
    path=/org/bluez{,/**}
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),

# Allow traffic to/from org.freedesktop.DBus for bluez service. This rule is
# not snap-specific and grants privileged access to the org.freedesktop.DBus
# on the system bus.
dbus (receive, send)
    bus=system
    path=/
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),

# Allow access to hostname system service
dbus (receive, send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.DBus.Properties
    peer=(label=unconfined),

# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.DBus.Properties
    member="Get{,All}",
dbus (send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.DBus.Introspectable
    member=Introspect,

## Concatenation of all ofono udev rules (plugins/*.rules in ofono sources)
## Note that ofono uses this for very few modems and that in most cases it finds
## modems by checking directly in code udev events, so changes here will be rare

## plugins/ofono.rules
# do not edit this file, it will be overwritten on update

ACTION!="add|change", GOTO="ofono_end"

# ISI/Phonet drivers
SUBSYSTEM!="net", GOTO="ofono_isi_end"
ATTRS{type}!="820", GOTO="ofono_isi_end"
KERNELS=="gadget", GOTO="ofono_isi_end"

# Nokia N900 modem
SUBSYSTEMS=="hsi", ENV{OFONO_DRIVER}="n900", ENV{OFONO_ISI_ADDRESS}="108"
KERNEL=="phonet*", ENV{OFONO_DRIVER}="n900", ENV{OFONO_ISI_ADDRESS}="108"

# STE u8500
KERNEL=="shrm0", ENV{OFONO_DRIVER}="u8500"

LABEL="ofono_isi_end"

SUBSYSTEM!="usb", GOTO="ofono_end"
ENV{DEVTYPE}!="usb_device", GOTO="ofono_end"

# Ignore fake serial number
ATTRS{serial}=="1234567890ABCDEF", ENV{ID_SERIAL_SHORT}=""

# Nokia CDMA Device
ATTRS{idVendor}=="0421", ATTRS{idProduct}=="023e", ENV{OFONO_DRIVER}="nokiacdma"
ATTRS{idVendor}=="0421", ATTRS{idProduct}=="00b6", ENV{OFONO_DRIVER}="nokiacdma"

# Lenovo H5321gw 0bdb:1926
ATTRS{idVendor}=="0bdb", ATTRS{idProduct}=="1926", ENV{OFONO_DRIVER}="mbm"

LABEL="ofono_end"

## plugins/ofono-speedup.rules
# do not edit this file, it will be overwritten on update

ACTION!="add|change", GOTO="ofono_speedup_end"

SUBSYSTEM!="tty", GOTO="ofono_speedup_end"
KERNEL!="ttyUSB[0-9]*", GOTO="ofono_speedup_end"

# SpeedUp 7300
ATTRS{idVendor}=="1c9e", ATTRS{idProduct}=="9e00", ENV{ID_USB_INTERFACE_NUM}=="00", ENV{OFONO_LABEL}="modem"
ATTRS{idVendor}=="1c9e", ATTRS{idProduct}=="9e00", ENV{ID_USB_INTERFACE_NUM}=="03", ENV{OFONO_LABEL}="aux"

# SpeedUp
ATTRS{idVendor}=="2020", ATTRS{idProduct}=="1005", ENV{ID_USB_INTERFACE_NUM}=="03", ENV{OFONO_LABEL}="modem"
ATTRS{idVendor}=="2020", ATTRS{idProduct}=="1005", ENV{ID_USB_INTERFACE_NUM}=="01", ENV{OFONO_LABEL}="aux"

ATTRS{idVendor}=="2020", ATTRS{idProduct}=="1008", ENV{ID_USB_INTERFACE_NUM}=="03", ENV{OFONO_LABEL}="modem"
ATTRS{idVendor}=="2020", ATTRS{idProduct}=="1008", ENV{ID_USB_INTERFACE_NUM}=="01", ENV{OFONO_LABEL}="aux"

# SpeedUp 9800
ATTRS{idVendor}=="1c9e", ATTRS{idProduct}=="9800", ENV{ID_USB_INTERFACE_NUM}=="01", ENV{OFONO_LABEL}="modem"
ATTRS{idVendor}=="1c9e", ATTRS{idProduct}=="9800", ENV{ID_USB_INTERFACE_NUM}=="02", ENV{OFONO_LABEL}="aux"

# SpeedUp U3501
ATTRS{idVendor}=="1c9e", ATTRS{idProduct}=="9605", ENV{ID_USB_INTERFACE_NUM}=="03", ENV{OFONO_LABEL}="modem"
ATTRS{idVendor}=="1c9e", ATTRS{idProduct}=="9605", ENV{ID_USB_INTERFACE_NUM}=="01", ENV{OFONO_LABEL}="aux"

LABEL="ofono_speedup_end"

# Description: Can run a FUSE filesystem. Unprivileged fuse mounts are
# not supported at this time.

# Allow communicating with fuse kernel driver
# https://www.kernel.org/doc/Documentation/filesystems/fuse.txt
/dev/fuse rw,

# Required for mounts
capability sys_admin,

# Allow mounts to our snap-specific writable directories
# Note 1: fstype is 'fuse.<command>', eg 'fuse.sshfs'
# Note 2: due to LP: #1612393 - @{HOME} can't be used in mountpoint
# Note 3: local fuse mounts of filesystem directories are mediated by
#         AppArmor. The actual underlying file in the source directory is
#         mediated, not the presentation layer of the target directory, so
#         we can safely allow all local mounts to our snap-specific writable
#         directories.
# Note 4: fuse supports a lot of different mount options, and applications
#         are not obligated to use fusermount to mount fuse filesystems, so
#         be very strict and only support the default (rw,nosuid,nodev) and
#         read-only.
#
# parallel-installs: SNAP_USER_{DATA,COMMON} are not remapped, need to use SNAP_INSTANCE_NAME
mount fstype=fuse.* options=(ro,nosuid,nodev) ** -> /home/*/snap/@{SNAP_INSTANCE_NAME}/@{SNAP_REVISION}/{,**/},
mount fstype=fuse.* options=(rw,nosuid,nodev) ** -> /home/*/snap/@{SNAP_INSTANCE_NAME}/@{SNAP_REVISION}/{,**/},
mount fstype=fuse.* options=(ro,nosuid,nodev) ** -> /home/*/snap/@{SNAP_INSTANCE_NAME}/common/{,**/},
mount fstype=fuse.* options=(rw,nosuid,nodev) ** -> /home/*/snap/@{SNAP_INSTANCE_NAME}/common/{,**/},
# parallel-installs: SNAP_{DATA,COMMON} are remapped, use SNAP_NAME instead, for
# completeness allow SNAP_INSTANCE_NAME too
mount fstype=fuse.* options=(ro,nosuid,nodev) ** -> /var/snap/{@{SNAP_NAME},@{SNAP_INSTANCE_NAME}}/@{SNAP_REVISION}/{,**/},
mount fstype=fuse.* options=(rw,nosuid,nodev) ** -> /var/snap/{@{SNAP_NAME},@{SNAP_INSTANCE_NAME}}/@{SNAP_REVISION}/{,**/},
mount fstype=fuse.* options=(ro,nosuid,nodev) ** -> /var/snap/{@{SNAP_NAME},@{SNAP_INSTANCE_NAME}}/common/{,**/},
mount fstype=fuse.* options=(rw,nosuid,nodev) ** -> /var/snap/{@{SNAP_NAME},@{SNAP_INSTANCE_NAME}}/common/{,**/},

# Explicitly deny reads to /etc/fuse.conf. We do this to ensure that
# the safe defaults of fuse are used (which are enforced by our mount
# rules) and not system-specific options from /etc/fuse.conf that
# may conflict with our mount rules.
deny /etc/fuse.conf r,

# Allow read access to the fuse filesystem
/sys/fs/fuse/ r,
/sys/fs/fuse/** r,

# Unprivileged fuser mounts must use the setuid helper in the core snap
# (not currently available, so don't include in policy at this time).
#/{,usr/}bin/fusermount ixr,

# Description: Allow operating as the avahi service. This gives
# privileged access to the system.
#include <abstractions/dbus-strict>

# Allow all access to Avahi service

dbus (receive)
    bus=system
    path=/
    interface=org.freedesktop.DBus.Peer
    member=Ping
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (receive)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.Server
    member=StateChanged
    peer=(label=###PLUG_SECURITY_TAGS###),

# address resolving
dbus (receive)
    bus=system
    path=/Client*/AddressResolver*
    interface=org.freedesktop.Avahi.AddressResolver
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.AddressResolver
    peer=(name=org.freedesktop.Avahi, label=###PLUG_SECURITY_TAGS###),

# host name resolving
dbus (receive)
    bus=system
    path=/Client*/HostNameResolver*
    interface=org.freedesktop.Avahi.HostNameResolver
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.HostNameResolver
    peer=(label=###PLUG_SECURITY_TAGS###),

# service resolving
dbus (receive)
    bus=system
    path=/Client*/ServiceResolver*
    interface=org.freedesktop.Avahi.ServiceResolver
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.ServiceResolver
    peer=(label=###PLUG_SECURITY_TAGS###),

# domain browsing
dbus (receive)
    bus=system
    path=/Client*/DomainBrowser*
    interface=org.freedesktop.Avahi.DomainBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.DomainBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

# record browsing
dbus (receive)
    bus=system
    path=/Client*/RecordBrowser*
    interface=org.freedesktop.Avahi.RecordBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.RecordBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

# service browsing
dbus (receive)
    bus=system
    path=/Client*/ServiceBrowser*
    interface=org.freedesktop.Avahi.ServiceBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.ServiceBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

# service type browsing
dbus (receive)
    bus=system
    path=/Client*/ServiceTypeBrowser*
    interface=org.freedesktop.Avahi.ServiceTypeBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    interface=org.freedesktop.Avahi.ServiceTypeBrowser
    peer=(label=###PLUG_SECURITY_TAGS###),

# Description: Allow using location service. This gives privileged access to
# the service.

#include <abstractions/dbus-strict>

# Allow clients to query service properties
dbus (send)
    bus=system
    path=/com/ubuntu/location/Service
    interface=org.freedesktop.DBus.Properties
    member=Get
    peer=(label=###SLOT_SECURITY_TAGS###),

# Allow clients to create a session
dbus (send)
    bus=system
    path=/com/ubuntu/location/Service
    interface=com.ubuntu.location.Service
    member=CreateSessionForCriteria
    peer=(label=###SLOT_SECURITY_TAGS###),

# Allow clients to request starting/stopping updates
dbus (send)
    bus=system
    path=/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}PositionUpdates"
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}HeadingUpdates"
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}VelocityUpdates"
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/com/ubuntu/location/Service/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}PositionUpdates"
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/com/ubuntu/location/Service/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}HeadingUpdates"
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/com/ubuntu/location/Service/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}VelocityUpdates"
    peer=(label=###SLOT_SECURITY_TAGS###),

# Allow clients to receive updates from the service
dbus (receive)
    bus=system
    path=/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="Update{Position,Heading,Velocity}"
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    path=/com/ubuntu/location/Service/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="Update{Position,Heading,Velocity}"
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (receive)
   bus=system
   path=/com/ubuntu/location/Service
   interface=org.freedesktop.DBus.Properties
   member=PropertiesChanged
   peer=(label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    path=/
    interface=org.freedesktop.DBus.ObjectManager
    peer=(label=unconfined),

# Allow clients to introspect the service
dbus (send)
    bus=system
    path=/com/ubuntu/location/Service
    interface=org.freedesktop.DBus.Introspectable
    member=Introspect
    peer=(label=###SLOT_SECURITY_TAGS###),

# Description: Allow operating as the ModemManager service. This gives
# privileged access to the system.

# To check present devices
network netlink raw,
/run/udev/data/* r,
/sys/bus/usb/devices/ r,
# FIXME snapd should be querying udev and adding the /sys and /run/udev accesses
# that are assigned to the snap, but we are not there yet.
/sys/bus/usb/devices/** r,

# Access to modem ports
# FIXME snapd should be more dynamic to avoid conflicts between snaps trying to
# access same ports.
/dev/tty[^0-9]* rw,
/dev/cdc-* rw,

# For ioctl TIOCSSERIAL ASYNC_CLOSING_WAIT_NONE
capability sys_admin,

# For {mbim,qmi}-proxy
unix (bind, listen) type=stream addr="@{mbim,qmi}-proxy",
/sys/devices/**/usb**/{descriptors,manufacturer,product} r,
# See https://www.kernel.org/doc/Documentation/ABI/testing/sysfs-class-net-qmi
/sys/devices/**/net/*/qmi/* rw,

include <abstractions/nameservice>
/run/systemd/resolve/stub-resolv.conf r,

# DBus accesses
include <abstractions/dbus-strict>

# systemd-resolved (not yet included in nameservice abstraction)
#
# Allow access to the safe members of the systemd-resolved D-Bus API:
#
#   https://www.freedesktop.org/wiki/Software/systemd/resolved/
#
# This API may be used directly over the D-Bus system bus or it may be used
# indirectly via the nss-resolve plugin:
#
#   https://www.freedesktop.org/software/systemd/man/nss-resolve.html
#
dbus send
     bus=system
     path="/org/freedesktop/resolve1"
     interface="org.freedesktop.resolve1.Manager"
     member="Resolve{Address,Hostname,Record,Service}"
     peer=(name="org.freedesktop.resolve1"),

dbus (send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member={Request,Release}Name
   peer=(name=org.freedesktop.DBus, label=unconfined),

# Allow binding the service to the requested connection name
dbus (bind)
    bus=system
    name="org.freedesktop.ModemManager1",

# Allow traffic to/from our path and interface with any method for unconfined
# clients to talk to our modem-manager services.
dbus (receive, send)
    bus=system
    path=/org/freedesktop/ModemManager1{,/**}
    interface=org.freedesktop.ModemManager1*
    peer=(label=unconfined),
dbus (receive, send)
    bus=system
    path=/org/freedesktop/ModemManager1{,/**}
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),

# Allow accessing logind services to properly shutdown devices on suspend
dbus (receive)
    bus=system
    path=/org/freedesktop/login1
    interface=org.freedesktop.login1.Manager
    member={PrepareForSleep,SessionNew,SessionRemoved}
    peer=(label=unconfined),
# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/login1
    interface=org.freedesktop.login1.Manager
    member=Inhibit,

# Description: Can access various APIs needed by modern browsers (eg, Google
# Chrome/Chromium and Mozilla) and file paths they expect. This interface is
# transitional and is only in place while upstream's work to change their paths
# and snappy is updated to properly mediate the APIs.

# This allows raising the OOM score of other processes owned by the user.
owner @{PROC}/@{pid}/oom_score_adj rw,

# Chrome/Chromium should be fixed to honor TMPDIR or the snap packaging
# adjusted to use LD_PRELOAD technique from LP: #1577514
/var/tmp/ r,
owner /var/tmp/etilqs_* rw,

# Chrome/Chromium should be modified to use snap.$SNAP_INSTANCE_NAME.* or
# the snap packaging adjusted to use LD_PRELOAD technique from LP: #1577514
owner /{dev,run}/shm/{,.}org.chromium.* mrw,
owner /{dev,run}/shm/{,.}com.google.Chrome.* mrw,
owner /{dev,run}/shm/.io.nwjs.* mrw,

# Chrome's Singleton API sometimes causes an ouid/fsuid mismatch denial, so
# for now, allow non-owner read on the singleton socket (LP: #1731012). See
# https://forum.snapcraft.io/t/electron-snap-killed-when-using-app-makesingleinstance-api/2667/20
# parallel-installs: $XDG_RUNTIME_DIR is not remapped, need to use SNAP_INSTANCE_NAME
/run/user/[0-9]*/snap.@{SNAP_INSTANCE_NAME}/{,.}org.chromium.*/SS r,
/run/user/[0-9]*/snap.@{SNAP_INSTANCE_NAME}/{,.}com.google.Chrome.*/SS r,

# Allow reading platform files
/run/udev/data/+platform:* r,

# miscellaneous accesses
@{PROC}/vmstat r,

# Chromium content api sometimes queries about huge pages. Allow status of
# hugepages and transparent_hugepage, but not the pages themselves.
/sys/kernel/mm/{hugepages,transparent_hugepage}/{,**} r,

# Chromium content api in gnome-shell reads this
/etc/opt/chrome/{,**} r,
/etc/chromium/{,**} r,

# Chrome/Chromium should be adjusted to not use gconf. It is only used with
# legacy systems that don't have snapd
deny dbus (send)
    bus=session
    interface="org.gnome.GConf.Server",

# webbrowser-app/webapp-container tries to read this file to determine if it is
# confined or not, so explicitly deny to avoid noise in the logs.
deny @{PROC}/@{pid}/attr/current r,

# This is an information leak but disallowing it leads to developer confusion
# when using the chromium content api file chooser due to a (harmless) glib
# warning and the noisy AppArmor denial.
owner @{PROC}/@{pid}/mounts r,
owner @{PROC}/@{pid}/mountinfo r,

# Since snapd still uses SECCOMP_RET_KILL, we have added a workaround rule to
# allow mknod on character devices since chromium unconditionally performs
# a mknod() to create the /dev/nvidiactl device, regardless of if it exists or
# not or if the process has CAP_MKNOD or not. Since we don't want to actually
# grant the ability to create character devices, explicitly deny the
# capability. When snapd uses SECCOMP_RET_ERRNO, we can remove this rule.
# https://forum.snapcraft.io/t/call-for-testing-chromium-62-0-3202-62/2569/46
deny capability mknod,

# Description: Allow access to Evolution Data Service for calendars

#include <abstractions/dbus-session-strict>

# Allow use of ObjectManager APIs, used to enumerate sources
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.ObjectManager
	path=/org/gnome/evolution/dataserver{,/**}
	peer=(label=unconfined),

# Allow access to properties on sources
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/Calendar{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/CalendarFactory
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/CalendarView{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/Subprocess{,/**}
	peer=(label=unconfined),
# Allow access to methods
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.Calendar
	path=/org/gnome/evolution/dataserver/{Subprocess,Calendar}{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.CalendarFactory
	path=/org/gnome/evolution/dataserver/CalendarFactory
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.CalendarView
	path=/org/gnome/evolution/dataserver/CalendarView{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.Source
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.Source.Removable
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.SourceManager
	path=/org/gnome/evolution/dataserver/SourceManager
	peer=(label=unconfined),

# Allow clients to introspect the service
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/Calendar{,/**}
	member=Introspect
	peer=(label=unconfined),
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/CalendarFactory
	member=Introspect
	peer=(label=unconfined),
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/CalendarView{,/**}
	member=Introspect
	peer=(label=unconfined),
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	member=Introspect
	peer=(label=unconfined),

# Description: Can query system status information. This is restricted because
# it gives privileged read access to all processes on the system and should
# only be used with trusted apps.

# Needed by 'ps'
@{PROC}/tty/drivers r,

# This ptrace is an information leak. Intentionlly omit 'ptrace (trace)' here
# since since ps doesn't actually need to trace other processes. Note this
# allows a number of accesses (assuming the associated /proc file is allowed),
# such as various memory address locations and esp/eip via /proc/*/stat,
# /proc/*/mem, /proc/*/personality, /proc/*/stack, /proc/*/syscall,
# /proc/*/timerslack_ns and /proc/*/wchan (see man proc).
#
# Some files like /proc/kallsyms (but anything using %pK format specifier) need
# 'capability syslog' when /proc/sys/kernel/kptr_restrict=1, but we
# intentionally do not allow since it could be used to defeat KASLR.
ptrace (read),

# Other miscellaneous accesses for observing the system
@{PROC}/locks r,
@{PROC}/modules r,
@{PROC}/stat r,
@{PROC}/vmstat r,
@{PROC}/diskstats r,
@{PROC}/kallsyms r,
@{PROC}/partitions r,
@{PROC}/sys/kernel/panic r,
@{PROC}/sys/kernel/panic_on_oops r,
@{PROC}/sys/vm/panic_on_oom r,

# These are not process-specific (/proc/*/... and /proc/*/task/*/...)
@{PROC}/*/{,task/,task/*/} r,
@{PROC}/*/{,task/*/}auxv r,
@{PROC}/*/{,task/*/}cgroup r,
@{PROC}/*/{,task/*/}cmdline r,
@{PROC}/*/{,task/*/}comm r,
@{PROC}/*/{,task/*/}exe r,
@{PROC}/*/{,task/*/}fdinfo/* r,
@{PROC}/*/{,task/*/}stat r,
@{PROC}/*/{,task/*/}statm r,
@{PROC}/*/{,task/*/}status r,
@{PROC}/*/{,task/*/}wchan r,

# Allow discovering the os-release of the host
/var/lib/snapd/hostfs/etc/os-release rk,
/var/lib/snapd/hostfs/usr/lib/os-release rk,

# Allow discovering system-wide CFS Bandwidth Control information
# https://www.kernel.org/doc/html/latest/scheduler/sched-bwc.html
/sys/fs/cgroup/cpu,cpuacct/cpu.cfs_period_us r,
/sys/fs/cgroup/cpu,cpuacct/cpu.cfs_quota_us r,
/sys/fs/cgroup/cpu,cpuacct/cpu.shares r,
/sys/fs/cgroup/cpu,cpuacct/cpu.stat r,

#include <abstractions/dbus-strict>

# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.DBus.Properties
    member=Get{,All},

# Allow clients to introspect hostname1
# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.DBus.Introspectable
    member=Introspect,

# Allow clients to enumerate DBus connection names on common buses
dbus (send)
    bus={session,system}
    path=/org/freedesktop/DBus
    interface=org.freedesktop.DBus
    member=ListNames
    peer=(label=unconfined),

# Allow clients to obtain the DBus machine ID on common buses. We do not
# mediate the path since any peer can be used.
dbus (send)
    bus={session,system}
    interface=org.freedesktop.DBus.Peer
    member=GetMachineId
    peer=(label=unconfined),
type: account-key
authority-id: canonical
revision: 2
public-key-sha3-384: -CvQKAwRQ5h3Ffn10FILJoEZUXOv6km9FwA80-Rcj-f-6jadQ89VRswHNiEB9Lxk
account-id: canonical
name: root
since: 2016-04-01T00:00:00.0Z
body-length: 1406
sign-key-sha3-384: -CvQKAwRQ5h3Ffn10FILJoEZUXOv6km9FwA80-Rcj-f-6jadQ89VRswHNiEB9Lxk

AcbDTQRWhcGAASAA4Zdo3CVpKmTecjd3VDBiFbZTKKhcG0UV3FXxyGIe2UsdnJIks4NkVYO+qYk0
zW26Svpa5OIOJGO2NcgN9bpCYWZOufO1xTmC7jW/fEtqJpX8Kcq20+X5AarqJ5RBVnGLrlz+ZT99
aHdRZ4YQ2XUZvhbelzWTdK5+2eMSXNrFjO6WwGh9NRekE/NIBNwvULAtJ5nv1KwZaSpZ+klJrstU
EHPhs+NGGm1Aru01FFl3cWUm5Ao8i9y+pFcPoaRatgtpYU8mg9gP594lvyJqjFofXvHPwztmySqf
FVAp4gLLfLvRxbXkOfPUz8guidqvg6r4DUD+kCBjKYoT44PjK6l51MzEL2IEy6jdnFTgjHbaYML8
/5NpuPu8XiSjCpOTeNR+XKzXC2tHRU7j09Xd44vKRhPk0Hc4XsPNBWqfrcbdWmwsFhjfxFDJajOq
hzWVoiRc5opB5socbRjLf+gYtncxe99oC2FDA2FcftlFoyztho0bAzeFer1IHJIMYWxKMESjvJUE
pnMMKpIMYY0QfWEo5hXR0TaT+NxW2Z9Jqclgyw13y5iY72ZparHS66J+C7dxCEOswlw1ypNic6MM
/OzpafIQ10yAT3HeRCJQQOOSSTaold+WpWsQweYCywPcu9S+wCo6CrPzJCCIxOAnXjLYv2ykTJje
pNJ2+GZ1WH2UeJdJ5sR8fpxxRupqHuEKNRZ+2CqLmFC5kHNszoGolLEvGcK4BJciO4KihnKtxrdX
dUJIOPBLktA8XiiHSOmLzs2CFjcvlDuPSpe64HIL5yCxO1/GRux4A1Kht1+DqTrL7DjyIW+vIPro
A1PQwkcAJyScNRxT4bPpUj8geAXWd3n212W+7QVHuQEFezvXC5GbMyR+Xj47FOFcFcSZID1hTZEu
uMD+AxaBHQKwPfBx1arVKE1OhkuKHeSFtZRP8K8l3qj5W0sIxxIW19W8aziu8ZeDMT+nIEJrJvhx
zGEdxwCrp3k2/93oDV7g+nb1ZGfIhtmcrKziijghzPLaYaiM9LggqwTARelk3xSzd8+uk3LPXuVl
fP8/xHApss6sCE3xk4+F3OGbL7HbGuCnoulf795XKLRTy+xU/78piOMNJJQu+G0lMZIO3cZrP6io
MYDa+jDZw4V4fBRWce/FA3Ot1eIDxCq5v+vfKw+HfUlWcjm6VUQIFZYbK+Lzj6mpXn81BugG3d+M
0WNFObXIrUbhnKcYkus3TSJ9M1oMEIMp0WfFGAVTd61u36fdi2e+/xbLN0kbYcFRZwd9CmtEeDZ0
eYx/pvKKaNz/DfUr0piVCRwxuxQ0kVppklHPO4sOTFZUId8KLHg28LbszvupSsHP/nHlW8l5/VK6
4+KxRV2XofsUnwARAQAB

AcLDXAQAAQoABgUCV83kkgAKCRDUpVvql9g3IA9hIADAkn4VXnJIFblhMSBe6hbTy7z6AfOhZxXR
Ds/mHsiWfFT6ifGi9SpZowhRX+ff57YvFCjlBqMYLKYE0NsFQYEUc5uBWiFZwC0ENydNhO23DV1B
elTSs6mr9duPm1eJAozFrQETOD1kz5BIamqBUeaTczjM+9l5i485Ffknbc+EaGOrtMEap0GqjByQ
u+ykZGvryVQ447avgjvFsMtA0quFi+SoW9PT/9D26e5rD7RIICYWG8mzFRn5Isqs/X4W1uAiKQe9
pqHMbdNr/FCWX5ws0/nMaOq+b0z4EIIXIfT0JmIlFDQsAgFVnKwYw+zs32cTw4XuzvMhgMDtCowD
YodhiO/5AOMsMMV0qBsYxbIPJIEz7b6gwTYEJoTVkqTit6o3UgWrAy+p4Y7t0ickYIHgwiuKRS9E
fu0Ue+32NFp0XFqZElfXLK/U2yjto+fJXu6uAELsXesfFGIOp/nbRbNavUt9jAJeO7ftQczgf39T
YfA0OKerP5gAOd4+aO3gATPUjfWPsJ9908XC7QqK2BwS1kh/fMrd95mxcmXdF1bBElszKwaToBVQ
1m52EYp06kkPyOu+fGKFAoIMafcV/2Ztz1WMo/Vp0iP/r0WAtBDw6sDJyWOfRjUEvP7BBdEzraHV
VblbSrKzhYeEGdMDi6kFC+KEzfPDPFJX1l3saPBkz9VDuESbktyObQp9VfkFKYBgBnw3msQJk+6k
G4t0o3/DZ7qz/kTJXMogG26Z/FsMhPERsaLTbWRJ3WRyXX8COaTladSf8bG0Oib19outnjuvpjQ0
qEV9eeGRBlx9mbidSYH95cj0zD2DKpeSZ83M5K1pFg+8RKToGElGTTk8vtdTfDVbmi3+QntfLq+z
ZMgs2+SmCWrV/MPC04Dl00CXywdKPyf6toomqRP7A5fS7W8P9fdPn+a8JCblcleGj9nvJXBQjue7
97rofCEszhKhoE9fMCIUcSoTU9YAm5Jr+qclSEbV1pzwTvZ8auMIXtzEZV5n4aK4WPDV+lYCadrL
DlvJSJRuXRvIMbmvU9b8NxgG8AS88BkX3L9vlOpkMculwG1/iooQvxuFaJDargt370wAQo0lCpG3
MxnsSusymwnYegvvvr7Xp/KBLZK1+8Djzm3fwAryp4qNo29ciVw3O9lFKmmuiIcxSY0bauXaK6kv
pTnYkmx7XGPF7Ahb7Ov0/0FE2Lx3JZXSEKeW+VrCcpYQOY++t67b+jf0AV4rZExcLFJzP6MPMimP
ZCd383NzlzkXK+vAdvTi40HPiM9FYOp6g8JTs5TTdx2/qs/SWFC8AkahIQmH0IpFBJep2JKl2kyr
FZMvASkHA9bR/UuXDvbMzsUmT/xnERZosQaZgFEO

# Description: This interface allows for getting hardware information
# from the system. This is reserved because it allows reading potentially
# sensitive information.

# used by lscpu and 'lspci -A intel-conf1/intel-conf2'
capability sys_rawio,

# see loaded kernel modules
@{PROC}/modules r,

# used by lspci
capability sys_admin,
/etc/modprobe.d/{,*} r,
/lib/modprobe.d/{,*} r,

# files in /sys pertaining to hardware (eg, 'lspci -A linux-sysfs')
/sys/{block,bus,class,devices,firmware}/{,**} r,

# files in /proc/bus/pci (eg, 'lspci -A linux-proc')
@{PROC}/bus/pci/{,**} r,

# DMI tables
/sys/firmware/dmi/tables/DMI r,
/sys/firmware/dmi/tables/smbios_entry_point r,

# power information
/sys/power/{,**} r,
/run/udev/data/+power_supply:* r,

# interrupts
@{PROC}/interrupts r,

# libsensors
/etc/sensors3.conf r,
/etc/sensors.d/{,*} r,

# Needed for udevadm
/run/udev/data/** r,
network netlink raw,

# util-linux
/{,usr/}bin/lsblk ixr,
/{,usr/}bin/lscpu ixr,
/{,usr/}bin/lsmem ixr,

# lsmem
/sys/devices/system/memory/block_size_bytes r,
/sys/devices/system/memory/memory[0-9]*/removable r,
/sys/devices/system/memory/memory[0-9]*/state r,
/sys/devices/system/memory/memory[0-9]*/valid_zones r,

# lsusb
# Note: lsusb and its database have to be shipped in the snap if not on classic
/{,usr/}bin/lsusb ixr,
/var/lib/usbutils/usb.ids r,
/dev/ r,
/dev/bus/usb/{,**/} r,
/etc/udev/udev.conf r,

# lshw -quiet (note, lshw also tries to create /dev/fb-*, but fails gracefully)
@{PROC}/devices r,
@{PROC}/ide/{,**} r,
@{PROC}/scsi/{,**} r,
@{PROC}/device-tree/{,**} r,
/sys/kernel/debug/usb/devices r,
@{PROC}/sys/abi/{,*} r,

# status of hugepages and transparent_hugepage, but not the pages themselves
/sys/kernel/mm/{hugepages,transparent_hugepage}/{,**} r,

# systemd-detect-virt
/{,usr/}bin/systemd-detect-virt ixr,
# VMs
@{PROC}/cpuinfo r,
@{PROC}/sysinfo r,  # Linux on z/VM
@{PROC}/xen/capabilities r,
/sys/hypervisor/properties/features r,
/sys/hypervisor/type r,

# containers
/run/systemd/container r,

# /proc/1/sched in a systemd-nspawn container with '-a' is supposed to show on
# its first line a pid that != 1 and systemd-detect-virt tries to detect this.
# This doesn't seem to be the case on (at least) systemd 240 on Ubuntu. This
# file is somewhat sensitive for arbitrary pids, but is not overly so for pid
# 1. For containers, systemd won't normally look at this file since it has
# access to /run/systemd/container and 'container' from the environment, and
# systemd fails gracefully when it doesn't have access to /proc/1/sched. For
# VMs, systemd requires access to /proc/1/sched in its detection algorithm.
# See src/basic/virt.c from systemd sources for details.
@{PROC}/1/sched r,

# systemd-detect-virt --private-users will look at these and the access is
# better added to system-observe. Since snaps typically only care about
# --container and --vm leave these commented out.
#@{PROC}/@{pid}/uid_map r,
#@{PROC}/@{pid}/gid_map r,
#@{PROC}/@{pid}/setgroups r,

# systemd-detect-virt --chroot requires 'ptrace (read)' on unconfined to
# determine if it is running in a chroot. Like above, this is best granted via
# system-observe.
#ptrace (read) peer=unconfined,

# Description: Can access opengl.

# specific gl libs
/var/lib/snapd/lib/gl{,32}/ r,
/var/lib/snapd/lib/gl{,32}/** rm,

# Bi-arch distribution nvidia support
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}libcuda*.so{,.*} rm,
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}libnvidia*.so{,.*} rm,
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}tls/libnvidia*.so{,.*} rm,
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}libnvcuvid.so{,.*} rm,
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}lib{GL,GLESv1_CM,GLESv2,EGL}*nvidia.so{,.*} rm,
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}libGLdispatch.so{,.*} rm,
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}vdpau/libvdpau_nvidia.so{,.*} rm,

# Support reading the Vulkan ICD files
/var/lib/snapd/lib/vulkan/ r,
/var/lib/snapd/lib/vulkan/** r,
/var/lib/snapd/hostfs/usr/share/vulkan/icd.d/*nvidia*.json r,

# Support reading the GLVND EGL vendor files
/var/lib/snapd/lib/glvnd/ r,
/var/lib/snapd/lib/glvnd/** r,
/var/lib/snapd/hostfs/usr/share/glvnd/egl_vendor.d/*nvidia*.json r,

# Main bi-arch GL libraries
/var/lib/snapd/hostfs/{,usr/}lib{,32,64,x32}/{,@{multiarch}/}{,nvidia*/}lib{GL,GLU,GLESv1_CM,GLESv2,EGL,GLX}.so{,.*} rm,

/dev/dri/ r,
/dev/dri/card0 rw,

# nvidia
/etc/vdpau_wrapper.cfg r,
@{PROC}/driver/nvidia/params r,
@{PROC}/modules r,
/dev/nvidia* rw,
unix (send, receive) type=dgram peer=(addr="@nvidia[0-9a-f]*"),

# VideoCore/EGL (shared device with VideoCore camera)
/dev/vchiq rw,

# va-api
/dev/dri/renderD[0-9]* rw,

# cuda
@{PROC}/sys/vm/mmap_min_addr r,
@{PROC}/devices r,
/sys/devices/system/memory/block_size_bytes r,
/sys/module/tegra_fuse/parameters/tegra_* r,
unix (bind,listen) type=seqpacket addr="@cuda-uvmfd-[0-9a-f]*",
/{dev,run}/shm/cuda.* rw,
/dev/nvhost-* rw,
/dev/nvmap rw,

# Tegra display driver
/dev/tegra_dc_ctrl rw,
/dev/tegra_dc_[0-9]* rw,

# OpenCL ICD files
/etc/OpenCL/vendors/ r,
/etc/OpenCL/vendors/** r,

# Parallels guest tools 3D acceleration (video toolgate)
@{PROC}/driver/prl_vtg rw,

# /sys/devices
/sys/devices/{,*pcie-controller/}pci[0-9a-f]*/**/config r,
/sys/devices/{,*pcie-controller/}pci[0-9a-f]*/**/revision r,
/sys/devices/{,*pcie-controller/}pci[0-9a-f]*/**/{,subsystem_}class r,
/sys/devices/{,*pcie-controller/}pci[0-9a-f]*/**/{,subsystem_}device r,
/sys/devices/{,*pcie-controller/}pci[0-9a-f]*/**/{,subsystem_}vendor r,
/sys/devices/**/drm{,_dp_aux_dev}/** r,

# FIXME: this is an information leak and snapd should instead query udev for
# the specific accesses associated with the above devices.
/sys/bus/pci/devices/ r,
/sys/bus/platform/devices/soc:gpu/ r,
/run/udev/data/+drm:card* r,
/run/udev/data/+pci:[0-9a-f]* r,
/run/udev/data/+platform:soc:gpu* r,

# FIXME: for each device in /dev that this policy references, lookup the
# device type, major and minor and create rules of this form:
# /run/udev/data/<type><major>:<minor> r,
# For now, allow 'c'haracter devices and 'b'lock devices based on
# https://www.kernel.org/doc/Documentation/devices.txt
/run/udev/data/c226:[0-9]* r,  # 226 drm

# From https://bugs.launchpad.net/snapd/+bug/1862832
/run/nvidia-xdriver-* rw,
unix (send, receive) type=dgram peer=(addr="@var/run/nvidia-xdriver-*"),

# Description: Allow access to Evolution Data Service for contacts

#include <abstractions/dbus-session-strict>

# Allow use of ObjectManager APIs, used to enumerate sources
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.ObjectManager
	path=/org/gnome/evolution/dataserver{,/**}
	peer=(label=unconfined),

# Allow access to properties on sources
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/AddressBook{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/AddressBookFactory
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/AddressBookCursor{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/AddressBookView{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.freedesktop.DBus.Properties
	path=/org/gnome/evolution/dataserver/Subprocess{,/**}
	peer=(label=unconfined),
# Allow access to methods
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.AddressBook
	path=/org/gnome/evolution/dataserver/{Subprocess,AddressBook}{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.AddressBookFactory
	path=/org/gnome/evolution/dataserver/AddressBookFactory
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.AddressBookCursor
	path=/org/gnome/evolution/dataserver/AddressBookCursor{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.AddressBookView
	path=/org/gnome/evolution/dataserver/AddressBookView{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.Source
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.Source.Removable
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	peer=(label=unconfined),
dbus (receive, send)
	bus=session
	interface=org.gnome.evolution.dataserver.SourceManager
	path=/org/gnome/evolution/dataserver/SourceManager
	peer=(label=unconfined),

# Allow clients to introspect the service
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/AddressBook{,/**}
	member=Introspect
	peer=(label=unconfined),
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/AddressBookFactory
	member=Introspect
	peer=(label=unconfined),
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/AddressBookCursor{,/**}
	member=Introspect
	peer=(label=unconfined),
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/AddressBookView{,/**}
	member=Introspect
	peer=(label=unconfined),
dbus (send)
	bus=session
	interface=org.freedesktop.DBus.Introspectable
	path=/org/gnome/evolution/dataserver/SourceManager{,/**}
	member=Introspect
	peer=(label=unconfined),

# Allow access to cached avatars
owner @{HOME}/.cache/evolution/addressbook/[0-9a-f]*/*.jpeg r,

# Description: Can configure firewall. This is restricted because it gives
# privileged access to networking and should only be used with trusted apps.

#include <abstractions/nameservice>
/run/systemd/resolve/stub-resolv.conf r,

# systemd-resolved (not yet included in nameservice abstraction)
#
# Allow access to the safe members of the systemd-resolved D-Bus API:
#
#   https://www.freedesktop.org/wiki/Software/systemd/resolved/
#
# This API may be used directly over the D-Bus system bus or it may be used
# indirectly via the nss-resolve plugin:
#
#   https://www.freedesktop.org/software/systemd/man/nss-resolve.html
#
#include <abstractions/dbus-strict>
dbus send
     bus=system
     path="/org/freedesktop/resolve1"
     interface="org.freedesktop.resolve1.Manager"
     member="Resolve{Address,Hostname,Record,Service}"
     peer=(name="org.freedesktop.resolve1"),

capability net_admin,

/{,usr/}{,s}bin/iptables{,-save,-restore} ixr,
/{,usr/}{,s}bin/ip6tables{,-save,-restore} ixr,
/{,usr/}{,s}bin/iptables-apply ixr,
/{,usr/}{,s}bin/xtables-multi ixr, # ip[6]tables*

# ping - child profile would be nice but seccomp causes problems with that
/{,usr/}{,s}bin/ping ixr,
/{,usr/}{,s}bin/ping6 ixr,
capability net_raw,
capability setuid,
network inet raw,
network inet6 raw,

# iptables (note, we don't want to allow loading modules, but
# we can allow reading @{PROC}/sys/kernel/modprobe).
@{PROC}/sys/kernel/modprobe r,

unix (bind, listen) type=stream addr="@xtables",
/{,var/}run/xtables.lock rwk,

@{PROC}/@{pid}/net/ r,
@{PROC}/@{pid}/net/** r,

# nft accesses these for routing expressions and device groups
/etc/iproute2/ r,
/etc/iproute2/rt_marks r,
/etc/iproute2/rt_realms r,
/etc/iproute2/group r,

# sysctl
/{,usr/}{,s}bin/sysctl ixr,
@{PROC}/sys/ r,
@{PROC}/sys/net/ r,
@{PROC}/sys/net/core/ r,
@{PROC}/sys/net/core/** r,
@{PROC}/sys/net/ipv{4,6}/ r,
@{PROC}/sys/net/ipv{4,6}/** r,
@{PROC}/sys/net/netfilter/ r,
@{PROC}/sys/net/netfilter/** r,
@{PROC}/sys/net/nf_conntrack_max r,

# check the state of the Kmod modules
/sys/module/arp_tables/               r,
/sys/module/arp_tables/initstate      r,
/sys/module/br_netfilter/             r,
/sys/module/br_netfilter/initstate    r,
/sys/module/iptable_filter/           r,
/sys/module/iptable_filter/initstate  r,
/sys/module/ip6table_filter/          r,
/sys/module/ip6table_filter/initstate r,
/sys/module/nf_*/initstate            r,

# read netfilter module parameters
/sys/module/nf_*/                     r,
/sys/module/nf_*/parameters/{,*}      r,

# write netfilter module parameters
/sys/module/nf_conntrack/parameters/hashsize w,

# various firewall related sysctl files
@{PROC}/sys/net/bridge/bridge-nf-call-arptables rw,
@{PROC}/sys/net/bridge/bridge-nf-call-iptables rw,
@{PROC}/sys/net/bridge/bridge-nf-call-ip6tables rw,
@{PROC}/sys/net/bridge/bridge-nf-filter-pppoe-tagged rw,
@{PROC}/sys/net/bridge/bridge-nf-filter-vlan-tagged rw,
@{PROC}/sys/net/bridge/bridge-nf-pass-vlan-input-dev rw,
@{PROC}/sys/net/ipv4/conf/*/rp_filter w,
@{PROC}/sys/net/ipv{4,6}/conf/*/accept_source_route w,
@{PROC}/sys/net/ipv{4,6}/conf/*/accept_redirects w,
@{PROC}/sys/net/ipv4/icmp_echo_ignore_broadcasts w,
@{PROC}/sys/net/ipv4/icmp_ignore_bogus_error_responses w,
@{PROC}/sys/net/ipv4/icmp_echo_ignore_all w,
@{PROC}/sys/net/ipv4/ip_forward w,
@{PROC}/sys/net/ipv4/conf/*/log_martians w,
@{PROC}/sys/net/ipv4/tcp_syncookies w,
@{PROC}/sys/net/ipv6/conf/*/forwarding w,
@{PROC}/sys/net/netfilter/nf_conntrack_helper rw,
@{PROC}/sys/net/netfilter/nf_conntrack_max rw,
@{PROC}/sys/net/netfilter/nf_conntrack_tcp_timeout_close_wait rw,
@{PROC}/sys/net/netfilter/nf_conntrack_tcp_timeout_established rw,

# Description: allow operating as the Docker daemon/containerd. This policy is
# intentionally not restrictive and is here to help guard against programming
# errors and not for security confinement. The Docker daemon by design requires
# extensive access to the system and cannot be effectively confined against
# malicious activity.

#include <abstractions/dbus-strict>

# Allow sockets/etc for docker
/{,var/}run/docker.sock rw,
/{,var/}run/docker/     rw,
/{,var/}run/docker/**   mrwklix,
/{,var/}run/runc/       rw,
/{,var/}run/runc/**     mrwklix,

# Allow sockets/etc for containerd
/{,var/}run/containerd/{,runc/,runc/k8s.io/,runc/k8s.io/*/} rw,
/{,var/}run/containerd/runc/k8s.io/*/** rwk,
/{,var/}run/containerd/{io.containerd*/,io.containerd*/k8s.io/,io.containerd*/k8s.io/*/} rw,
/{,var/}run/containerd/io.containerd*/*/** rwk,

# Limit ipam-state to k8s
/run/ipam-state/k8s-** rw,
/run/ipam-state/k8s-*/lock k,

# Socket for docker-container-shim
unix (bind,listen) type=stream addr="@/containerd-shim/**/shim.sock\x00",

/{,var/}run/mount/utab r,

# Wide read access to /proc, but somewhat limited writes for now
@{PROC}/ r,
@{PROC}/** r,
@{PROC}/[0-9]*/attr/exec w,
@{PROC}/[0-9]*/oom_score_adj w,

# Limited read access to specific bits of /sys
/sys/kernel/mm/hugepages/ r,
/sys/kernel/mm/transparent_hugepage/{,**} r,
/sys/fs/cgroup/cpuset/cpuset.cpus r,
/sys/fs/cgroup/cpuset/cpuset.mems r,
/sys/module/apparmor/parameters/enabled r,

# Limit cgroup writes a bit (Docker uses a "docker" sub-group)
/sys/fs/cgroup/*/docker/   rw,
/sys/fs/cgroup/*/docker/** rw,

# Also allow cgroup writes to kubernetes pods
/sys/fs/cgroup/*/kubepods/ rw,
/sys/fs/cgroup/*/kubepods/** rw,

# Allow tracing ourself (especially the "runc" process we create)
ptrace (trace) peer=@{profile_name},

# Docker needs a lot of caps, but limits them in the app container
capability,

# Docker does all kinds of mounts all over the filesystem
/dev/mapper/control rw,
/dev/mapper/docker* rw,
/dev/loop-control r,
/dev/loop[0-9]* rw,
/sys/devices/virtual/block/dm-[0-9]*/** r,
mount,
umount,

# After doing a pivot_root using <graph-dir>/<container-fs>/.pivot_rootNNNNNN,
# Docker removes the leftover /.pivot_rootNNNNNN directory (which is now
# relative to "/" instead of "<graph-dir>/<container-fs>" thanks to pivot_root)
pivot_root,
/.pivot_root[0-9]*/ rw,

# file descriptors (/proc/NNN/fd/X)
# file descriptors in the container show up here due to attach_disconnected
/[0-9]* rw,

# Docker needs to be able to create and load the profile it applies to
# containers ("docker-default")
/sbin/apparmor_parser ixr,
/etc/apparmor.d/cache/ r,            # apparmor 2.12 and below
/etc/apparmor.d/cache/.features r,
/etc/apparmor.d/{,cache/}docker* rw,
/var/cache/apparmor/{,*/} r,         # apparmor 2.13 and higher
/var/cache/apparmor/*/.features r,
/var/cache/apparmor/*/docker* rw,
/etc/apparmor.d/tunables/{,**} r,
/etc/apparmor.d/abstractions/{,**} r,
/etc/apparmor/parser.conf r,
/etc/apparmor/subdomain.conf r,
/sys/kernel/security/apparmor/.replace rw,
/sys/kernel/security/apparmor/{,**} r,

# use 'privileged-containers: true' to support --security-opts

# defaults for docker-default
change_profile unsafe /** -> docker-default,
signal (send) peer=docker-default,
ptrace (read, trace) peer=docker-default,

# defaults for containerd
change_profile unsafe /** -> cri-containerd.apparmor.d,
signal (send) peer=cri-containerd.apparmor.d,
ptrace (read, trace) peer=cri-containerd.apparmor.d,

# Graph (storage) driver bits
/{dev,run}/shm/aufs.xino mrw,
/proc/fs/aufs/plink_maint w,
/sys/fs/aufs/** r,

#cf bug 1502785
/ r,

# recent versions of docker make a symlink from /dev/ptmx to /dev/pts/ptmx
# and so to allow allocating a new shell we need this
/dev/pts/ptmx rw,

# needed by runc for mitigation of CVE-2019-5736
# For details see https://bugs.launchpad.net/apparmor/+bug/1820344
/ ix,
/bin/runc ixr,

/pause ixr,
/bin/busybox ixr,

# When kubernetes drives containerd, containerd needs access to CNI services,
# like flanneld's subnet.env for DNS. This would ideally be snap-specific (it
# could if the control plane was a snap), but in deployments where the control
# plane is not a snap, it will tell flannel to use this path.
/run/flannel/{,**} rk,

# When kubernetes drives containerd, containerd needs access to various
# secrets for the pods which are overlayed at /run/secrets/....
# This would ideally be snap-specific (it could if the control plane was a
# snap), but in deployments where the control plane is not a snap, it will tell
# containerd to use this path for various account information for pods.
/run/secrets/kubernetes.io/{,**} rk,
