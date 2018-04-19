#include <iostream>
#include <iomanip>
#include <string>
#include <cctype>
#include <fstream>
#include "InventoryItem.h"
 
using namespace std;
 
InventoryItem::InventoryItem()
{
}
InventoryItem::InventoryItem(string d, int q)
{
                description = d;
                if (q < 0) q = 0;
                quantityOnHand = q;
}
string InventoryItem::getDescription() {
                return description;
}
 
int InventoryItem::getQuantityOnHand() {
                return quantityOnHand;
}
void InventoryItem::setDescription(string d)
{
                description = d;
}
 
void InventoryItem::setQuantityOnHand(int q)
{
                quantityOnHand = q;
}
//InventoryItem InventoryItem::displayInventoryItem(const InventoryItem &item)
//{
//                //cout << "Description obtained :" << description << endl;
//                //cout << "Quantity obtained: " << quantityOnHand << endl;
//                cout<<item;
//}
void InventoryItem::readInventoryItem(string myFile)
{
                string description = "";
                int quantity;
 
                ifstream mystream(myFile);
                if (!mystream.is_open()) //Handle error in file opening
                {
                                cout << "Unable to open data file " << myFile;
                                exit(1);
                }
 
                getline(mystream, description);   //reads the first line from the file        
                mystream >> quantity; //reads the second line, which is an integer from the file
 
                setDescription(description);
                setQuantityOnHand(quantity);
 
                mystream.close();
}

