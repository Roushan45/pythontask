package cheggsept;
import java.util.Arrays;

import java.util.MissingResourceException;

/**
 * Array Search class for finding the elements in arrays
 * using java library and coustom looping
 * element index in array
 * @author Your Name
 * @param <E>
 */

public class ArraySearch<E> {
	
	/**
	 *find for method that will be search for elements in loop
	 *@param needle
	 * @param haystack
	 * @return if element found return index of value or throw
	 * MissingResourceException exception
	 */

	public int find_for (E [] haystack, E needle)

	{
		//for finding the key needle 
		//looping through the array using for loop
		for(int a0=0;a0<haystack.length;a0++)

		{
			//matching the array element with needle
			//using equal method
			if(haystack[a0].equals(needle))
				//returning the index
				return a0;
		}

		//if needle not found in array throwing MissingResourceException

		throw new MissingResourceException("Element not found",this.getClass().getName(),needle.toString());

	}

	/**
	 * in this method using java Arrays class for finding the key
	 * in array
	 * @param haystack
	 * @param needle
	 * @return if element found return the array based index otherwise throw exception
	 */

	public int find_other (E [] haystack, E needle)

	{
		//Converting the array in List and searching the needle
		boolean isFound = Arrays.asList(haystack).contains(needle);
		//if not found throwing exception
		if(!isFound)
			throw new MissingResourceException("Element not found",this.getClass().getName(),needle.toString());
		//if found returning the index
		return find_for(haystack, needle);
	}
	
	/**
	 * first_duplicate will find the first duplicate entry in array
	 * @param data array
	 * @return if duplicate found will return first index of duplicate value
	 * else return -1 that means not found
	 */

	public int first_duplicate (E [] data)
	{

		int same_value_count = 0;

		for(int a0=0;a0<data.length;a0++)

		{

			for(int a1=a0+1;a1<data.length;a1++)

			{
				//if identical data found
				if(data[a0]==data[a1])

				{
					//increasing the count
					same_value_count++;

				}
				//if count greater than 1 
				//then returning the index of 
				//duplicate value
				if(same_value_count>1)

					return a0;

			}

		}

		return -1;

	}

}