#include <stdio.h>
#define ROWS 100
#define COLS 2
//declared the required function
void columnAvg(int array[ROWS][COLS],int rows,double* a, double* b);
double allElementsAvg(int array[ROWS][COLS], int rows);
int main()
{
//declared array with given data
	int A [2][2]={{-1,9},{5,13}};
	int B [3][2] ={{7,26},{-9,0},{12,-17}};	
	int C [5][2] ={{8,32},{16,64},{25,-5},{22,10},{7,41}};
	//two variable for storing the column average
	double a;
	double b;
	//calling the column averege method by passing
	//the address of a and b
	columnAvg(A,2,&a,&b);
	//printing the values
	printf("column average = (%.02f, %.02f)\n",a,b);
	//printing and calling the all value average
	printf("Average All = %.02f\n",allElementsAvg(A,2));
	columnAvg(B,3,&a,&b);
	printf("\ncolumn average = (%.02f, %.02f)\n",a,b);
	printf("Average All = %.02f\n",allElementsAvg(B,3));
	columnAvg(C,5,&a,&b);
	printf("\ncolumn average = (%.02f, %.02f)\n",a,b);
	printf("Average All = %.02f",allElementsAvg(C,5));
	return 0;
}
void columnAvg(int array[ROWS][COLS],int rows,double* a, double* b)
{
	//resetting the any previous value to 0
	*b=0;*a=0;
	int i,j;
	for(i=0;i<rows;i++)
	{
		for(j=0;j<2;j++)
		{
			if(j==0)
			{
				*a=*a+array[i][j];
			}
			else{
				*b=*b+array[i][j];
			}
		}
	}
	//storing the average into a and b
	*a=*a/rows;
	*b=*b/rows;

}
double allElementsAvg(int array[ROWS][COLS], int rows)
{
	double sum=0;
	//it will count the no of elements in array
	int noOfElement=0;
	int i,j;
	for(i=0;i<rows;i++)
	{
		for(j=0;j<2;j++)
		{
			sum=sum+array[i][j];
			noOfElement++;
		}
	}
	//returning the average of all values
	return sum/noOfElement;
}
