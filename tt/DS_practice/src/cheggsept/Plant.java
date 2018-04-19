package cheggsept;
/***
 * abstract plant class
 * @author 
 *
 */
public abstract class Plant {
	//declared required varibales
	static String ENERGY_SOURCE = "carbon dioxide";
	static int plants;
	String color;
	//constructor no-args
	public Plant()
	{
		this.color="none";
		plants++;
	}
	//Constructor with args
	public Plant(String color)
	{
		this.color=color;
		plants++;
	}
	public static int numberOfPlants()
	{
		return plants;
	}
	
	public int getPlants() {
		return plants;
	}
	//getters and setters
	public void setPlants(int plants) {
		Plant.plants = plants;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getENERGY_SOURCE() {
		return ENERGY_SOURCE;
	}
	//abstarct getWatering mathod
	 abstract public int getWatering();
	 //toString method
	@Override
	public String toString() {
		return "color  " + color ;
	}
	
}
