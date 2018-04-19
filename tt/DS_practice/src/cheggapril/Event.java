package cheggapril;

public class Event {
	//Integer for event types
	private int eventType;
	//final String array of even type
	private final String typesOfEvent[]={"wedding","baptism","birthday"
			                      , "corporate","others"};
	//getter for event type
	public int getEventType() {
		return eventType;
	}
	//setter for event type
	public void setEventType(int eventType) {
		//if eventType value greater than
		//size of array then setting to last 
		//event name that is other
		if(eventType>typesOfEvent.length){
			eventType=typesOfEvent.length;
		}
		this.eventType = eventType;
	}
	//getting the event name on basis of 
	//event type value
	public String getEventName(int i){
		return typesOfEvent[i];
	}
	

}
