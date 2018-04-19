package cheggjune;

import java.util.NoSuchElementException;
/***
 * Fitness tracker class
 *
 */
public class Fitness {
	//name is type of 2d array
	//with 3 columns
	private String name[][]=new String[1][3];
	//other required instance variables
	private double hieght;
	private double weight;
	private int age;
	//constructor of Fitness class
	public Fitness(String fname,String mname,String lname,double hieght
			,double weight, int age){
		//initializing the instance variables
		name[0][0]=fname;
		name[0][1]=mname;
		name[0][2]=lname;
		this.hieght=hieght;
		this.weight=weight;
		this.age=age;
		
	}

	/***
	 * method will find first name
	 * @param fname
	 * @return true if firstname found else false
	 */
	public boolean firstNameIs(String fname){
		if(name[0]==null){
			throw new NoSuchElementException("No any name stored");
		}
		//first name will always store in 1st column of 2d array
		return fname.equals(name[0][0]);
	}
	/***
	 * method will calculate bmi
	 * @return double type value of bmi
	 */
	public double bmi(){
		return weight/(this.hieght*this.hieght);
	}
	/***
	 * method will check for normal bmi
	 * @return
	 */
	public boolean bmiNormal(){
		return (bmi()>18.5 && bmi()<25);
	}
	//main method for compiling and running above program
	public static void main(String[] args) {
		//created two firness object
		Fitness p1 = new Fitness("John", "michelle","smith", 1.9, 90, 23);
		Fitness p2 = new Fitness("McGallen", "Gujalkr","Roy", 1.79, 96, 35);
		
		System.out.println("Fitness tracker \n\n");
		//checking the implemented methods.
		System.out.println("First name of P1 is John : "+p1.firstNameIs("John"));
		System.out.println("BMI of p1 : "+p1.bmi());
		System.out.println("Is Normal BMI of p1 : "+p1.bmiNormal());
		System.out.println("\n\n");
		System.out.println("First name of P2 is Mcgreth : "+p2.firstNameIs("Mcgreth"));
		System.out.println("BMI of p2 : "+p2.bmi());
		System.out.println("Is Normal BMI of p2 : "+p2.bmiNormal());
	}//end of main method
}//end of class
