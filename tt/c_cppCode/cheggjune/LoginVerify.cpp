#include<string>
#include<fstream>
#include<iostream>
using namespace std;
/*function prototype declared*/
void login();
bool checkCredentials(string username,string password);
/*Main method*/
int main()
{
	login();
	return 0;
}
/*Login method declaratrion*/
void login()
{
	/*it will restore the no of unsuccessfull attempt */
	int noOfAttempt=0;
	/*storing the user inputs*/
	string uname,pass;
	/*running the loop*/
	while(1)
	{
		/*checking for no of attempts*/
		if(noOfAttempt>=3)
		{
			/*if 3 then returning to main*/
			cout<<"\nYou have exceeded the max limit! ";
			return;
		}
		/*asking for user inputs*/
		cout<<"Enter user name : ";
		getline(cin,uname);
		cout<<"Enter password : " ;
		getline(cin,pass);
		/*calling the method checkCredentials with 
		required parameters and comparing it woth 0*/
		if(checkCredentials(uname,pass)==0)
		{
			/*if login successfull breaking the loop*/
			cout<<"\nLogin successfull! \n";
			break;
		}
		else
		{
			/*if not then increasing the attempt*/
			cout<<"\nWrong credentials , Please try again later ! \n\n";
			noOfAttempt++;
		}
	}
}
/*cjeck credentials method declaration*/
bool checkCredentials(string username,string password)
{
	/*file name*/
	char fileName[30]="correctData.txt";
	string uname,pass,line;
	ifstream fin;
	/*opened the file*/
	fin.open(fileName,ios::in);
	int i=1;
	while(getline(fin,line,'\n'))
	{
		/*storing the file data in local variables*/
		/*username on first line in text file*/
		if(i==1)
		{
			uname=line;
		}
			/*password on second line in text file*/
		if(i==2)
		{
			pass = line;
		}
		i++;
	}
	/*of both value match closing the file before returning 0*/
	if(username==uname && password==pass)
	{
		fin.close();
		return 0;
	}
	return 1;
}
