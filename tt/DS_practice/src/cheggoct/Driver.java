package cheggoct;

import java.util.Scanner;
/**
 * Driver class for running player
 * @author yourname
 *
 */
public class Driver {
/**
 * main method
 * @param args
 */
	public static void main(String[] args) {

		String fn,ln;
		int num,user_choice;
		Player players[] = new Player[11];
		int index=0;

		System.out.println("Welcome to Roster Editor!");
		Scanner sc = new Scanner(System.in);

		while(true)//running in loop
		{
			System.out.print("1) Add New Player\n2) View Player(s)\n3) Exit Program\n\n");
			System.out.print("Plese enter your selection : ");
			user_choice = sc.nextInt();
			//on selection choice
			if(user_choice==1)
			{
				if(index>=11)//if roaster fulls printing 
				{			//the roaster info and exiting the program
					System.out.println("Roaster full!");
					for(int i=0;i<index;i++)
					{
						System.out.println(players[i]);
					}
					System.out.println("*****************************\n\n");
					System.out.println("\nThanks for using our program - Goodbye!\n");
					break;

				}
				else{
					//creating new player and adding to array
					Player temp = new Player();
					System.out.print("Please enter a first name : ");
					fn=sc.next();
					System.out.print("Please enter a last name : ");
					ln=sc.next();
					System.out.print("Please enter number (1-99) : ");
					num=sc.nextInt();
					temp.setFirstName(fn);//setting playesrs property
					temp.setLastName(ln);
					temp.setNumber(num);
					players[index]=temp;
					System.out.print("**Player Created**\n\n");
					index++;
				}
			}
			else if (user_choice==2)
			{
				System.out.println("\n**IUPUI Football Roaster**");
				for(int i=0;i<index;i++)
				{
					System.out.println(players[i]);
				}
				System.out.println("*****************************\n\n");
			}
			else if(user_choice==3)
			{
				System.out.println("\nThanks for using our program - Goodbye!\n");
				break;
			}
			else{
				System.out.println("Invalid choice! Please select option #1, #2, or #3.\n");
			}
		}
		sc.close();
	}

}

