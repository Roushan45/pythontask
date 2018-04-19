#include<iostream>
#include<sstream>
#include<string>
#include<iomanip>
using namespace std;

int main()
{
	//storing the user input in single variable
	string input;
	cout<<"Enter date (mm/dd/yyyy) : ";
	cin>>input;
	//declared three int type variables
	//for storing the day, month and year
	int day,month,year;
	istringstream ss(input);
	string s;
	int i=0;
	//splitting the string by '/'
	while(getline(ss,s,'/'))
	{
		//cout<<s<<endl;
		if(i==0)
		{
			//convering string to int and storing
			//to respective variables
			month=stoi(s);
		}
		if(i==1)
		{
			day=stoi(s);
		}
		if(i==2)
		{
			year=stoi(s);
		}
		i++;
	}
	//using iomanip library to filling the required digits
	cout <<"Month entered : "<< setw(2) << setfill('0') << month << endl;
	cout <<"Day entered : "<< setw(2) << setfill('0') << day << endl;
	cout <<"Year entered : "<< setw(4) << setfill('0') << year << endl;

}
