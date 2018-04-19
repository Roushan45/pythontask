#include<iostream>
#include<string>
#include "Benefit.cpp"
using namespace std;
class Employee
{
	public:
		string firstname;
		string lastname;
		char gender;
		int dependents;
		double annualSalary;
		Benefit benefit;
	static int numEmployees = 0;
	public:
		Employee(){
			numEmployees++;
		}
		Employee(string fname,string lname,char gen,int dep,Benefit benefits)
		{
			firstname=fname;
			lastname=lname;	
			gender=gen;
			dependents=dep;
			benefit=benefits;
			numEmployees++;
		}
		static int getNumEmployees()
		{
			return numEmployees;
		}
		virtual double CalculatePay()=0.0;
		virtual void displayEmployee()
		{
			cout<<"Employee Infirmation \n\n";
			cout<<"Name : "<<firstname<<" "<<lastname<<endl;
			cout<<"Gender : "<<gender<<endl;
			cout<<"Dependents : "<<dependents<<endl;
			cout<<"Annual Salary : "<<annualSalary<<endl;
			cout<<"Weekly Salary :"<<annualSalary/4<<endl;
			cout<<"\n----------------------------------\nBenefit Information\n";
			benefit.displayBenefits();
		}
		
};
