package string;

public class Person {
	private String name;
	private int age;
	private String phone;

	public Person(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	
	}
	
	public String toString() {
		return "Name : "+name+"\nAge : "+age+"\nPhone : "+phone+"\n";
	}

}
