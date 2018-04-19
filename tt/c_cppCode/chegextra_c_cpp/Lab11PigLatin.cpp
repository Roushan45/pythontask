//Lab11PigLatin.cpp
#include<iostream>
#include<string>
#include<sstream>
using namespace std;

int main()
{
	string s ;
	cout<<"Enter the String : ";
	getline(cin,s);
	string word;
	stringstream ss (s);
	//reading word by word rfom string
	while(ss>>word){
		//getting first char of word
		char _1stchar = tolower(word.at(0));
		//iff vowel append yay	
	if(_1stchar == 'a'||_1stchar == 'e'||_1stchar == 'i'||_1stchar == 'o'||_1stchar == 'u'){
	
		word.append("yay");
	}
	//if not vowel append first letter and ay
	else
	{
		//appending first char
		word.append(word.substr(0,1));
		//deleting first char
		word.erase(0,1);
		//appending ay
		word.append("ay");
	}
	cout<<word<<" ";

	}
	
	
	
	
}
