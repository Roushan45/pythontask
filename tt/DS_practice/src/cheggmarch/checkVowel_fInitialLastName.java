package cheggmarch;

import java.util.Scanner;

public class checkVowel_fInitialLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking input from user
		Scanner  scan = new Scanner(System.in);
		System.out.println("Please enter the line");
		//stored input to line
		String line=scan.nextLine();
		//declaring and initialized int variable that count the no of
		//vowels in sentence
		int vowelCount =0;
		//looping the all char of string
		for(int i=0;i<line.length();i++){
			char c = line.charAt(i);
			//switch statement for matching the vowels and increasing the count
			switch(c){
			case 'a' :vowelCount++;break;
			case 'e' :vowelCount++;break;
			case 'i' :vowelCount++;break;
			case 'o' :vowelCount++;break;
			case 'u' :vowelCount++;break;
			}
		}
		//Printing the length of line and no of vowels in it
		System.out.println("Lenght of the Line  "+line.length());
		System.out.println("The total number of all vowels. "+vowelCount);
	}

}
