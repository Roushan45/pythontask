#include<iostream>
#include<fstream>
#include<string>
#include<sstream>
#include<cstdlib>
#include<vector>
using namespace std;

int main()
{
	//variable declaration
	vector<int>halfmax_exe;
	string fileName;
	ofstream fout;
	string input,word;
	int count=0;
	int max=INT_MIN;
	float halfmax;
	
	//prompting user for file name
	cout<<"Enter the name of output file : ";
	cin>>fileName;
	//opening the output file
	fout.open(fileName);
	//check for error while opening file
	//if error printing error mgs and exit
	if(!fout)
	{
		cout<<"Error on opening file";
		exit(1);
	}
	//prompting user for enter the list of integer
	//seprated by single space 
	cout<<"Enter the list of ten or fewer positive integers ending with -100"<<endl;
	cin.ignore();
	//reading user input from terminal
	getline(cin,input);
	stringstream ss(input);
	//splitting the string using space delimeter
	while(ss>>word)
	{
		//checking if word equal to -100
		//or user has given more than 10 
		//elements then brraking the loop
		if(word=="-100"||count>=10)
		break;
		//reading the input in vector
	halfmax_exe.push_back(stoi(word));
	count++	;
	}
	//finding the maximum element
	 for (std::vector<int>::iterator it = halfmax_exe.begin() ; it != halfmax_exe.end(); ++it)
  	{
  		//handling the case if user has not entered any 
  		//positive integers
  		if(count==0)
  		{
  			return 0;
		  }
  		if(max<*it)
  		{
  			max=*it;
		  }
	  }
	  //writting max to file and console
	  cout<<"Maximum : "<<max<<endl;
	  fout<<"Maximum : "<<max<<endl;
	  //calculating halfmax
	  halfmax = (float)max/2;
	  //wrtting to file and console
	  fout<<"Integers strictly greater than : ";
	  cout<<"Integers strictly greater than : ";
	  //finding the integers grateter than halfmax 
	  //and writing to console and output file
	  for (std::vector<int>::iterator it = halfmax_exe.begin() ; it != halfmax_exe.end(); ++it)
  	{
  		if(*it>halfmax)
  		{
  			cout<<*it<<" ";	
  			fout<<*it<<" ";	
		  }
	  }
 //closing the output file
 	if(fout)
 	{
 		fout.close();
	 }
	return 0;
}
