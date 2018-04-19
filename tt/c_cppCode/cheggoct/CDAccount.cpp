#include<iostream>
#include<iomanip>
using namespace std;
/*class CDAccount replaces the structure*/
class CDAccount{
	//private variables
	private:
		double balance;
		double interest_rate;
		int term; //months until maturity
		//public getters for varoiables and constructors
	public:
		CDAccount()
		{
			balance=0.0;
			interest_rate=0.0;
			term=0;
		}
		CDAccount(double b,double i,int t)
		{
			balance=b;
			interest_rate=i;
			term=t;
		}
		double getBalance()
		{
			return balance;
		}
		double getInterestRate()
		{
			return  interest_rate;
		}
		double getTerm()
		{
			return term;
		}
		//get input method that accepts only istream as param
		void getInput(istream& cin)
		{
			cin>>balance;
			cin>>interest_rate;
			cin>>term;
		}
		//get the calculated maturity value
		double getMaturityValue()
		{
			return balance+(balance*(interest_rate/100.0)*term/12);
		}
		//output method for displaying the result
		//it accept ostream as param
		void output(ostream& cout)
		{
			cout<<"\n\nBalacnce : $"<<balance<< "\nInterest Rate : "<<interest_rate<<"\nTerm : "<<term<<"\nMaturity Value : $"<<getMaturityValue()<<endl;
		}
};
int main(void)
{
	//created object of CDAccount
	CDAccount ac;
	cout<<"Please enter the Balance , Interest Rate and Term, Hit the enter/return after entering each value\n\n";
	//getting the input
	ac.getInput(std::cin);
	//printing the output
	ac.output(std::cout);
	return 0;
}
