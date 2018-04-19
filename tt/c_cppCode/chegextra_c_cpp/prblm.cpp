#include<iostream>
using namespace std;

void print(int arr[],int size, int curNode)
{
	int leftChild, rightChild;
	leftChild = curNode * 2 + 1;
	rightChild = curNode * 2 + 2;
	if(leftChild >= size && rightChild >= size)
	{
		cout<<	arr[curNode]<<" ";
		return;
	}
	print(arr,size,rightChild);
	print(arr,size,leftChild);
	
	return;
}

int main()
{
	int arr[7]={1,5,3,7,6,2,4};
	print(arr,7,0);
	cout<<endl;
	
	return 0;
}
