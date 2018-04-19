package cheggoct;
/**
 * VehicleType is subclass of VehicleFuel
 * @author your name
 *
 */
public class VehicleType extends VehicleFuel{
	//instance variable for vehicleType
	private String veh_type;
	//parameterized constructor 
	public VehicleType(String manufacturer, int manufacturer_year, String fule_type, String veh_type) {
		super(manufacturer, manufacturer_year, fule_type);/*using super keyword calling the 
		    super class constructor that is VehicleFuel*/
		this.veh_type = veh_type;
	}

	//to string method
	public String toString(){
		//user super first calling the toString of super class
		return super.toString()+"Vehicle type : "+veh_type+"\n";
	}

}
