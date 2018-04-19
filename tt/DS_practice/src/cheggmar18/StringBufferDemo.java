package cheggmar18;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//read in a string consisting of 200+ characters
		System.out.println("Enter the string buffer of 200+ chars ");
		String readInput=sc.nextLine();
		StringBuffer sf = new StringBuffer(readInput);
		//1. Count the # of uppercase characters and print it.
		System.out.println("Number of uppercase letter -> "+sf.codePoints().filter(c-> c>='A' && c<='Z').count());
		//2. Read another string of 50 characters to append to current text and print the current text
		System.out.println();

		System.out.println("Enter the string to append");
		String temp=sc.nextLine();
		sf.append(" "+temp.substring(0, temp.length()-1));
		printStuff(sf);
		System.out.println();
		//3. Find the positions of all $s and print the positions
		System.out.println("Find the positions of all $s and print the positions");
		for(int i=0;i<sf.length();i++) {
			if(sf.charAt(i)=='$') {
				System.out.print(i+", ");
			}
		}
		System.out.println();
		//4 Replace the $s with #s and print the current text
		System.out.println("Replacing the $s with #s and print the current text");
		for(int i=0;i<sf.length();i++) {
			if(sf.charAt(i)=='$') {
				sf.setCharAt(i, '#');
			}
		}
		printStuff(sf);
		//5. Delete extra special characters-namely, & and @-and print the current text.
		System.out.println();
		System.out.println(" Deleting extra special characters");
		for(int i=0;i<sf.length();i++) {
			char c=sf.charAt(i);
			if(c=='@' || c=='&' || c=='-') {
				sf.deleteCharAt(i);
			}
		}
		printStuff(sf);
		/*
		 * 6. Change the first character of every word 
		 * (something delimited by whitespace) to Uppercase and print the current text. 
		 */
		System.out.println();
		System.out.println("Changing the first character of every word ");
		int i = 0;
		do {
			sf.replace(i, i + 1, sf.substring(i,i + 1).toUpperCase());
			i =  sf.indexOf(" ", i) + 1;
		} while (i > 0 && i < sf.length());
		printStuff(sf);
		//7. Change the entire contents of the 1st line to Uppercase and print the current text
		sf.replace(0, sf.indexOf("."),sf.substring(0,sf.indexOf(".")).toUpperCase());
		System.out.println();
		System.out.println("Changing the entire contents of the 1st line to Uppercase");
		printStuff(sf);
		//8. Insert my name at the end of the last line and print the current text
		System.out.println();
		System.out.println(" Insert my name at the end of the last line");
		sf.insert(sf.length()," Rakesh.");
		printStuff(sf);
		//9.  Insert a friend's name in the first line and print the current text
		System.out.println();
		System.out.println("Insert a friend's name in the first line and print the current text");
		sf.insert(0,"Rahul. ");
		printStuff(sf);
		//10 Using substring and compare, provide the result of which name is larger or smaller
		System.out.println();
		String s1=sf.substring(sf.indexOf("Rakesh"),sf.length()-1);
		String s2=sf.substring(0,sf.indexOf("."));

		int result=s1.compareTo(s2);
		if(result==0) {
			System.out.println("Both name are equal");
		}
		else if(result>0) {
			System.out.println("my name is larger");
		}
		else {
			System.out.println("my friend name is larger");
		}


	}
	//this method used to print stringbiffer
	public static void printStuff(final StringBuffer s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			//printing new line once find period
			if(s.charAt(i)=='.') {
				System.out.println();
			}
		}
		System.out.println();
	}

}
