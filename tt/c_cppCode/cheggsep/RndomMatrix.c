#include<stdio.h>
#include<stdlib.h>
#define MAX 3

int main()
{
	//3 X 3 MAtrix declared
	//MAX =3 define above
	int matrix[MAX][MAX];
	int i,j;
	//looping through variables
	for(i=0;i<MAX;i++)
	{
		for(j=0;j<MAX;j++)
		{
			//in loop checking if Random generated 
			//is multiple of 20
			while(1)
			{
				int s = rand()%1000;
				if(s%20==0)
				{
					//if multiple of 20 found breaking the loop
					matrix[i][j]=s;
					break;
				}
			}
		}
	}
	//printing the Matrix
	printf("==========================================\n");
	printf("------3X3 Matrix Multiple of 20-------------\n\n");
	printf("              ");
	for(i=0;i<MAX;i++)
	{
		for(j=0;j<MAX;j++)
		{
			printf("%d  ",matrix[i][j]);
		}
		printf("\n              ");
		//printf("\n");
	}
	return 0;
	
}
