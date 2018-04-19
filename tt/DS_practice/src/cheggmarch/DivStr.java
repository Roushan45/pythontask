package cheggmarch;

import java.util.ArrayList;
import java.util.List;
//class DivStr implemented the Divisible interface
public class DivStr implements Divisible {
	private String data;
	//Constructor that will initialize instance string value
	public DivStr(String data){
		this.data=data;
	}
	
	//overiding the method that declared in Divisible interface
	@Override
	public List<Character> divide() {
		//Created a ArrayList of character
		List<Character> characterList=new ArrayList<Character>();
		//looping through the whole string from index 0 and adding the value
		//of respective index to LIST
		for(int i=0;i<this.data.length();i++){
			characterList.add(data.charAt(i));
		}
		//returning the LIST
		return characterList;
	}
	

}
