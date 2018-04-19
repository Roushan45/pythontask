package cheggoct;

public class FindMin {

	/**
	 * Method will find find the minimum no in given array
	 * @param list
	 * @return the minimun no
	 */
	public static int findMin(int []list)
	{
		//initialize the min no with max value
		int min = Integer.MAX_VALUE;
		//comapring the list value with min
		//if min is greater then assigning min no
		for(int i=0;i<list.length;i++)
		{
			if(list[i]<min)
				min=list[i];
		}
		//returning min no
		return min;
	}
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		//created array with given values
		int list [] = {9,2,1,8,7,6,4};
		//calling the function with array and
		//after printing the value
		System.out.println("Minimun no in list : "+findMin(list));

	}

}
