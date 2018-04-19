package cheggmarch;

public class Driver {

	public static void main(String[] args) {
		//created object of Ant
		Ant antObject = new Ant("Fire Ant",114,"Tropical");
		//created object of Shrimp
		Shrimp shrimpObject = new Shrimp("Pacific Pink Shrimp",118,"Mildy Buttery");
		//printing the statements
		System.out.println("Ant\n"
				+ "This ant is a "+antObject.getName()+" and its heart rate is "+antObject.getHeartRate());
		System.out.println("Shrimp\n"
				+ "This "+shrimpObject.getName()+" has a "+shrimpObject.getTaste()+
				". Its heart rate is "+shrimpObject.getHeartRate());
	}

}
