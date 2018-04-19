package cheggsept;
/**
 * this is a test class for Bags
 * @author yourname
 *
 */
public class BagTest {
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		//two bags created
		Bags<String> aBag1 = new Bags<>();
		Bags<String> aBag2 = new Bags<>();
		//adding items to bag1
		aBag1.addItem("Hockey");
		aBag1.addItem("Ball");
		aBag1.addItem("Basket Ball");
		aBag1.addItem("Goomps");
		//adding items to bag2
		aBag2.addItem("Bat");
		aBag2.addItem("Stumps");
		aBag2.addItem("Light ball");
		//printing information of bags
		System.out.println("Size of Bag1 : "+aBag1.getNoOfItems());
		System.out.println("Content of Bag1 : "+aBag1);
		System.out.println("Size of Bag2 : "+aBag2.getNoOfItems());
		System.out.println("Content of Bag2 : "+aBag2);
		
		System.out.println("\nMoving Bag2 content from Bag1.......\n");
		//moving the items from aBag2 to aBag1 using
		//the methods of Bags
		int i=0;
		while(i<=aBag2.getNoOfItems()+1)
		{
			aBag1.addItem(aBag2.getItem(0));
			i++;
		}
		
		System.out.println("After moving Bag2 to Bag1 size of Bag1 : "+aBag1.getNoOfItems());
		System.out.println("Content of Bag1  : "+aBag1);
		
		System.out.println("Size of Bag2 : "+aBag2.getNoOfItems());
		
	}

}
