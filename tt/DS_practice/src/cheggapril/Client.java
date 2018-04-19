package cheggapril;

import java.util.Arrays;

public class Client {
	
	private String _lastName;
	private String _firstName;
	private String _address;
	private String _clientId;
	private String _balance;
	private int _visitorNo;
	private Pet _noOfPets[];
	//no arg constructor
	public Client(){
		
	}
	//parameterized constructor with all values
	public Client(String last_name, String first_name, String address, String clientId, String balance,
			int no_of_visiters, Pet[] pets) {
		super();
		this._lastName = last_name;
		this._firstName = first_name;
		this._address = address;
		this._clientId = clientId;
		this._balance = balance;
		this._visitorNo = no_of_visiters;
		this._noOfPets = pets;
	}
	//displying the readable ormat using toString
	@Override
	public String toString() {
		return "" + _lastName + ", " + _firstName + "," + _address
				+ " ," + _clientId + " , " + _balance + " , " + _visitorNo + "\n"
				+ Arrays.toString(_noOfPets)+"" ;
	}
	//As per requirement overriden the equal method
	//on base of client id
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Client))
			return false;
		Client other = (Client) obj;
		if (_clientId == null) {
			if (other._clientId != null)
				return false;
		} else if (!_clientId.equals(other._clientId))
			return false;
		return true;
	}
	
	
	

}
