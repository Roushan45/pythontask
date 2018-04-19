#include<string>
#include<iostream>
/*used only string library to manipulate */
using namespace std;
int main(void)
{
	//storing both lines in c++ type string
	string line1,line2;
	cout<<"Enter the address number and street name : ";
	getline(cin,line1);//using getline getting line1 and line2
	cout<<"Enter the town, state, and zipcode : ";
	getline(cin,line2);
	int i;
	//for the first line finding the space
	for(i=0;i<line1.length();i++)
	{
		if(line1[i]==' ')
			break;
	}
	//using substring method printing the Address number and Street name
	cout<<"Address Number : "<<line1.substr(0,i)<<endl;
	cout<<"Street Name : "<<line1.substr(i+1,line1.length())<<endl;
	//as per given rule town name is comma seprated so 
	//finding the comma 
	int j;
	for(j=0;j<line2.length();j++)
	{
		if(line2[j]==',')break;
	}
	//once comma find printing the toen name
	cout<<"\nTown Name : "<<line2.substr(0,j)<<endl;
	string temp = line2.substr(j+2,line2.length());
	int k;
	for(k=0;k<temp.length();k++)
	{
		if(temp[k]==' ')break;
	}
	//printing the state abbrv and zip code
	cout<<"State abbreviation : "<<temp.substr(0,k)<<endl;
	cout<<"zipcode : "<<temp.substr(k+1,temp.length())<<endl;
	return 0;
}
