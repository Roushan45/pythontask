#include<iostream>

using namespace std;

class Polygon{
protected:
	int width,height;
public:
	void set_values(int a, int b)
	{
		width=a;height=b;
	}
	
	virtual int area()=0;
};

class Rectangle:public Polygon{
	public:
		int area()
		{
			return width*height;
		}
};

int main()
{
	//static binding 
	//in this rect is object of Rectangle class
	//and compile time compliler resolves it as a 
	//static binding or early binding
	cout<<"Static Binding\n";
	Rectangle rect;
	rect.set_values(5,6);
	cout<<"Area = "<<rect.area()<<endl;
	
	//dynamic binding
	//in this by using the reference of base class
	//actually creating the object of derived class
	//at the compile time poly will treated as Polygon class object
	//but at run time it will treated as Rectangle class object
	//so it resolves late , so it is late binding or Dynamic binding
	cout<<"\nDynamic Binding\n";
	Polygon *poly = new Rectangle();
	poly->set_values(5,10);
	cout<<"Area = "<<poly->area();
	return 0;
}
