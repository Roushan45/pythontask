package cheggoct;
import java.util.Scanner; 
/** To change this license header, choose License Headers in Project Properties. 
 *  To change this template file, choose Tools | Templates * and open the template in the editor. 
 * @author Matt 
 */ 
public class GeometryDriver { 
	public static void main(String[] args) { 
		//displaying the menu to user
		System.out.println("Welcome to the Geometry Calculator!\n" + 
				"In this program we will use a menu to decide what kind of shape we will create.\n" +
				"\n1. Create and Calculate Perimeter of a Circle" + 
				"\n2. Create and Calculate Perimeter of a Rectangle" + "\n3. Create and Calculate Perimeter of a Triangle");
		GeometricShape aShape = new GeometricShape(-1, -1); 
		//for storing the user choice
		int option;
		Scanner scanner = new Scanner(System.in);
		//scanning user choice
		option=scanner.nextInt();//declared the required local variables
		double side1,side2,side3,radius,length,width;
		switch (option) 
		{ 

		case 1: System.out.print("Enter radius: "); 
		radius = scanner.nextDouble(); 
		//creating the shape of circle
		aShape  = new GeometricShape(radius);
		break; 
		case 2: System.out.print("Enter length : "); 
		length = scanner.nextDouble();
		System.out.print("Enter width : "); 
		width = scanner.nextDouble();
		//creating the shape of rectangle
		aShape  = new GeometricShape(length,width);
		break; 
		case 3: System.out.print("Enter side1 : "); 
		side1 = scanner.nextDouble();
		System.out.print("Enter side2 : "); 
		side2 = scanner.nextDouble();
		System.out.print("Enter side3 : "); 
		side3 = scanner.nextDouble();
		//creating the shape of triangle
		aShape=new GeometricShape(side1,side2,side3);
		break;
		default:System.out.println("Not Valid option!");break;
		}
		//printing the shape info and perimeter
		System.out.printf(aShape+" \nPerimeter  = %.2f",aShape.getPerimeter());
	}
}
