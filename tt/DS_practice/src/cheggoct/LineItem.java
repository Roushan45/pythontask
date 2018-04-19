package cheggoct;
/**
   Describes a quantity of an article to purchase.
 */
public class LineItem
{
	private int quantity;
	private Product theProduct;
	/**
Constructs an item from the product and quantity.
@param aProduct the product
@param aQuantity the item quantity
	 */
	public LineItem(Product aProduct, int aQuantity)
	{
		theProduct = aProduct;
		quantity = aQuantity;
	}
	/**
Computes the total cost of this line item.
@return the total price
	 */
	public double getTotalPrice()
	{
		return theProduct.getPrice() * quantity;
	}
	
	
	
	/**
	 *this method will return the quantity 
	 * @return quantity of product
	 */
	public int getQuantity()
	{
		return this.quantity;
	}
	
	/**
	 * this method will return the product object 
	 * to caller
	 * @return product of current invoice
	 */
	public Product getProduct()
	{
		return this.theProduct;
	}
}
//////////////////////////////////////////////////////////////////////////////

