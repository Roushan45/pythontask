package chegg;

//Driver class to demonstrate functionality
public class Driver {

	public static void main(String[] args) {
		Milk milk = new Milk(3, 3);
		Bread bread = new Bread(4,6);
		Eggs eggs = new Eggs(5,9);
		Grocery gro = new Grocery(milk, bread, eggs);
		System.out.println(gro.toString());
		gro.expense();
	}

}
