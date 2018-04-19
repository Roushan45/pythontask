package cheggoct;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
	
	private double radius;
	
	//default constructor
	public CircleFromSimpleGeometricObject(){
		
	}
	//constructor with radius
	public CircleFromSimpleGeometricObject(double radius)
	{
		this.radius=radius;//setting the radius
	}
	
	public CircleFromSimpleGeometricObject(double radius, String color,boolean filled)
	{
		super.setColor(color);//setting the parent class color
		super.setFilled(filled);//setting the parent class filled
		this.radius=radius;//setting the radius
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;//setting the radius
	}
	public double getArea()
	{
		return 3.14*radius*radius;//calculating area
	}
	public double getDiameter()
	{
		return 2*radius;//calculating diameter
	}
	public double getPerimeter()
	{
		return 2*3.14*radius;//Calculating perimeter
	}
	public void printCircle()
	{
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
	
}

