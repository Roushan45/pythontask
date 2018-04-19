package cheggjune;

import java.util.ArrayList;
import java.util.Arrays;
/***
 * 
 * arrayList class 
 *
 * @param <E>
 */
public class arrayList<E> {
	//list of arraylist
	private static ArrayList<Integer> list;
	/***
	 * equals method that will take another list argument
	 * and comapre with above list
	 * @param list2
	 * @return
	 */
	public boolean equals(ArrayList<E> list2)
	{
		//if both list's size not equal
		//return false
		if(list.size()!=list2.size())
		{
			return false;
		}
		//checking equality of element 
		//at every index for both list
		for(int i=0;i<list.size();i++)
		{
			//if both value not equals
			//return false
			if(!list.get(i).equals(list2.get(i)))
				return false;
		}
		return true;
	}//end of equals method
	
	/***
	 * Main method for execution for above program
	 * @param args
	 */
	public static void main(String[] args) {
		arrayList<Integer> obj = new arrayList<>();
		//declared an array 
		Integer i[]={3,5,2,5,2,5,2,5};
		//adding the array elements to arraylist
		list=  new ArrayList<Integer>(Arrays.asList(i));
		//declared one more arraylist for comparision
		//added the same element
		ArrayList<Integer> list2=  new ArrayList<>(Arrays.asList(i));
		//checking  for equality
		System.out.print("list equals to list2 : ");
		System.out.println(obj.equals(list2));
		//added one more array
		Integer j[]={23,3,5,2,5,2,5,2,5};
		//created new arraylist with array j
		//it should return false as it have diiff element
		ArrayList<Integer> list3=  new ArrayList<>(Arrays.asList(j));
		System.out.print("list equals to list3 : ");
		System.out.println(obj.equals(list3));
		
	}

}
