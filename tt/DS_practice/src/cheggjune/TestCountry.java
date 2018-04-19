package cheggjune;

public class TestCountry {

	public static void main(String[] args) {
		//created three country variables
		Country c1 = new Country("UK", 1887, true);
		Country c2 = new Country("Polland", 1997, true);
		Country c3 = new Country("india", 1770, false);
		
		//added to list by calling newMember method
		EU.newMember(c1);
		EU.newMember(c2);
		EU.newMember(c3);
		//getting the country by accessing the index
		System.out.println(EU.getCountry(1));
		System.out.println(EU.getCountry(3));
		//checking if currency exchange required
		System.out.println("Is c1 and c2 need to change currency : "+EU.needFX(c1, c2));
		
		System.out.println("Is c1 and c3 need to change currency : "+EU.needFX(c1, c3));

	}

}
