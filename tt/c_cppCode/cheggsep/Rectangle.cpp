/*Implementation of header file*/
#include "Rectangle.h"
Rectangle::Rectangle(){}
void Rectangle::set_values(int l,int b)
{
	length=l;
	breadth=b;
}
int Rectangle::area()
{
	//completed implementation of area
	int answer;
	answer =  length*breadth;
	return answer;
}
