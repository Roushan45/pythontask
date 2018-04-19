package chegg;

//Driver/test class for testing functionality
public class Test {
	public static void main(String[] args) {
		//Created Room Dimension object
		RoomDimension dimension = new RoomDimension(30, 30.5);
		//Created Room carpet object
		RoomCarpet roomCarpet = new RoomCarpet(dimension, 20);
		System.out.println("\nArea Of Room is  => "+dimension.getAreaOfRoom()
		+"sqrFeet");
		System.out.println("\nTotal Cost of Carpet => $"+roomCarpet.getTotalCost());
	}


}
