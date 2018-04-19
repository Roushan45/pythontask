/*This is the test program for finding the smallest index of int array*/
#include "SmallIndex.cpp"
#include<iostream>
using namespace std;
int main()
{
	//array1 with 7 int 
	int *array1=new int[7];
	//initialized the array
	array1[0]=34;array1[1]=4;array1[2]=9;array1[3]=2;array1[4]=34;
	array1[5]=23;array1[6]=2;
	//printing the array contents
	cout<<"First Test \nArray1 elements \n";
	for(int i=0;i<7;i++)
	{
		cout<<"index : "<<i<<" value : "<<array1[i]<<endl;
	}
	//printing the index
std::cout<<"first index of smallest no in array1 : "<<smallestIndex(array1,7);

	int *array2=new int[7];
	array2[0]=57;array2[1]=1;array2[2]=9;array2[3]=1;array2[4]=2;
	array2[5]=1;array2[6]=56;
	
	cout<<"\n\nSecondTest \narray2 elements \n";
	for(int i=0;i<7;i++)
	{
		cout<<"index : "<<i<<" value : "<<array2[i]<<endl;
	}
std::cout<<"first index of smallest no in array2 : "<<smallestIndex(array2,7);
	return 0;
}
