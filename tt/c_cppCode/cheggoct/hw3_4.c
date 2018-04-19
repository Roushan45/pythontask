#include<stdio.h>
#include<string.h>
int main(void)
{
	char word_array[50][100];
	int count=0;
	printf("Enter the series of word , for ending input enter xxx: \n");
	char temp2[100];
	for(;;)
	{
		
		scanf("%s",&temp2);
		if(strcmp(temp2,"xxx")==0)break;
		else{
			strcpy(word_array[count++],temp2);
		}
	}

	char temp1[50][100];
	int i,j;
	int x=0,y=0;
	for(i=0;i<count-1;i++)
	{
		for(j=i+1;j<count;j++)
		{
			if(strcmp(word_array[i],word_array[j])==0)
			{
				strcpy(temp1[x++],word_array[i]);
			}
		}
	}
	printf("The result is :\n");
	for(i=0;i<count;i++)
	{
		for(j=0;j<x;j++)
		{
			if(strcmp(word_array[i],temp1[i])==0)continue;
			printf("%s\n",word_array[i]);
		}
	}
	printf("Repeated words: ");
	for(i=0;i<x;i++)
	printf("%s\n",temp1[i]);
	return 0;
}
