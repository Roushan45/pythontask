#include<iostream>
#include<fstream>
#include<string>
#include<sstream>
using namespace std;
int main(void)
{
	string input="arm_position.csv"	;
	string output = "arm_angle.csv";
	ifstream fin;
	ofstream fout;
	fin.open(input,ios::in);
	if(!fin)
		exit(-1);
	fout.open(output,ios::out);
	string line;
	while(getline(fin,line)){
		stringstream ss(line);
		string temp;
		while(getline(ss,temp,' '))
			cout<<temp<<endl;
	}
		
	return 0;
}
