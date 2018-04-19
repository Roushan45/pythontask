package cheggjuly;

public class RemoveTester {
	/***
	 * 
	 * @param array
	 * @param size
	 * @return array with no odd elements
	 */
	public static int [] removeOdd(int array[],int size)
	{
		//count will store the actual no of even elements
		int count=0;
		for(int i=0;i<size;i++)
		{
			//if odd found
			if(array[i]%2==1)
			{
				//replacing it with some garbage value
				array[i]=Integer.MIN_VALUE;
				continue;
			}
			//if even found increasing the count
			count++;
		}
		//creating the new temp array with the size 
		//of count variable
		
		int temp[]=new int[count];
		int t=0;
		/*copying the even no from array to temp*/
		for(int j=0;j<size;j++)
		{
			//if garbage value found 
			//continuing the loop
			if(array[j]==Integer.MIN_VALUE)
			{
				continue;
			}
			//if even found adding to temp 
			else{
				temp[t++]=array[j];
			}
		}
		/*need to return array instead of size because need to eliminate the 
		 * odd variables so only returning size will not work
		 * returning the temp
		 *no need to return size explicitly
		 * it contains the size of array*/
		return temp;
	}
//main method
	public static void main(String[] args) {
		//created one array with odd and even values
		int[] a = { 22, 98, 95, 46, 31, 53, 82, 24, 11, 19 };
		/*getting the length of array by calling the length
		*printing the info before removing the odd elements*/
		int sizeBefore = a.length;
		System.out.println("Size of array having the odd elements : "+sizeBefore);
		System.out.print("a[");
		for(int i=0;i<sizeBefore;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		//removed the odd elements from array and stored in new array*/
		int newArray[]=removeOdd(a, sizeBefore);
		int sizeAfter = newArray.length;
		System.out.println("\n----------------------------------\n");
		System.out.println("\nSize of array after removing odd elements : "+sizeAfter);
		System.out.print("newArray[");
		for(int i=0;i<sizeAfter;i++)
		{
			System.out.print(newArray[i]+" ");
		}
		System.out.println("]");
	}

}
