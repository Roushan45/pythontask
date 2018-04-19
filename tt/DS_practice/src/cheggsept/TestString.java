package cheggsept;

public class TestString {

	public static void main(String[] args) {
		
		String s = "Apple";
		System.out.println("String : "+s);
		/*in java string is combination of chars and we can access it using index and Sting class
		 * have a method charAt which gives the char at given index so 
		 * getting the first char index will be zero
		 */ 
		System.out.println("\nFirst letter of String "+s+" : "+s.charAt(0));
		/*
		 * in String there is length method which return the length of string
		 * so length -1 will return the last char of string as string is 0 array indexed based
		 * 
		 */
		System.out.println("Last char of String "+s+" : "+s.charAt(s.length()-1));
		/*
		 * String is immutable Data type , means that once you created not able to modify
		 * so here i am using another string for deleting the first char of string 
		 * can use substring method in method i have passed 1 and length of string so first char will ignored
		 */
		String del_first_char = s.substring(1,s.length());
		System.out.println("String after deleting first char : "+del_first_char);
		/*
		 * String is immutable Data type , means that once you created not able to modify
		 * so here i am using another string for deleting the last char of string 
		 * can use substring method 
		 */
		String del_last_char = s.substring(0, s.length()-1);
		System.out.println("String after deleting last char : "+del_last_char);
	}
}
