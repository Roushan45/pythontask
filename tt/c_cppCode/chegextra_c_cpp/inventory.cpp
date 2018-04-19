//driver program, .cpp file
#include <iostream>
#include "inventory.h"
using namespace std;

int main()
{
	//creating 3 object of class inventory
	Inventory object1,object2,object3;
	int item,quantity;
	double cost;
	//getting the values rfom user
	cout<<"Enter first object info "<<endl;
	cout<<"Enter the item no : ";
	cin>>item;
	cout<<"Enter the quantity : ";
	cin>>quantity;
	cout<<"Enter the cost : ";
	cin>>cost;
	//stting the value to 
	//variable using mutators
	object1.setItemNumber(item);
	object1.setQuantity(quantity);
	object1.setCost(cost);
	object1.setTotalCost(cost * quantity);
	//printing the values of variables
	//using accessors and same for below two more
	//objects (object2, object3)
	cout<<"\nprinting the first object info "<<endl;
	cout<<"Item Number: "<<object1.getItemNumber()<<endl;
	cout<<"Quantity: "<<object1.getQuantity()<<endl;
	cout<<"Cost: "<<object1.getCost()<<endl;
	cout<<"Total Cost: "<<object1.getTotalCost()<<endl;
	
	cout<<"Enter second object info "<<endl;
	cout<<"Enter the item no : ";
	cin>>item;
	cout<<"Enter the quantity : ";
	cin>>quantity;
	cout<<"Enter the cost : ";
	cin>>cost;
	object2.setItemNumber(item);
	object2.setQuantity(quantity);
	object2.setCost(cost);
	object2.setTotalCost(cost * quantity);
	cout<<"\nprinting the second object info "<<endl;
	cout<<"Item Number: "<<object2.getItemNumber()<<endl;
	cout<<"Quantity: "<<object2.getQuantity()<<endl;
	cout<<"Cost: "<<object2.getCost()<<endl;
	cout<<"Total Cost: "<<object2.getTotalCost()<<endl;
	
	cout<<"Enter third object info "<<endl;
	cout<<"Enter the item no : ";
	cin>>item;
	cout<<"Enter the quantity : ";
	cin>>quantity;
	cout<<"Enter the cost : ";
	cin>>cost;
	object3.setItemNumber(item);
	object3.setQuantity(quantity);
	object3.setCost(cost);
	object3.setTotalCost(cost * quantity);
	cout<<"\nprinting the third object info "<<endl;
	cout<<"Item Number: "<<object3.getItemNumber()<<endl;
	cout<<"Quantity: "<<object3.getQuantity()<<endl;
	cout<<"Cost: "<<object3.getCost()<<endl;
	cout<<"Total Cost: "<<object3.getTotalCost()<<endl;
	return 0;
}
