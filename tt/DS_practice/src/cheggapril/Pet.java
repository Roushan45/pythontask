package cheggapril;
//pet class that have the 
//own variables
public class Pet {
	//declared instance variable
	private String _petName;
	private String _petAnimalType;
	private String _petWeight;
	private String _lastRabbies;
	private String _lastVisit;
	public Pet(String name, String animalType, String weight, String last_rabies_date, String last_visit_date) {
		super();
		this._petName = name;
		this._petAnimalType = animalType;
		this._petWeight = weight;
		this._lastRabbies = last_rabies_date;
		this._lastVisit = last_visit_date;
	}
	public Pet(){
		
	}
	//to string method or readable
	@Override
	public String toString() {
		return _petName + "," + _petAnimalType + "," + _petWeight + ","
				+ _lastRabbies + "," + _lastVisit+"\n" ;
	}
	
	
}
