#include<iostream>
#include <fstream>
#include <cstdlib>
using namespace std;
int main()
{
	//declared two variable for storing the values
	//that read from file
	int n1,n2;
	//two boolean variable for statement
	bool file1HasNext =true;
	bool file2HasNext=true;
	//declared 3 files stream 
	fstream file1,file2,result;
	//opening the file
	file1.open("file1.txt",ifstream::in);
	file2.open("file2.txt",ifstream::in);
	result.open("result.txt");
	//it will terminate only if both will reach 
	//end of the file
	while (file1HasNext||file2HasNext) {
    //reading from file
    	file1 >> n1;
    	file2 >> n2;
    	//if both having values then write to sum of them to file
	if(file1HasNext&&file2HasNext){
		 result<<n1+n2<<"\n";
	}
	//else it will write 0
	else{
		result<<0<<"\n";
	}
    if( file1.eof() ) {
    	file1HasNext=false;
	}
	if(file2.eof()){
		file2HasNext=false;
	} 
}
//closing all the files
file1.close();
file2.close();
result.close();
	
	return 0;
}
