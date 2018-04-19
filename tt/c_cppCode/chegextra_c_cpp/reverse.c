#include<stdio.h>
#include<string.h>
int main(void)
{
	//char array
	char array[50];
	//asking for word
	printf("Please enter a word: ");
	scanf("%s",&array);
	int i;
	printf("You entered %s , which in reverse is : ",array);
	//using for loop and strlen reversed the word
	for(i=strlen(array)-1;i>=0;i--)
	{
		printf("%c",array[i]);
	}
	return 0;
}
