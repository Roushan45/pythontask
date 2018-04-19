#include<iostream>

using namespace std;
class Rectangle
{
	public:
		//variable of Rectangle
		int length;
		int width;
		//declared the 4 requirec constructores
		Rectangle();
		Rectangle(int l,int w);
		Rectangle(int l);
		Rectangle(Rectangle& r);
};
Rectangle::Rectangle()
{
	//using default value as 3 and 2
	length=3;
	width=2;
}
//setting the length and width as per 
//passed vlues 
Rectangle::Rectangle(int l,int w)
{
	length=l;
	width=w;
}
//setting the length as per passed
//and width default value
Rectangle::Rectangle(int l)
{
	length=l;
	width=2;
}
//passing the rectangle object
Rectangle::Rectangle(Rectangle& r)
{
	//assigning the values from rectangle to
	//current rectangle
	length=r.length;
	width=r.width;
}

int main()
{
	//created object using diff constructor
	Rectangle r1;
	Rectangle r2(4,5);
	Rectangle r3(10);
	Rectangle r4(r2);
	//printing the length and width of all rectangles
	cout<<"Rectangle r1 length and width : "<<r1.length<<" & "<<r1.width<<endl;
	cout<<"Rectangle r2 length and width : "<<r2.length<<" & "<<r2.width<<endl;
	cout<<"Rectangle r3 length and width : "<<r3.length<<" & "<<r3.width<<endl;
	cout<<"Rectangle r4 length and width : "<<r4.length<<" & "<<r4.width<<endl;
}
