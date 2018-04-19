#include <iostream>
#define ROWS 100
#define COLS 2
using namespace std;
void columnAvg(int array[ROWS][COLS],int rows,double* a, double* b);
double allElementsAvg(int array[ROWS][COLS], int rows);
int main()
{
//	int A [2][2] ={{-1,9},{5,13}};
	int A [2][2]={{-1,9},{5,13}};
	int B [3][2] ={{7,26},{-9,0},{12,-17}};	
	int C [5][2] ={{8,32},{16,64},{25,-5},{22,10},{7,41}};
	double a;
	double b;
	columnAvg(A,2,&a,&b);
	printf("column average = (.2f, .2f)",a,b);
	cout<<"column average = ("<<a<<", "<<b<<")"<<endl;
	cout<<"Average All ="<<allElementsAvg(A,2)<<endl;
	columnAvg(B,3,&a,&b);
	cout<<"column average = ("<<a<<", "<<b<<")"<<endl;
	cout<<"Average All ="<<allElementsAvg(B,3)<<endl;
	columnAvg(C,5,&a,&b);
	cout<<"column average = ("<<a<<", "<<b<<")"<<endl;
	cout<<"Average All ="<<allElementsAvg(C,5)<<endl;
	return 0;
}
void columnAvg(int array[ROWS][COLS],int rows,double* a, double* b)
{
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
	*a=*a/rows;
	*b=*b/rows;
//	cout<<*a<<" "<<*b<<endl;
}
double allElementsAvg(int array[ROWS][COLS], int rows)
{
	double sum=0;
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
	return sum/noOfElement;
}
