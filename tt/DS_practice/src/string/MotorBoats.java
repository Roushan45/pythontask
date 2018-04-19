package string;

public class MotorBoats {

	//ClassVariable
	private String name;
	private double fuel_capacity;
	private double current_fuel_amount;
	private double max_Speed;
	private double current_speed;
	private double fuel_consumption_rate;
	private double travelled_dist;
	
	/**
	 * Constructor for initializing variables
	 * @param name
	 * @param fuel_capacity
	 * @param current_fuel_amount
	 * @param max_Speed
	 * @param fuel_consumption_rate
	 */
	public MotorBoats(String name, double fuel_capacity, double current_fuel_amount, double max_Speed,
			double fuel_consumption_rate) {
		this.name = name;
		this.fuel_capacity = fuel_capacity;
		this.current_fuel_amount = current_fuel_amount;
		this.max_Speed = max_Speed;
		this.fuel_consumption_rate = fuel_consumption_rate;
		this.current_speed=0;
	}
	
	//setters and getters for instance variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFuel_capacity() {
		return fuel_capacity;
	}
	public void setFuel_capacity(double fuel_capacity) {
		this.fuel_capacity = fuel_capacity;
	}
	public double getCurrent_fuel_amount() {
		return current_fuel_amount;
	}
	public void setCurrent_fuel_amount(double current_fuel_amount) {
		this.current_fuel_amount = current_fuel_amount;
	}
	public double getMax_Speed() {
		return max_Speed;
	}
	public void setMax_Speed(double max_Speed) {
		this.max_Speed = max_Speed;
	}
	public double getCurrent_speed() {
		return current_speed;
	}
	public void setCurrent_speed(double current_speed) {
		this.current_speed = current_speed;
	}
	public double getFuel_consumption_rate() {
		return fuel_consumption_rate;
	}
	public void setFuel_consumption_rate(double fuel_consumption_rate) {
		this.fuel_consumption_rate = fuel_consumption_rate;
	}
	public double getTravelled_dist() {
		return travelled_dist;
	}
	public void setTravelled_dist(double travelled_dist) {
		this.travelled_dist = travelled_dist;
	}
	
	/**
	 * This method will the speed of boat
	 * @param s
	 */
	
	public void changeSpeed(double s) {
		//if current speed and new speed sum greater than
		//max speed then
		if((this.current_speed+s)>this.max_Speed){
			//changing the current speed to max
			this.current_speed=this.max_Speed;
		}
		else {
			this.current_speed=this.current_speed+s;
		}
	}
	
	/**
	 * Method to cruise the boat
	 * @param time
	 */
	
	public void cruise(double time) {
		//calculating the distance traveled
		travelled_dist=current_speed* (time/60);
		//changing the current fuel 
		current_fuel_amount-=(fuel_consumption_rate*travelled_dist);
	}
	
	//method for adding the fuel to boat tank
	public void increaseFuel(double litres) {
		if(this.current_fuel_amount+litres>this.fuel_capacity) {
			this.current_fuel_amount=this.fuel_capacity;
		}
		else {
			this.current_fuel_amount+=litres;
		}
	}
	//method to check faster boat
	public boolean fasterBoat(MotorBoats another) {
		return this.getMax_Speed()>another.getMax_Speed();
	}
	//method to check equality of two boats on given 
	//conditions
	
	public boolean equals(MotorBoats another) {
		return (this.max_Speed==another.max_Speed && this.fuel_capacity==another.getFuel_capacity()
				&& this.fuel_consumption_rate==another.getFuel_consumption_rate());
	}
	
	/**
	 * To String method for textual representation of object
	 */
	public String toString() {
		return "Name: "+this.name+"\nCurrent Speed: "+this.current_speed+" kmph\nDistance Driven: "
				+ this.travelled_dist+" km\nFuel in Tank: "+this.current_fuel_amount+" litres\n";
	}
	
}

