package cheggAugust;
/**
 * Own data type Star
 */
public class Star {
	//star properties
	private String starName;
	private String stellarDesignation;
	private double magnitude;
	//constructor
	public Star(String name,String stellar,double magnitude)
	{
		this.starName=name;
		this.stellarDesignation=stellar;
		this.magnitude=magnitude;
	}
	//collide method
	public Star collide(Star bang)
	{
		//adding the magnitude of star
		//to given start
		this.magnitude+=bang.magnitude;
		return this;
	}
	//this method will return the star agnitude
	public double getMagnitude()
	{
		return this.magnitude;
	}
	//String represenation of Star object
	public String toString()
	{
		//Giving the star name of choice 
		//degintion of star and the magnitude
		return "Name : Star World\nMagnitude : "+this.getMagnitude()+
				"\nStellar Designation : "+this.stellarDesignation;
	}
}
