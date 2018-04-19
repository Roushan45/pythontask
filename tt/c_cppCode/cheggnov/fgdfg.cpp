#include <fstream>  
#include <string>
#include<iostream>
using namespace std;
 
//method will validate the username and return the flee name
string validateUserName() {
string inputname;
int flag = 1;
while (flag == 1) {
cout << "Enter your name :  ";
getline(cin, inputname);
flag = 0;
 
for (int i = 0; i < inputname.length(); i++) {
if (inputname[i] >= 'a' && inputname[i] <= 'z' ||//fixed here using i as index
inputname[i] >= 'A' && inputname[i] <= 'Z') {
 
}
 
else
 
flag = 1;
//fixed here
 
}
if(flag==1)//out aftre for loop
	cout << "Letters Only \n";
}
 return inputname;//returning the user name
}
 //method for display results
void displayResults(string totalfile, int count_even, int count_odd) {
 
 cout<<"\n\nStatics .....\n\n";
cout << "In the file name " << totalfile << endl;
 
cout << "The number of even are " << count_even << endl;
 
cout << "The number of odd are " << count_odd << endl;
 
}
//method will read data from user and return the file name
string readUserData(string userName){
	ofstream fout;
	//creating the file name
	string fileName=userName+".txt";
	fout.open(fileName.c_str(),ios::out);
	if(!fout){
		cout<<"Error on creating file ";
		exit(-1);
	}
	while(1){
		string input;
		cout<<"Enter anything , -1 to end : ";
		cin>>input;
		//if user inputs -1 breaking the loop
		if(input=="-1")break;
		fout<<input<<endl;//writting to file
	}//retirning the file name
	return fileName;
}


//method will count even and odd number from file
void countEvenDigit(string fileName) {
 
int even_count=0,odd_count=0;
ifstream fin;
//opening file for reading 
fin.open(fileName.c_str(),ios::in);
if(!fin){
	cout<<"File opening error\n";
	exit(-1);
}
string line;
while(getline(fin,line)){
	//checking for line that is int only
	if(line.find_first_not_of("0123456789") == std::string::npos){
		//cout<<"line n : "<<line<<endl;
		int n = stoi(line);
		if(n%2==0){//checking for even and odd
			//
			even_count++;
		}
		else
			odd_count++;
}
	}
//calling the method display result
displayResults(fileName,even_count,odd_count);
}
int main() {
//calling the required methods
string userName= validateUserName();
string fileName=readUserData(userName);
countEvenDigit(fileName);
return 0; 
}
