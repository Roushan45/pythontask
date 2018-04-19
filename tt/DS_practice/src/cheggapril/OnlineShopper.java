package cheggapril;
/** A class that maintains a shopping cart for an online store.
    @author Frank M. Carrano
 Modified by Darina Dicheva
    @version 4.0
*/
public class OnlineShopper
{
 public static void main(String[] args)  {
 
  // Define what products are sold in the store
  Item item1 = new Item("Sunflower seeds", 1295); 
  Item item2 = new Item("Bird feeder", 2050);
  Item item3 = new Item("Squirrel guard", 1547);
  Item item4 = new Item("Bird bath", 4499);
                     
  BagInterface<Item> shoppingCart = new ArrayBag<>();
  BagInterface<Item> groceryBag = new ArrayBag<>();
  int totalCost = 0;
           
  // Add to the shopping cart 2 bags of sunflower seeds
  shoppingCart.add(item1);
  shoppingCart.add(item1);
     
  // Add to the shopping cart 1 bird feeder, 1 squirrel guard and 2 birth baths
  
  shoppingCart.add(item2);
  shoppingCart.add(item3);
  shoppingCart.add(item4);
  shoppingCart.add(item4);
     
  // Check how many packages of Sunflower seeds are in the shopping car
  
  System.out.println("Sunflower seeds bags: "+shoppingCart.getFrequencyOf(item1));
  // Simulate checkout
  while (!shoppingCart.isEmpty()) {
   // Remove the item from the shopping cart
   Item nextItem = shoppingCart.remove(); 
   // Find the item's price and add it to the totalCost    
   totalCost = totalCost+nextItem.getPrice();
   
   // Print item's description
   System.out.println(nextItem.toString());
   
   // Add the item to the shopper bag
  
   groceryBag.add(nextItem);
  }
 
  System.out.println();
  System.out.println("Total cost: " +
                         "\t$" + totalCost / 100 + "." + totalCost % 100);
 } // end main
} // end OnlineShopper
/*
You should receive the following result:

Sunflower seeds bags:  2
Bird bath $44.994499
Bird bath $44.994499
Squirrel guard $15.471547
Bird feeder $20.502050
Sunflower seeds $12.951295
Sunflower seeds $12.951295
Total cost:  $151.85
*/