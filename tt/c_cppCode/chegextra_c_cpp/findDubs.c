#include<stdio.h>
#include<stdlib.h>
int **allocateArray(int r, int c)
{
	int **array = (int **)malloc (sizeof(int *)*r);
	int a,b;
	for(a=0;a<r;a++)
	{
		array[a]=(int *) malloc (sizeof(int *)*c);
		return array;
	}
}
void readArray(int **array, int r, int c)
{
	int a,b;
	for(a=0;a<r;a++){
		for(b=0;b<c;b++){
			scanf("%d",&array[a][b]);
			printf("\n");
		}
		return;
	}
}
void printArray(int **array, int r, int c)
{
	int a,b;
	for(a=0;a<r;a++){
		for(b=0;b<c;b++){
			printf("%d",array[a][b]);
			printf("\n");
		}
		return;
	}
}
int hasDups(int **data,int r,int c)
{
	int a,b,j,noOfDups=0;
	for(a=0;a<r;a++){
		for(b=0;b<c;b++){
			printf("calling find dups\n");
			j=data[a][b];
				printf("j = %d\n",j);
			noOfDups=findDups(**data,r,c,j);
			printf("No of Dups %d\n",noOfDups);
			if(noOfDups>1)
			{
				return 1;
			}
		}
	
	}
	return 0;
}
int findDups(int **data,int r,int c , int x)
{
	printf("%d %d %d\n",r,c,x);
		printf("in find dups\n");
	int a,b,count=0,i;
	for(a=0;a<r;a++){
		for(b=0;b<c;b++){
				printf("in find dups iterarting\n");
			//	i=data[a][b];
				printf("i = %d\n",8);
			if(8==x)
			{
				printf("in find dups data matching\n");
				count=count+1;
			}
		}
	
	}
	return count;
}
int main()
{
	int **data=allocateArray(5,5);
	readArray(data,5,5);
	printArray(data,5,5);
	if(hasDups(data,5,5))
		printf("The Matrix Has Dublicate Value \n");
	else
		("No Duplicate values");
	return 0;
}
