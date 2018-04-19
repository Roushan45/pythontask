	package cheggmarch;
	
	import java.util.Scanner;
	
	public class Quiz {
	
		public static void main(String[] args) {
			String mcq_1 = "what is correct about String class\n"+
								"\t1) it is muttable\n"
								+ "\t2) it is non-muttable";
			String mcq_2 = "what is correct about interface\n"+
					"\t1) can create object\n"
					+ "\t2) cannot create object";
			int noOfCorectAns=0;
			int choice =0;
			System.out.println("Quiz _1 : Please input your name :");
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			System.out.println("Welcome "+name
								+"\nPlease enter the number of correct option");
			System.out.println("Q1 "+mcq_1);
			choice = scan.nextInt();
			if(choice==2){
				System.out.println("Thats Correct");
				noOfCorectAns++;
			}
			else{
				System.out.println("sorry its Incorrect,\nString is final class in java we cannot modify its one it created");
			}
			System.out.println("Q2 "+mcq_2);
			choice  = scan.nextInt();
			if(choice==2){
				System.out.println("Thats correct");
				noOfCorectAns++;
			}
			else{
				System.out.println("sorry its Incorrect, \nIn java we cannot craete object of interface");
			}
			System.out.println("Overall you got " +noOfCorectAns +" out of 2 correct."
					+ "\nThanks for playing.");
	
			scan.close();
		}
	
	}
