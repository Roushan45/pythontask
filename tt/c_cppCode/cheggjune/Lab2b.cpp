#include<iostream>

using namespace std;

int main()
{
	cout<<"\t\tASCII Code Finder \n\n";
	while(1){
	
	char user_input;
	
	cout<<"Please enter a character from the keyboard: ";
	cin>>user_input;
	cout<<"You entered "<<user_input <<" and the ASCII code for that is "<<static_cast<int>(user_input)<<endl;
	
}
return 0;
 }
