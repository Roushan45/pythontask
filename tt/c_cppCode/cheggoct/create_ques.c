#include<stdio.h>
#include<string.h>
#include<stdlib.h>
char* createQuestion(char* part1,char* part2,char* part3){
	//allocated size of question to 1000 chars
	char *question = (char*)malloc(sizeof(char)*1000);
	int index=0,i;
	//adding part1 content to question
	for(i=0;part1[i]!='\0';i++)
	{
		question[index++]=part1[i];
	}
	//adding part2 content to question
	for(i=0;part2[i]!='\0';i++)
	{
		question[index++]=part2[i];
	}
	//adding part3 content to question
	for(i=0;part3[i]!='\0';i++)
	{
		question[index++]=part3[i];
	}
	return question;//returning full question
}
int main(void)
{
	//have created three parts please feel free to
	//replace with yours
	char* part1="First Part ";
	char* part2="Second Part ";
	char* part3="Third Part ";
	//printing full question by calling method with all parts
	printf("Full Question  : %s",createQuestion(part1,part2,part3));
	return 0;
}
