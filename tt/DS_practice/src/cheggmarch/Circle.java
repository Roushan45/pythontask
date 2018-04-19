package cheggmarch;

public class Circle {
	
	private double radius;
	
	public Circle(double r){
		radius=r;
	}
	
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		final double PI=3.14159;
		return PI*radius*radius;
	}
	public double getDiameter(){
		return 2*radius;
	}
	public double getCircumference(){
		final double PI=3.14159;
		return 2*PI*radius;
	}

}
