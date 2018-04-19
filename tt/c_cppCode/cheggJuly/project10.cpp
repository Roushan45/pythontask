#include<stdlib.h>
#include<stdio.h>
#include<ctype.h>
#include<string.h>
bool allDigits(char str[]);
char *firstNonDigit(char str[]);
int main()
{
	char buffer[100];
	
	printf("Checking if input contains digits only\n");
	while(1)
	{
		printf("Enter the number : ");
		fgets(buffer,100,stdin);
		if(allDigits(buffer)==1)
		{
			printf("\nInput number was : %s",buffer);
			printf("Twice value of number :  %d\n",2*atoi(buffer));
			break;
		}
		else
		{
			char *non_digit=firstNonDigit(buffer);
			printf("Invalid input , it contains non-digit : %c \n",non_digit[0]);
		}
		
	}
	return 0;
}
bool allDigits(char str[])
{
	//printf("in all digit\n");
	int i=0;
	while(str[i]!='\0'&&str[i]!='\n')
	{
		char c=str[i++];
		//printf("char %c \n",c);
	//	int temp=atoi(&c);
		if(isdigit(c)==0)
		{
			
			return 0;
		}
	}
	return 1;
}
char *firstNonDigit(char str[])
{
	char *nonDigit;
	if(allDigits(str)==1)
	{
		printf("returning null\n");
		return NULL;
	}
	
	int i=0;
	while(str[i]!='\0'&&str[i]!='\n')
	{
		char c=str[i++];
		if(isdigit(c)==0)
		{
		nonDigit=&c;
			break;
		}
	}
//	printf("non digit %c \n",nonDigit[0]);
	return nonDigit;
}
