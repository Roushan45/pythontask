package string;

public class MotorBoatsDemo {

	/**
	 * Main method for executing the program
	 * @param args
	 */
	public static void main(String[] args) {
		//created object of motorboat
		MotorBoats boat1=new MotorBoats("speedy", 100, 50, 100, 1);
		//tested the condition that given
		boat1.setCurrent_speed(25);
		boat1.cruise(30);
		System.out.println(boat1);
		boat1.changeSpeed(25);
		boat1.cruise(30);
		System.out.println(boat1);
		//created another object
		MotorBoats boat2=new MotorBoats("Flippy", 90, 45, 120, 0.75);
		//and tested the given condition
		boat2.changeSpeed(45);
		boat2.cruise(20);
		System.out.println(boat2);
		boat2.increaseFuel(50);
		boat2.changeSpeed(60);
		boat2.cruise(30);
		System.out.println(boat2);
		if(boat1.fasterBoat(boat2))
			System.out.println("Fastest Boat: "+boat1.getName());
		else
			System.out.println("Fastest Boat: "+boat2.getName());
		
		//testing equality of two boats
		if(boat1.equals(boat2)) {
			System.out.println(boat1.getName()+" and "+boat2.getName()+" are the same boat");
		}
		else {
			System.out.println(boat1.getName()+" and "+boat2.getName()+" are not the same boat");
		}
		
		//Test for increasing the speed greater than max speed
		System.out.println("\n\nCurrent speed of "+ boat2.getName()+ ": "+boat2.getCurrent_speed()+"\n"
				+ "Max Speed : "+boat2.getMax_Speed());
		System.out.println("Increasing by 70 .... ");
		boat2.changeSpeed(70);
		System.out.println("Current speed of "+ boat2.getName()+ ": "+boat2.getCurrent_speed());
		
		//Test for increasing the fuel greater than the fuel capacity
		System.out.println("\n\nCurrent Fule in tank in "+boat1.getName()+" : "+boat1.getCurrent_fuel_amount()+""
				+ "\nMax Fuel Capacity : "+boat1.getFuel_capacity());
		System.out.println("Refueling by another 100 litres....");
		boat1.increaseFuel(100);
		System.out.println("After refueling current fuel : "+boat1.getCurrent_fuel_amount());
		
		//test for decreasing the speed
		System.out.println("\n\nCurrent speed of "+boat1.getName()+" : "+boat1.getCurrent_speed());
		System.out.println("Decreasing the speed by 34 kmph");
		boat1.changeSpeed(-34);
		System.out.println("After changing Current speed of "+boat1.getName()+" : "+boat1.getCurrent_speed());
	}
}
