#include<stdlib.h>
#include<stdio.h>
#include<ctype.h>
bool allDigits(char str[]);
int main()
{
	
	return 0;
}
bool allDigits(char str[])
{
	int i=0;
	while(str[i]!='\0')
	{
		if(isdigit(str[i])!=0)
		{
			return 0;
		}
	}
	return 1;
}
