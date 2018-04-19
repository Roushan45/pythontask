#include <iostream>
using namespace std;

class CDAccount
{
public:
    CDAccount();
    CDAccount(double new_balance, double new_interest_rate, int new_term);
    double get_initial_balance() const;
    double get_balance_at_maturity() const;
    double get_interest_rate() const;
    int get_term() const;
    void input(istream& in);
    void output(ostream& out);
    
private:
    int dollar;
    int cent;
    double interest_rate;
    int term; // months until maturity
};
int main()
{
	//created object
	CDAccount ac;
	//getting input from user
	ac.input(std::cin);
	//displaying the value
	ac.output(std::cout);
    
    return 0;
}
CDAccount::CDAccount(){
}
CDAccount::CDAccount(double new_balance, double new_interest_rate, int new_term)
{
	dollar = (int)new_balance;
	cent = (int) ((new_balance - dollar)*100); 
	interest_rate = new_interest_rate/100;
	term=new_term;
}

void CDAccount::input(istream& in)
{
    double balance;
    cout<<"Enter balance : ";
    in >> balance; // get initial balance from user
    
    // convert balance to dollars and cents since this is how balance stored
    dollar = (int) balance; // dollar is the interger part of balace
    cent = (int) ((balance - dollar)*100); // cent is the fraction part * 100
    cout<<"Enter interest rate : ";
    in >> interest_rate; // get interest rate from user
    //storing the interest as decimal
    interest_rate = interest_rate/100;
    cout<<"Enter Term : ";
    in >> term; // get term from user
}
double CDAccount::get_initial_balance() const
{
	return (double)((double)dollar+(double)((double)cent/100.0));
}
double CDAccount::get_interest_rate() const
{
	return interest_rate;
}
double CDAccount::get_balance_at_maturity() const
{
	double amount = dollar+(cent/100);
	return get_initial_balance()+amount*interest_rate*term;
}
int CDAccount::get_term() const
{
	return term;
}
void CDAccount::output(ostream& out)
{
	out<<"===========Account Details==============\n\n";
	out<<"balance : "<<get_initial_balance()<<endl;
	out<<"Interest Rate : "<<get_interest_rate()<<endl;
	out<<"Term : "<<get_term()<<endl;
	out<<"balance at matuarity : "<<get_balance_at_maturity()<<endl;
}
