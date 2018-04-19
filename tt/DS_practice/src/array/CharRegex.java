package array;

public class CharRegex {
public static void main(String[] args) {
	
	//declared and intialized character
	char c = '6'; 
	
	//converting character to lowercase
	//u can also convert to uppercase(in for loop make sure using upper case letter)
	Character toLower = Character.toLowerCase(c); 
	//flag variable
	boolean found  = false;
	
	//looping through each alphabet
	for(char cc = 'a';cc<'z';cc++){
		if(cc==toLower){
			//if found set lag to true and break the loop
			found = true;
			break;
		}
		
	}
	//print the result flag
	//true = found
	//false = not found
	System.out.print("\n\ncase 3 char = '6' =>");
	System.out.print("\t"+found);
}
}
