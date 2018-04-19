package cheggoct;
/**
 * Use to separate the printing of invoice 
 * using the format for formatting the 
 * Invoice and LinkItems
 */
import java.util.ArrayList;

public class InvoiceFormatter {
	
	//for printing the line items 
	//needed the all items required
	//it will store the all items
	private static ArrayList<LineItem> lineItems;
	
	/**
	 * this is method for formating the line items 
	 * it requires product info and lineitem
	 * @param LineItem object
	 * @param Product Object
	 * @return formatted line item description
	 */
	private static String format(LineItem item,Product product)
	{
		return String.format("%-30s%8.2f%5d%8.2f",
				product.getDescription(), product.getPrice(),
				item.getQuantity(), item.getTotalPrice());
	}
	/**
	 * this is method for formating the Invoice
	 * @param object of invoice
	 * @return formated Invoice
	 */
	public static String format(Invoice invoice)
	{
		//all items for foramtting
		lineItems=invoice.getItems();
		String r = " I N V O I C E\n\n"
				+ invoice.getAddress().format()
				+ String.format("\n\n%-30s%8s%5s%8s\n",
						"Description", "Price", "Qty", "Total");
		for (LineItem li : lineItems)
		{
			//calling the above method with required param
			r = r + format(li,li.getProduct()) + "\n";
		}
		r = r + String.format("\nAMOUNT DUE: $%8.2f", invoice.getAmountDue());
		return r;
	}
}

///////////////////////////////////////////////////////////////////////////////////////