package cheggapril;
import java.util.*;
public class Driver {
 public static void main(String[] args) {
  Scanner src = new Scanner(System.in);
  int maxc = 0;
  System.out.println("Enter the Maximum capacity of your set: ");
  maxc = src.nextInt();
  Set set = new Set(maxc);
  do {
   System.out.println("Enter a positive integer to add to your set: ");
   Integer elem = src.nextInt();
   //here one try is sufficient to catch both 
   //exception simply added a catch block
   //for handle negative exception
   //whenever the excption thrown it will 
   //appropriete exception block and throw 
   //accorindgly message
   try {
    set.add(elem);
   } 
   catch(NegativeIntegerException e){
	   System.out.println(e.getMessage());
   }
   catch (FullSetException e) {
    System.out.println(e.getMessage());
    break;// at this point the array is full and we should break to
      // stop asking the user to enter new elements
   }
  } while (true);
  do {
   System.out.print("Enter a positive integer to search in your set: ");
   Integer elem = src.nextInt();
   //try catch block if user input negative integer
   //it will get message by calling e.getmesssage();
   boolean result = false;
   try{
	   result = set.contains(elem);
   }
   catch(NegativeIntegerException e){
	   System.out.println(e.getMessage());
   }
   
   if (result)
	   System.out.println(elem + " found in the set.");
   else
    System.out.println(elem + " not found in the set.");
   break;
  } while (true);
  do {
   System.out.print("Enter a positive integer to remove from your set: ");
   Integer elem = src.nextInt();
   
   boolean result = false;
   try{
	   result = set.remove(elem);
   }
   catch(NegativeIntegerException e){
	   System.out.println(e.getMessage());
   }
   if (result)
    System.out.println(elem + " removed from the set.");
   else
    System.out.println(elem + " not found in set ");
   break;
  } while (true);
  src.close();
 }
}