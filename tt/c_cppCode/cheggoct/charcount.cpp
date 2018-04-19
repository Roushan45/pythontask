#include<iostream>
#include <algorithm>
#include<string>
using namespace std;
//this method will return string after reading from user
string getString()
{
	string temp;
	cout<<"Enter the String : ";
	getline(cin,temp);
	return temp;
}
//this method will count the no of matched chars
//in given string
int countChar(char c, string str )
{
	
	int count=0;
	size_t n = std::count(str.begin(), str.end(), c);
	return (int)n;
	
}
int main(void)
{
	//caling getString for gettign string
	string str= getString();
	char c;
	cout<<"String Analysis : \n";
	
	string temp=str;
	int count=0;//removing duplicates
		 for (int i=0; i <str.length()-1; i++)
           {
                 char c=temp[i];
               for(int j=i+1; j <str.length(); j++)
                  {
                     if(c==temp[j])
                       temp [j]=' ';
                   }
             }
	//counting char and printing result
	for(int i=0;i<temp.length();i++)
	{
		if(temp[i]>='a'&&temp[i]<='z')
		cout<<temp[i]<<" : "<<countChar(temp[i],str)<<endl;
	}
	return 0;
}
