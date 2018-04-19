#include<iostream>
#include<cstdlib>
using namespace std;
//declared the method
int min_n_maxSum(int *p ,int n);
bool isSymmetricArray(int *p ,int n);
int main()
{
	//space allocated for pointer array for size of 6
	int *p=(int*)malloc(sizeof(int)*6);
	//assigning value to array
	p[0]=5;p[1]=4;p[2]=7;p[3]=6;p[4]=2;p[5]=8;
	//printing the sum of min and max in array
	cout<<"Sum of min and max element in array : "<<min_n_maxSum(p,6)<<endl; 
	
	//cheking for array is symmetric or not
	//created another pointer array of size 5
	int *p1=(int*)malloc(sizeof(int)*5);
	//value initialized
	p1[0]=4;p1[1]=3;p1[2]=2;p1[3]=3;p1[4]=4;
	//if method return true it means array is symmetric
	if(isSymmetricArray(p1,5))
		cout<<"\nArray is symmetric"<<endl;
	else
		cout<<"\nArray is not symmetric"<<endl;
	
	//checking another array for symmetric	
	int *p2=(int*)malloc(sizeof(int)*4);
	p2[0]=4;p2[1]=3;p2[2]=2;p2[3]=3;
	if(isSymmetricArray(p2,4))
		cout<<"\nArray is symmetric"<<endl;
	else
		cout<<"\nArray is not symmetric"<<endl;
		
	return 0;
}
int min_n_maxSum(int *p, int n)
{
	//initialized the max and min with low and high
	//int values
	int min = INT_MAX;
	int max = INT_MIN;
	//looping throught the array
	for(int i=0;i<n;i++)
	{
		//finding min
		if(min>p[i])
		{
			min=p[i];
		}
		//finding max
		if(max<p[i])
		{
			max=p[i];
		}
	}
	//adding the min and max and returning the sum
	return min+max;
}

//method for checking the if the given
//array is symmetric or not
bool isSymmetricArray(int *p ,int n)
{
	//lopping throught the array with two variables
	//i and j i is start index and j is last index
	//of array if i and j not match then 
	//given array is not symmetric
	for (int i = 0, j = n-1; i < j; i++, j--) {
    if (p[i] != p[j]) 
        return false;  
    
}
//if symmetric returning  true
return true;
}
