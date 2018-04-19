package chegg;

public class DayOfTicket extends Ticket {
	
	
	private static int i=1;
	private int count = i;
	
	public DayOfTicket(String event, double facePrice) {
		super(event, facePrice);
		i++;
	}
	
	public int getNoOfDayTicket(){
		return count;
	}

}
