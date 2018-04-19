package cheggsept;
/**
 * succulent class
 */
public class Succulent extends Plant{
	//hasSpines instance varibles
	boolean hasSpines;
	//no-args constructor
	public Succulent() {
		super("purple");
		hasSpines=false;
	}
	//constructor to set color and spine
	public Succulent(String color,boolean hasSpines)
	{
		super(color);
		this.hasSpines=hasSpines;
	}
	//getters and setters
	public boolean hasSpines()
	{
		return this.hasSpines;
	}
	
	public void setSpines(boolean hasSpines)
	{
		this.hasSpines=hasSpines;
	}
	
	public String getType()
	{
		if(hasSpines)
			return "cactus";
		return "succulent";
	}
	@Override
	public int getWatering() {
		if(hasSpines)
			return 28;
		return 14;
	}
	
	public boolean  isSameType(Succulent plant)
	{
		return this.hasSpines==plant.hasSpines;
	}
	//toString method
	public String toString()
	{
		return "color  " + color +"\nhasSpines   "+hasSpines();
	}
}
