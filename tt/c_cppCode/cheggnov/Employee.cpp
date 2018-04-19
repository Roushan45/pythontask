#include<iostream>
#include<cstring>
#include<iomanip>
using namespace std;
#define MAX 64
//EMployee structure
struct Employee{
	char firstName[30];
	char lastName[30];
	int id;
	int hours;
	double payRate;
};
//Method for adding employee
Employee addEmployee(){
	Employee emp;
	char fn[30],ln[30];
	int id_,hr;
	double pr;
	cout<<"Enter first name : ";
	cin>>fn;
	cout<<"Enter last name : ";
	cin>>ln;
	cout<<"Enter id : ";
	cin>>id_;
	cout<<"Enter hours worked : ";
	cin>>hr;
	cout<<"Enter payrate : ";
	cin>>pr;
	strcpy(emp.firstName,fn);
	strcpy(emp.lastName,ln);
	emp.id=id_;
	emp.hours=hr;
	emp.payRate=pr;
	
	return emp;
	
}
//methd for printing employee
void printEmployee(Employee emp){
	cout<<fixed<<setw(5);
	cout<<"First\t"<<"Last\t"<<"ID#\t"<<"Hours\t"<<"$payrate"<<endl;
	cout<<emp.firstName<<"\t"<<emp.lastName<<"\t"<<emp.id<<"\t"<<emp.hours<<"\t"<<setprecision(2)<<"$"<<emp.payRate<<" / hour"<<endl;
}
void printEmployeesPayChecks(Employee emp[],int size){
	cout<<fixed<<setw(5);
	cout<<"EMP#  F.L.\tid\tPaycheck"<<endl;
	for(int i=0;i<size;i++){
		cout<<"# "<<i+1<<" : "<<emp[i].firstName[0]<<". "<<emp[i].lastName[0]<<".\t"<<emp[i].id<<"\t$"<<setprecision(2)<<emp[i].hours*emp[i].payRate<<endl;
	}
}
void displayMenu(){
	cout<<"\n  ------------------------------- \n"
		<<" |Employee Control center        |\n"
		<<" |-------------------------------|\n"
		<<" | 1.Add New Employee            |\n"
		<<" | 2.Print Employee              |\n"
		<<" | 3.Print Employee Playchecks   |\n"
		<<" | 0.Exit                        |\n"
		<<"  -------------------------------\n"
		<<"Enter choice : ";
		
}
int main(){
	Employee emp_array[MAX];
	int count=0,choice,index;
	do{
		displayMenu();
		cin>>choice;
		cin.ignore();
		switch(choice){
			case 1:{
				Employee e=addEmployee();
				emp_array[count++]=e;
				break;
			}
			case 2:{
				if(cout==0){
					cout<<"Alert! no employee added please add one !"<<endl;
				}
				else{
					cout<<"Enter employee index # : ";
					cin>>index;
					printEmployee(emp_array[index-1]);
				}
				break;
			}
			case 3:{
				printEmployeesPayChecks(emp_array, count);
				break;
			}
			case 0:{
				cout<<"Exiting program\n";
				break;
			}
			default :{
				cout<<"Invalid option\n";
				break;
			}
		}
	}
	while(choice!=0);
	cout<<"Good Bye \n";
	return 0;
}
