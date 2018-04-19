package cheggoct;

public class Player {

	//private member declaration
	private String lastName;
	private String firstName;
	private int number;
	//default constructor
	public Player()
	{}
	
	//getters and setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//to string method for object string represenation
	public String toString()
	{
		return number+") "+firstName+" "+lastName;
	}
}
