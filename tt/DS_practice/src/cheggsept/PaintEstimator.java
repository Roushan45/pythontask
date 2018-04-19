package cheggsept;
public class PaintEstimator {
	public static void main(String[] args) {
		/* NOTE: IN BlueJ, we could run the program by right-clicking to make a wall object, and then calling the
methods in order. Here, in the main method we are calling the methods and printing the answers in a user-friendly way
		 */
		Wall myWall= new Wall(); //make a wall object, which will prompt the user to input height & width of wall.

		double wallArea = 0.0; //local method variable to hold the area for printing
		// Calculate and output wall area
		wallArea = myWall.calculateArea(); // fixed Calculate the wall's area (in Wall class)
		System.out.println("Area of the wall: " + wallArea + "square feet"); // FIXME (1): Finish the output statement so the variable prints
		// fixed : Calculate and output the amount of paint in gallons needed to paint the wall
		double NumberOfPaintGallons;
		//passing the wallArae in order to calculate area and getting the 
		//no of gallons
		NumberOfPaintGallons = myWall.getNumberOfPaintGallons(wallArea);
		System.out.println("Paint needed: " + NumberOfPaintGallons + "gallons");

		return;
	}
}