#include<iostream>
#include <sstream>
//method for reading the user input
void getInput(int *array)
{
	int count=0;
	//reading whole input in string
	 std::string numbers;
	 std::cout<<"Enter the 50 integers seprated by space \n";
	getline( std::cin, numbers, '\n' );
	int number;
    for ( std::istringstream iss( numbers );//using sstream lib splitting by space
          iss >> number; ) {
        array[count++]=number;//storing to array
    }
}
void selectionSort(int *array){
	//two var for running loop
	 int i, j;
    for (i = 0 ;  i < 50;i++)
    {
        for (j = i ; j < 50; j++)
        {
        	//if condition match for swap
        	//sorting in ascending order
            if (array[i] > array[j])
               {
               	//swapping the array
               	int temp;
    			temp = array[i];
    			array[i] = array[j];
   				array[j] = temp;
               }
 
        }
    }
}
//method for printing the array
void printArray(int *array){
	for(int i=0;i<50;i++)
	{
		std::cout<<array[i]<<" ";
	}
}
int main(void)
{
	//array for 50 int
	int *array=new int[50];
	//getting input
	getInput(array);
	//sorting the array
	selectionSort(array);
	std::cout<<"\nArray after selection sort : \n\n";
	//printing the result
	printArray(array);
	return 0;
}

