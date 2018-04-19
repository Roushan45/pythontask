package cheggoct;

/**
 * Drink class for type size and price
 * @author yourName
 *
 */
public class Drink {

	//required varibles
	private String type;
	private String size;
	private double price;
	//default and param constructor
	public Drink(){};
	public Drink(String type, String size, double price) {
		super();
		this.type = type;
		this.size = size;
		this.price = price;
	}
	//setters and getters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	//to String method presenting object in readable format
	public String toString()
	{
		return "Drink Type : "+type+"\nSize : "+size+"\nPrice $: "+price;
	}
}
