#include<string>
#include<iostream>
#include "Coin.h"
using namespace std;
//Constructors ans desctructors
Coin::Coin(){
}
Coin::Coin(int y,double fv,string desc,int q,double mv)
{
	year = y;
	faceValue = fv;
	description = desc;
	quantity = q;
	marketValue = mv;
}
Coin::~Coin(){
}
//mutators and accessors basic validation
//for checking negative numbers
void Coin::setYear(int y)
{
		if(y<1000)
		{
			cout<<"Ivalid year \n";
			year = 1000;
		}
		else
			year = y;
}
void Coin::setFaceValue(double fv)
{
	if(fv<0)
	{
		cout<<"face Value can be negative , setting to 0\n";
		faceValue = 0;
	}
	else
		faceValue = fv;
}
void Coin::setDescription(string desc)
{
	description = desc;
}
void Coin::setQuantity(int q)
{
	if(q<0)
	{
		cout<<"Quantity can not be negative , setting to 0\n";
		quantity = 0;
	}
	else
		quantity = q;
}
void Coin::setMarketValue(double mv)
{
	if(mv<0)
	{
		cout<<"Market value can not be negative, setting to 0\n";
		marketValue = 0;
	}
	else{
			marketValue = mv;
			//static field total value updating 

			totalValue = totalValue+mv*quantity;
	}
	
}
int Coin::getYear()
{
	return year;
}
string Coin::getDescription()
{
	return description;
}
double Coin::getFaceValue()
{
	return faceValue;
}
double Coin::getMarketValue()
{
	return marketValue;
}
int Coin::getQuantity()
{
	return quantity;
}
//method for getting diff of facevalue and market value
double getFaceAndMarketValueDiff(Coin c)
{
	return c.getFaceValue()-c.getMarketValue();
}
