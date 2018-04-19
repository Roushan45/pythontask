#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	/*Variables required for computing*/
	int noOfDays;
	double miles,tax,total,subtotal;
	//asking for no of days and storing to noOfDays
	cout<<"Enter the number of days the car was rented: ";
	cin>>noOfDays;
	//asking for miles and storing to miles
	cout<<"Enter the number of miles the car was driven: ";
	cin>>miles;
	//using if condition cheking how was driven
	if(miles>=200.0){//if more than 400 
			subtotal=(miles*0.35)+(15*noOfDays);//calculating subtotal
			tax = subtotal*(6.0/100.0);//6 percent tax
			total=subtotal+tax;//adding subtotal and tax
		}
	if(miles<200){//if less than 200 miles driven
		subtotal=(miles*0.40)+(15*noOfDays);
		tax = subtotal*(6.0/100.0);
		total=subtotal+tax;
	}
	std::cout << std::fixed;
  	std::cout << std::setprecision(2);
  	//printing the result
	cout<<"Subtotal:\t\t$"<<subtotal<<endl;
	cout<<"Tax Amount:\t\t$"<<tax<<endl;
	cout<<"Total:\t\t\t$"<<total<<endl;
	return 0;
}
