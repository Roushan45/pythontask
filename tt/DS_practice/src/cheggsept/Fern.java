package cheggsept;
/**
 * Fern class extending the plant class and 
 * implemented the Comarable inteface
 * @author 
 *
 */
public class Fern extends Plant implements Comparable<Fern> {

	//empty constructor
	public Fern()
	{
		super();
	}
	//get watering methods
	@Override
	public int getWatering() {
		int days = (int) (Math.random() * (6 - 1)) + 1;
		if(days<5)
			return 7;
		return 14;
	}
	/*
	 * comapreTo method
	 * please note that as in problem statement not 
	 * mentioned that how to implemet or on ehat basis need to
	 * compare so here i am using just getWatering() method
	 *if any other please do let me know
	 */
	@Override
	public int compareTo(Fern o) {
		if(this.getWatering()>o.getWatering())
			return 1;
		if(this.getWatering()<o.getWatering())
			return -1;
		return 0;
	}
	
}
