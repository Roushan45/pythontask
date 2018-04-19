package cheggoct;
public class TriangleApp
{
	public static void main(String[] args)
	{
		double[] side1Values = {3.0, 5.0, 4.0, 4.5, 0.0, 4.0, -2.0, 1.0, 3.1};
		double[] side2Values = {5.0, 4.0, 3.0, 4.5, 0.0, 4.0,2.0, 2.0, 2.1};
		double[] side3Values = {4.0, 3.0, 5.0, 4.5, 0.0, 5.0,1.0, 3.0, 0.0};
		int numberOfTests = side1Values.length;
		for(int i = 0; i < numberOfTests; i++) {
			Triangle1 triangle =
					new Triangle1(side1Values[i], side2Values[i], side3Values[i]);
			testTriangle(triangle);
		}
	}
	private static void testTriangle(Triangle1 t) {
		System.out.printf("Triangle (%.1f, %.1f, %.1f) ",
				t.getSide1(), t.getSide2(), t.getSide3());
		System.out.print(t.isEquilateral() ? "is equilateral" : "");
		System.out.print(t.isRight() ? "is right" : "");
		System.out.println();
	}
}
/*
Triangle (3.0, 5.0, 4.0) is right
Triangle (5.0, 4.0, 3.0) is right
Triangle (4.0, 3.0, 5.0) is right
Triangle (4.5, 4.5, 4.5) is equilateral
Triangle (1.0, 1.0, 1.0) is equilateral
Triangle (4.0, 4.0, 5.0)
Triangle (1.0, 1.0, 1.0) is equilateral
Triangle (1.0, 1.0, 1.0) is equilateral
Triangle (1.0, 1.0, 1.0) is equilateral
 */
