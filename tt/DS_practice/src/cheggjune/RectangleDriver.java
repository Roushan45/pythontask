package cheggjune;

public class RectangleDriver {

	public static void main(String[] args) throws Exception {
		//created the object of rectangle
		Rectangle r1 = new Rectangle(20, 15, 20, 15);
		//testing the declared methods
		System.out.println("Area of rectangle : "+r1.area());
		System.out.println("if x any y fits into rctangle : "+r1.inside(15, 19));
		r1.largetSquare();

	}

}
