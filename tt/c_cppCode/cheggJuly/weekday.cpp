#include <string>
#include<iostream>
using namespace std;
/*define the class dayType*/
class dayType
{
	//taken an enum for weekdays 
	enum weekday
	{
		Sun,
		Mon,
		Tue,
		Wed,
		Thu,
		Fri,
		Sat
	};
	private:
		//taken string array for weekdays
		string array[7]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		weekday day;
	public:
		//setday method
		void setDay()
		{
			//it requires the numeric input data for setting the day
			
			cout<<"\t\tSet the data (example 1 for sunday, 2 for Monday...\n\n)";
			cout<<"1.Sun\n2.Mon"
					<<"\n3.Tues\n4.Wed\n5.Thu\n6.Fri\n7.Sat\nEnter the response :";
			int d;
			while(1)
			{
				cin>>d;
				if(d<1||d>7)
					cout<<"Please enter valid day : ";
				else
				break;
			}
			d=d-1;
			day = (weekday)d;
			cout<<"Day set to : "<<array[day]<<endl;
		}
		void printDay()
		{
			cout<<"Day is : "<<array[day]<<endl;
		}
		string currentDay()
		{
			return array[day];
		}
		string nextDay()
		{
			//if day is last day then reseting to day 1
			if(day==6)
			{
				return array[0];
			}
				
			return array[day+1];
		}
		string previousDay()
		{
			//if day is first day then reseting to last day
			if(day==0)
			{
				return array[6];
			}
				
			return array[day-1];
		}
		string calculateDate()
		{
			//asking the no of days to add
			int no,nextday;
			cout<<"Enter the no of days for add : ";
			cin>>no;
			//if new value greater than 7 
			//without using if else setting the new date
			//here if else not using for specific date 
			//location here using very generic way
			if((no+day+1)>7)
			{
				int temp=0;
				temp=no%7;
				if((temp+day+1)>7)
					nextday=(temp+day+1)%7;
				nextday=(temp+(int)day+1)%7;
				day=(weekday)(nextday-1);
			}
			else if((no+day)<7)
			{
				day=(weekday)(no+day);
			}
			return array[day];
		}
};
//main program for driving the progrm
int main()
{
	dayType dayclass;
	int userChoice;
	cout<<"\t\tMenu : Please select response \n\n";
	do
	{
		cout<<"\n1.Set the day\n";
		cout<<"2.Print the day\n";
		cout<<"3.Return the day\n";
		cout<<"4.Return the prev date\n";
		cout<<"5.Return the next date\n";
		cout<<"6.calculate the date\n";
		cout<<"7.Exit\n";
		cin>>userChoice;
		switch(userChoice)
		{
			case 1:{
				dayclass.setDay();
				break;
			}
			case 2:{
				dayclass.printDay();
				break;
			}
			case 3:{
				cout<<"Current Day : "<<dayclass.currentDay()<<endl;
				break;
			}
			case 4:{
				cout<<"Previous Day : "<<dayclass.previousDay()<<endl;
				break;
			}
			case 5:{
				cout<<"Next Day : "<<dayclass.nextDay()<<endl;
				break;
			}
			case 6:{
				cout<<" Day after given days : "<<dayclass.calculateDate()<<endl;
				break;
			}
			case 7:{
			exit(0);
			break;
			}
			default :{
				cout<<"Invalid input\n";
				break;
			}
	}
}
	while(1);
	
	return 0;
}//end of program

