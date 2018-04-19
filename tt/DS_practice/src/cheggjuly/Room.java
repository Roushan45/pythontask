package cheggjuly;

import java.util.HashMap;

/***
 * Room class have three diff private instance variables
 */
public class Room {

	private String description;
	private Item item;
	private HashMap<String, Room> adjacentRooms=new HashMap<>();
	/*constructors have two diff types of parameters*/
	public Room(String des)
	{
		this.description=des;
	}
	public Room(String des,Item item)
	{
		this.description=des;
		this.item=item;
	}
	/*getters for description and item*/
	public String getDescription() {
		return description;
	}
	public Item getItem() {
		return item;
	}
	public void addItem(Item i)
	{
		this.item=i;	
	}
	/*has item will return true if item is not null
	 * otherwise return false*/
	public boolean hasItem()
	{
		return item!=null;
	}
	/*Putting the value to hashmap */
	public void addNeighbor (String pDirection, Room r)
	{
		adjacentRooms.put(pDirection, r);
	}
	/*If pDirection exist in hashmap then room will return 
	 * if not then room will be null*/
	public Room getNeighbor (String pDirection)
	{
		Room r =adjacentRooms.get(pDirection);
		return r;
	}
	/*Remove item method */
	public Item removeItem ()
	{
		//if item is not null
		if(item!=null)
		{
			//then copied it in temp item variable
			Item temp=item;
			//marking item as null
			item=null;
			//then returning the temp item
			return temp;
		}
		//if item null 
		return item;
	}
	/*long description method will return the description ofroom*/
	public String getLongDescription ()
	{
		String longDescription="";
		longDescription="You are "+this.description;
		//if item is not null then adding
		//item description well
		if(item!=null)
			longDescription=longDescription+"\nyou see "+item;
		return longDescription;
	}
	//Main method for testing the functionality
	public static void main(String[] args) {
		//created two Room objects
		Room room1 = new Room("in this this room have 2 bedrrom and one hall.");
		Room room2 = new Room("in this this room have 1 bedrrom and one hall and one balcony.");
		//setting room1 neighbor to room2
		room1.addNeighbor("North", room2);
		//new item created
		Item item1 = new Item("Dressing table");
		//added item in room2
		room2.addItem(item1);
		Item item2 = new Item("Furniture");
		//one more room created with description and item
		Room room3 = new Room("in this have nice decorations.",item2);
		Room r=room1.getNeighbor("North");
		System.out.println("Room 1 Description : "+room1.getDescription());
		System.out.println("Room 1 has Item ? : "+room1.hasItem());
		System.out.println("Room 2 Description :" +room2.getDescription());
		System.out.println("Room 2 has Item ? : "+room2.hasItem());
		System.out.println("Room 3 Description :" +room3.getDescription());
		System.out.println("Room1 neighbor : "+r.getDescription());
	}
}
