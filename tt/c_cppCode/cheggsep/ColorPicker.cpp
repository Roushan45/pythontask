#include<iostream>
#include<string>

using namespace std;
/**
Color class for choosing color 
*/
class Color{
	//color array
	string colors[7];
	public:
		//set elemet will set color to 
		//string color array 
		void setElement( int index, string color)
	 	{
	 		colors[index]=color;
		}
		//method to printout all the color from colors array
		void printAllColor()
		{
			cout<<"\nAll Colors \n";
			for(int i=0;i<7;i++)
			{
				cout<<colors[i]<<endl;
			}
		}
		//this method will randomly choose color from 
		//color array
		void printRandomColor()
		{
			int min=1,max=7;
			int randNo = min + (rand() * (int)(max - min) / RAND_MAX);  
			cout<<"\nRandom Color Picked : "<<colors[randNo-1]<<endl;
		}
};
//main functions for execution 
int main()
{
	/*in below line please replace YourName with your actual name as
	i have no information about*/
	cout << "Name: YourName  - Program Name: ColorPicker - Date:  09/09/17" << endl;
	Color colorObj;
	//setting the color element
	colorObj.setElement(0,"red");
	colorObj.setElement(1,"orange");
	colorObj.setElement(2,"yellow");
	colorObj.setElement(3,"green");
	colorObj.setElement(4,"blue");
	colorObj.setElement(5,"indigo");
	colorObj.setElement(6,"voilet");
	//printing all color
	colorObj.printAllColor();
	//printing random color
	colorObj.printRandomColor();
	return 0;
}
