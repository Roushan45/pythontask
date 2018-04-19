from os import rename, listdir
import datetime
#finding the word in file name as draft
replaceWord = "draft"
#asking for user input for directory
dirpath=raw_input("Enter the full directory of path : ")
fnames = listdir(dirpath)
#iterating through the directory
for fname in fnames:
    #if draft found in file name
    if replaceWord in fname:
        #opening the file for editing
        with open(fname,"a") as f:
            #writting the current date at the end of file
            f.write('Edited on : ')
            f.write(str(datetime.datetime.now()))
            f.close()
        #renaming the file after editing
        rename(fname, fname.replace(replaceWord, 'final', 1))
