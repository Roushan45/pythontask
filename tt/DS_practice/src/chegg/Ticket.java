package chegg;

public class Ticket {
	
	private String event;
	private double facePrice;
	
	public Ticket(String event, double facePrice) {
		this.event = event;
		this.facePrice = facePrice;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public double getFacePrice() {
		return facePrice;
	}
	public void setFacePrice(double facePrice) {
		this.facePrice = facePrice;
	}
	
	

}
