package cheggapril;

import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
		// Array of Event to store 3 events
		Event eventArray[]= new Event[3];
		Scanner scan = new Scanner(System.in);
		//reading the data and storing to array
		for(int i=0;i<3;i++){
			Event newEvent = new Event();
			System.out.print("Enter the event type  ");
			int type = scan.nextInt();
			newEvent.setEventType(type);
			eventArray[i]=newEvent;
			System.out.println("Event type  saved to event array");
		}
		//printing the data after reading from eventArray
		System.out.println("----printing the object from Event object--------");
		for(Event event : eventArray){
			
			System.out.print("event type = "+event.getEventType()+
					" Event Name = "+event.getEventName(event.getEventType()-1));
			System.out.println();
			
		}
		scan.close();
		//System.out.print("event type = "+event.getEventType()+
		//" Event Name = "+event.getStringEventType(i));

	}

}
