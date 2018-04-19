#include <iostream>
#include <conio.h>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
int employeeNumber = 1;
double grossPayTotal = 0.0;
double stateTaxTotal = 0.0;
double federalTaxTotal = 0.0;
double FICATotal = 0.0;
double Netpay = 0.0;
cout << "Enter the following information:\n" << endl;
while (1)
{
cout << "Employee Number (0 to quit): ";
cin >> employeeNumber;
if (employeeNumber != 0)
{
double employeeGrossPay = 0.0;
double employeeStateTaxes = 0.0;
double employeeFederalTaxes = 0.0;
double employeeFICA = 0.0;
bool condition;
while(1){

cout << "Gross pay: ";
cin >> employeeGrossPay;
while(employeeGrossPay<0){//if negative values entered
						//prompting for re-enter
	cout<<"Gross pay may not be less than zero\n";
	cout<<"Re-enter Gross pay :  ";
	cin>>employeeGrossPay;
}
cout << "Federal Withholding: ";
cin >> employeeFederalTaxes;
//if values is negative or greater than gross pay
//re-prompting for data
while(employeeFederalTaxes<0 || employeeFederalTaxes>employeeGrossPay){
	if(employeeFederalTaxes<0){
	cout<<"federal withholding may not be less than zero\n";
	cout<<"Re-enter Federal withholding : ";
	cin>>employeeFederalTaxes;
}
else{
	cout<<"federal withholding may not be greater then gross pay\n";
	cout<<"Re-enter Federal withholding : ";
	cin>>employeeFederalTaxes;
}

}
cout << "State Withholding: ";
cin >> employeeStateTaxes;
//same as above and for below entry also same
while(employeeStateTaxes<0||employeeStateTaxes>employeeGrossPay){
	if(employeeStateTaxes<0){
	
	cout<<"employee state taxes may not be less than zero\n";
	cout<<"Re-enter state taxes : ";
	cin>>employeeStateTaxes;
}
else{
	cout<<"employee state taxes may not be greater then gross pay\n";
	cout<<"Re-enter employee state taxes : ";
	cin>>employeeStateTaxes;
}
}
cout << "FICA Withholding: ";
cin >> employeeFICA;
while(employeeFICA<0 || employeeFICA>employeeGrossPay){
	if(employeeFICA<0){
	cout<<"FICA Withholding taxes may not be less than zero\n";
	cout<<"Re-enter FICA Withholding taxes : ";
	cin>>employeeFICA;
}
else{
	cout<<"FICA Withholding taxes may not be greater then gross pay\n";
	cout<<"Re-enter FICA Withholding taxes : ";
	cin>>employeeFICA;
}
}
//if sum is greater asking to re-enter the data
 if ((employeeFederalTaxes + employeeStateTaxes+employeeFICA) > employeeGrossPay)
{
cout << "FICA + State Taxes + federal tax cannot be greater than gross pay. \nPlease re-enter the data for employee\n\n";
}
else
	break;
}

grossPayTotal += employeeGrossPay;
stateTaxTotal += employeeStateTaxes;
federalTaxTotal += employeeFederalTaxes;
FICATotal += employeeFICA;
Netpay = grossPayTotal - stateTaxTotal - federalTaxTotal - FICATotal;
}
else 
	break;
}
//summary printing 
cout << right << fixed << showpoint << setprecision(2);
cout << "\n\nTotal Gross Pay: $" << setw(8) << grossPayTotal << endl;
cout << "Total Federal Tax: $" << setw(8) << federalTaxTotal << endl;
cout << "Total State Tax: $" << setw(8) << stateTaxTotal << endl;
cout << "Total FICA: $" << setw(8) << FICATotal << endl;
cout << "Total Net Pay: $" << setw(8) << Netpay << endl;
cout << "\n" << endl;
system("pause");
return 0;
}
