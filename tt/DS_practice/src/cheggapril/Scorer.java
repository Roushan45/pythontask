package cheggapril;

import java.util.Scanner;

public class Scorer {
	//declared array of 3X3
	int score[][] = new int[3][3];
	Scanner scanner = new Scanner(System.in);
	//method for getting input 
	//using nested while loop
	void getInput(){
		int i=0;//row 
		while(i<3){
			int j=0;//column
			while(j<3){
				System.out.print("Enter the no :");
				score[i][j]=scanner.nextInt();
				j++;
			}
			i++;
		}
	}
	//calculating average per row
	//using nested for loop
	void averagePerRow(){
		for(int i=0;i<3;i++){
			float sum=0;
			for(int j=0;j<3;j++){
				sum=sum+score[i][j];
			}
			//calling the output method
			output(sum,1+i);
		}
	}
	//output method for printing 
	//average per row
	void output(float sum,int row){
		//for average sum/3
		System.out.println("Average score for Row "+row+" : "+sum/3);
	}
	public static void main(String[] args) {
		//created object of Scorer class
		Scorer object = new Scorer();
		//calling input method for 
		//getting input in array
		object.getInput();
		//printing average score per row
		object.averagePerRow();
	}

}
