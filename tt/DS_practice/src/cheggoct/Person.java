package cheggoct;

/**
 * Person Class 
 * @author yourName
 *
 */
public class Person {
	//Person instance variable	
	private String name;
	//constructor that accepts string name
	public Person(String name) {
		//initializing the name
		this.name = name;
	}
	//getters for name
	public String getName() {
		return name;
	}
	//setters for name
	public void setName(String name) {
		this.name = name;
	}
	//toString for name
	public String toString()
	{
		return "Person Name : "+name;
	}

}
