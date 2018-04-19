package cheggsept;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstnameLastname {

	public static void main(String[] args) throws FileNotFoundException {
		//defined two multidimension array for name and marks
		String studentNames[][] = new String[100][2];
		int marks[][]  = new int[100][8];
		int noOfrecord = 0;
		String fileName = "input.txt";
		System.out.println("Loading data from file....\n");
		Scanner sc = new Scanner(new File(fileName));
		//reading from file start
		while(sc.hasNext())
		{
			String data[] = sc.nextLine().split(" ");
			//adding name to name array
			studentNames[noOfrecord][0]=data[0];
			studentNames[noOfrecord][1]=data[1];
			int k=0;
			//adding marks to mark array
			for(int i=2;i<data.length;i++)
			{
				marks[noOfrecord][k++]=Integer.valueOf(data[i]);
			}
			noOfrecord++;
		}
		//final sum array will store the sum of marks for each
		//student 
		double finalSum[] = new double[noOfrecord-1];
		//total max that can be achieval 
		//100*3 for test score 
		//20*5 for homeworks
		double totalMarks = (100*3)+(20*5);
		for(int i=0;i<noOfrecord-1;i++)
		{
			double sum=0;
			for(int j=0;j<8;j++)
			{
				sum = sum+ marks[i][j];
			}
			finalSum[i]=sum;
		}
		
		System.out.printf("%1$-20s","Student Names");
		System.out.printf("%1$-8s","Average");
		System.out.printf("%1$-5s\n","Letter Grade");
		System.out.println("-------------------------------------------------");
		for(int i=0;i<finalSum.length;i++)
		{
			//calculating grade
			char grade = 'x';
			double avg = (finalSum[i]*100)/totalMarks;
			if(avg>=90)
				grade='A';
			else if(avg<90 && avg>=80){
				grade = 'B';
			}
			else if(avg<80 && avg>=70	)
				grade = 'C';
			else if(avg<70 && avg>=60)
				grade = 'D';
			else if (grade>60 && avg<=70)
				grade = 'E';
			else
				grade = 'F';
			
			System.out.printf("%1$-20s",studentNames[i][0] +" "+studentNames[i][1]);
			System.out.printf("%1$-10s",avg);
			System.out.printf("%1$-8s\n",grade);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Prepare by your name ");
		System.out.println("-------------------------------------------------");
		sc.close();
	}

}
