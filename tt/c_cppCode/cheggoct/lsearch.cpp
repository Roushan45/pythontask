#include<iostream>
using namespace std;
/*converted given psuedo code to c++ code 
for Recursive search*/
int Lsearch( int Array[], int i, int m, int Search)
{
	if(i>m)//if element not found
		return -1;
	if(Array[i]==Search)//if found
		return i;
	return Lsearch(Array,i+1,m,Search);//recursively calling method
}
int main()
{
	int a[10];//array for holding 10 elements
	int value;
	cout<<"Enter the 10 seprated by space like 1 3 5 \n";
	//read the input in array
	cin>>a[0]>>a[1]>>a[2]>>a[3]>>a[4]>>a[5]>>a[6]>>a[7]>>a[8]>>a[9];
	cout<<"Enter the value to search : ";//askign  value to be search in array
	cin>>value;
	int result = Lsearch(a,0,9,value);//getting the result
	if(result != -1)//if -1 then found
	{
		cout<<"Element found at index : "<<result<<endl;
	}
	else{
		cout<<"Element not found\n";//else not found
	}
	return 0;
}

