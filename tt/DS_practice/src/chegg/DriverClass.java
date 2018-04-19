package chegg;

public class DriverClass {
	public static void main(String[] args) {
		DayOfTicket day = new DayOfTicket("Play", 35);
		 AdvanceTicket adv = new AdvanceTicket("advancePaly", 345, 14);
		 BoxOffice bx = new BoxOffice(day, adv);
		bx.dayOfTicketDetails();
		bx.advanceTicketDetails();
	}
	public void test(){
		
	}

}
