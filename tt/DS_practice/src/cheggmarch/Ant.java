package cheggmarch;

public class Ant extends Animal{

	private String habitat;
	
	//default constructor
	public Ant(){
		
	}
	//parameterized constructor
	public Ant(String name,int heartRate,String habitat) {
		//calling super constructor with parameter
		super(name,heartRate);
		this.habitat = habitat;
	}


	public String getHabitat(){
		return habitat;
	}
	public void setHabitat(String habitat){
		this.habitat=habitat;
	}
}
