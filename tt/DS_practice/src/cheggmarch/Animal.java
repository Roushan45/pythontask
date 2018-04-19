package cheggmarch;

public class Animal {
	//private instance variable
	private String name;
	private int heartRate;
	//default constructor
	public Animal(){	
	}
	//constructor with arguments
	public Animal(String name, int heartRate) {
		this.name = name;
		this.heartRate = heartRate;
	}
	//non abstract methods, getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	
	

}
