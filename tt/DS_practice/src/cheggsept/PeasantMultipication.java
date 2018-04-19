package cheggsept;

import java.util.ArrayList;

public class PeasantMultipication {

	/**
	 * this method will multiply two values 
	 * by using peasant multiply method
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int peasantMultiply(int n1,int n2)
	{
		//taken two array list for 
		//right hand side and left hand side
		ArrayList<Integer> leftSide=new ArrayList<Integer>();
		ArrayList<Integer> rightSide = new ArrayList<Integer>();
		
		//dividing the n1 by 2 until it greater than 1
		while(n1>1)
		{
			//adding the values to leftside of array
			leftSide.add(n1/2);
			n1=n1/2;
		}
		/*doubling the number n2 (multiplying by 2 to result)
		 * till the size of leftSide array
		 */
		for(int i=0;i<leftSide.size();i++)
		{
			rightSide.add(n2*2);
			n2=n2*2;
		}
		//removing the even no from left side array and on same
		//index from right side array
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i=0;i<leftSide.size();i++)
		{
			//if divisible by 2 then removing
			if(leftSide.get(i)%2==0)
				continue;
			temp.add(rightSide.get(i));
		}
		//reassigning the value to right side array
		rightSide=temp;
		int mulValue = 0;
		//looping through each variable and adding the values
		for(Integer i : rightSide)
			mulValue += i;
		//returning the final value of multiplication
		return mulValue;
	}
	//main method for execitung the program
	public static void main(String[] args) {
		
		//multiplying value 1
		System.out.println("146 x 37 : "+peasantMultiply(146, 37)+" , Expected "+(146*37));
		System.out.println("212 x 54 : "+peasantMultiply(212, 54)+" , Expected "+(212*54));

	}

}
