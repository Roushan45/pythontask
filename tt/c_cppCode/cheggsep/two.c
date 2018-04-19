#include<stdio.h>

int isAscending(int []);
int isDescending(int []);
int main(void)
{
	int array[10];
	int a;
	for(a=0;a<10;a++)scanf("%d",&array[a]);
	if(isAscending(array)==1)
		printf("The values are in ascending order \n");
	else if(isDescending(array)==1)
		printf("The values are in descending order \n");
	else
		printf("The values are neither ascending or descending\n");
	return 0;
}
//checking for ascending
int isAscending(int array[]){
	int i;
	for(i=0;i<9;i++)
	{
			//if next element is lesser or equal 
		//returning false
		if(array[i+1]<=array[i])return 0;
	}
	return 1;
}
//checking for descending
int isDescending(int array[]){
	int i;
	for(i=0;i<9;i++)
	{
		//if next element is greater or equal 
		//returning false
		if(array[i+1]>=array[i])return 0;
	}
	return 1;
}
