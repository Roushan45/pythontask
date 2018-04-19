#include<string>
#include<iostream>
#include "BankAccount.cpp"
int main()
{
	BankAccount account;
	cout<<"\t\tWelcome to xyz Bank Application\n\n";
	do 
	{
		cout<<"A.Deposit \n";
		cout<<"B.Withdrawl \n";
		cout<<"C.Show account info\n";
		cout<<"Q.Quit\n";
		char choice;
		double amt;
		cin>>choice;
		switch(choice)
			{
			
			case 'A':{
				cout<<"Enter Amount to deposit : ";
			cin>>amt;
			if(account.deposit(amt))
			{
				cout<<"Success!\n";
				cout<<"New Balance is : "<<account.getBalance()<<endl<<endl;
			}
			else{
				cout<<"Invalid Transaction : \n";
			}
				break;
			}
			case 'B':{
				cout<<"Enter Amount to withdrawl : ";
			cin>>amt;
			if(account.withdraw(amt))
			{
				cout<<"Success!\n";
				cout<<"New Balance is : "<<account.getBalance()<<endl<<endl;
			}
			else{
				cout<<"Invalid Transaction : \n";
			}
				break;
			}
			case 'C':{
				account.showAccountInfo();
				break;
			}
			case 'Q':{
				cout<<"Thanks for using bank Application\n";
			exit(0);
				break;
			}
			default :
				cout<<"Inavlid choice entered, try again !\n";
		}
	}
	while(1);
	return 0;
}
