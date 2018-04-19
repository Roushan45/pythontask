#include<stdio.h>
#include<stdlib.h>
int main()
{
	file name declared
	char fileName[30] = "employees.txt";
	FILE *fptr;
	//opened he file for reading
	fptr=fopen(fileName,"r");
	char buffer[100];
	//if file not opened
	if(fptr==NULL)
	{
		printf("Error reading file ");
		exit(1);
	}
//looping through file using fgets
	while(fgets(buffer,100,fptr))  
{  
//priting the file line
       printf("%s",buffer);
    
}  
	return 0;
}
