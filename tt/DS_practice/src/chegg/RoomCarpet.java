package chegg;
//Room Carpet Class
public class RoomCarpet {
	//Room dimension object and cost per sqt o carpet
	private RoomDimension roomDimension;
	private double costOfCarperPerSqrFeet;
	//constructor for crating object with object o room dimension and cost 
	//per sqr feet of carpet
	public RoomCarpet(RoomDimension roomDimension, double costPerCarpetPerSqr){
		this.roomDimension = roomDimension;
		this.costOfCarperPerSqrFeet = costPerCarpetPerSqr;
	}
	//Public method for displaying total cost
	public double getTotalCost(){
		return roomDimension.getAreaOfRoom()*costOfCarperPerSqrFeet;
	}
	
}
