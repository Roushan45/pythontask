#!/bin/bash
#running loop in infinite way
while true;do
    #getting the numbers of file in /tmp directory
    file_count=$(ls /tmp/ | wc -l)
   #checking if /tmp/killspring found in tmp
    if [ ! -f /tmp/killspring ]; then
        #printing to console using logger
        logger -s "There are $file_count files in /tmp"
        #sleeping for 10 seconds
        sleep 10
    else
        #if file found then exiting the program
        logger -s "file  /tmp/killspring found exiting..."
        break
    fi
done #end of while loop