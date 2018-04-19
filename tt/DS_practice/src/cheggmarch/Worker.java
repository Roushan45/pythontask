package cheggmarch;

public class Worker {

	private String name;
	private int income;
	
	Worker(String n ,int i){
		name=n;
		income=i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
	
	

}
