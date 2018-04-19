#ifndef INVENTORYITEM_H
#define INVENTORYITEM_H
#include <string>
using namespace std;
class InventoryItem
{
private:
string description;
int quantityOnHand;
//added member var price
float price;
public:
InventoryItem();
InventoryItem(string, int q);
string getDescription();
int getQuantityOnHand();
//added getter and setters method
float getPrice();
void setPrice(float p);
void setDescription(string);
void setQuantityOnHand(int);
};
#endif
