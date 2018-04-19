#include<iostream>
using namespace std;

int main()
{
	//celcius and kelvin diiff declared as constant
	const double celcius_kelvin_diff = 273.15;
	double fahrenheit ;
	cout<<"Enter the temperatrure in fahrenheit : ";
	//taking the user input and stoeing to fahrenheit variable
	cin>>fahrenheit ;
	//calculating celcius
	double celcius = (fahrenheit-32)/1.8;
	//calculating kelvin
	double kelvin = celcius+celcius_kelvin_diff;
	//displaying the conversion
	cout<<"\n=======================================\n";
	cout.setf(ios::fixed,ios::floatfield);
    cout.precision(3);
	cout<<fahrenheit<<" °F (fahrenheit) =  "<<celcius<< " °C (celcius)\n";
	cout<<fahrenheit<<" °F (fahrenheit) =  "<<kelvin<< " K (kelvin)";
	return 0;
}
