package cheggoct;

/**
 * VehicleFule class is subclass of vehicle class
 * @author your Name
 *
 */
public class VehicleFuel extends Vehicle{
	//instance variable for this subclass
	//that store the type of fuel in vehicle
	private String fule_type;
	//constructor for initializing the instance variables
	public VehicleFuel(String manufacturer, int manufacturer_year, String fule_type) {
		super(manufacturer, manufacturer_year);/*using super keyword calling the 
		 									    super class constructor that is Vehicle*/
		this.fule_type = fule_type;
	}
	//to string method
	public String toString()
	{
		//user super first calling the toString of super class
		return super.toString()+"Fule Type : "+fule_type+"\n";
	}

}
