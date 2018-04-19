package cheggjuly;
/*This is the  test class*/
public class TestClass {

	public static void main(String[] args) {
	/*two object created of each class with valid details*/
		Telephone t1 = new Telephone("020", "1234567");
		StringBuffer locality = new StringBuffer();
		Address add1 = new Address(locality, "22233");
		add1.setStreet("FolersVatra");
		add1.setApartment("new galaxy");
		add1.setCountry("Canada");
		Contact c1 = new Contact("Joy", t1, add1, "jiy@gmail.ccc");
		
		//second contact
		Telephone t2 = new Telephone(9911, "56435678");
		Address add2 = new Address("843993");
		add2.setStreet("REWUIO");
		add2.setApartment("new sky");
		add2.setCountry("Canada");
		Contact c2 = new Contact("smith", t2, add2, "smithH@gmail.ccc");
		//printing the contacts
		System.out.println(c1);
		System.out.println(c2);
		/*getting the no of contacts created by calling static method of contact
		 * class in a static way*/
		System.out.println("No of contacts created : "+Contact.getContactsCreated());

	}

}
