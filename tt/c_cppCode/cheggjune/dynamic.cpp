#include<iostream>
using namespace std;
//given struct
struct DynamicArray
{
	int *array;
	int size;
	int count;
};
//given grow function
void grow( DynamicArray &da )
{
    int *temp = da.array;
    da.array = new int[da.size*2];
    for ( int i=0;i<da.size; i++ )
        da.array[i] = temp[i];
    delete [] temp;
    da.size = da.size * 2;
}
//implemented onr function
//that will take list of int 
//dynamic array and size of the list
void readData(int list[],int length,DynamicArray &da)
{
	//initialize with size
	da.size=5;
	da.array=new int[da.size];
	for(int i=0;i<length;i++)
	{
		//checking for dynamic array size
		if(i>=da.size)
		//if list has more element than 
		//current size then growing the list
		grow(da);
		//copying the value from list to array
		da.array[i]=list[i];
		//increasing the count
		da.count++;
	}
	//printing the data
	cout<<"Size : "<<da.size<<endl;
	cout<<"Count : "<<da.count<<endl;
	cout<<"Data : "<<endl;
	for(int i=0;i<da.count;i++)
	{
		cout<<da.array[i]<<endl;
	}
}
//main function
int main()
{
	//declared dyanmic array
	DynamicArray da ;
	//list of int of size 9
	int list[9]={6,2,35,23,56,34,65,23,52};
	//calling the readData method
	readData(list,9,da);
	//another dynamic array created
	DynamicArray da1;
	//list of size 5
	int list1[5]={5,3,34,65,23};
	//calling the method
	readData(list1,5,da1);
	return 0;
}
