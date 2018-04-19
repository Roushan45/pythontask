#include<iostream>
#include "findMean.cpp"
#include<vector>
#include <cstdlib>
using namespace std;
vector<double> generateArray();
//main function
int main()
{
	//getting the array by calling function
	vector<double> array = generateArray();
	//getting the mean
	double mean = getMean(array);
	//printing to console
	cout<<"Mean of array : "<<mean;
	return 0;
}
/*This function will generate the 
array using rand() */
vector<double> generateArray()
{
	//declare an vector
	vector<double> array;
	//10 elements are generated
	//if want more increase the count 
	//of 10 ti desire number
	for(int i=0;i<10;i++)
	{
		int randomNo  = rand()%100 +1;
		array.push_back(randomNo);
	}
	//returning the array
	return array;
}
