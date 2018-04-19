#include<iostream>
#include<stdlib.h>
#include<string>
using namespace std;

int main()
{
	/*first part where three const int variable delared for
	  storing three random values between 1 to 2
	   and three string literals declared*/
	string first,second,third;
	int const FIRST_NO = rand() % 2 + 1;
	int const SECOND_NO = rand() % 2 + 1;
	int const THIRD_NO = rand() % 2 + 1;
	/*second part in which assigning the string values to string
	  literasl based on the const int which contains one and 2*/
	if(FIRST_NO==1)
		first="Heads";
	else
		first="Tails";
	if(SECOND_NO==1)
		second="Heads";
	else
		second="Tails";
	if(THIRD_NO==1)
		third="Heads";
	else
		third="Tails";
		
	/*third part in which printing the value to user
	  without using any if else condition*/
	cout<<"\t\tWelcomr to coin flipping\n\n";	
	cout<<"First flip : "<<first<<endl;
	cout<<"Second flip : "<<second<<endl;
	cout<<"Third flip : "<<third<<endl;
	
	return 0;
}
