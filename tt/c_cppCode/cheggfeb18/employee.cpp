//employee.cpp

//Declaration of class employee

#include "employee.h"
#include<iostream>
#include<string>
using namespace std;

//definition declaration of employee class
employee::employee(){}
employee::employee(string n,int i,int hr,int hw){
    name=n;
    id=i;
    hourly_rate=hr;
    hours_worked=hw;
}
void employee::setName(string n){
    name=n;
}
string employee::getName(){
    return name;
}
void employee::setId(int i){
    id=i;
}
int employee::getId(){
    return id;
}
void employee::setHourlyRate(int hr){
    hourly_rate=hr;
}
int employee::getHourlyRate(){
    return hourly_rate;
}
void employee::setHoursWorked(int hw){
    hours_worked=hw;
}
int employee::getHoursWorked(){
    return hours_worked;
}
int employee::calculateWage(employee e){
    return e.getHourlyRate()*e.getHoursWorked();
}

void employee::print(){
    cout<<"Name : "<<name<<endl;
    cout<<"Id : "<<id<<endl;
    cout<<"Hourly Rate : "<<hourly_rate<<endl;
    cout<<"Hours worked : "<<hours_worked<<endl;
}
