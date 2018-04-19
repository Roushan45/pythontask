package chegg;
//Driver class for check functionality
public class H11_yourfirstname {

	public static void main(String[] args) {
		//getting the command line argument
		String name = args[0];
		int quantity  = Integer.valueOf(args[1]);
		double perUnitPrice = Double.valueOf(args[2]);
		GroceryItemOrder item = new GroceryItemOrder(name,quantity,perUnitPrice);
		
		GroceryList list  =new GroceryList();
		list.add(item);
		
		System.out.println("total price"+list.getTotalCost());
	}

}
