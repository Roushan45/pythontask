#include<iostream>
using namespace std;

int main()
{
	double totalBill;
	double liquorCharge;
	double tipPercentage;
	cout<<"Enter the total bill : ";
	cin>>totalBill;
	cout<<"Enter the liquor charge : ";
	cin>>liquorCharge;
	cout<<"Enter the tip percentage : ";
	cin>>tipPercentage;
	double billWithoutLiquorCharge= totalBill-liquorCharge;
	double tip = billWithoutLiquorCharge*(tipPercentage/100);
	cout<<"\nTip : "<<tip<<"$"<<endl;
	cout<<"Total charge  for Jerry credit card : "<<totalBill+tip<<"$"<<endl;
	return 0;
}
