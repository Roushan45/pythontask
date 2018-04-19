#include<iostream>
#include "Coin.cpp"

using namespace std;

int main()
{
	//Coin array for 3 objects
	Coin c[3];
	int year,quant;
	string desc;
	double fv,mv;
	//for each Coin asking the value
	for(int i=0;i<3;i++)
	{
		cout<<"Enter the Info for Coin  :  "<<i+1<<endl;
		cout<<"Enter the year : ";
		cin>>year;
		cout<<"Enter the face value of coin : ";
		cin>>fv;
		cout<<"Enter the market value of coin : ";
		cin>>mv;
		cout<<"Enter the quantity of coin : ";
		cin>>quant;
		cout<<"Enter the description of coin : ";
		cin.ignore();
		getline(cin,desc);
		//using mutators setting the value
		c[i].setYear(year);
		c[i].setQuantity(quant);
		c[i].setFaceValue(fv);
		c[i].setMarketValue(mv);
		c[i].setDescription(desc);
		
	}
	cout<<"\n=======================================\n";
	//printing the values using accessors
	for(int j=0;j<3;j++)
	{
		cout<<"Coin "<<j+1<<" Information : \n";
		cout<<"Coin Description : "<<c[j].getDescription()<<endl;
		cout<<"Coin Minted Year : "<<c[j].getYear()<<endl;
		cout<<"Coin Face Value : "<<c[j].getFaceValue()<<endl;
		cout<<"Coin Market Value : "<<c[j].getMarketValue()<<endl;
		cout<<"Coin Quantity : "<<c[j].getQuantity()<<endl;
		cout<<"Face and Market value difference : "<<getFaceAndMarketValueDiff(c[j])<<endl;
		cout<<"------------------------------------\n";
	}
	
	cout<<"\nTotal Value of coin : "<<totalValue;
	
	return 0;
}
