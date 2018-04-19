#include<iostream>
#include<vector>
using namespace std;
/*this function will return the mean of vector*/
double getMean(vector<double> vec)
{
	double total =0;
	int count=0;
	//looping through vector
	for(double value : vec)
	{
		//totalling sum
		total += value;
		//counting the element
		count++;
	}
	//returning the mean by using formula
		return total/count;
}


