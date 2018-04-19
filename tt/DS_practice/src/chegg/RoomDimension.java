package chegg;

//RoomDimension class 
public class RoomDimension {
	//two private field for length and breadth
	private double lenght;
	private double width;
	//Constructor for creating object with length and width
	public RoomDimension(double length, double width){
		this.lenght = length;
		this.width = width;
	}
	//It will return Area of Room
	public double getAreaOfRoom(){
		return lenght*width;
	}

}
