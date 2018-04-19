#include<iostream>
#include<string>
#include<sstream>
using namespace std;

int main(void)
{
	//read the input in string
	string input;
	cout<<"Enter the decimal : ";
	cin>>input;
	string temp;
	//using string stream split the
	//string fron .
	stringstream ss(input);
	int i=0;
	while(getline(ss,temp,'.'))
	{
		if(i==1)
		{
			//if length of decimal greater than 1
			if(temp.length()>1)
				cout<<"Error!	\n";
			//if one decimal place print good
			else if(temp.length()==1)
				cout<<"Good!	\n";
		}
		i++;
	}
	
	return 0;
}
