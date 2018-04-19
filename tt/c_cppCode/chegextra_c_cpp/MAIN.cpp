#include <iostream>
#include <vector>
#include <fstream>
#include<sstream>
#include "Person.h"
#include "Person.cpp"
using namespace std;
void menu();
void find(char filename[]);
void add(char filename[]);
void remove(char filename[]);
int main() {
   char file[30]="information.txt";
   add(file);
   find(file);
   add(file);
   //remove(file);
   return 0;
}
void menu() {
    //add a person to the text file where names/addresses/etc. are stored
    cout << "1. Add Person" << endl;
    //search the text file for a name and it will return all of the person's info
    cout << "2. Search Directory" << endl;
    //removes a person's entry from the text file along with all of their personal data
    cout << "3. Remove Person" << endl;
    //exits from the program
    cout << "4. Exit" << endl;
}
void add(char filename[])
{
	ofstream fout;
	string name,phone,add,email,web;
	
	cout<<"Enter the Name : ";
	
	cin>>name;
	cout<<"Enter the Phone : ";
	cin>>phone;
	cout<<"Enter Address : ";
	cin>>add;
	cout<<"Enter email : ";
	cin>>email;
	cout<<"Enter the WebSite : ";
	cin>>web;
	PersonDetails pd1;
   pd1.name = name;
   pd1.phone = phone;
   pd1.address = add;
   pd1.email = email;
   pd1.website = web;
    Person p1(pd1);
	fout.open(filename);
	fout<<name<<" "<<phone<<" "<<add<<" "<<email<<" "<<web<<"\n";
}
void find(char filename[])
{
	string name;
	int found=0;
	cout<<"Enter the name to search in directory : ";
	cin>>name;
	ifstream fin;
	string line,s;
	fin.open(filename,::ifstream::in);
	while(getline(fin,line))
	{
		stringstream ss(line);
		while(getline(ss,s,' '))
		{
			if(name==s)
			{
				cout<<line<<endl;
				found=1;
				break;
			}
		}
	}
	if(found==0)
		cout<<"Data not found "<<endl;
}
void remove(char filename[])
{
	ifstream fin;
	string name,line,s;
	ofstream temp;
	cout<<"Enter the name to delete from Directory : ";
	cin>>name;
	fin.open(filename,::ifstream::in);
	temp.open("temp.txt");
	while(getline(fin,line))
	{
		stringstream ss(line);
		while(getline(ss,s,' '))
		{
			if(name!=s)
			{
				temp<<line<<endl;
			}
		}
	}
	remove(filename);
	rename("temp.txt",filename);
}
