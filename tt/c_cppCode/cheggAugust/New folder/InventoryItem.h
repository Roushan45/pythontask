#ifndef InventoryItem_h
#define InventoryItem_h
 
#include <string>
 
using namespace std;
 
class InventoryItem
{
private:
                string description; // The item description
                int quantityOnHand; // Number of units on hand
 
public:
 
                InventoryItem();
                InventoryItem(string, int q);
 
                // Accessor functions
                string getDescription();
                int getQuantityOnHand();
 
                // Mutator functions
                void setDescription(string); // sets description member to argument
                void setQuantityOnHand(int); // sets QuantityOnHand to argument
 
                void displayInventoryItem();  //display the data members description and quantityOnHand on the standard output
                void readInventoryItem(string); //to read data from an input stream (i.e. file) and set the data members
friend ostream &operator<<( ostream &output, const InventoryItem &item ) 
{ 
         output << "Description: " << item.getDescription() << "\nQuantity : " << item.getQuantityOnHand();
         return output;            
      }
 friend istream &operator>>( istream  &input, InventoryItem &item ) { 
         input >> item.setDescription(desc) >> item.setQuantityOnHand(q);
         return input;            
      }
};
#endif
