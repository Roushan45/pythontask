#include <iostream>
#include "InventoryItem.cpp"
using namespace std;	
int main()
{
InventoryItem item;
item.setDescription("Item1");
//testing scenario for negative price
cout<<"Checking exception for negative price \n";
cout << "Description obtained: " << item.getDescription() << endl;
item.setQuantityOnHand(10);
item.setPrice(-235.23);
cout << "Quantity obtained: " << item.getQuantityOnHand() << endl;
cout << "Price obtained: " << item.getPrice() << endl;
cout<<"\n\nChecking exception for negative quantity \n";
//scenario for negative quantity
InventoryItem item2("Item2", -20);
item2.setPrice(400.32);
cout << "Description obtained: " << item2.getDescription() << endl;
cout << "Quantity obtained: " << item2.getQuantityOnHand() << endl;
cout << "Price obtained: " << item2.getPrice() << endl;
system("pause");
return 0;
}
