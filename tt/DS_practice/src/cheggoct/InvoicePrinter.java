package cheggoct;

public class InvoicePrinter
{
	public static void main(String[] args)
	{
		Address samsAddress
		= new Address("Sam's Small Appliances",
				"100 Main Street", "Anytown", "CA", "98765");
		Invoice samsInvoice = new Invoice(samsAddress);
		samsInvoice.add(new Product("Toaster", 29.95), 3);
		samsInvoice.add(new Product("Hair dryer", 24.95), 1);
		samsInvoice.add(new Product("Car vacuum", 19.99), 2);
		/*
		 * calling the class InvoiceFormatter method 
		 * to display the content 
		 */
		System.out.println(InvoiceFormatter.format(samsInvoice));
	}
}
/////////////////////////////////////////////