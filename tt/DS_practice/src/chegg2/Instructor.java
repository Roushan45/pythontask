package chegg2;

public class Instructor  extends Person implements Drinks{

	@Override
	public String drinks() {
		
		return "INSTRUCTOR: I drink coffee";
	}

	@Override
	public String doesForALiving() {
		
		return "INSTRUCTOR: I spend all my time teaching";
	}

}
