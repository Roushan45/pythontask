package cheggjuly;
/*Contact class */
public class Contact {
	/*InstNCE VARIABLES*/
	private String name;
	private Telephone tel;
	private Address add;
	private String email;
	/*STTATIC INT VARIABLE THAT WILL COUNT THE NO OF CONTACTC CREATED*/
	private static 	int contactsCreated;
	public Contact(String name, Telephone tel, Address add, String email) {
		this.name = name;
		this.tel = tel;
		this.add = add;
		this.email = email;
		/*INCREMENTING THE COUNT IN CONSTRUCTOR*/
		contactsCreated++;
	}
	/*GETTERS AND SETTERS FOR INSTANCE VARIABLE*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Telephone getTel() {
		return tel;
	}

	public void setTel(Telephone tel) {
		this.tel = tel;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	/*STATIC METHOD THAT RETURN THE NO OF CONTACTS CREATED*/
	public static int getContactsCreated()
	{
		return contactsCreated;
	}
	@Override
	public String toString() {
		return "Contact Name = " + name + "\n"+ tel + "\n" + add 
				+ "\nEmail = " + email+"\n";
	}
	

}
