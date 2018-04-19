#include<vector>
#include<fstream>
#include<string>
#include<sstream>
#include<iostream>
using namespace std;
int main()
{
	//two vectors declared for two seprate files
	vector<int> v1,v2;
	//inputstream for reading file
	ifstream infile1,infile2;
	//output stream for writting file
	ofstream outfile;
	string line;
	//name of the file
	char file1[30]="first.dat";
	char file2[30]="second.dat";
	char file3[30]="result.dat";
	//opening first file for read
	cout<<"Opening first file for reading "<<endl;
	infile1.open(file1,ios::in);
	while(getline(infile1,line,'\n'))
	{
		cout<<line<<endl;
		int no=stoi(line);
		v1.push_back(no);
	}
	cout<<"Reading from first file completed"<<endl;

	cout<<"------------------------------\n\n";
	cout<<"Opening second file for reading "<<endl;
	//opening second file for reading
	infile2.open(file2,ios::in);
	while(getline(infile2,line,'\n'))
	{
		cout<<line<<endl;
		int no=stoi(line);
		v2.push_back(no);
	}
	cout<<"Reading from second file completed"<<endl;
	cout<<"Opening result.dat file for writing output\n";
	//opening the output file for read
	outfile.open(file3,ios::out);
	vector<int>::iterator it1,it2;
	it1=v1.begin();
	it2=v2.begin();
	cout<<"calulating sum by iterating over the vector\n";
	//here if any vector goes to end whole loop will terminate
	//by doing this we are doing sum till only untill
	//both vectors have numbers
	while(it1<v1.end()&&it2<v2.end())
	{
		outfile<<*it1 + *it2<<"\n";
		it1++;
		it2++;
	}
	cout<<"Writing to file completed ... \nexiting the program";
	return 0;
	
}
