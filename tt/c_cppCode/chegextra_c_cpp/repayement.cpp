#include<iostream>
//declared macro for array size
#define   MAX_SIZE  8
using namespace std;
//declared two function fopr sorting an array
int bubbleSort(int array[]);
int insertionSort(int array[]);

int main()
{
	//declared the two identical array with 8 elements
	int array1[MAX_SIZE]={34,12,14,63,4,99,33,59};
	int array2[MAX_SIZE]={34,12,14,63,4,99,33,59};
	//before sorting the array dispalying values
	cout<<"Array before sorting...\n";
	for(int i=0;i<8;i++)
	{
		cout<<array1[i]<<" ";
	}
	cout<<"\n\nSorting arrays by Bubble sort and Insertion Sort....."<<endl;
	cout<<"\n\n";
	//displaying the count of exchane by calling the appropriate function
	cout<<"The Exchange count  by Bubble Sort : "<<bubbleSort(array1)<<endl;
	cout<<endl;
	cout<<"The Exchange count  by Insertion Sort : "<<insertionSort(array2)<<endl;
	
	return 0;
}
//bubble sort algorithm
int bubbleSort(int array[])
{
//swapcount will store actual swap count
	int swapCount=0;
	for(int i = MAX_SIZE-1; i >= 0; i--)
   {
      for(int j = 1; j <= i; j++)
      {
         if(array[j-1] > array[j])
         {
              int temp = array[j-1];
              array[j-1] = array[j];
              array[j] = temp;
              ++swapCount;
   } 
   } 
   }
   return swapCount;
}
//insertion sort algorithm
int insertionSort(int array[])
{
	int swapCount=0;
for (int i = 0; i < MAX_SIZE; i++){
	int	j = i;
		
		while (j > 0 && array[j] < array[j-1]){
		int	 temp = array[j];
			  array[j] = array[j-1];
			  array[j-1] = temp;
			  ++swapCount;
			  j--;
			  }
		}
return swapCount;
}
