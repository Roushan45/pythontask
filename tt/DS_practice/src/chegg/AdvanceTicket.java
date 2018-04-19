package chegg;

public class AdvanceTicket extends Ticket {
	
	private double discountRate;
	private static int i=1;
	private int count =i;

	public AdvanceTicket(String event, double facePrice, double discountRate) {
		super(event, facePrice);
		this.discountRate = discountRate;
		i++;
		
	}
	
	public int getNoOfAdvanceTicket(){
		return count;
	}
	public double getAdvanceTicketPrice(){
		return getFacePrice()-((discountRate*getFacePrice())/100);
	}
	public double getDicoutRate(){
		return discountRate;
	}
	

}
