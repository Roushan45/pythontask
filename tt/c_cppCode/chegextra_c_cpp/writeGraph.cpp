#include<iostream>
#include<fstream>
#include<string>
using namespace std;
//WriteGraph.cpp -> this program will write graph to output file from input file
int main()
{
	//declared inputstream and output stream for reading file
	ofstream fout;
	ifstream fin;
	//char aaray for storing file name
	char inputFileName[30];
	char outputFileName[30];
	string line;
	//prompting user for file name
	while(true)
	{
	cout<<"Enter the name of the file containing the graph information : ";
	cin.getline(inputFileName, 20);
	//opening the ile
	fin.open(inputFileName, ifstream::in);
	//checking for is file opened
	if(!fin.is_open())
	{
		//if  input file not found then it will exit with message
		cout<<"\ninvalid file name"<<endl;
		//exit(1);
	}
	else if(fin.is_open())
	{
		//if ile found then it will read data
		cout<<"***Reading from input.txt***";
		cout<<"\nPlease enter the name of the output file:  ";
		cin.getline(outputFileName, 30);
		fout.open(outputFileName);
		//reading line by line from file
		while(!fin.eof())
		{
			getline(fin,line);
			//writting to output file
			fout<<line;	
		}
		cout<<"Thank you! Your Graph is now written to output.txt!";
		break;
		
	}
	
	}
	
	return 0;
}
