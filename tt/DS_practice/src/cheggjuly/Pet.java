package cheggjuly;

public class Pet {
	//variables required for pet
	private String name;
	private String type;
	private int age;
	private float height;
	private float weight;
	private int legs;
	
	//getters ans segtters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	//print story for pet
	public void printStory()
	{
		System.out.println("\nThere once was a "+ type+" named "+ name+" who lived in Dallas, Texas.\n"
				+  name+" was a "+ legs+"legged pet. \nIn 2017,"
				+ "when it was "+ age+" years old, "+ name+" was "+ height+" feet tall and "+ weight+" pounds.\n"
				+ name+" was a happy "+ type+" and had long and happy life.");
	}
	
}
