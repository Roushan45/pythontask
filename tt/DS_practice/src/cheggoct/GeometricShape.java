package cheggoct;
public class GeometricShape
{
	private double side1, side2, side3;
	//These are the variables necessary to calculat the perimeter of a triangle 
	private double radius;
	//Radius is needed to calculate the perimeter of a circle 
	private double length, width;
	//Length and Width are needed to calculate the perimeter of a rectangle 
	private boolean triangle = false;
	private boolean rectangle = false;
	private boolean circle = false;
	//Constructor for a triangle 
	public GeometricShape(double aSide1, double aSide2, double aSide3)
	{ 
		side1 = aSide1; side2 = aSide2; side3 = aSide3; triangle = true; 
	}
	//Constructor for a rectangle
	public GeometricShape(double aLength, double aWidth)
	{ 
		length = aLength; width = aWidth; rectangle = true; 
	}
	//Constructor for a circle
	public GeometricShape(double aRadius)
	{ 
		radius = aRadius; 
		circle = true; 
	}
	public double getRadius()
	{ return radius; }
	public double getSide1()
	{ return side1; }
	public double getSide2()
	{ return side2; }
	public double getSide3()
	{ 
		return side3; 
	}
	public double getLength()
	{
		return length; 
	} 
	public double getWidth()
	{ 
		return width; 
	}
	public void setRadius(double aRadius)
	{ 
		radius = aRadius; 
	}
	public void setSide1(double aSide1)
	{
		side1 = aSide1; 
	} 
	public void setSide2(double aSide2)
	{ side2 = aSide2; 
	}
	public void setSide3(double aSide3)
	{ side3 = aSide3; 
	}
	public void setLength(double aLength)
	{ length = aLength; 
	} 
	public void setWidth(double aWidth)
	{ 
		width = aWidth; 
	} 
	public double getPerimeter()
	{
		//Calculate the perimeter of the Geometric object depending on what the object is.
		//Remember the following formulas:
		//Perimeter of a Triangle = Side1 + Side2+ Side3
		//Perimeter of a Rectangle = (2 * length) + (2 * width)
		//Perimeter of a Circle = 2 * Math.PI * radius 
		if (triangle == true) {
			double perimeter = side1 + side2 + side3; return perimeter;
		} else if (rectangle == true) {
			double perimeter = (2 * length) + (2 * width); return perimeter; 
		} else if (circle == true)
		{ double perimeter = 2 * Math.PI * radius; return perimeter; 
		} return 0;
	}
	public String toString() { 
		if (triangle == true) 
		{ 
			return "It's a triangle, with sides   " + side1 +", "+" "+ side2 +", "+ side3; 
		} else if (rectangle == true) {
			return " It's a rectangle with length " + length +" and width : "+width; 
		} else if (circle == true) {
			return "It's a circle with  radius " + radius; 
		}
		return "";
	}
}