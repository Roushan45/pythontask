#include<iostream>
using namespace std;
//global variable for storing total gross pay
static double sum=0;
//void function to calculate gross pay
void  grossPay(double hours){
	double grosspay=0;
	if(hours<=40){
		grosspay=hours*100;
		cout<<"Gross Pay : "<<grosspay<<endl<<endl;
	}
	else{
		grosspay=((40*100)+((hours-40)*(100*1.5)));
		cout<<"Gross Pay : "<<grosspay<<endl<<endl;
}
//updating sum
	sum+=grosspay;
}
//this method will use to return the total gross
double totalGrosspay(){
	
	return sum;
}

int main(void){
	int count=0;
	while(1){
		double hours;
		cout<<"Enter the number of hours worked or negative value to terminate: ";
		cin>>hours;
		if(hours<0)//if size is upto 80
			{
				cout<<"\n\nTotal gross pay : "<<totalGrosspay();
				break;
			}
		grossPay(hours);
	}
	return 0;
}
