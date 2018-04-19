 
#include<iostream>
#include<fstream>
using namespace std;
 
const int DESCRIPTION = 20;
 
// Function prototype
void Add();
void Display();
void Edit();
 
// Structure definition
struct Inventory
{
char item[DESCRIPTION];
int qty;
double wholeCost;
double retailCost;
char date[15];
};
 
int main()
{
// Variables
int select;
do
{
// Menu
cout << "MENU" << endl;
cout << "1. Add Record" << endl;
cout << "2. Display Record" << endl;
cout << "3. Edit Record" << endl;
cout << "4. Exit" << endl;
cout << "Enter your selection: ";
cin >> select;
cout << endl;
 
switch (select)
{
case 1:
Add();
break;
case 2:
Display();
break;
case 3:
Edit();
break;
case 4:
break;
default:
cout << "Invalid entry" << endl;
break;
}
 
} while (select != 4);
 
system("pause");
return 0;
}
 
// Function Add
void Add()
{
fstream fout;
const int size = 3;
char ch;
fout.open("Records.txt", ios::out);
Inventory inv;
 
 
do
{
cout << "Enter the item description:  ";
cin.ignore();
cin.getline(inv.item, DESCRIPTION);
 
cout << "Enter the quantity:  ";
cin >> inv.qty;
while (inv.qty < 1)
{
cout << "Quantity must be 1 or more." << endl << endl;
cout << "Enter the quantity:  ";
cin >> inv.qty;
}
 
cout << "Enter the wholesale cost:  ";
cin >> inv.wholeCost;
while (inv.wholeCost <= 0)
{
cout << "Cost must be greater than 0." << endl << endl;
cout << "Enter the wholesale cost:  ";
cin >> inv.wholeCost;
}
 
cout << "Enter the retail cost:  ";
cin >> inv.retailCost;
while (inv.retailCost <= 0)
{
cout << "Cost must be greater than 0." << endl << endl;
cout << "Enter the retail cost:  ";
cin >> inv.retailCost;
}
 
cout << "Enter the date as mm-dd-yyyy:  ";
cin.ignore();
cin.getline(inv.date, 15);
 
fout.write(reinterpret_cast<char *>(&inv), sizeof(inv));
cout << "Enter another record?" << endl;
cout << "Enter Y for yes:  ";
cin >> ch;
cout << endl;
} while (ch == 'Y' || ch == 'y');
 
fout.close();
}
 
// Function Display
void Display()
{
fstream fout;
fout.open("Records.txt", ios::in);
Inventory inv;
fout.read(reinterpret_cast<char *>(&inv), sizeof(inv));
 
while (!fout.eof())
{
cout << "\nDescription\t";
cout << inv.item;
cout << "\nQuantity\t";
cout << inv.qty;
cout << "\nWholesale cost\t";
cout << inv.wholeCost;
cout << "\nRetail cost\t";
cout << inv.retailCost;
cout << "\nDate\t";
cout << inv.date;
cout << endl;
 
fout.read(reinterpret_cast<char *>(&inv), sizeof(inv));
}
fout.close();
cout << endl;
}
 
// Function Edit
void Edit()
{
fstream fout;
fout.open("Records.txt", ios::in | ios::out);
Inventory inv;
int recordNum;
 
cout << "Enter the record number to edit:  ";
cin >> recordNum;
recordNum -= 1;
 
fout.seekg(recordNum * sizeof(inv), ios::beg);
fout.read(reinterpret_cast<char *>(&inv), sizeof(inv));
 
cout << "\nDescription\t";
cout << inv.item;
cout << "\nQuantity\t";
cout << inv.qty;
cout << "\nWholesale cost\t";
cout << inv.wholeCost;
cout << "\nRetail cost\t";
cout << inv.retailCost;
cout << "\nDate\t";
cout << inv.date;
cout << endl << endl;
 
cout << "Enter the new description:  ";
cin.ignore();
cin.getline(inv.item, DESCRIPTION);
 
cout << "Enter the quantity:  ";
cin >> inv.qty;
while (inv.qty < 1)
{
cout << "Quantity must be 1 or more." << endl << endl;
cout << "Enter the quantity:  ";
cin >> inv.qty;
}
 
cout << "Enter the wholesale cost:  ";
cin >> inv.wholeCost;
while (inv.wholeCost <= 0)
{
cout << "Cost must be greater than 0." << endl << endl;
cout << "Enter the wholesale cost:  ";
cin >> inv.wholeCost;
}
 
cout << "Enter the retail cost:  ";  
cin >> inv.retailCost;
while (inv.retailCost <= 0)
{
cout << "Cost must be greater than 0." << endl << endl;
cout << "Enter the retail cost:  ";
cin >> inv.retailCost;
}
 
cout << "Enter the date:  ";
cin.ignore();
cin.getline(inv.date, 15);
cout << endl;
 
// Move back to the beginning of this record's position
fout.seekg(recordNum * sizeof(inv), ios::beg);
// Write new record over the current record
fout.write(reinterpret_cast<char *>(&inv), sizeof(inv));
fout.close();
}
