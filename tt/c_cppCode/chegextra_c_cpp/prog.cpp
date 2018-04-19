#include<iostream>
#include "PayRoll.cpp"
using namespace std;
int main(){
	cout<<"Enter the size of array that you want to store emp info"<<endl;
	int size ;
	 cin>>size;
	 PayRoll empArray[size];
	 int nhw;
	 int hpr;
	 for(int i=0;i<size;i++)
	 {
	 	cout<<"\nEnter the NHW of "<<i+1<<"  employee"<<endl;
	 	cin>>nhw;
	 	
	 	cout<<"\nEnter the HPR of "<<i+1<<"  employee"<<endl;
	 	cin>>hpr;
	 	
	 	PayRoll payRoll(hpr,nhw);
	 	//Adding emp info to emp array
	 	empArray[i]=payRoll;
	 	
	 }
	 for(int j =0;j<size;j++)
	 {
	 	//PayRoll emp;
	 	cout<<"\nGross Salary of "<<j+1<<" Employee  \t$"<<empArray[j].getGrossPay()<<endl;
	 }
	
	return 0;
}
