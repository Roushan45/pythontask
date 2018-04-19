#include<iostream>
#include<iomanip>
using namespace std;
//function for converting cm to inches
double centimeter_to_inches(double centimeter){
	return centimeter* 0.39370;
}
//function for converting inches to cm
double inches_to_centimeter(double inches){
	return inches*2.54;
}
int main(void){
	while(1){
	double choice;
	//displaying menu to user
	cout<<"1)Centimeter to inches\n2)Inches to Centimeter\n3)Exit"<<endl;
	cout<<"Enter your selection : ";
	cin>>choice;//getting choice
	if(choice==1){
		double cm;
		cout<<"\nEnter the centimeter : ";
			cin>>cm;
			//converting to inches
		cout<<cm<<" centimeters = "<<centimeter_to_inches(cm)<<" inches"<<endl<<endl;
	
	}
	else if(choice==2){
		double in;
		cout<<"\nEnter the inches : ";
		cin>>in;
		//converting to cm
		cout<<in<<" inches = "<<inches_to_centimeter(in)<<" centimeters"<<endl<<endl;
	}
	else if(choice==3){
		exit(0);//on choice 3 exitting the program
	}
	else
		cout<<"Invalid choice!\n";
}
	
}
