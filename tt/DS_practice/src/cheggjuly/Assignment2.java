package cheggjuly;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
public class Assignment2{
	//list that will contain flower upto 25
	List<Flower> FlowerList= new ArrayList<Flower>(25); //this is an arraylist for Flower
	public static void main(String[] args){
		new Assignment2();
	}
	// This will act as our program switchboard
	public Assignment2(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to my flower pack interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");
		while (true){
			// Give the user a list of their options
			System.out.println("1: Add an item to the pack.");
			System.out.println("2: Remove an item from the pack.");
			System.out.println("3: Search for a flower.");
			System.out.println("4: Display the flowers in the pack.");
			System.out.println("0: Exit the flower pack interfact.");

			// Get the user input
			int userChoice = input.nextInt();
			switch (userChoice){
			case 1: addFlower();
			break;
			case 2: removeFlower();
			break;
			case 3: searchFlowers();
			break;
			case 4: displayFlowers();
			break;
			case 0: System.out .println("Thank you for using the flower pack interface. See you again soon!");
					System.exit(0);
			}
		}
	}
	
	// add method 
	//removed the argument as it is not required 
	private void addFlower(){
		Flower objflower = new Flower();
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide Flower name…");
		String name = scan.nextLine();
		System.out.println("Provide Flower color…");
		String fcolor = scan.nextLine();
		System.out.println("Provide Flower presence of thorns…");
		String pot = scan.nextLine();
		System.out.println("Provide Flower smell…");
		String fsmell = scan.nextLine();
		objflower.setName(name);
		objflower.setcolor(fcolor);
		objflower.setthorns(pot);
		objflower.setsmell(fsmell);
		FlowerList.add(objflower);
		System.out.println("New flower has been added…");
	}

	private void removeFlower(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide Flower name…");
		String name = scan.nextLine();
		for(int i=0;i<FlowerList.size();i++){
			if(FlowerList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
				FlowerList.remove(i);
				System.out.println("one flower  named "+name+" removed");
				break;
			}
				
			
		}
	}
	private void searchFlowers(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide Flower name…");
		boolean found=false;
		String name = scan.nextLine();
		for(int i=0;i<FlowerList.size();i++){
			if(FlowerList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
				System.out.println("Your flower exists in the list…");
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("Your flower is not in the list");
	}
	private void displayFlowers(){
		//Display flower name along with a count .. For example it should say Roses - 7 Daffodils - 3 Violets - 5 */ }
		//copying the flower name to temp array list
		ArrayList<String> temp = new ArrayList();
		for(Flower f : FlowerList){
			temp.add(f.getName());
		}
		//added list to hashset
		HashSet<String> hs = new HashSet<>(temp);
		//using frequency counting the name
		for(String s : hs){
			System.out.println(s+" - "+Collections.frequency(temp, s));
		}
		
	}
}