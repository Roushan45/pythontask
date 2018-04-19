package cheggoct;

import java.util.Random;
import java.util.Scanner;

public class Hi_Low_Guessing {

	public static void main(String[] args) {
		//scanner for scanning input
		Scanner sc = new Scanner(System.in);
		Random rand  = new Random();
		System.out.println("*************************************");
		System.out.println("\tWelcome to Number guessing Game!");
		System.out.println("*************************************");
		String anotherGame="";
		//using two while loops 
		
		do{
			//generating the random no
			int rand_no = rand.nextInt(100)+1;
			//using the varibale in do loop whenever new 
			//game start whole thing will get reset
			int guessNo =0;
			int noOfGuesses=0;
			//System.out.println(rand_no);
			System.out.println("Press -1 to exit the current game in between: \n");
		do{
			System.out.println("Enter the Guess no [1-100]: ");
			guessNo	= sc.nextInt();
			//comapring the guessed no with random number
			if(guessNo==rand_no){
				noOfGuesses++;
				System.out.println("You Won! ");
			System.out.println("No of guesses : "+noOfGuesses);
			noOfGuesses=0;
			break;
			
			}
			//if user enters -1 then printing the no of guess
			if(guessNo==-1)
			{
				System.out.println("No of guesses : "+noOfGuesses);
			}
			else if(guessNo<rand_no){
				System.out.println("Guess is Low!");
				noOfGuesses++;
			}
			else if(guessNo>rand_no){
				System.out.println("Guess is High!");
				noOfGuesses++;
				}
				
		}
		while(guessNo!=-1);
		//asking for another game 
		System.out.print("Do you want to play another game Y/N : ");
		anotherGame=sc.next();
		}
		while(anotherGame.toLowerCase().equals("y")||anotherGame.toLowerCase().equals("yes"));

	}

}
