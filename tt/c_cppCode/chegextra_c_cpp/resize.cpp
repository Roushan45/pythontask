#include<iostream>
#include<vector>
#include<stdlib.h>
#include<iterator>

using namespace std;
//please use c++ 11 complier 


int main()
{
	//initial array delcared with 10 elements
	int array[10];

	int i;
	//initia;ized the array with random elements
	for(i=0;i<10;i++)
	{
		//rand function will generate random no between 1 and 1000
		array[i]=rand() % 1000 + 1;
	}
	//printed the old values from
	cout<<"printing from  array with 10 elements : \n";
	for(i=0;i<10;i++)
	{
		cout<<array[i]<<" ";
	}
	//declared the new array of size 20
	int newarray[20];
	//using dynamic copy copied the element from old to new
	copy(begin(array), end(array), begin(newarray));

	for(i=10;i<20;i++)
	{
		//filling the rest position of array with random variables
		newarray[i]=rand() % 1000 + 1;
	}
	
//dispalying the values of new array
	cout<<"\nprinting from  array with 20 elements : \n";
	for(i=0;i<20;i++)
	{
		cout<<array[i]<<" ";
	}
	
	//declared the  vector of initial size of 10
	vector<int> vectorarray(10);
	for(i=0;i<10;i++)
	{
		//initialized the vector to some random values
		vectorarray[i]=rand() % 1000 + 1;
	}
	//print out the values of vector from old 
	cout<<"\n\nprinting from old vector with 10 elements : \n";
	for(i=0;i<10;i++)
	{
		cout<<vectorarray[i]<<" ";
	}
	
	//resized vector to store 20 elements
	vectorarray.resize(20);
//initialized the rest place with some random values
	for(i=10;i<20;i++)
	{
		vectorarray[i]=rand() % 1000 + 1;
	}
	//displaying all 20 values from a vector
	cout<<"\nprinting from resized vector with 20 elements : \n";
	for(i=0;i<20;i++)
	{
		cout<<vectorarray[i]<<" ";
	}
	delete[] array;
	return 0;
}
