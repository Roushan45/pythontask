#include<iostream>
using namespace std;
int main(void){
	int quantity;
	double discount_amt,total_amount;
	cout<<"Enter the number of packages : ";
	cin>>quantity;
	//based on the quantity enters calculating 
	//discount and total after discount
	//10-19
	if(quantity>=10 && quantity <=19){
		double total=quantity*99;
		discount_amt=(total*20.0)/100;
		total_amount=total-discount_amt;
	}//20-49
	else if(quantity>=20 && quantity<=49){
		double total=quantity*99;
		discount_amt=(total*30.0)/100;
		total_amount=total-discount_amt;
	}//50-99
	else if(quantity>=50 && quantity<=99){
		double total=quantity*99;
		discount_amt=(total*40.0)/100;
		total_amount=total-discount_amt;
	}//100- above
	else if(quantity>99){
		double total=quantity*99;
		discount_amt=(total*50.0)/100;
		total_amount=total-discount_amt;
	}//less than 10
	else{
		double total=quantity*99;
		discount_amt=0;
		total_amount=total-discount_amt;
	}
	cout<<"Discount : $"<<discount_amt<<endl;
	cout<<"Total : $"<<total_amount<<endl;
	return 0;
}
