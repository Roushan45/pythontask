package chegg;
import chegg.GroceryItemOrder;
//Grocery list class
public class GroceryList {
	//static int variable that will count no of grocery
	static int counter=0;
	//Array of ten GroceryOrder item
	private GroceryItemOrder[] array = new GroceryItemOrder[10];
	//Add method for Grocery Item 
	//counter variable will check for storage 
	//if avaliable then only proceed
	public void add(GroceryItemOrder item){
		if(counter<10){
			for(int i = 0;i<10;i++){
				if(array[i]==null){
					array[i]=item;
					counter++;
					System.out.println("added");break;
				}
			}
		}
		else{
			System.out.println("Full storage");
		}
	}
	//return totals cost 
	public double getTotalCost(){
		double totalCost = 0;
		int count=0;
		System.out.println("Item Name   Quantity  PerUnitPrice ");
		for(int i=0;i<array.length;i++){
			if(array[i]!=null&&count<10){
				System.out.print(array[i].toString()+"\n");
				totalCost = totalCost+array[i].getCost();
				count++;
			}
		}
		
		return totalCost;
	}

}
