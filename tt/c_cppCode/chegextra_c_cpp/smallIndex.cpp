#include <iostream>
using namespace std;
//declared function for getting min index no
void smallNoIndex(int* array, int size);
int main()
{
	//declared an array of 100 elements
	int array[100];
	//asking for input
	cout<<"Enter integer values or -1 to quit"<<endl;
	//size will count no of user input
	int size=0;
	int input;
	//loop will run until user input -1
	while(input != -1)
	{
		cin>>input;
		if(input != -1){
			//adding values to array
			array[size]=input;
			//increasing the size 
			size++;
		}
			
	}
	//calling the function 
	smallNoIndex(array, size);
	return 0;
}
void smallNoIndex(int* array, int size)
{
	//smallNO will track smallest no in array
	int smallno=array[0];
	//this variable will store the index no of small no
	int indexofsmallNo;
	int i;
	//for loop 
	for(i=0;i<size;i++)
	{
		if(array[i]<smallno)
		{
			//comapring the value for getting small no
			smallno=array[i];
			//index for small no
			indexofsmallNo = i;
		}
	}
	//printing the output
	cout<<"The minimum value's index is "<<indexofsmallNo<<" and the minimum value us "<<smallno;

	
}
