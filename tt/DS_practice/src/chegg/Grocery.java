package chegg;

public class Grocery {
	
	private Milk myMilk;
	private Bread myBread;
	private Eggs myEggs;
	
	public Grocery(Milk myMilk, Bread myBread, Eggs myEggs) {
		
		this.myMilk = myMilk;
		this.myBread = myBread;
		this.myEggs = myEggs;
	}
	public String toString(){
		System.out.println("Item \tUnit price \tQuantity");
		return "Milk \t$"+myMilk.getItem_price()+" \t\t"+myMilk.getQuantity()+
				"\nBread \t$"+myBread.getItem_price()+" \t\t"+myBread.getQuantity()+
				"\nEggs \t$"+myEggs.getItem_price()+" \t\t"+myEggs.getQuantity();
	}
	public void expense(){
		
		System.out.println("---------------------------------------------------");
		System.out.println("\nCalculating total price per individually item");
		System.out.println("\nItem  \tTotal Price");
		System.out.println("Milk  \t$"+myMilk.total_price());
		System.out.println("Bread  \t$"+myBread.total_price());
		System.out.println("Eggs  \t$"+myEggs.total_price());
		
		System.out.println("------------------------------------------------------");
		System.out.println("\nCalculating total expense including all items");
		System.out.println("Total Price \t$"+(myMilk.total_price()+myBread.total_price()+myEggs.total_price()));
		
	}
	
	

}
