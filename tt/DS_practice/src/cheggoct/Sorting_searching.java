package cheggoct;

import java.util.Random;

public class Sorting_searching {

	/**
	 * For performing the binary search should be sorted 
	 * this method id implementation of Insertion sort
	 * that will take input as unsorted array and return the 
	 * sorted array
	 * @param unsorted array
	 * @return sorted array
	 */
	 public static int[] sortArray(int[] array){
         
	        int k;
	        int n=array.length;//no of elements in array
	        //using nested loops looping the elements
	        for (int i = 1; i <n; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(array[j] < array[j-1]){
	                    k = array[j];
	                    array[j] = array[j-1];//swapping the values
	                    array[j-1] = k;
	                }
	            }
	        }
	        return array;//returning the sorted array
	    }
	 
	 /**
	  * this method is the implementation
	  * of recursive binary search
	  * @param sort_arr
	  * @param first
	  * @param end
	  * @param search_value
	  * @return the index of search value if found
	  */
	 public static int b_search(int[] sort_arr, int first, int end, int search_value) {
         
	        if (first < end) {//condition for exiting recursive
	            int m = first + (end - first) / 2;  //calculating mid value
	            if (search_value < sort_arr[m]) {//left search
	            	//calling the function recursively
	                return b_search(sort_arr, first, m, search_value);
	                 
	            } else if (search_value > sort_arr[m]) {//right search
	            	/*calling the function recursively
	            	using updated values
	            	*/
	                return b_search(sort_arr, m+1, end , search_value);
	                 
	            } else {
	                return m;   /*if m ==  search_value then it will 
	                				exit from and return the index*/
	            }
	        }
	        return -1;  //if not found
	    }
	 
	// main meto
	 public static void main(String[] args) {
		int array1[] = new int[25];//two array of length 25
		int array2[] = new int[25];
		/*
		 * here i am using random no to generate array value
		 * u can free to use implementation for initialing the array
		 * */
		Random random1 = new Random();
		for(int i=0;i<25;i++)
		{
			int tmp1 = random1.nextInt(100);//two random no
			int tmp2 = random1.nextInt(200);
			array1[i]=tmp1;//adding random no to both array
			array2[i]=tmp2;
		}
		array1 = sortArray(array1);/*sorting the array for performing the binary search*/
		array2 = sortArray(array2);
		
		System.out.println("Serching for value using BST");
		System.out.println("Searching for 13 in array2 "+b_search(array1, 0, array1.length, 13));
		System.out.println("Searching for 10 in array1 "+b_search(array1, 0, array2.length, 10));
		
	}
}
