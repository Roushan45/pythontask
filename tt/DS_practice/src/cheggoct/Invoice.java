package cheggoct;

import java.util.ArrayList;

/**
   Describes an invoice for a set of purchased products.
 */
public class Invoice
{
	private Address billingAddress;
	private ArrayList<LineItem> items;
	/**
Constructs an invoice.
@param anAddress the billing address
	 */
	public Invoice(Address anAddress)
	{
		items = new ArrayList<LineItem>();
		billingAddress = anAddress;
	}

	/**
Adds a charge for a product to this invoice.
@param aProduct the product that the customer ordered
@param quantity the quantity of the product
	 */
	public void add(Product aProduct, int quantity)
	{
		LineItem anItem = new LineItem(aProduct, quantity);
		items.add(anItem);
	}
	/**
//removed the format class
	 */
	
	/**
Computes the total amount due.
@return the amount due
	 */
	public double getAmountDue()
	{
		double amountDue = 0;
		for (LineItem item : items)
		{
			amountDue = amountDue + item.getTotalPrice();
		}
		return amountDue;
	}
	
	/**
	 * this method used to return the billingAdress 
	 * for formating printing of invoic
	 * @return
	 */
	public Address getAddress()
	{
		return this.billingAddress;
	}
	
	/**
	 * this method will return the all LineItems to caller 
	 * function
	 * formatting the invoice
	 */
	public ArrayList<LineItem> getItems()
	{
		return this.items;
	}
}
////////////////////////////////////////////////////////////////////////////////////////////
