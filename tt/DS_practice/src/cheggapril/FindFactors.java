package cheggapril;

import java.util.Scanner;

public class FindFactors {
	
	public static void main(String[] args){
		//getting the user input a integer
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the No for finding all its factors : ");
		//scanning the no from console
        int number = scan.nextInt();
        System.out.print("Factors of "+number+": ");
        //using for loop iterating the all no
        for(int i=2; i<=number; i++){
            while(number%i==0){
            	//printing the no
                System.out.print(i + " ");
                number = number/i;
            }
        }
        //closing the scanner
        scan.close();
    }

}
