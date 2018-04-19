package cheggapril;

public class Cat {
	
	private String name;
	private char gender;
	
	public Cat(){
		name="";
		gender=' ';
	}//End Constructor
	
	public void setName(String newName){
		name = newName;
	}//End Module
	
	public String getName(){
		return name;
	}//End Module
	
	public void setgender(char newGender){
		 if (newGender == 'F' || newGender == 'M') {
             gender = newGender;
		 		} //End IF
		 else {
             System.out.println("Error: only M or F is allowed for gender, not: " + newGender);
             gender = ' ';
    } //End Else
	}//End Module
	public char getGender(){
		return gender;
	}//End Module

}//End Class
