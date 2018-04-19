#include<iostream>
#include <iomanip>
using namespace std;

int main(){
	
	double perSharePrice;
	long noOfShare;
	long double totalSharePrice;
	long double sharePriceWithCommision;
	double commision;
	
	cout <<"Enter the Share price : ";
	cin >>perSharePrice;
	
	
	cout <<"\nEnter the no of share you want to buy  ";
	cin >>noOfShare;
	cout<<"\nCalculating.... price of "<<setprecision(10) <<noOfShare <<"  shares  at  per share price of  " <<setprecision(5) <<showpoint<<perSharePrice <<endl;
	
	//Calculatin total share price without commision
	totalSharePrice = noOfShare*perSharePrice;
	
	
	cout <<"\nTotal price of share without any commision :  "<<setw(6) <<showpoint <<totalSharePrice<<endl;
	
	//Calculatin Commission
	commision = (2*totalSharePrice)/100;
	
	cout <<"\nCommmision 2 percent : of transaction amount " <<setprecision(5) <<showpoint <<commision <<endl;
	
	//Calculatin total share price including Commision
	sharePriceWithCommision = commision + totalSharePrice;
	
	cout <<"\nTotal payable cost including commision is "<<setw(6) <<sharePriceWithCommision <<endl;
	
	
}


