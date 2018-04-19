#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
#include <time.h>
#define ROWS 20
#define COLUMNS 40
int main(void)
{
    char input_table[ROWS][COLUMNS];
    char temp[40];    
 	char exit[10]="XXX";
    int current_row=0;
    const char delim[2] = " ";
   char *token;
    time_t mytime;
    mytime = time(NULL);
    printf(ctime(&mytime));
    printf("program name : tokenizer.c\n\n");
    //loop initiated for taking input
   while(current_row<=20){
   
    printf("Enter name age and wage: ");
    //copied input in temp variable
    fgets(temp, 30, stdin);  
   
      int exitstatus=0; 
      //delimitting the string by space
   token = strtok(temp, delim);
   int i=0;
   
   char name[40];
   	int age=0;
   	float wage=0;
   while( token != NULL ) 
   {
   	if(i==0)
   	{
   	
   	strcpy(name,token);
   //if name==xxx then breaking the loop
   	if(strcmp(name,exit)==1)
   	{
   		exitstatus=1;
   		break;
	   }
	   }
     //modifying age
    if(i==1)
    {
    	age=atoi(token);
    
	}
	//modifying wage
	if(i==2)
	{
		wage=atof(token);
		wage=wage+(wage/2);
	}
      token = strtok(NULL, delim);
      i++;
   }
   if(exitstatus==1)
   	break;
   	//converting to string after modifying
   	char temp1[10];
   	char temp2[10];
   	itoa(age,temp1,10);
  
   snprintf(temp2, 10, "%.2f", wage);
  //concating the string 
   strcat(name," ");
   	strcat(name,temp1);
   	strcat(name," ");
   	strcat(name,temp2);
  //saving the string to 2d array
   strcpy(input_table[current_row],name);
  //increasing the row count
  current_row++;
   
}
//displaying data from array
int j;
   for(j=0;j<current_row;j++)
   {
   	printf("%s\n",input_table[j]);
   }
     
    return 0;
}
