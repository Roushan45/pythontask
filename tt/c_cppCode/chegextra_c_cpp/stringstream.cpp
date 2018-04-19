//revString.cpp without using stringstream
#include<iostream>
#include<string>
#include<stack>

using namespace std;


int main()
{
	cout<<"Enter the String : ";
	//declared the stack
	stack<string> stc;
	string s ;
	getline(cin,s);

//spiltting the word using delimiter "" 	
string seprator = " ";
size_t pos = 0;
string word;
while ((pos = s.find(seprator)) != std::string::npos) {
    word = s.substr(0, pos);
    //adding word into stack
    stc.push(word);
    s.erase(0, pos + seprator.length());
}
stc.push(s);//pusing lat word into stacj

	//reversing the string, using stack pop
	while(!stc.empty()){
		cout<<stc.top()<<" ";
		stc.pop();
	}
	
	return 0;
}
