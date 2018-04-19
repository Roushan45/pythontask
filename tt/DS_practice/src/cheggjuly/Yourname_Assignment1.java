package cheggjuly;

import java.util.Scanner;
/*Change the name of class as per your name*/
public class Yourname_Assignment1 {

public static void main(String[] args) {
		//object  created for pet
		Pet object = new Pet();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			//asking for inpur fot each fileds
			System.out.print("Enter the pet Name : ");
			object.setName(sc.next());
			System.out.print("Enter the pet type : ");
			object.setType(sc.next());
			System.out.print("Enter the pet Age : ");
			object.setAge(sc.nextInt());
			System.out.print("Enter the pet height : ");
			object.setHeight(sc.nextFloat());
			System.out.print("Enter the pet weight : ");
			object.setWeight(sc.nextFloat());
			System.out.print("Enter the pet no of leg : ");
			object.setLegs(sc.nextInt());
			
			//after entering the details 
			//asking user for confirming the details
			System.out.println("\nThe details you entered \n");
			System.out.println("Pet Name : "+object.getName());
			System.out.println("Pet Type : "+object.getType());
			System.out.println("Pet Age : "+object.getAge());
			System.out.println("Pet Height : "+object.getHeight());
			System.out.println("Pet Weight : "+object.getWeight());
			System.out.println("Pet no of legs : "+object.getLegs());
			System.out.print("\nConfirm the details (y/n): ");
			String confrm = sc.next();
			//if user enters y then printing the story
			if(confrm.toLowerCase().charAt(0)=='y')
			{
				object.printStory();
				sc.close();
				break;
			}
			//if users enters n then again asking the inputs
			else{
				System.out.println("Please, Enter the corrext details!");
			}
		}
	}
}
