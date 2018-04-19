#include "Box.hpp"//included Box header
//Constructor
Box::Box(double h,double w,double l){
	height=h;
	width=w;
	length=l;
}
//default constructor
Box::Box(){
	//using setter for setting value to 1 
	setHeight(1.0);
	setLength(1.0);
	setWidht(1.0);
}
//setters
void Box::setHeight(double h){
	height=h;
}
void Box::setWidht(double w){
	width=w;
}
void Box::setLength(double l){
	length=l;
}
//method for calculating volume
double Box::calcVolume(){
	return height*length*width;
}
//method for calculating surface area
double Box::calcSurfaceArea(){
	return (2*height*width)+(2*length*height)+(2*width*length);
}
