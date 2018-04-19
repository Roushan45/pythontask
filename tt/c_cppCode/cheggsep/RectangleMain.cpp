#include<iostream>
#include "Rectangle.cpp"

using namespace std;

int main()
{
	//put your name in below cout statement in the place of YourName
	cout << "Name: YourName - Program Name: Rectangle - Date: 130917\n" << endl;
  Rectangle rect1;
  // Use set_values function to set values 
  rect1.set_values (5,6);
  cout << "Rectangle 1 area  " << rect1.area() << endl;
  Rectangle rect2;
  // Use set_values function to set values 
  rect2.set_values (3,4);
  cout << "Rectangle 2 area: " << rect2.area() << endl;
  return 0;
}
