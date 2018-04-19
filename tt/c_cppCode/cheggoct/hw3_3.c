#include<stdio.h>
#include<string.h>
int main(void)
{
	char word_array[50][100];
	int count=0;
	printf("Enter the series of word , for ending input xxx : \n");
	char temp[100];
	for(;;)
	{
		
		scanf("%s",&temp);
		if(strcmp(temp,"xxx")==0)break;
		else{
			strcpy(word_array[count++],temp);
		}
	}
	int j;
	printf("\nThe result is : \n");
	for(j=count-1;j>=0;j--)
	{
		printf("%s\n",word_array[j]);
	}
	return 0;
}
