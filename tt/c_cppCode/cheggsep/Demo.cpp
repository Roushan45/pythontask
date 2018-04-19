// This program demonstrates the use of pointer variables
// It finds the area of a rectangle given length and width
// It prints the length and width in ascending order 
 
#include <iostream>
using namespace std;
 
int main()
{
 
   int length; // holds length
   int width; // holds width
   int area; // holds area
 
   int *lengthPtr; // int pointer which will be set to point to length
   int *widthPtr;   // int pointer which will be set to point to width
 
   cout << "Please input the length of the rectangle" << endl;
   cin >> length;
   cout << "Please input the width of the rectangle" << endl;
   cin >> width;
 
   //for storing the & will get the address of variable
   lengthPtr = &length;
   widthPtr = &width; 
   
 	//for getting the actual value from pointer
 	//need to de-reference the pointer by *
   area =  *lengthPtr * *widthPtr;//calculating area by using only the pointer variables
   cout << "The area is " << area << endl;
 
 	//just de-reference the pointer as above
   if (*lengthPtr >  *widthPtr)
    cout << "The length is greater than the width" << endl;
 
   else if (*widthPtr > *lengthPtr)
    cout << "The width is greater than the length" << endl;
 
   else 
    cout << "The width and length are the same" << endl;
 
   return 0;
}
