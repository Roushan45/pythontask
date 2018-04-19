package cheggsept;

/**
 * Test class for  Admin
 *
 */
public class TestInvoice {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Created two object of Invoice
		 */
		Invoice _first  = new Invoice("A211", "Door bell", 10, 200);
		Invoice _second = new Invoice("B91S","Bucket",30,150);
		
		//printing the information of Invoice
		System.out.println("============Invoice 1====================");
		System.out.println("Part No : "+_first.getPartNumber());
		System.out.println("Description : "+_first.getPartDesc());
		System.out.println("Part Quantity : "+_first.getQuantity());
		System.out.println("Price : "+_first.getPrice());
		System.out.println("Invoice Amount :"+_first.getInvoiceAmount());
		System.out.println("============Invoice 2====================");
		System.out.println("Part No : "+_second.getPartNumber());
		System.out.println("Description : "+_second.getPartDesc());
		System.out.println("Part Quantity : "+_second.getQuantity());
		System.out.println("Price : "+_second.getPrice());
		System.out.println("Invoice Amount :"+_second.getInvoiceAmount());
	}

}
