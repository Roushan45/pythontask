package cheggmarch;

import java.util.List;

//this is Driver class for testing functionality
public class TestDivStr {
	//main method
	public static void main(String[] args) {
		//created 1st object  
		DivStr object1 = new DivStr("Fox Life");
		//calling the divide method on 1st object
		//and printing the value to console
		//if you need value in LIST then you can also do this as below
		//List<Character> charList=obj.divide();
		System.out.println("\nlist of char of object1  "+object1.divide().toString());
		//Created 2nd object
		DivStr object2 = new DivStr("My Life My Rules");
		//here first getting the LIST value by calling divide()
		List<Character> charList1 = object2.divide();
		//then printing the list
		//using toString() for printing in readable format
		System.out.println("\nlist of char of object2  "+charList1.toString());
	}

}
