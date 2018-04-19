package cheggsept;
import java.util.Scanner;
class Wall{
	//instance variables
	private double height;
	private double width;

	private Scanner scnr = new Scanner(System.in);

	private final double SQUARE_FEET_PER_GALLON = 350.0; //constant variable to hold feet/galloon for painting wall

	//constructor for wall
	public Wall(){
		inputHeight();
		inputWidth();
	}

	public void inputHeight(){
		System.out.println("Enter the height of wall(feet):");
		height = scnr.nextDouble();
	}


	 //fixed prompting for width
	public void inputWidth(){
		System.out.println("Enter the width of wall(feet):");
		width = scnr.nextDouble();
	}

	//Accessor method ("getter") for the private height variable
	public double getHeight(){
		return height;
	}

	//Accessor method ("getter") for the private height variable
	public double getWidth(){
		return width;
	}

	//this already working fine
	//  Calculate the wall's area, using the wall's height and width instance variables
	public double calculateArea(){
		return height*width;
	}

	//  Calculate the amount of paint in gallons needed to paint the wall
	//here modify method to take area parameter
	//and return the gallons
	public double getNumberOfPaintGallons(double wallArea){
		//locally area will not work
		return wallArea/SQUARE_FEET_PER_GALLON;

	}
}
