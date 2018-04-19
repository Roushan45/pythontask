/*cpp file that contains the implemention of hpp file*/
#include<string>
#include<iostream>
#include "dynamicArray.hpp"
#include<fstream>
/*constructor that initialize the current arraysize of 5*/
DynamicArray::DynamicArray()
{
	count=0;
	array_size=5;
	array = new string[array_size];
}
/*add method that add the line to array from input text file*/
void DynamicArray::add()
{
	//input file declaration
	char inputfile[30]="weblog.txt";
	ifstream fin;
	//opening the input file
	fin.open(inputfile,ios::in);
	string line;
	//reading line by line
	while(getline(fin,line,'\n'))
	{
		/*checking for size of array
		if needed then resizing it*/
		if(count>=array_size)
		{
			cout<<"resizing array \n";
			resize(array);
		}
		/*adding line to array and increasing the count*/
		array[count]=line;
		count++;
	}
	fin.close();
}
/*this method for resizing the array*/
void DynamicArray::resize(string *array)
{
	/*copyong current contents of array to a temp array*/
	string *temp=new string[array_size];
	for(int j=0;j<array_size;j++)
	{
		temp[j]=array[j];
	}
	/*increasing the currnt capacity to double*/
	array=new string[array_size*2];
	/*copying from temp to array */
	for(int i=0;i<array_size;i++)
	{
		array[i]=temp[i];
	}
	//deleting the temp
	delete [] temp;
	array_size *=2;
}
int DynamicArray::size()
{
	return count;
}
void DynamicArray::lineNumber(int index)
{
	if(index>count)
	{
		cout<<"Index out of range \n";
		return;
	}
	cout<<"Line found at "<<index <<" index :";
	cout<<array[index-1]<<endl;
}
void DynamicArray::lineSearch(string key)
{
	string line;
	for(int i=0;i<count;i++)
	{
		line=array[i];
		if (line.find(key) != string::npos) {
    		cout << line << '\n';
			}
	}
}

