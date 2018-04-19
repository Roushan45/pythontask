#include<iostream>
using namespace std;
void biggerarray(int array1[],int array2[])
{
	int sum1=0,sum2=0;//initial value of sum
	for(int i=0;i<5;i++)
	{
		sum1+=array1[i];//calculating sum of both array elements
		sum2+=array2[i];
	}
	if(sum1>sum2){//comapring the sum of both array
		cout<<"Array 2 is larger \n";
		cout<<"Elements of larger array : "<<endl;
		for(int i=0;i<5;i++)
		{
			cout<<array1[i]<<" ";//printi the array elements
		}
		cout<<endl;
		cout<<"Sum of elements : "<<sum1<<endl;
	}
	else if(sum1<sum2){
		cout<<"Array 2 is larger \n";
		cout<<"Elements of larger array : "<<endl;
		for(int i=0;i<5;i++)
		{
			cout<<array2[i]<<" ";
		}
		cout<<endl;
		cout<<"Sum of elements : "<<sum2<<endl;
	}
	else//if both array equals
		cout<<"Array sums are equal."<<endl;
		
}
int main(void)
{
	int a1[5]={3,8,3,67,23};//array 1
	int a2[5]={6,34,31,7,2};//array 2
	biggerarray(a1,a2);//comapring both arrays by calling function
	return 0;
}
