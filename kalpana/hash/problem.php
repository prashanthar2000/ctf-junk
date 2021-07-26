<?php 
#include("mydatabase.php");
$handle = fopen("/home/prashanth/Music/five86-2/rockyou.txt", "r");
if ($handle) {
    while (($line = fgets($handle)) !== false) {
        $hash = md5(crypt($line,'salted'));
        if( $hash === "e7925ce09ec0eac25293ead97f7bdaf0")
        {
            echo $line;
            break;
        }
        else{
            echo "not a password $line ";
        }
	    
        // process the line read.
    }

    fclose($handle);
} else {
    // error opening the file.
} 
	$hash = md5(crypt($user_password,'salted'));
	echo "$user_password"

?>
