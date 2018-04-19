#include<iostream>
#include<string>
#include"RetailItem.cpp"

using namespace std;

int main()
{
	//created three objects of RetailItem
	RetailItem r[3];
	string desc;
	int unit=0;
	double price=0.0;
	//getting the user input
	cout<<"Item 1 inirialize with default values \n"<<endl;
	for(int i=1;i<3;i++)
	{
		cout<<"Enter the description for item "<<i+1<<" : ";
		getline(cin,desc);
		//validating the no of unit >0
		while(unit<=0)
		{
	
		cout<<"Enter the no of unit of item "<<i+1<<" : ";
		cin>>unit;
		if(unit<=0)
		cout<<"unit cannot be 0 please enter again"<<endl;
	}
	//validating the price >0
		while(price<=0.0)
		{
	
		cout<<"Enter the price of item "<<i+1<<" : ";
		cin>>price;
		cin.ignore();
		if(price<=0)
		cout<<"price cannot be 0 please enter again"<<endl;
		
	}
	cout<<endl;
	//using mutators setting the values
	r[i].setDescription(desc);
		r[i].setUnitsOnHand(unit);
		r[i].setPrice(price);
		unit=0;
		price=0;
		
	}
	//displaying  the all items
	cout<<"Display items...\n"<<endl;
	int totalInventory=0;
	for(int i=0;i<3;i++)
	{
		cout<<"Description : "<<r[i].getDescription()<<endl;
		cout<<"Units on hand : "<<r[i].getUnitsOnHand()<<endl;
		totalInventory+=r[i].getUnitsOnHand();
		cout<<"Price : "<< r[i].getPrice()<<" $ "<<endl;
		cout<<"\n\n";
	}
	cout<<"Total Inventory "<<endl;
	cout<<"Total Inventory is : "<<totalInventory<<endl;
	return 0;
}
