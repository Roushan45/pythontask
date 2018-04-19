package chegg2;

public class Student extends Person implements Drinks {

	@Override
	public String drinks() {
		
		return "STUDENT: I drink Red Bull";
	}

	@Override
	public String doesForALiving() {
		
		return "STUDENT: I spend all my time studying";
	}

}
