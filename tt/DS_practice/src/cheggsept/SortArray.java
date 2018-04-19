package cheggsept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) throws FileNotFoundException {
		//declared array of 50000  element
		int array[] = new int[50000];
		//Scanner object
		Scanner sc = new Scanner(System.in);
		int count =0;
		String fileName;
		//asking for file name
		//place the file name in same dir where program kept or
		//give full path of file
		System.out.print("Enter the name of file: ");
		fileName = sc.next();
		//if file not found then exiting
		if(!new File(fileName).exists())
		{
			System.err.println("File not exists");
			System.exit(1);
		}
		sc = new Scanner(new File(fileName));	
		//reading from file to array
		while(sc.hasNext())
		{
			array[count++]=Integer.valueOf(sc.next());
		}
		int no_of_swipes = 0;
		long startTime=0,endTime=0;
		//getting the start time
		startTime  = System.currentTimeMillis();
		//insertion sorting starts here
		for (int i = 1; i < count; i++) {
			int shift = array[i];
			int j = i;
			//nested while loop
			while (j > 0 && shift < array[j - 1]) {
				array[j] = array[j - 1];
				--j;
				//increasing the no of swipes
				++no_of_swipes;
			}
			array[j] = shift;
		}
		//getting the end time 
		endTime = System.currentTimeMillis();
		//printing the total swipes and time taken
		System.out.println("No of Swipes : "+no_of_swipes);
		System.out.println("Time taken for sorting in milli second : "+ (endTime - startTime));
		
		//printing first 30 element from array
		System.out.println("First 30 element from sorted element");
		for(int i=0;i<30;i++)
		{
			System.out.print(array[i]+" ");
		}

		sc.close();
	}

}
