#include<iostream>
#include<string>
using namespace std;
/*methos to find last occurance of key in given array
as it can be used to find any type of data types do it is generic method
*/
template <class T>
int find_last_of(T array[],T key,int len)
{
	int lastIndex=-1;//initialize to -1 
	int i;
	for(i=0;i<len;i++)
	{
		if(array[i]==key)//if found updating lastIndex value
		{
			lastIndex=i;
		}
	}
	return lastIndex;
}
int main(void)
{
	//three given array
	int intArr[10]={2,5,3,5,4,7,5,1,8,9};
	char charArr[]="mathematics";
	string strArr[5]={"june","joe","glenn","joe","glenn"};
	
	//calcualting and displaying result
	cout<<"Last index of 5 in intArray : "<<find_last_of<int>(intArr,5,10)<<endl;
	cout<<"Last index of a in charArray : "<<find_last_of<char>(charArr,'a',10)<<endl;
	cout<<"Last index of glenn in strArray : "<<find_last_of<string>(strArr,"glenn",5);
	return 0;
}
