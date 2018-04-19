package chegg;

public class Bread {
	
	
	
	private float item_price;
	private int quantity;
	
	//Default constructor
	
	public Bread(){
			
		}
		//Parameterized constructor
	public Bread(float item_price,int quantity){
			this.item_price= item_price;
			this.quantity = quantity;
			
		}
	public float getItem_price() {
		return item_price;
	}
	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float total_price(){
		return item_price*quantity;
	}
	@Override
	public java.lang.String toString() {
		return "Milk [item_price=" + item_price + ", quantity=" + quantity + "]";
	}
	

}
