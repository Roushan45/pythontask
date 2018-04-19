package cheggmarch;

public class Shrimp extends Animal implements Edible{

	private String taste;
	//defaul;t constructor
	public Shrimp(){
		
	}
	//parametirized constructor
	public Shrimp(String name, int heartRate, String taste){
		super(name,heartRate);
		this.taste=taste;
	}
	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return taste;
	}
	public void setTaste(String taste){
		this.taste=taste;
	}

}
