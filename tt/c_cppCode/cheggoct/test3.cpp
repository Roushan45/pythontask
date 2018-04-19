#include<iostream>
#include<iomanip>
using namespace std;
//method for reading input
double readSeconds()
{
	double input;
	
	while(1)//in loop reading input
	{
		cout<<"Enter the time (in seconds) ";
		cin>>input;
		if(input<0)//if negative asking again
		{
			cout<<"The time must be zero or more \n";
			}
		else
		break;
	}
	return input;
}
double calculateDistance(double seconds)
{
	//calcuating  distance
	double acceleration_due_to_gravity = 9.8;
	double time=seconds;
	//1/2 == 0.5
	double distance = 0.5*(acceleration_due_to_gravity*time*time);
	return distance;
}
void displayResults(double seconds , double distance)
{
	//using iomanip printing the result
	//for meters 2 fixed and for time 1 fxed right after decimal
	cout<<"\nThe object travelled "<<std::fixed<<std::setprecision(2)<<distance<< " meters in "<<std::fixed<<std::setprecision(1)
	<<seconds <<" seconds";
}
//main function
int main()
{
	while(1){
	double seconds=	readSeconds();
	if(seconds==0)break;//on entering 0 breaking the loop
	double distance = calculateDistance(seconds);
	displayResults(seconds,distance);
	cout<<endl;
	}
	
	
}
