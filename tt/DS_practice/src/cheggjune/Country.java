package cheggjune;

public class Country {
//three instance variable for country
	private String name;
	private int year;
	private boolean isEuroasCurrency;
	//constructor
	public Country(String name,int year,boolean currency){
		this.name=name;
		this.year=year;
		this.isEuroasCurrency=currency;
	}
//getters and setters or accessor and mutators
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public boolean isEuroCurrency() {
		return isEuroasCurrency;
	}
	
	public void setCurrency(boolean currency){
		this.isEuroasCurrency=currency;
	}
	
	public String toString(){
		return "Name : "+this.name+"\nYear : "+this.year
				+"\nEuro Currency : "+this.isEuroasCurrency;
	}
}
