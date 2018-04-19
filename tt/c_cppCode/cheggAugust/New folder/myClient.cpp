//myClient.cpp (client program with the main function)
#include <iostream>
#include "InventoryItem.cpp"
 
using namespace std;
 
int main()
 
{
                /*** Declare an InventoryItem object */
                InventoryItem item;
 
                /*** write code to test the mutator and accessor members */
                item.setDescription("Item1");
                //cout << "Description obtained: " << item.getDescription() << endl;
 
                item.setQuantityOnHand(50);
                //cout << "Quantity obtained: " << item.getQuantityOnHand() << endl;
                cout<<item;
 
                InventoryItem itemB("Item2", 75);
                cout << "Description obtained: " << itemB.getDescription() << endl;
                cout << "Quantity obtained: " << itemB.getQuantityOnHand() << endl;
 
                /* testing the method displayInventoryItem()*/
 
                InventoryItem itemC("Item3", 32);
                itemC.displayInventoryItem();
 
                /* testing the method readInventoryItem passing the file name*/
 
                InventoryItem itemD;
                itemD.readInventoryItem("inventory.txt");
                itemD.displayInventoryItem();
                //system("pause");
 
                return 0;
}
