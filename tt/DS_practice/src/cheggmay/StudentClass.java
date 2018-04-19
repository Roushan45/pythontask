package cheggmay;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/***
 * 
 * This program will read student record from
 * text file and calculate grade on basic of test score
 * and write the final output to file 
 * also find the highest score and
 * student who got the highest score
 *
 */
public class StudentClass {
	//instance variable of student
	private String  studentFName;
	private String  StudentLName;
	private int testScore;
	private char grad;
	/***
	 * This method will load the data from text to StudentClass array object
	 * @param array
	 * @param input
	 * @return
	 * @throws FileNotFoundException
	 */
	public static StudentClass[] readData(StudentClass []array,File input) throws FileNotFoundException
	{
		
		Scanner sc = new Scanner(input);
		int counter=0;
		//getting line by line from text file
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			//splitting the line by whitespace
			String line[]=s.split(" ");
			//creating new object of studenclass
			StudentClass stu = new StudentClass();
			//assigning value to them
			stu.studentFName=line[0];
			stu.StudentLName=line[1];
			stu.testScore=Integer.valueOf(line[2]);
			//saving object to array
			array[counter]=stu;
			counter++;
		}
		//after reading the data returning the array
		return array;
	}

	/***
	 * this class will be used for calucating the grade on the basis of score
	 *assign grade to them accordingly
	 * @param array
	 * @return
	 */
	public static StudentClass[] assignGrade(StudentClass array[])
	{
		for(int i=0;i<array.length;i++)
		{
			//as per data if score 90 or max grade should be A
			if(array[i].testScore>=90)
			{
				array[i].grad='A';
			}
			//as per data if score 80 and less than 90 grade should be B
			else if(array[i].testScore<90 && array[i].testScore>=80)
			{
				array[i].grad='B';
			}
			//for other grade wil be C
			else
			{
				array[i].grad='C';
			}
		}
		return array;
	}
	/***
	 * this method will find the highest score from array
	 * @param array
	 * @return
	 */
	public static int highestScore(StudentClass array[])
	{
		//initilize the high score with min
		Integer high=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(high<array[i].testScore)
			{
				high=array[i].testScore;
			}
		}
		//returning the highest score
		return high;
	}
	/***
	 * this method will write the data to file in appropriate format
	 * @param array
	 * @param output
	 * @throws IOException
	 */
	public static void printData(StudentClass array[],File output) throws IOException
	{
		//filewriter used to write into file
		FileWriter fw = new FileWriter(output, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Student Name     Test Score    Grade");
		bw.newLine();
		//writting the student data
		for(int i=0;i<array.length;i++)
		{
			bw.write(String.format("%1$-20s",array[i].StudentLName+", "+array[i].studentFName)
					+"  "+array[i].testScore+"        "+array[i].grad);
			bw.newLine();
		}
		//writting the highets score
		bw.write("Highest Test Score : "+highestScore(array));
		bw.newLine();
		//write the students name who having the highest scores
		bw.write("Students having the highest test score:");
		bw.newLine();
		for(int i=0;i<array.length;i++)
		{
			if(array[i].testScore==highestScore(array))
			{
				bw.write(array[i].StudentLName+", "+array[i].studentFName);
				bw.newLine();
			}
		}
		bw.close();
	}
	/***
	 * main method using  for executing and calling the required  function
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// declared the student class object array 
		//that will hold 20 students
		StudentClass array[] = new StudentClass[20];
		//declared the input and out file
		File input = new File("C:/Rakesh/Data.txt");
		File output = new File("C:/Rakesh/Out.txt");
		//reading the data
		array=readData(array,input);
		//assigning the grade
		array=assignGrade(array);
		//writting to file
		printData(array, output);
		System.out.println("All operation completed successfully");
	}

}//end of program
