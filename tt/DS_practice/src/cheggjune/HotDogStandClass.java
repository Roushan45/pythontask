package cheggjune;

import java.util.Scanner;
/***
 * This is HotDog Stand class to keep track inventory
 * @author 
 *
 */
public class HotDogStandClass {
	//inventory instance variable will 
	//track the no of hot dogs
	private int inventory;
	//nOfSold instance variable will 
	//keep track the no of hot dogs sole
	//since object initialization
	private int noOfSold=0;
	/***
	 * public constructor 
	 * intialize the inventory to 25
	 */
	public HotDogStandClass()
	{
		this.inventory=25;
	}
	/***
	 * setInventory will set the no of hotdogs
	 * @param no
	 */
	public void setInventory(int no)
	{
		this.inventory=no;
	}
	/***
	 * getinventory will return the no of 
	 * hotdogs in inventory
	 * @return
	 */
	public int getInventory()
	{
		return this.inventory;
	}
	/***
	 * add_to_inventory will add no of 
	 *hotdogs in inventory
	 * @param no
	 */
	public void add_to_inventory(int no)
	{
		this.inventory+=no;
	}
	/***
	 * sub_from_inventory will subtract no of 
	 *hotdogs from inventory
	 * @param no
	 */
	public void sub_from_inventory(int no)
	{
		this.inventory-=no;
	}
	/***
	 * buy method is for transacting the 
	 *hotdogs to buyer
	 * @param i
	 */
	public void buy(int no)
	{
		Scanner sc = new Scanner(System.in);
		
		//if inventory size is zero
		if(this.inventory<=0)
		{
			System.out.println("out of hotdogs to the buyer.");
			return;
		}
		
		//if buyer want to buy more than current
		//inventory size
		if(no>this.inventory)
		{
			System.out.printf("Remaining %d hotdogs in inventory "
					+ "is sufficient for the buyer (Y/N)",this.inventory);
			char decision = sc.next().toLowerCase().charAt(0);
			//getting the user decision
			//if yes
			if(decision=='y')
			{
				//sold all hotdogs to buyer
				System.out.printf("%d Dogs sold to buyer \n",this.inventory);
				this.noOfSold+=this.inventory;
				this.inventory=0;
			}
			return;
		}
		//if inventory has more than no of buyer hotdogs
		else
		{
			sub_from_inventory(no);
			System.out.printf("%d Dogs sold to buyer \n",no);
			this.noOfSold+=no;
		}
	}
	/***
	 * toString method will show the 
	 *current inventory size and no of 
	 *hotdogs sold since object initialization
	 */
	public String toString()
	{
		return  String.format("Current no of hotdogs in Inventory : %d\nNo of sold hotdogs : %d",
				                     this.inventory,this.noOfSold);
	}
}
