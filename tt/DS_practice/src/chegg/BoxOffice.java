package chegg;

public class BoxOffice {
	
	
	private DayOfTicket dayOfTicket;
	private AdvanceTicket advanceTicket;
	
	public BoxOffice(DayOfTicket day, AdvanceTicket advance){
		this.dayOfTicket = day;
		this.advanceTicket = advance;
		
	}
	
	public void dayOfTicketDetails(){
		double total = dayOfTicket.getFacePrice()*dayOfTicket.getNoOfDayTicket(); 
		System.out.println("calculating DayOfTicketDetails");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("No of Ticket \t Price Rate \t Total Price");
		System.out.println(dayOfTicket.getNoOfDayTicket()+" \t\t "+dayOfTicket.getFacePrice()+" \t\t "+total);
	}
	
	public void advanceTicketDetails(){
		System.out.println("===============================================================================");
		System.out.println("\ncalculating AdvanceTicketDetails..");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("No of Ticket \t Price Rate \t  discoutRate \t Total Price ");
		System.out.println(advanceTicket.getNoOfAdvanceTicket()+" \t\t "+advanceTicket.getFacePrice()+" \t\t "+advanceTicket.getDicoutRate()
		+" \t\t "+advanceTicket.getAdvanceTicketPrice());
		
	}
	/**/

}
