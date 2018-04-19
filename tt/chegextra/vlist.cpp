#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <conio.h>
#include "vlist.h"
 
using namespace std;
 //int size=0;
vector<string> *DB = new vector<string>();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Function Name: vlist
//Precondition: Constructor has not been invoked.
//Postcondition: count=0, vector size is 9.
//Description: Constructs an instance of a vlist object.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
vlist::vlist()
{

    count = 0;
  //	DB->resize(9);
    cout<<"default constructor invoked\n";
}
 
 
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Function Name: vlist
//Precondition: A vlist object is being passed by reference.
//Postcondition: A hard copy of a vlist object has been created.
//Description: Creates a hard copy of a vlist object.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
vlist::vlist(const vlist & Org)
{
	cout<<"copy constructor invoked\n";
    if (this != &Org)
    {
        count = Org.count;
        (*this) = Org;
    }
}
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Function Name: ~vlist
//Precondition: Destructor has not been invoked.
//Postcondition: array DB deleted.
//Description: Deallocates memory of a vlist object.
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
vlist::~vlist()
{
    cout<<"The destructor has been called"<< endl;
}
 
 
bool vlist::Is_Empty()
{
	return DB->empty();
}
 
 
string vlist:: Search(const string & key)
{
  if ( find(DB->begin(), DB->end(), key) != DB->end() ){
  	return "item find";
  }
  else{
  		return "item not ound";
  }
  
}
 
void vlist::Insert(const string & key)
{
        DB->push_back(key);
		count++;
}
void vlist::Remove(const string & key)
{
 
 DB->erase(remove(DB->begin(), DB->end(), key), DB->end());
}
void vlist::Print()
{
	vector<string>::iterator v = DB->begin();
   while( v != DB->end()) {
     cout << "value of v = " << *v << endl;
     v++;
   }
   
}
 
