package cheggfeb18;

public class Circle extends GeometricObject{

	private double x,y;
	private double radius;
	public Circle() {
		this.x=0;
		this.y=0;
		this.radius=1.0;
	}
	public Circle(double _x,double _y,double _r) {
		this.x=_x;
		this.y=_y;
		this.radius=_r;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public double getArea() {
		 return 3.14 * (radius * radius);
	}
	@Override
	public double getPerimeter() {
		 return 2 * 3.14 * radius;
	}
	public String toString() {
		return "Circle \nx = "+x+"\ny = "+y+"\nradius = "+radius;
	}
	
}
