#include <iostream>
#include <conio.h>
#include <string>
#include "vlist.h"
#include "vlist.cpp"
using namespace std;
 
int main()
{
    
    //Testing default constructor
    cout << "Test1:Testing the default constructor for string\n";
    vlist String_List;
    
    //Testing functionality for string list
    cout << "Test2: Testing Insert \n";
    String_List.Insert("Hello");
    String_List.Insert("Zebra");
    String_List.Insert("Good_Bye");
    String_List.Insert("Space");
    String_List.Insert("No_One");
    String_List.Print();
    
    cout << "Test 3: Testing copy constructor for string \n";
    vlist Copied_String = String_List;
    Copied_String.Print();
    cout << "Test4: Testing Search \n";
    string found= String_List.Search("Space");
    cout<<found<<endl;
    cout<< "Test5: Testing isEmpty \n";
    cout<<String_List.Is_Empty()<<endl;
    cout << "Test 6: Testing Remove for string \n";
   
    String_List.Remove("Zebra");
    String_List.Remove("Good_Bye");
    String_List.Remove("Hello");
    String_List.Remove("No_One");
    String_List.Remove("Space");
    String_List.Remove("Hello");
    
    cout<<"When leave main destructor will be called"<<endl;
    
    return 0;
}
