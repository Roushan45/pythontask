#include <cs50.h>
#include <stdio.h>
 
int main(void)//syntax error ; not needed
{
	int height,spaces,hashes;//declared all int variables here
 do
 {//missing opening bracket
 // prompt the user for the height of Mario's Pyramid
 height = get_int("Height");
 spaces = get_int("Spaces");//missing semi colon
 hashes = get_int("#");//missing semi colon
}
while(height > 23 || height < 0); //logical and syntax error corrected

int i,j,k;//declared all variables here
// print the rows

for(i = 0 ;i< height ;i++)//syntax error
{
// print the spaces
for(j = 0;j < spaces; j++)//syntax error
 printf(" ");//missing semicolon
{
// print the hashes
for(k = 0;k< hashes ;k++)//logical error and syntax error
printf("#") ;//missing semicolon
}
}
return 0;
}//missing closed bracket
