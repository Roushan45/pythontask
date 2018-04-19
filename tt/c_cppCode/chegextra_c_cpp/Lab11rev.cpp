//Lab11rev.cpp using stringstream
#include<iostream>
#include<string>
#include<stack>
#include<sstream>
using namespace std;
//using namespace boost;

int main()
{
	//stack declared
	stack<string> stc;
	cout<<"Enter the String :";
	string s ;
	//reading stream
	getline(cin,s);
	string word;
	//reding string using stringstream
	stringstream ss (s);
	while(ss>>word){
		//pushing to stack
	stc.push(word);

	}
//reversing the string using
//stack pop
	while(!stc.empty()){
		cout<<stc.top()<<" ";
		stc.pop();
	}
	
	return 0;
}
