#include<stdio.h>

int main()
{
	//array of 3 elements defined
	int array[3];
	int index=0;
	printf("Enter the three numbers press enter after each number \n");
	//asking for 3 inputs integer
	for(index=0;index<3;index++)
	{
		int input;
		scanf("%d",&input);
		array[index]=input;
	}
	//ordering the integers by sorting them
	int i,j;
	for( i=0;i<2;i++)
	{
		for(j=i+1;j<3;j++)
		{
			if(array[i]>array[j])
			{
				int temp=array[j];
				array[j]=array[i];
				array[i]=temp;
				
			}
		}
	}
	int k;
	//using abs function checking the difference
	//and printing the result
	if(abs(array[0]-array[1])!=abs(array[1]-array[2]))
		printf("it can not be arithmatic progression");
	else
		printf("it can be arithmatic progression");
	return 0;
}
