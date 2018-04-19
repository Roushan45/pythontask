package chegg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enetr the no please");
			
		String s = sc.next();
		//This is the  Pattern will match no within 1-100
		Pattern patt = Pattern.compile("^0*(?:[1-9][0-9]?|100)$");
		
		Matcher m = patt.matcher(s);
		
		if(m.find()){
			System.out.println(s+" =>is in Within Range [1-100] !!!");
		}
		
		else{
			System.out.println(s+" => sorry not in Range [1-100]");
		}
	

}
}
