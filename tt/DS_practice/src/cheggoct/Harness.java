package cheggoct;

public class Harness {

	public static void main(String[] args) {
		//using three class created object
		Vehicle vehicle = new Vehicle("Honda", 2017);
		VehicleFuel vehicleFuel = new VehicleFuel("Honda", 2017, "Petrol");
		VehicleType vehicleType = new VehicleType("Honda", 2017, "Petrol", "TwoWheeler");
		
		System.out.println(vehicle);
		System.out.println(vehicleFuel);
		System.out.println(vehicleType);

	}

}
