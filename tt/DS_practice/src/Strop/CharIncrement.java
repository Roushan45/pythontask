package Strop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class CharIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='C';
		char c2=74;
		c1++;
		c2++;
		System.out.println(c1+"  "+c2);
		
		boolean a =true;
		boolean b=!true;
		boolean d=a|b;
		boolean c=a|b;
		boolean e=d?b:c;
		System.out.println(d+"           "+e);
		
		List object =(List) Arrays.asList("sun mon tue wed thu fri sat".split(" "));
		System.out.println(object);
		Collections.rotate(object, 3);
		System.out.println(object);
	}

}
