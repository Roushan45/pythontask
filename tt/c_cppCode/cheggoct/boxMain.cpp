#include "Box.hpp"//included hpp file 
#include<iostream>
using namespace std;
//clent code for box
int main(void)
{
	//3 object created of box
	Box box1(2.4, 7.1, 5.0);
	Box box2;
	Box box3;
	//printing the volume ans area
	double volume1 = box1.calcVolume();
	double surfaceArea1 = box1.calcSurfaceArea();
	cout<<"Volume of Box 1: "<<volume1<<endl;
	cout<<"Surface area of Box 1: "<<surfaceArea1<<endl<<endl;
	double volume2 = box2.calcVolume();
	double surfaceArea2 = box2.calcSurfaceArea();
	cout<<"Volume of Box 2: "<<volume2<<endl;
	cout<<"Surface area of Box 2: "<<surfaceArea2<<endl<<endl;
	//using setters set the value of box
	box3.setHeight(4);
	box3.setLength(6.4);
	box3.setWidht(5.3);
	//printing the vol and surface area
	double volume3 = box3.calcVolume();
	double surfaceArea3 = box3.calcSurfaceArea();
	cout<<"Volume of Box 3: "<<volume3<<endl;
	cout<<"Surface area of Box 3: "<<surfaceArea3<<endl;
	return 0;
}
