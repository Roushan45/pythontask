#include<stdio.h>

int main()
{
	int array[3];
	int index=0;
	printf("Enter the three numbers press enter after each number \n");
	for(index=0;index<3;index++)
	{
		int input;
		scanf("%d",&input);
		array[index]=input;
	}
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
	printf("%d",array[0]);
	return 0;
}
