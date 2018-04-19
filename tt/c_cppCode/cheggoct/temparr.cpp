#include<iostream>
#include <string>
#include <stdint.h>
#include <fstream>
using namespace std;

//method for reading input
template <class T>
T* getInput (T* array,	int arrayLength) {
	
	array = new T[arrayLength];
 	T input;
 	cout<<"Enter the data one by one and press enter after each \n";
 	for(int i=0;i<arrayLength;i++)
 	{
 		cin>>input;
 		array[i]=input;
	 }
	 return array;
}
//method for calculating average
template <class T>
void getAverage(T* array,int arrayLength)
{
	//first getting min and mux excluded
	T sum=(T)0;
	T min=INT_MAX,max=INT_MIN;
	for(int i=0;i<arrayLength;i++)
	{
		if(array[i]>max)
			max = array[i];
		if(min>array[i])
			min=array[i];
	}
	for(int j=0;j<arrayLength;j++)
	{
		if(array[j]==min||array[j]==max)continue;
		sum+=array[j];
	}
	cout<<"\nAverage excluding Min and Max : "<<(double)sum/(double)arrayLength<<endl;
}
//method for sortung to descending order
template <class T>
T* sort(T* array, int arrayLength)
{
	for(int i=0;i<arrayLength-1;i++)
	{
		for(int j=i+1;j<arrayLength;j++)
		{
			if(array[j]>array[i])
			{
				T temp = array[j];
				array[j]=array[i];
				array[i]=temp;
			}
		}
	}
	return array;
}
//method for saving to file
//it requires array , length and name of file
template <class T>
void saveToFile(T* array, int arrayLength,string fileName)
{
	ofstream fout;
	fout.open(fileName,ios::out);
	for(int i=0;i<arrayLength;i++)
	{
		fout<<array[i]<<endl;
	}
}
//read array data and print to console
//requires file name
template <class T>
void readFromFile(const char* fileName)
{
	ifstream fin;
	string line;
	fin.open(fileName,ios::in);
	while(getline(fin,line))
		cout<<line<<"  ";
	cout<<endl;
}

//written one extra method for priting the array
template <class T>
void printArray(T* array, int arrayLength)
{
	for(int i=0;i<arrayLength;i++)
	{
		cout<<array[i]<<"  ";
	}
	cout<<endl;
}
int main(void)
{
	//created three array
	int *array1;
	float *array2;
	double *array3;
	char *c;
	//asking for input using template function
	array1 = getInput<int>(array1,4);
//	array2 = getInput<float>(array2,4);
//	array3 = getInput<double>(array3,4);
	c = getInput<char>(c,4);
	c = sort<char>(c,4);
	printArray(c,4);
//	//sorting the array data
//	array1 = sort<int>(array1,4);
//	array2 = sort<float>(array2,4);
//	array3 = sort<double>(array3,4);
//	//printing the average
//	cout<<"Array 1 average : ";
//	getAverage<int>(array1,4);
//	
//	cout<<"Array 2  average : ";
//	getAverage<float>(array2,4);
//	
//	cout<<"Array 3 average : ";
//	getAverage<double>(array3,4);
//	//printing in descending order
//	cout<<"Printing the Array1 in descending order  \n";
//	printArray<int>(array1,4);
//	
//	cout<<"Printing the Array2 in descending order  \n";
//	printArray<float>(array2,4);
//	
//	cout<<"Printing the Array3 in descending order  \n";
//	printArray<double>(array3,4);
	//writting to file
	cout<<"writting to file....\n";
//	
//	saveToFile<int>(array1,4,"array1.txt");
//	saveToFile(array2,4,"array2.txt");
//	saveToFile(array3,4,"array3.txt");
//	
//	cout<<"Reading from file ...\n";
	
	//reading from file
//	cout<<"Reading from array1.txt\n";
//	readFromFile<char*>("array1.txt");
//	cout<<"Reading from array2.txt\n";
//	readFromFile<char*>("array2.txt");
//	cout<<"Reading from array3.txt\n";
//	readFromFile<char*>("array3.txt");
	return 0;
}
