/*program that will read tae bill and sum up of
* regardless of no of entries*/
#include<sstream>
#include<iostream>
#include<fstream>
#include<string>

using namespace std;

int main()
{
	//required varibales used for read file and
	//calculating total bill
	string temp;
	double sumOfTeabBill=0;
	char inputFile[30];
	int totalNoOfBills;
//requesting user to enter the name of file 
	cout<<"Please enter the name of file  : ";
	cin>>inputFile;
	ifstream fin;
	fin.open(inputFile,ios::in);
	//If file opening error exiting the program
	if(!fin)
		{
			cout<<"Error : File can not be opened ";
			exit(1);
		}
	int index=0;
	//using while loop 
	//reading each line of file
	while(getline(fin,temp))
	{
		++index;
		/*In the file total bill is at evry 
		  fifth line of the bille 
		  so here using module of to find bill in file*/
		if(index%5==0)
		{
		//when toatl bill found increasing the 
		//count og bill
			totalNoOfBills++;
			string temp1;
			//for spliting the string taken into string stream
			stringstream ss(temp);
			int index1=0;
			//splitting the line by dollar sign $ to gert the amount
			while(getline(ss,temp1,'$'))
			{
				if(index1==1)
				{
					//after getting the bill converting to double
					//using stod
					//and adding to total bill
					sumOfTeabBill+=stod(temp1);
				}
					index1++;
			}
		}
	}
	//After extracting the required data from and action performing
	//displaying the result to console
	cout<<"\n**************************************\n";
	cout<<"No of bills in given file  : "<<totalNoOfBills<<endl<<endl;
	cout<<"Sum of all bills   : $"<<sumOfTeabBill<<endl;
	return 0;
}
