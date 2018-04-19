#include<iostream>
#include<string>
using namespace std;
class Benefit{
	
	private:
		string healthinsurance;
		double lifeinsurance;
		int vacation;
	public:
		Benefit(){
		}
		Benefit(string hins,double lins,int vac)
		{
			healthinsurance=hins;
			lifeinsurance=lins;
			vacation=vac;
		}
		void displayBenefits()
		{
			cout<<"Health Insurance : "<<healthinsurance<<endl;
			cout<<"Lige Insurance : "<<lifeinsurance<<endl;
			cout<<"Vacation : "<<vacation<<endl;
		}
};
