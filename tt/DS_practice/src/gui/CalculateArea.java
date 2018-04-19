package gui;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CalculateArea  {
	
	//getArea method that will calculate area of square
	public static double getArea(double side){
		return side*side;
	}
	//getPerimeter method that will calculate perimeter of square
	public static double getParameter(double side){
		return side*4;
	}
	public static void main(String[] args) {
		//taking the input //side of square
		String input =JOptionPane.showInputDialog("Enter  the side of square");
		//parsing the input to double
		Double side = Double.valueOf(input);
		//calculating area of square by calling getArea method
		double area=getArea(side);
		//calculating perimeter of square by calling getPerimeter method
		double perimeter=getParameter(side);
		//created new JtextArea that will hold area and perimeter
		JTextArea text = new JTextArea(2,10);
		String output = "Area of square = "+area+" sq unit"+"\n\nperimeter of square = "+perimeter+"  unit";
		//added output to jtext area
		text.setText(output);
		//showing req calculation to joptionpane
		JOptionPane.showMessageDialog(null, text);

}
}
