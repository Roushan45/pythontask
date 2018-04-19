package cheggsept;

public class SumWithouOperaor {

	public static void main(String[] args) {
		//Three Integers declared
		Integer i1 = 6;
		Integer i2 = 9;
		Integer i3 = 4;
		//i4 will store the sum
		Integer i4;
		//storing the multiplication to i4
		i4 = multiply(i1, i2);
		//storing the multiplication of i2 and i1 i.e, i4 and i3 to i4
		i4=multiply(i4, i3);
		//printing the result
		System.out.println("Multiplication of "+i1+"  "+i2+" "+i3+" without using * operator : "+i4);
	}
	public static Integer multiply(Integer first, Integer second)
	{
	   /* if any zero returns 0 */
	   if(second == 0 || first==0)
	     return 0;
	 //calling recursively
	   if(second > 0 )
	     return (first + multiply(first, second-1));
	 //calling recursively
	   if(second < 0 )
	     return -multiply(first, -second);
	  return 0;
	}
	 
}
