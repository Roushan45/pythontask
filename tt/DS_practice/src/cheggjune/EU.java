package cheggjune;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class EU {
//instanc variable that will hold all country data
	private static ArrayList<Country> countryList = new ArrayList<>();
	//retutn country info in list
	public static Country getCountry(int index){
		if(index>countryList.size()){
			throw new NoSuchElementException("Index out of range");
		}
		return countryList.get(index-1);
	}
	//this will add new member
	public static void newMember(Country newCountry){
		countryList.add(newCountry);
	}
	//checking if currency exchange required
	public static boolean needFX(Country c1, Country c2){
		boolean flag=false;
		if((c1.isEuroCurrency()&&!c2.isEuroCurrency())
				||(!c1.isEuroCurrency()&&c2.isEuroCurrency())){
			flag=true;
		}
		return flag;
	}
}
