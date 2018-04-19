package cheggjuly;

import java.util.Scanner;
/***
 * Bus reservation class extended the Thread class
 */
public class BuSReservation extends Thread {
	/***
	 * Run method used by thread 
	 */
	public void run()
	{
		//declared required varibles
		int noOfTickets;
		String []names;
		Scanner sc = new Scanner(System.in);
		//synchronized block
		synchronized(this){
			//asking for number of tickets
			System.out.print("Enter the No of tickets you want to book : ");
			noOfTickets = sc.nextInt();
			//initialize the name array
			//that will store the names of the passenger
			names=new String[noOfTickets];
			//running the loop for passenger name
			for(int i=0;i<noOfTickets;i++)
			{
				System.out.print("Name of "+(i+1)+" passenger : ");
				names[i]=sc.next();
			}
			//printing the report
			System.out.println(Thread.currentThread().getName() + " has booked "+noOfTickets+" Ticket(s).");
			for(int i=0;i<noOfTickets;i++)
			{
				System.out.println((i+1)+" Passenger : "+names[i]);
			}
		}
	}
//main method for executing the above program
	public static void main(String[] args) {
		System.out.println("\n***********Welcome to Online Bus reservation****************\n\n");
		//created the thread 
		BuSReservation thread  = new BuSReservation();
		//name the thread 
		thread.setName("Thread 1");
		//started the thread
		thread.start();
		
	}
}
