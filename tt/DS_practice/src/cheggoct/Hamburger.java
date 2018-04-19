package cheggoct;

/**
 * Hamburger class
 * @author yourName
 *
 */
public class Hamburger {

	//declared  the required varibles
	private String size;
	private double price;
	private String toppings;
	//also have drink type object
	//so it will have order info including drink
	private Drink drink;
	//constructors
	public Hamburger(){};
	public Hamburger(String size, double price, String toppings, Drink drink) {
		super();
		this.size = size;
		this.price = price;
		this.toppings = toppings;
		this.drink = drink;
	}
	//setters and getters
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	//tostring method for printing the object
	public String toString()
	{
		return "Hamburger Size : "+size+"\nToppings : "+toppings+"\nPrice : $"+price+"\n"+drink;
				
	}
	
}
