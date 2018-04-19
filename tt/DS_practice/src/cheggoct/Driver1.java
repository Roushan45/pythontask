package cheggoct;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Driver1 {
public static void main(String[] args) throws IOException {
	

	Player players[] = new Player[11];
	int cur_no=0;
	String fname,lname;
	int no,user_choice;
	System.out.println("Welcome to our CSCI 240 Roster Editor!\n");
	System.out.println("Reading the players information from file.....\n");
	
	Scanner fileScanner  = new Scanner(new File("Players.txt"));
	while(fileScanner.hasNextLine())
	{
		String temp[] = fileScanner.nextLine().trim().split(" ");
		//Player temp_p = new Player(temp[0],temp[1], Integer.valueOf(temp[2]));
	//	players[cur_no]=temp_p;
		cur_no++;
		
	}
	
	System.out.println(cur_no +" Players info loaded \n");
	
	
	Scanner sc = new Scanner(System.in);
	
	
	while(true)
	{
		System.out.print("1) Add New Player\n2) View Player(s)\n3) Exit Program\n\n");
		System.out.print("Plese enter your selection : ");
		user_choice = sc.nextInt();
		//based on choice performing operations
		if(user_choice==1)
		{
			if(cur_no>=11)
			{
				System.out.println("Payer add Quota full!\n");
			}
			else{
			
			System.out.println();
			System.out.print("Please enter a first name : ");
			fname=sc.next();
			System.out.print("Please enter a last name : ");
			lname=sc.next();
			System.out.print("Please enter number (1-99) : ");
			no=sc.nextInt();
			//creating dynamic memory for object
			//players[count]=new player();
			Player temp = new Player();
			temp.setFirstName(fname);
			temp.setLastName(lname);
			temp.setNumber(no);
			players[cur_no]=temp;
			System.out.print("\n**Player Created**\n\n");
			cur_no++;
		}
		}
		else if (user_choice==2)
		{
			System.out.println("\n**IUPUI Football Roaster**");
			for(int i=0;i<cur_no;i++)
			{
				System.out.println(players[i]);
			}
			System.out.println("*****************************\n\n");
		}
		else if(user_choice==3)
		{
			Files.write(Paths.get("Players.txt"), "".getBytes());
			//FileWriter fw= new FileWriter(new File("Players1.txt"));
			for(int i=0;i<cur_no;i++)
			{
				String temp = players[i].getFirstName()+" "+players[i].getLastName()+" "+players[i].getNumber()+" \n";
				Files.write(Paths.get("Players.txt"), temp.getBytes(),StandardOpenOption.APPEND);
				//Files.write(Paths.get("Players.txt"),"\n".getBytes(), StandardOpenOption.APPEND);
			}
			System.out.println("Players info saved to file ...\n");
			System.out.println("\nThanks for using our program - Goodbye!\n");
			System.exit(0);
		}
		else{
			System.out.println("Invalid choice! Please select option #1, #2, or #3.\n");
		}
		fileScanner.close();
		sc.close();
	}
	
	
	}
}
