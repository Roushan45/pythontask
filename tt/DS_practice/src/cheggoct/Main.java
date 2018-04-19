package cheggoct;

public class Main {

	
	/**
	 * Do insertion sort for given string 
	 * work on any number of inputs
	 * @param alphabets
	 * @return
	 */
	public static String sortAlphabets(String alphabets){
		char c;
		//converting the alphabets to char array
        char array[]= alphabets.toCharArray();
        //using insertion algo performing the sorting
        for (int a0 = 1; a0 < array.length; a0++) {
            for(int b0 = a0 ; b0 > 0 ; b0--){
                if(array[b0] < array[b0-1]){
                    c = array[b0];
                    array[b0] = array[b0-1];
                    array[b0-1] = c;
                }
            }
        }
        //now converting array back to string and returning the value
        return new String(array);
    }

	public static void main(String[] args) {
		String test = "aertoplghuqw";
		System.out.println("Before Insertion sort : "+test);
		System.out.println("\nPerforming insertion sort....\n");
		test = sortAlphabets(test);
		System.out.println("After Sorting : "+test);
	}
}
