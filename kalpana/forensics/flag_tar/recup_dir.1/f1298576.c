scription: allows domain, record, service, and service type browsing
# as well as address, host and service resolving

/{,var/}run/avahi-daemon/socket rw,

#include <abstractions/dbus-strict>
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.DBus.Peer
    member=Ping
    peer=(name=org.freedesktop.Avahi,label=###SLOT_SECURITY_TAGS###),

# Allow accessing DBus properties and resolving
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member={Get*,Resolve*,IsNSSSupportAvailable}
    peer=(name=org.freedesktop.Avahi,label=###SLOT_SECURITY_TAGS###),

# Allow receiving anything from the slot server
dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.Server
    peer=(label=###SLOT_SECURITY_TAGS###),

# Don't allow introspection since it reveals too much (path is not service
# specific for unconfined)
# do not use peer=(label=unconfined) here since this is DBus activated
#dbus (send)
#    bus=system
#    path=/
#    interface=org.freedesktop.DBus.Introspectable
#    member=Introspect,

# These allows tampering with other snap's browsers, so don't autoconnect for
# now.

# address resolving
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member=AddressResolverNew
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/Client*/AddressResolver*
    interface=org.freedesktop.Avahi.AddressResolver
    member=Free
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.AddressResolver
    peer=(label=###SLOT_SECURITY_TAGS###),

# host name resolving
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member=HostNameResolverNew
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/Client*/HostNameResolver*
    interface=org.freedesktop.Avahi.HostNameResolver
    member=Free
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.HostNameResolver
    peer=(label=###SLOT_SECURITY_TAGS###),

# service resolving
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member=ServiceResolverNew
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/Client*/ServiceResolver*
    interface=org.freedesktop.Avahi.ServiceResolver
    member=Free
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.ServiceResolver
    peer=(label=###SLOT_SECURITY_TAGS###),

# domain browsing
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member=DomainBrowserNew
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/Client*/DomainBrowser*
    interface=org.freedesktop.Avahi.DomainBrowser
    member=Free
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.DomainBrowser
    peer=(label=###SLOT_SECURITY_TAGS###),

# record browsing
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member=RecordBrowserNew
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/Client*/RecordBrowser*
    interface=org.freedesktop.Avahi.RecordBrowser
    member=Free
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.RecordBrowser
    peer=(label=###SLOT_SECURITY_TAGS###),

# service browsing
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member=ServiceBrowserNew
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/Client*/ServiceBrowser*
    interface=org.freedesktop.Avahi.ServiceBrowser
    member=Free
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.ServiceBrowser
    peer=(label=###SLOT_SECURITY_TAGS###),

# Service type browsing
dbus (send)
    bus=system
    path=/
    interface=org.freedesktop.Avahi.Server
    member=ServiceTypeBrowserNew
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/Client*/ServiceTypeBrowser*
    interface=org.freedesktop.Avahi.ServiceTypeBrowser
    member=Free
    peer=(name=org.freedesktop.Avahi, label=###SLOT_SECURITY_TAGS###),

dbus (receive)
    bus=system
    interface=org.freedesktop.Avahi.ServiceTypeBrowser
    peer=(label=###SLOT_SECURITY_TAGS###),

# Description: allow operating as the Docker daemon. This policy is
# intentionally not restrictive and is here to help guard against programming
# errors and not for security confinement. The Docker daemon by design requires
# extensive access to the system and cannot be effectively confined against
# malicious activity.

# Because seccomp may only go more strict, we must allow all syscalls to Docker
# that it expects to give to containers in addition to what it needs to run and
# trust that docker daemon # only gives out reasonable syscalls to containers.

# Docker includes these in the default container whitelist, but they're
# potentially dangerous.
#finit_module
#init_module
#query_module
#delete_module

# These have a history of vulnerabilities, are not widely used, and
# open_by_handle_at has been used to break out of Docker containers by brute
# forcing the handle value: http://stealth.openwall.net/xSports/shocker.c
#name_to_handle_at
#open_by_handle_at

# Calls the Docker daemon itself requires

# /snap/docker/VERSION/bin/docker-runc
#   "do not inherit the parent's session keyring"
#   "make session keyring searcheable"
# runC uses this to ensure the container doesn't have access to the host
# keyring
keyctl

# /snap/docker/VERSION/bin/docker-runc
pivot_root

# ptrace can be abused to break out of the seccomp sandbox
# but is required by the Docker daemon.
ptrace

# This list comes from Docker's default seccomp whitelist (which is applied to
#   all containers launched unless a custom profile is specified or
#   "--privileged" is used)
# https://github.com/docker/docker/blob/v1.12.0/profiles/seccomp/seccomp_default.go#L39-L1879
# It has been further filtered to exclude certain known-troublesome syscalls.
accept
accept4
access
acct
adjtimex
alarm
arch_prctl
bind
bpf
breakpoint
brk
cacheflush
capget
capset
chdir
chmod
chown
chown32
chroot
clock_getres
clock_gettime
clock_nanosleep
clone
close
connect
copy_file_range
creat
dup
dup2
dup3
epoll_create
epoll_create1
epoll_ctl
epoll_ctl_old
epoll_pwait
epoll_wait
epoll_wait_old
eventfd
eventfd2
execve
execveat
exit
exit_group
faccessat
fadvise64
fadvise64_64
fallocate
fanotify_init
fanotify_mark
fchdir
fchmod
fchmodat
fchown
fchown32
fchownat
fcntl
fcntl64
fdatasync
fgetxattr
flistxattr
flock
fork
fremovexattr
fsetxattr
fstat
fstat64
fstatat64
fstatfs
fstatfs64
fsync
ftruncate
ftruncate64
futex
futimesat
getcpu
getcwd
getdents
getdents64
getegid
getegid32
geteuid
geteuid32
getgid
getgid32
getgroups
getgroups32
getitimer
getpeername
getpgid
getpgrp
getpid
getppid
getpriority
getrandom
getresgid
getresgid32
getresuid
getresuid32
getrlimit
get_robust_list
getrusage
getsid
getsockname
getsockopt
get_thread_area
gettid
gettimeofday
getuid
getuid32
getxattr
inotify_add_watch
inotify_init
inotify_init1
inotify_rm_watch
io_cancel
ioctl
io_destroy
io_getevents
ioperm
iopl
ioprio_get
ioprio_set
io_setup
io_submit
ipc
kcmp
kill
lchown
lchown32
lgetxattr
link
linkat
listen
listxattr
llistxattr
_llseek
lookup_dcookie
lremovexattr
lseek
lsetxattr
lstat
lstat64
madvise
memfd_create
mincore
mkdir
mkdirat
mknod
mknodat
mlock
mlock2
mlockall
mmap
mmap2
modify_ldt
mount
mprotect
mq_getsetattr
mq_notify
mq_open
mq_timedreceive
mq_timedsend
mq_unlink
mremap
msgctl
msgget
msgrcv
msgsnd
msync
munlock
munlockall
munmap
nanosleep
newfstatat
_newselect
open
openat
pause
perf_event_open
personality
pipe
pipe2
poll
ppoll
prctl
pread64
preadv
prlimit64
process_vm_readv
process_vm_writev
pselect6
pwrite64
pwritev
read
readahead
readlink
readlinkat
readv
reboot
recv
recvfrom
recvmmsg
recvmsg
remap_file_pages
removexattr
rename
renameat
renameat2
restart_syscall
rmdir
rt_sigaction
rt_sigpending
rt_sigprocmask
rt_sigqueueinfo
rt_sigreturn
rt_sigsuspend
rt_sigtimedwait
rt_tgsigqueueinfo
s390_pci_mmio_read
s390_pci_mmio_write
s390_runtime_instr
sched_getaffinity
sched_getattr
sched_getparam
sched_get_priority_max
sched_get_priority_min
sched_getscheduler
sched_rr_get_interval
sched_setaffinity
sched_setattr
sched_setparam
sched_setscheduler
sched_yield
seccomp
select
semctl
semget
semop
semtimedop
send
sendfile
sendfile64
sendmmsg
sendmsg
sendto
setdomainname
setfsgid
setfsgid32
setfsuid
setfsuid32
setgid
setgid32
setgroups
setgroups32
sethostname
setitimer
setns
setpgid
setpriority
setregid
setregid32
setresgid
setresgid32
setresuid
setresuid32
setreuid
setreuid32
setrlimit
set_robust_list
setsid
setsockopt
set_thread_area
set_tid_address
settimeofday
set_tls
setuid
setuid32
setxattr
shmat
shmctl
shmdt
shmget
shutdown
sigaltstack
signalfd
signalfd4
sigreturn
socket
socketcall
socketpair
splice
stat
stat64
statfs
statfs64
stime
symlink
symlinkat
sync
sync_file_range
syncfs
sysinfo
syslog
tee
tgkill
time
timer_create
timer_delete
timerfd_create
timerfd_gettime
timerfd_settime
timer_getoverrun
timer_gettime
timer_settime
times
tkill
truncate
truncate64
ugetrlimit
umask
umount
umount2
uname
unlink
unlinkat
unshare
utime
utimensat
utimes
vfork
vhangup
vmsplice
wait4
waitid
waitpid
write
writev

# Description: Can access basic graphical desktop resources. To be used with
# other interfaces (eg, wayland).

#include <abstractions/dbus-strict>
#include <abstractions/dbus-session-strict>

# Allow finding the DBus session bus id (eg, via dbus_bus_get_id())
dbus (send)
     bus=session
     path=/org/freedesktop/DBus
     interface=org.freedesktop.DBus
     member=GetId
     peer=(name=org.freedesktop.DBus, label=unconfined),

#include <abstractions/fonts>
owner @{HOME}/.local/share/fonts/{,**} r,
/var/cache/fontconfig/   r,
/var/cache/fontconfig/** mr,

# subset of gnome abstraction
/etc/gtk-3.0/settings.ini r,
owner @{HOME}/.config/gtk-3.0/settings.ini r,
# Note: this leaks directory names that wouldn't otherwise be known to the snap
owner @{HOME}/.config/gtk-3.0/bookmarks r,

/usr/share/icons/                          r,
/usr/share/icons/**                        r,
/usr/share/icons/*/index.theme             rk,
/usr/share/pixmaps/                        r,
/usr/share/pixmaps/**                      r,
/usr/share/unity/icons/**                  r,
/usr/share/thumbnailer/icons/**            r,
/usr/share/themes/**                       r,

# The snapcraft desktop part may look for schema files in various locations, so
# allow reading system installed schemas.
/usr/share/glib*/schemas/{,*}              r,
/usr/share/gnome/glib*/schemas/{,*}        r,
/usr/share/ubuntu/glib*/schemas/{,*}       r,

# subset of freedesktop.org
owner @{HOME}/.local/share/mime/**   r,
owner @{HOME}/.config/user-dirs.* r,

/etc/xdg/user-dirs.conf r,
/etc/xdg/user-dirs.defaults r,

# gmenu
dbus (send)
     bus=session
     interface=org.gtk.Actions
     member=Changed
     peer=(name=org.freedesktop.DBus, label=unconfined),

# notifications
dbus (send)
    bus=session
    path=/org/freedesktop/Notifications
    interface=org.freedesktop.Notifications
    member="{GetCapabilities,GetServerInformation,Notify,CloseNotification}"
    peer=(label=unconfined),

dbus (receive)
    bus=session
    path=/org/freedesktop/Notifications
    interface=org.freedesktop.Notifications
    member={ActionInvoked,NotificationClosed,NotificationReplied}
    peer=(label=unconfined),

# DesktopAppInfo Launched
dbus (send)
    bus=session
    path=/org/gtk/gio/DesktopAppInfo
    interface=org.gtk.gio.DesktopAppInfo
    member=Launched
    peer=(label=unconfined),

# Allow requesting interest in receiving media key events. This tells Gnome
# settings that our application should be notified when key events we are
# interested in are pressed, and allows us to receive those events.
dbus (receive, send)
  bus=session
  interface=org.gnome.SettingsDaemon.MediaKeys
  path=/org/gnome/SettingsDaemon/MediaKeys
  peer=(label=unconfined),
dbus (send)
  bus=session
  interface=org.freedesktop.DBus.Properties
  path=/org/gnome/SettingsDaemon/MediaKeys
  member="Get{,All}"
  peer=(label=unconfined),

# Allow use of snapd's internal 'xdg-open'
/usr/bin/xdg-open ixr,
/usr/share/applications/{,*} r,
dbus (send)
    bus=session
    path=/
    interface=com.canonical.SafeLauncher
    member=OpenURL
    peer=(label=unconfined),
# ... and this allows access to the new xdg-open service which
# is now part of snapd itself.
dbus (send)
    bus=session
    path=/io/snapcraft/Launcher
    interface=io.snapcraft.Launcher
    member={OpenURL,OpenFile}
    peer=(label=unconfined),

# Allow checking status, activating and locking the screensaver
# gnome/kde/freedesktop.org
dbus (send)
    bus=session
    path="/{,org/freedesktop/,org/gnome/}ScreenSaver"
    interface="org.{freedesktop,gnome}.ScreenSaver"
    member="{GetActive,GetActiveTime,Lock,SetActive}"
    peer=(label=unconfined),

dbus (receive)
    bus=session
    path="/{,org/freedesktop/,org/gnome/}ScreenSaver"
    interface="org.{freedesktop,gnome}.ScreenSaver"
    member=ActiveChanged
    peer=(label=unconfined),

# Allow unconfined to introspect us
dbus (receive)
    bus=session
    interface=org.freedesktop.DBus.Introspectable
    member=Introspect
    peer=(label=unconfined),

# Allow use of snapd's internal 'xdg-settings'
/usr/bin/xdg-settings ixr,
dbus (send)
    bus=session
    path=/io/snapcraft/Settings
    interface=io.snapcraft.Settings
    member={Check,Get,Set}
    peer=(label=unconfined),

## Allow access to xdg-document-portal file system.  Access control is
## handled by bind mounting a snap-specific sub-tree to this location.
owner /run/user/[0-9]*/doc/ r,
owner /run/user/[0-9]*/doc/** rw,

# Allow access to xdg-desktop-portal and xdg-document-portal
dbus (receive, send)
    bus=session
    interface=org.freedesktop.portal.*
    path=/org/freedesktop/portal/{desktop,documents}{,/**}
    peer=(label=unconfined),

dbus (receive, send)
    bus=session
    interface=org.freedesktop.DBus.Properties
    path=/org/freedesktop/portal/{desktop,documents}{,/**}
    peer=(label=unconfined),

# These accesses are noisy and applications can't do anything with the found
# icon files, so explicitly deny to silence the denials
deny /var/lib/snapd/desktop/icons/ r,

# Description: Can configure networking and network namespaces via the standard
# 'ip netns' command (man ip-netns(8)). This interface is restricted because it
# gives wide, privileged access to networking and should only be used with
# trusted apps.

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

capability net_admin,
capability net_raw,
capability setuid, # ping

# Allow protocols except those that we blacklist in
# /etc/modprobe.d/blacklist-rare-network.conf
network appletalk,
network bridge,
network inet,
network inet6,
network ipx,
network packet,
network pppox,
network sna,

@{PROC}/@{pid}/net/ r,
@{PROC}/@{pid}/net/** r,

# used by sysctl, et al
@{PROC}/sys/ r,
@{PROC}/sys/net/ r,
@{PROC}/sys/net/core/ r,
@{PROC}/sys/net/core/** rw,
@{PROC}/sys/net/ipv{4,6}/ r,
@{PROC}/sys/net/ipv{4,6}/** rw,
@{PROC}/sys/net/netfilter/ r,
@{PROC}/sys/net/netfilter/** rw,
@{PROC}/sys/net/nf_conntrack_max rw,

# For advanced wireless configuration
/sys/kernel/debug/ieee80211/ r,
/sys/kernel/debug/ieee80211/** rw,

# read netfilter module parameters
/sys/module/nf_*/                r,
/sys/module/nf_*/parameters/{,*} r,

# networking tools
/{,usr/}{,s}bin/arp ixr,
/{,usr/}{,s}bin/arpd ixr,
/{,usr/}{,s}bin/bridge ixr,
/{,usr/}{,s}bin/dhclient Pxr,             # use ixr instead if want to limit to snap dirs
/{,usr/}{,s}bin/dhclient-script ixr,
/{,usr/}{,s}bin/ifconfig ixr,
/{,usr/}{,s}bin/ifdown ixr,
/{,usr/}{,s}bin/ifquery ixr,
/{,usr/}{,s}bin/ifup ixr,
/{,usr/}{,s}bin/ip ixr,
/{,usr/}{,s}bin/ipmaddr ixr,
/{,usr/}{,s}bin/iptunnel ixr,
/{,usr/}{,s}bin/iw ixr,
/{,usr/}{,s}bin/nameif ixr,
/{,usr/}{,s}bin/netstat ixr,              # -p not supported
/{,usr/}{,s}bin/nstat ixr,
/{,usr/}{,s}bin/ping ixr,
/{,usr/}{,s}bin/ping6 ixr,
/{,usr/}{,s}bin/pppd ixr,
/{,usr/}{,s}bin/pppdump ixr,
/{,usr/}{,s}bin/pppoe-discovery ixr,
#/{,usr/}{,s}bin/pppstats ixr,            # needs sys_module
/{,usr/}{,s}bin/route ixr,
/{,usr/}{,s}bin/routef ixr,
/{,usr/}{,s}bin/routel ixr,
/{,usr/}{,s}bin/rtacct ixr,
/{,usr/}{,s}bin/rtmon ixr,
/{,usr/}{,s}bin/ss ixr,
/{,usr/}{,s}bin/sysctl ixr,
/{,usr/}{,s}bin/tc ixr,
/{,usr/}{,s}bin/wpa_action ixr,
/{,usr/}{,s}bin/wpa_cli ixr,
/{,usr/}{,s}bin/wpa_passphrase ixr,
/{,usr/}{,s}bin/wpa_supplicant ixr,

/dev/rfkill rw,
/sys/class/rfkill/ r,
/sys/devices/{pci[0-9a-f]*,platform,virtual}/**/rfkill[0-9]*/{,**} r,
/sys/devices/{pci[0-9a-f]*,platform,virtual}/**/rfkill[0-9]*/state w,

# arp
network netlink dgram,

# ip, et al
/etc/iproute2/{,**} r,
/etc/iproute2/rt_{protos,realms,scopes,tables} w,
/etc/iproute2/rt_{protos,tables}.d/* w,

# ping - child profile would be nice but seccomp causes problems with that
/{,usr/}{,s}bin/ping ixr,
/{,usr/}{,s}bin/ping6 ixr,
network inet raw,
network inet6 raw,

# pppd
capability setuid,
@{PROC}/@{pid}/loginuid r,
@{PROC}/@{pid}/mounts r,

# static host tables
/etc/hosts w,

# resolvconf
/sbin/resolvconf ixr,
/run/resolvconf/{,**} rk,
/run/resolvconf/** w,
/etc/resolvconf/{,**} r,
/lib/resolvconf/* ix,
# Required by resolvconf
/bin/run-parts ixr,
/etc/resolvconf/update.d/* ix,

# wpa_suplicant
/{,var/}run/wpa_supplicant/ w,
/{,var/}run/wpa_supplicant/** rw,
/etc/wpa_supplicant/{,**} ixr,

#ifup,ifdown, dhclient
/{,var/}run/dhclient.*.pid rw,
/var/lib/dhcp/ r,
/var/lib/dhcp/** rw,

/run/network/ifstate* rw,
/run/network/.ifstate* rw,
/run/network/ifup-* rw,
/run/network/ifdown-* rw,

# route
/etc/networks r,
/etc/ethers r,

/etc/rpc r,

# TUN/TAP - https://www.kernel.org/doc/Documentation/networking/tuntap.txt
#
# We only need to tag /dev/net/tun since the tap[0-9]* and tun[0-9]* devices
# are virtual and don't show up in /dev
/dev/net/tun rw,

# access to bridge sysfs interfaces for bridge settings
/sys/devices/virtual/net/*/bridge/* rw,

# Network namespaces via 'ip netns'. In order to create network namespaces
# that persist outside of the process and be entered (eg, via
# 'ip netns exec ...') the ip command uses mount namespaces such that
# applications can open the /run/netns/NAME object and use it with setns(2).
# For 'ip netns exec' it will also create a mount namespace and bind mount
# network configuration files into /etc in that namespace. See man ip-netns(8)
# for details.

capability sys_admin, # for setns()
network netlink raw,

/ r,
/run/netns/ r,     # only 'r' since snap-confine will create this for us
/run/netns/* rw,
mount options=(rw, rshared) -> /run/netns/,
mount options=(rw, bind) /run/netns/ -> /run/netns/,
mount options=(rw, bind) / -> /run/netns/*,
umount /,

# 'ip netns identify <pid>' and 'ip netns pids foo'. Intenionally omit 'ptrace
# (trace)' here since ip netns doesn't actually need to trace other processes.
capability sys_ptrace,

# 'ip netns exec foo /bin/sh'
mount options=(rw, rslave) /,
mount options=(rw, rslave), # LP: #1648245
umount /sys/,

# Eg, nsenter --net=/run/netns/... <command>
/{,usr/}{,s}bin/nsenter ixr,

# Description: Allow operating as the NetworkManager service. This gives
# privileged access to the system.

capability net_admin,
capability net_bind_service,
capability net_raw,

network netlink,
network bridge,
network inet,
network inet6,
network packet,

@{PROC}/@{pid}/net/ r,
@{PROC}/@{pid}/net/** r,

# used by sysctl, et al
@{PROC}/sys/ r,
@{PROC}/sys/net/ r,
@{PROC}/sys/net/core/ r,
@{PROC}/sys/net/core/** rw,
@{PROC}/sys/net/ipv{4,6}/ r,
@{PROC}/sys/net/ipv{4,6}/** rw,
@{PROC}/sys/net/netfilter/ r,
@{PROC}/sys/net/netfilter/** rw,
@{PROC}/sys/net/nf_conntrack_max rw,

# Needed for systemd's dhcp implementation
@{PROC}/sys/kernel/random/boot_id r,

/sys/devices/**/**/net/**/phys_port_id r,
/sys/devices/**/**/net/**/dev_id r,
/sys/devices/virtual/net/**/phys_port_id r,
/sys/devices/virtual/net/**/dev_id r,
/sys/devices/**/net/**/ifindex r,

/dev/rfkill rw,

/run/udev/data/* r,

# Allow read and write access for all netplan configuration files
# as NetworkManager will start using them to store the network
# configuration instead of using its own internal keyfile based
# format.
/etc/netplan/{,**} rw,

# Allow access to configuration files generated on the fly
# from netplan and let NetworkManager store its DHCP leases
# in the dhcp subdirectory so that console-conf can access
# it.
/run/NetworkManager/ w,
/run/NetworkManager/{,**} r,
/run/NetworkManager/dhcp/{,**} w,

# Needed by the ifupdown plugin to check which interfaces can
# be managed an which not.
/etc/network/interfaces r,
# Needed for systemd's dhcp implementation
/etc/machine-id r,

# Needed to use resolvconf from core
/sbin/resolvconf ixr,
/run/resolvconf/{,**} rk,
/run/resolvconf/** w,
/etc/resolvconf/{,**} r,
/lib/resolvconf/* ix,
# NM peeks into ifupdown configuration
/run/network/ifstate* r,
# Required by resolvconf
/bin/run-parts ixr,
/etc/resolvconf/update.d/* ix,

#include <abstractions/nameservice>
/run/systemd/resolve/stub-resolv.conf r,

# DBus accesses
#include <abstractions/dbus-strict>

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
     path="/org/freedesktop/resolve1"
     interface="org.freedesktop.resolve1.Manager"
     member="SetLink{DNS,Domains}"
     peer=(label=unconfined),

dbus (send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member={Request,Release}Name
   peer=(name=org.freedesktop.DBus, label=unconfined),

dbus (receive, send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member=GetConnectionUnixProcessID
   peer=(label=unconfined),

dbus (receive, send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member=GetConnectionUnixUser
   peer=(label=unconfined),

# Allow binding the service to the requested connection name
dbus (bind)
    bus=system
    name="org.freedesktop.NetworkManager",

# Allow traffic to/from our path and interface with any method for unconfined
# clients to talk to our service.
dbus (receive, send)
    bus=system
    path=/org/freedesktop/NetworkManager{,/**}
    interface=org.freedesktop.NetworkManager*
    peer=(label=unconfined),

# Allow traffic to/from org.freedesktop.DBus for NetworkManager service
dbus (receive, send)
    bus=system
    path=/org/freedesktop/NetworkManager{,/**}
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

dbus(receive, send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.hostname1
    member={Set,SetStatic}Hostname
    peer=(label=unconfined),
# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.hostname1
    member={Set,SetStatic}Hostname,

# Sleep monitor inside NetworkManager needs this
# do not use peer=(label=unconfined) here since this is DBus activated
dbus (send)
    bus=system
    path=/org/freedesktop/login1
    member=Inhibit
    interface=org.freedesktop.login1.Manager,
dbus (receive)
    bus=system
    path=/org/freedesktop/login1
    member=PrepareForSleep
    interface=org.freedesktop.login1.Manager
    peer=(label=unconfined),
dbus (receive)
    bus=system
    path=/org/freedesktop/login1
    interface=org.freedesktop.login1.Manager
    member=Session{New,Removed}
    peer=(label=unconfined),

# Allow access to wpa-supplicant for managing WiFi networks
dbus (receive, send)
    bus=system
    path=/fi/w1/wpa_supplicant1{,/**}
    interface=fi.w1.wpa_supplicant1*
    peer=(label=unconfined),
dbus (receive, send)
    bus=system
    path=/fi/w1/wpa_supplicant1{,/**}
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),

# Leaks installed applications
# TODO: should this be somewhere else?
/etc/mailcap r,
# Snaps should be using xdg-open from the runtime instead of reading these
# files directly since the snap is unable to do anything with these files
# but these accesses have been allowed for a long time and remain so as not
# to break existing snaps. These could be changed to explicit deny rules,
# but that provides a worse debugging experience. Combined, the risks
# outweigh the benefits of closing this information leak for the small
# number of snaps allowed to use allow-sandbox: true. Reference:
# https://forum.snapcraft.io/t/cannot-open-pdf-attachment-with-thunderbird/11845
/usr/share/applications/{,*} r,
/var/lib/snapd/desktop/applications/{,*} r,
owner @{PROC}/@{pid}/fd/[0-9]* w,

# Various files in /run/udev/data needed by Chrome Settings. Leaks device
# information.
# input
/run/udev/data/c1:[0-9]* r,   # /dev/psaux
/run/udev/data/c10:[0-9]* r,  # /dev/adbmouse
/run/udev/data/c13:[0-9]* r,  # /dev/input/*
/run/udev/data/c180:[0-9]* r, # /dev/vrbuttons
/run/udev/data/c4:[0-9]* r,   # /dev/tty*, /dev/ttyS*
/run/udev/data/c5:[0-9]* r,   # /dev/tty, /dev/console, etc
/run/udev/data/c7:[0-9]* r,   # /dev/vcs*
/run/udev/data/+hid:* r,
/run/udev/data/+input:input[0-9]* r,

# screen
/run/udev/data/c29:[0-9]* r,  # /dev/fb*
/run/udev/data/+backlight:* r,
/run/udev/data/+leds:* r,

# sound
/run/udev/data/c116:[0-9]* r, # alsa
/run/udev/data/+sound:card[0-9]* r,

# miscellaneous
/run/udev/data/c108:[0-9]* r, # /dev/ppp
/run/udev/data/c189:[0-9]* r, # USB serial converters
/run/udev/data/c89:[0-9]* r,  # /dev/i2c-*
/run/udev/data/c81:[0-9]* r,  # video4linux (/dev/video*, etc)
/run/udev/data/c202:[0-9]* r, # /dev/cpu/*/msr
/run/udev/data/c203:[0-9]* r, # /dev/cuse
/run/udev/data/+acpi:* r,
/run/udev/data/+hwmon:hwmon[0-9]* r,
/run/udev/data/+i2c:* r,
/sys/devices/**/bConfigurationValue r,
/sys/devices/**/descriptors r,
/sys/devices/**/manufacturer r,
/sys/devices/**/product r,
/sys/devices/**/revision r,
/sys/devices/**/serial r,
/sys/devices/**/vendor r,
/sys/devices/system/node/node[0-9]*/meminfo r,

# Allow getting the manufacturer and model of the
# computer where Chrome/chromium is currently running.
# This is going to be used by the upcoming Hardware Platform
# extension API.
# https://chromium.googlesource.com/chromium/src.git/+/84618eee98fdf7548905e883e63e4f693800fcfa
/sys/devices/virtual/dmi/id/product_name r,
/sys/devices/virtual/dmi/id/sys_vendor r,

# Chromium content api tries to read these. It is an information disclosure
# since these contain the names of snaps. Chromium operates fine without the
# access so just block it.
deny /sys/devices/virtual/block/loop[0-9]*/loop/backing_file r,
deny /sys/devices/virtual/block/dm-[0-9]*/dm/name r,

# networking
/run/udev/data/n[0-9]* r,
/run/udev/data/+bluetooth:hci[0-9]* r,
/run/udev/data/+rfkill:rfkill[0-9]* r,
/run/udev/data/c241:[0-9]* r, # /dev/vhost-vsock

# storage
/run/udev/data/b1:[0-9]* r,   # /dev/ram*
/run/udev/data/b7:[0-9]* r,   # /dev/loop*
/run/udev/data/b8:[0-9]* r,   # /dev/sd*
/run/udev/data/b11:[0-9]* r,  # /dev/scd* and sr*
/run/udev/data/b230:[0-9]* r, # /dev/zvol*
/run/udev/data/c21:[0-9]* r,  # /dev/sg*
/run/udev/data/+usb:[0-9]* r,

# experimental
/run/udev/data/b252:[0-9]* r,
/run/udev/data/b253:[0-9]* r,
/run/udev/data/b259:[0-9]* r,
/run/udev/data/c24[0-9]:[0-9]* r,
/run/udev/data/c25[0-4]:[0-9]* r,

/sys/bus/**/devices/ r,

# Google Cloud Print
unix (bind)
     type=stream
     addr="@[0-9A-F]*._service_*",

# Policy needed only when using the chrome/chromium setuid sandbox
capability sys_ptrace,
ptrace (trace) peer=snap.@{SNAP_INSTANCE_NAME}.**,
unix (receive, send) peer=(label=snap.@{SNAP_INSTANCE_NAME}.**),

# If this were going to be allowed to all snaps, then for all the following
# rules we would want to wrap in a 'browser_sandbox' profile, but a limitation
# in AppArmor profile transitions prevents this.
#
# @{INSTALL_DIR}/@{SNAP_NAME}/@{SNAP_REVISION}/opt/google/chrome{,-beta,-unstable}/chrome-sandbox cx -> browser_sandbox,
# profile browser_sandbox {
#   ...
#   # This rule needs to work but generates a parser error
#   @{INSTALL_DIR}/@{SNAP_NAME}/@{SNAP_REVISION}/opt/google/chrome/chrome px -> snap.@{SNAP_INSTANCE_NAME}.@{SNAP_APP},
#   @{INSTALL_DIR}/@{SNAP_INSTANCE_NAME}/@{SNAP_REVISION}/opt/google/chrome/chrome px -> snap.@{SNAP_INSTANCE_NAME}.@{SNAP_APP},
#   ...
# }

# Required for dropping into PID namespace. Keep in mind that until the
# process drops this capability it can escape confinement, but once it
# drops CAP_SYS_ADMIN we are ok.
capability sys_admin,

# All of these are for sanely dropping from root and chrooting
capability chown,
capability fsetid,
capability setgid,
capability setuid,
capability sys_chroot,

# User namespace sandbox
owner @{PROC}/@{pid}/setgroups rw,
owner @{PROC}/@{pid}/uid_map rw,
owner @{PROC}/@{pid}/gid_map rw,

# Webkit uses a particular SHM names # LP: 1578217
owner /{dev,run}/shm/WK2SharedMemory.* mrw,

# Chromium content api on (at least) later versions of Ubuntu just use this
owner /{dev,run}/shm/shmfd-* mrw,

# Clearing the PG_Referenced and ACCESSED/YOUNG bits provides a method to
# measure approximately how much memory a process is using via /proc/self/smaps
# (man 5 proc). This access allows the snap to clear references for pids from
# other snaps and the system, so it is limited to snaps that specify:
# allow-sandbox: true.
owner @{PROC}/@{pid}/clear_refs w,

# Allow setting realtime priorities. Clients require RLIMIT_RTTIME in the first
# place and client authorization is done via PolicyKit. Note that setrlimit()
# is allowed by default seccomp policy but requires 'capability sys_resource',
# which we deny be default.
# http://git.0pointer.net/rtkit.git/tree/README
dbus (send)
    bus=system
    path=/org/freedesktop/RealtimeKit1
    interface=org.freedesktop.DBus.Properties
    member=Get
    peer=(name=org.freedesktop.RealtimeKit1, label=unconfined),
dbus (send)
    bus=system
    path=/org/freedesktop/RealtimeKit1
    interface=org.freedesktop.RealtimeKit1
    member=MakeThread{HighPriority,Realtime}
    peer=(name=org.freedesktop.RealtimeKit1, label=unconfined),

# Description: Can access common desktop legacy methods. This gives privileged
# access to the user's input.

# accessibility (a11y)
#include <abstractions/dbus-session-strict>
dbus (send)
    bus=session
    path=/org/a11y/bus
    interface=org.a11y.Bus
    member=GetAddress
    peer=(label=unconfined),

#include <abstractions/dbus-accessibility-strict>

# Allow the accessibility services in the user session to send us any events
dbus (receive)
    bus=accessibility
    peer=(label=unconfined),

# Allow querying for capabilities and registering
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/accessible/root"
    interface="org.a11y.atspi.Socket"
    member="Embed"
    peer=(name=org.a11y.atspi.Registry, label=unconfined),
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/registry"
    interface="org.a11y.atspi.Registry"
    member="GetRegisteredEvents"
    peer=(name=org.a11y.atspi.Registry, label=unconfined),
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/registry/deviceeventcontroller"
    interface="org.a11y.atspi.DeviceEventController"
    member="Get{DeviceEvent,Keystroke}Listeners"
    peer=(name=org.a11y.atspi.Registry, label=unconfined),
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/registry/deviceeventcontroller"
    interface="org.a11y.atspi.DeviceEventController"
    member="NotifyListenersSync"
    peer=(name=org.a11y.atspi.Registry, label=unconfined),

# org.a11y.atspi is not designed for application isolation and these rules
# can be used to send change events for other processes.
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/accessible/root"
    interface="org.a11y.atspi.Event.Object"
    member="ChildrenChanged"
    peer=(name=org.freedesktop.DBus, label=unconfined),
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/accessible/root"
    interface="org.a11y.atspi.Accessible"
    member="Get*"
    peer=(label=unconfined),
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/accessible/[0-9]*"
    interface="org.a11y.atspi.Event.Object"
    member="{ChildrenChanged,PropertyChange,StateChanged,TextCaretMoved}"
    peer=(name=org.freedesktop.DBus, label=unconfined),
dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/accessible/[0-9]*"
    interface="org.freedesktop.DBus.Properties"
    member="Get{,All}"
    peer=(label=unconfined),

dbus (send)
    bus=accessibility
    path="/org/a11y/atspi/cache"
    interface="org.a11y.atspi.Cache"
    member="{Add,Remove}Accessible"
    peer=(name=org.freedesktop.DBus, label=unconfined),


# ibus
# subset of ibus abstraction
/usr/lib/@{multiarch}/gtk-2.0/[0-9]*/immodules/im-ibus.so mr,
owner @{HOME}/.config/ibus/      r,
owner @{HOME}/.config/ibus/bus/  r,
owner @{HOME}/.config/ibus/bus/* r,

# allow communicating with ibus-daemon (this allows sniffing key events)
unix (connect, receive, send)
    type=stream
    peer=(addr="@/tmp/ibus/dbus-*"),

# abstract path in ibus >= 1.5.22 uses $XDG_CACHE_HOME (ie, @{HOME}/.cache)
# This should use this, but due to LP: #1856738 we cannot
#unix (connect, receive, send)
#    type=stream
#    peer=(addr="@@{HOME}/.cache/ibus/dbus-*"),
unix (connect, receive, send)
     type=stream
     peer=(addr="@/home/*/.cache/ibus/dbus-*"),


# mozc
# allow communicating with mozc server
unix (connect, receive, send)
     type=stream
     peer=(addr="@tmp/.mozc.*"),


# fcitx
# allow communicating with fcitx dbus service
dbus send
    bus=fcitx
    path=/org/freedesktop/DBus
    interface=org.freedesktop.DBus
    member={Hello,AddMatch,RemoveMatch,GetNameOwner,NameHasOwner,StartServiceByName}
    peer=(name=org.freedesktop.DBus),

owner @{HOME}/.config/fcitx/dbus/* r,

# allow creating an input context
dbus send
    bus={fcitx,session}
    path=/inputmethod
    interface=org.fcitx.Fcitx.InputMethod
    member=CreateIC*
    peer=(label=unconfined),

# allow setting up and tearing down the input context
dbus send
    bus={fcitx,session}
    path=/inputcontext_[0-9]*
    interface=org.fcitx.Fcitx.InputContext
    member="{Close,Destroy,Enable}IC"
    peer=(label=unconfined),

dbus send
    bus={fcitx,session}
    path=/inputcontext_[0-9]*
    interface=org.fcitx.Fcitx.InputContext
    member=Reset
    peer=(label=unconfined),

# allow service to send us signals
dbus receive
    bus=fcitx
    peer=(label=unconfined),

dbus receive
    bus=session
    interface=org.fcitx.Fcitx.*
    peer=(label=unconfined),

# use the input context
dbus send
    bus={fcitx,session}
    path=/inputcontext_[0-9]*
    interface=org.fcitx.Fcitx.InputContext
    member="Focus{In,Out}"
    peer=(label=unconfined),

dbus send
    bus={fcitx,session}
    path=/inputcontext_[0-9]*
    interface=org.fcitx.Fcitx.InputContext
    member="{CommitPreedit,Set*}"
    peer=(label=unconfined),

# this is an information leak and allows key and mouse sniffing. If the input
# context path were tied to the process' security label, this would not be an
# issue.
dbus send
    bus={fcitx,session}
    path=/inputcontext_[0-9]*
    interface=org.fcitx.Fcitx.InputContext
    member="{MouseEvent,ProcessKeyEvent}"
    peer=(label=unconfined),

# this method does not exist with the sunpinyin backend (at least), so allow
# it for other input methods. This may consitute an information leak (which,
# again, could be avoided if the path were tied to the process' security
# label).
dbus send
    bus={fcitx,session}
    path=/inputcontext_[0-9]*
    interface=org.freedesktop.DBus.Properties
    member=GetAll
    peer=(label=unconfined),

# gtk2/gvfs gtk_show_uri()
dbus (send)
    bus=session
    path=/org/gtk/vfs/mounttracker
    interface=org.gtk.vfs.MountTracker
    member=ListMountableInfo,
dbus (send)
    bus=session
    path=/org/gtk/vfs/mounttracker
    interface=org.gtk.vfs.MountTracker
    member=LookupMount,

# This leaks the names of snaps with desktop files
/var/lib/snapd/desktop/applications/ r,
/var/lib/snapd/desktop/applications/mimeinfo.cache r,
# Support BAMF_DESKTOP_FILE_HINT by allowing reading our desktop files
# parallel-installs: this leaks read access to desktop files owned by keyed
# instances of @{SNAP_NAME} to @{SNAP_NAME} snap
/var/lib/snapd/desktop/applications/@{SNAP_INSTANCE_NAME}_*.desktop r,
