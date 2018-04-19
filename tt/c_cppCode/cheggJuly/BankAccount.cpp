#include<iostream>
#include"BankAccount.h"
#include<string>
using namespace std;
//implemention of bankaccount.h
BankAccount::BankAccount()
{
	name="John Doe";
	balance = 100;
}
BankAccount::BankAccount(string n,double b)
{
	name=n;
	balance=b;
}
bool BankAccount::deposit(double amt)
{
	//checking for amt 
	//if it is less than 0
	if(amt<0)
		return 0;//FALSE
	balance=balance+amt;
	return 1;//TRUE
}
bool BankAccount::withdraw(double amt)
{
	//checking for amt 
	//if it is less than 0 or greater than balance
	if(amt<=0 || amt>balance)
		return 0;//FALSE
	balance=balance-amt;
	return 1;//TRUE
}
void BankAccount::showAccountInfo()
{
	cout<<"Accout owner : "<<name<<endl;
	cout<<"Balance : "<<balance<<"$"<<endl;
}
double BankAccount::getBalance()
{
	return balance;
}

