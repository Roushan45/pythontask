package string;

import java.util.Scanner;

public class SpeedLimit {
//main method
	public static void main(String[] args) {
		
		//Given max speed limit
		double speedLimit=60;
		Scanner sc = new Scanner(System.in);
		//getting the speed
		System.out.print("Please enter the speed : ");
		double speed=sc.nextDouble();
		//comparing the speed and printing the result
		if(speed>speedLimit) {
			System.out.println("you have exceeded the speed limit of "+ speedLimit+" mph by "+ (speed-speedLimit)+" miles");
		}
		else {
			System.out.println("your speed is within the speed limit");
		}
		sc.close();

	}

}
