package cheggsept;
/**
 * Invoice class
 * @author 
 *
 */
public class Invoice {
	//Data members of Invoice class
	private String partNumber;
	private String partDesc;
	private int quantity;
	private int price;
	//constructor of invoice class thats initializes
	//the all data members
	public Invoice(String partNumber, String partDesc, int quantity, int price) {
		this.partNumber = partNumber;
		this.partDesc = partDesc;
		//if quantity values is negative then 
		//setting to 0
		if(quantity<0)
			this.quantity=0;
		else
			this.quantity = quantity;
		//if price values is negative then 
		//setting to 0
		if(price<0)
			this.price=0;
		else
			this.price = price;
	}
	/*
	 * getters and setters for all data
	 * members
	 */
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0)
			this.quantity=0;
		else
			this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0)
			this.price=0;
		else
			this.price = price;
	}
	/**
	 * This method will return the invoice amount
	 * @return
	 */
	public int getInvoiceAmount()
	{
		return this.price*this.quantity;
	}
	
	
}
