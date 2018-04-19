package chegg;
//Grocery Item class 

public class GroceryItemOrder {
	//Private fields
	private String name;
	private int quantity;
	private double pricePerUnit;
	//public parameterized constructor
	public GroceryItemOrder(String name,int quantity,double pricePerUnit){
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	//method that will return cost 
	public double getCost(){
		return quantity*pricePerUnit;
	}
	//method for set quantity
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	//Return readable format of String
	public String toString(){
		return ""+this.name+"\t\t  "+this.quantity+"\t\t  "+this.pricePerUnit;	}
	
}
