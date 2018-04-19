package chegg;

import java.util.ArrayList;
import java.util.Scanner;
 

//Your class ArrayToArrayList
public class ArrayToArrayList {
	//declaring instance variable
	private ArrayList list;
	private String cities[];
	private int indexC, indexE;     // integer to hold index value
    private int i;                  // variable for for loop
    Scanner kb;
    //in junit it is always good practice to initialize the variable
    //before testing in your case initializing the ArrayList, cities 
    //Scanner object for future you can write here jdbc get connection
    //code that will help to get jdbc conn beore executing test
	//@Before
	public void b4Test(){
		 cities = new String[]{"Montreal", "Saskatoon", "New York", "Toronto",
                 "Sudbury", "London", "Paris", "Delhi",
                 "Vancouver", "Winnipeg"};
		  list = new ArrayList();
		  kb=new Scanner(System.in);
		System.out.println("beore test");
	}
	//this is the first test method 
	//you can write multiple test cases
	//@Test
	public void test(){
		//System.out.println("in test method");
		// storing array into an arraylist
        for (i = 0; i < cities.length; i++) {
            list.add(cities[i]);
        }
    
        System.out.println("Current list of cities:");
        System.out.println(list);
        System.out.print("\nEnter index number of city to replace with Calgary: ");
        indexC = kb.nextInt();
    
        list.set(indexC, "Calgary");
    
        System.out.println("\nCurrent list with replaced city with Calgary:");
        System.out.println(list);
    
        System.out.print("\nNow, what index number do you want to add Edmonton in? ");
        indexE = kb.nextInt();
    
        list.add(indexE, "Edmonton");
    
        System.out.println("\nCurrent list with added city Edmonton:");
        System.out.println(list);
       
      }
	//here another test cases for using assert statement
//	@Test
//	public void testAssert(){
//		//using asserttrue checking the size of Arraylist and Arraysize
//		//it should get failed because we added one more entry to
//		//Arraylist "list.add(indexE, "Edmonton");"
//		Assert.assertTrue(cities.length==list.size());
//		
//	}

}
