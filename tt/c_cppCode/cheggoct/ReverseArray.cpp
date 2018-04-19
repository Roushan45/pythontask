#include<iostream>
#include<iomanip>
#include<math.h>
//required function prototype
void printArray(const double *array,int);
void swapArray(double *array,int,int);
void reverseArray(double *array,int size);
using namespace std;
int main(void){
	//array of 56 element
	double *array = new double[56];
	//initializing the array
	for(int i=0;i<56;i++)
	{
		if(i<28)//first 28 are square of index
			array[i]=(i+1)*(i+1);
		else
			array[i]=sqrt(i+1);//next 28 are square root
	}
	cout<<"Array before reverse .."<<endl;
	printArray(array,56);//print the array
	//reversed the array
	reverseArray(array,56);//reversed the array using reverse method
	cout<<"\n\nArray After reversed ..\n";
	printArray(array,56);//printing the array after reversing
}

//method for printing the array
void printArray(const double *array,int size){
	cout<<fixed;
	cout<<setprecision(1)<<endl;
	for(int i=0;i<size;i++)
	{
		if(i>1&&i%10==0)
			cout<<endl;
		 std::cout.width(6);cout<<array[i]<<" ";
		
	}
}
//method for swapping the array
void swapArray(double *array,int first,int second){
	int temp=array[first];
	array[first]=array[second];
	array[second]=temp;
	
}
//method for reversing the array
void reverseArray(double *array,int size){
	for(int i=0,j=size-1;i<size&&j>0;i++,j--){
		if(i==size/2)break;
		swapArray(array,i,j);//using swap methd above
	}
}
