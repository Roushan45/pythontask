package chegg2;

public class Hipster  extends Person implements Drinks{

	@Override
	public String drinks() {
		// TODO Auto-generated method stub
		return "HIPSTER: I drink PBR";
	}

	@Override
	public String doesForALiving() {
		
		return "HIPSTER: I spend all my time grooming";
	}

}
