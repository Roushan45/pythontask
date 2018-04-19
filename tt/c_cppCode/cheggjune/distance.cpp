#include<iostream>
#include<string>
#include<algorithm>
#include<sstream>
using namespace std;

int main()
{
	cout<<"\t\tWelcome to the point menu program \n\n";
	string choice;
	/* looping the menu */
	do{
		string line1,line2;
		double firstPointStart,firstPointEnd;
		double secondPointStart,secondPointEnd;
		/*displaying the menu*/
		cout<<"1) Calculate distance between two points "<<endl;
		cout<<"2) Calculate Midpoint of two points "<<endl;
		cout<<"3) Quit"<<endl;
		cin>>choice;
		/*converting choice to lower case*/
		transform(choice.begin(), choice.end(), choice.begin(), ::tolower);
	/*	if choice equal to 
		1 or mid or MID or MiD mID */
		if(choice=="1"||choice=="mid")
		{
			//asking the input
			/*input in form of <first<space>second> 34 32*/
			cout<<"What is your first point ? ";
			cin.ignore(256, '\n');
			getline(cin,line1);
			cout<<"What is your second point ? ";
			getline(cin,line2);
			stringstream ss1(line1);
			stringstream ss2(line2);
			string temp;
			int i=0,j=0;
			//manupulatin the line
			while(getline(ss1,temp,' '))
			{
				if(i==0)
					firstPointStart=stod(temp);
				if(i==1)
				{
					firstPointEnd=stod(temp);
				}
				i++;
			}
			while(getline(ss2,temp,' '))
			{
				if(j==0)
					secondPointStart=stod(temp);
				if(j==1)
				{
					secondPointEnd=stod(temp);
				}
				j++;
			}
			//calculating the midpoint
			cout<<"\nMidpoint of the line segment from ("<<line1<<") to ("<<line2<<") is ("<<(firstPointStart+secondPointStart)/2
			<<"  "<<(firstPointEnd+secondPointEnd)/2<<")\n"<<endl;
		}
		/*	if choice equal to 
		2 or dis or DIS or Dis dIS */
		else if(choice=="2"||choice=="dis")
		{
		cout<<"What is your first point ? ";
			cin.ignore(256, '\n');
			getline(cin,line1);
			cout<<"What is your second point ? ";
			getline(cin,line2);
			stringstream ss1(line1);
			stringstream ss2(line2);
			string temp;
			int i=0,j=0;
			while(getline(ss1,temp,' '))
			{
				if(i==0)
					firstPointStart=stod(temp);
				if(i==1)
				{
					firstPointEnd=stod(temp);
				}
				i++;
			}
			while(getline(ss2,temp,' '))
			{
				if(j==0)
					secondPointStart=stod(temp);
				if(j==1)
				{
					secondPointEnd=stod(temp);
				}
				j++;
			}
			cout<<"\nDistance of the line segment from ("<<line2<<") to ("<<line1<<") is ("<<secondPointStart-firstPointStart
			<<"  "<<secondPointEnd-firstPointEnd<<")\n"<<endl;
		}
		/*	if choice equal to 
		3 or quit or QUIT or QuiT quIT */
		else if(choice=="3"||choice=="quit")
		{
			cout<<"Thanks for using point menu program "<<endl;
			break;
		}
		//any  invalid input comes here
		else{
			cout<<"I'm sorry , that choice is invalid!"<<endl;
		}
	}
	while(true);
	return 0;
}
