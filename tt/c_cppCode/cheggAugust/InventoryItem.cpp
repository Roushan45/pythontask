#include <iostream>
#include <iomanip>
#include <string>
#include <cctype>
#include <stdexcept>
#include "InventoryItem.h"
using namespace std;
InventoryItem::InventoryItem()
{
}
InventoryItem::InventoryItem(string d, int q)
{
description = d;
setQuantityOnHand(q);
}
void InventoryItem::setDescription(string d)
{
	description=d;
}
string InventoryItem::getDescription() {
return description;
}
int InventoryItem::getQuantityOnHand()
{
	return quantityOnHand;
}
float InventoryItem::getPrice()
{
	return price;
}
//set quantiyy  method in which checking the negative
//quantity in try catch block
void InventoryItem::setQuantityOnHand(int q)
{
try{
	if(q < 0)
	{
		quantityOnHand=0;
		throw invalid_argument( "quantity cannot be negative" );	
	}
		
	else
		quantityOnHand = q;
}
catch( const invalid_argument& e)
{
	cout<<e.what()<<endl;
}
}
//as same as set quantity method checking for setPrice  method
void InventoryItem::setPrice(float p)
{
	try{
	
	if(p < 0)
	{
		price=0;
		throw invalid_argument( "Price cannot be negative..." );
	}
	
	else
		price = p;
}
catch( const invalid_argument& e)
{
	cout<<e.what()<<endl;
}
	}	

