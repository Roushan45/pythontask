#include<iostream>
#include<stack>
using namespace std;
stack<int> s;
/*
this is the stack based implementation index
value is aadded to statck s in binary search method
it will add left or right of the array
as array is already sorted
*/
bool bSearch(int data[], int nItems, int key)
{
	int low=0,mid,high=nItems-1;
	while(low<high)
	{
		mid = (low+high)/2;
		s.push(mid);//
		
		if(key>data[mid])
			low = mid+1;
		else
			high = mid;
	}
	if(key==data[low])
		return true;
	else
		return false;
}
int main(void)
{
	int num,data[]={3,5,10,15,16,19,23,37};
	if(bSearch(data,8,19))
		cout<<"found"<<endl;
	else
		cout<<"not found"<<endl;
	while(!s.empty())
	{
		num=s.top();//pop is void type function
					//so top will return the top elements
		cout<<num<<endl;
		s.pop();//now here removing the top element from stack
	
	}
	//Output expalanation
	
		/*
		code output will will found as 19 is already in array
		and data which wil be added to stack s 
		mid will calculated as 0+7/2=3 (int will igonre the decimal)
		and can see data as 3rd index is 15 and it is less than key that is 19 so 
		value of low will be +1 that is 1
		now again mid will be calculated as 1+7/2=4 so 4 will
		be added to stack and so on
		*/
	return 0;
	
}
