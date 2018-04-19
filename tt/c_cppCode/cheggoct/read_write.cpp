#include<fstream>
#include<iostream>
#include<string>
using namespace std;
char fileName[30]="nums.txt";

void WriteInts(ostream& fout)
{
	cout<<"Enter the five integers that you want to save to file \n";
	double temp;
	for(int i=1;i<=5;i++)
	{
		cout<<"Enter "<<i<< "  integer : ";
		cin>>temp;
		fout<<temp<<"\n";
	}
}
void DisplayInts(istream& fin)
{
	cout<<"Reading integers from file.....\n\n";
	string line;
	while(getline(fin,line))
	{
		cout<<line<<endl;
	}
}
int main(void)
{
	ifstream fin;
	ofstream fout;
	fin.open(fileName,ios::in);
	if(fin.fail()){
		cout<<"ghfdgh\n";
		exit(-1);
	}
	fout.open(fileName,ios::out);
	if(fout.fail()){
		cout<<"dftfyghfdgh\n";
		exit(-1);
	}
	WriteInts(&fout);
	DisplayInts(fin);
	return 0;
}
