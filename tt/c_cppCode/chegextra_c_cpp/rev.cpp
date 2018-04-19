#include<iostream>
#include<string>
using namespace std;

int main()
{
	string myString ="Test String";
	string reverse="";
	cout<<"Orignal String = "<<myString<<endl;
	int i;
	//for loop for iterating all elements of string
	for(i=myString.length()-1;i>=0;i--)
	{
		//appending the cahr to reverse string
		reverse=reverse+myString[i];
	}
	cout<<"\nReverse String = "<<reverse;
	
	if(i==5&&i==8){
		
	}
}
