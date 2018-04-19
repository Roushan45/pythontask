package cheggoct;

/**
 * Super class Vehicle
 * @author your Name
 *
 */
public class Vehicle {
	/*two instance variables for holding the name of manufacturer
	 * and year of manufactures this is general info that 
	 * all vehicle must have*/
	private String manufacturer;
	private int manufacturer_year;
	//Constructor with param that initializes the instance variables
	public Vehicle(String manufacturer, int manufacturer_year) {
		this.manufacturer = manufacturer;
		this.manufacturer_year = manufacturer_year;
	}
	//to string method for vehicle class
	public String toString()
	{
		
		return "Vehicle Manufacturer : "+manufacturer+"\nManufacture Year : "+manufacturer_year+"\n";
	}

}
