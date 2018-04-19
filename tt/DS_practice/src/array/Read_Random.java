package array;

import java.io.File;
import java.util.Scanner;
//this module will read the random from file
public class Read_Random {

	public static void main(String[] args) throws Exception {
		double total=0;
		//using scanner reading file
		Scanner sc = new Scanner(new File("random.txt"));
		while (sc.hasNext()){
			double temp=Double.valueOf(sc.next().trim());
			System.out.println(temp);
			total+=temp;
		}
		sc.close();
		//printing total
		System.out.println("\nThe total is : "+total);
	}

}
