package cheggmarch;

public abstract class Plant {
	//private instance vaiable
	private String name;
	private String group;
	//default constructor
	public Plant(){
		
	}
	//parameterized constructor
	public Plant(String name, String group) {
		this.name = name;
		this.group = group;
	}
	//abstract methods
	public abstract String getName();
	public abstract String getGroup();
	
	public boolean isSeeded(){
		return true;
	}
	
}
