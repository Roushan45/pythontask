package cheggAugust;

public class AirCraftNode {

	public AirCraftNode next;
	 public AirCraftNode prev;
	 String name;
	 int id;
	 int altitude;
	 int speed;
	public AirCraftNode(String name, int id, int altitude, int speed) {
		this.name = name;
		this.id = id;
		this.altitude = altitude;
		this.speed = speed;
		this.prev=null;
		this.next=null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

	

	

}
