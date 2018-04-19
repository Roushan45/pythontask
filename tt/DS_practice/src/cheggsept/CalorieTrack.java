package cheggsept;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.util.EnumSet;
import java.util.Scanner;

/**
 * This is a calorie tracker class 
 *
 */
public class CalorieTrack {

	/**
	 * This method will list calories on daily basis
	 * @param a
	 * @param b
	 * @param c
	 */
	public void listCaloriesEachDay(int a[],int b[],int c[])
	{
		//predefined days of week
		EnumSet<DayOfWeek> weekDays= EnumSet.allOf( DayOfWeek.class );
		int i=0;
		System.out.println("DAY      :     Calories ");
		for(DayOfWeek day:weekDays)
		{
			System.out.println(day.toString()+"    : "+(a[i]+b[i]+c[i]));
			i++;
		}
	}
	/**
	 * this method will list the days on which more calories taken
	 * @param a
	 * @param b
	 * @param c
	 */
	public void moreCaloriesConsumedDay(int a[],int b [],int c [])
	{
		System.out.println("\n================================================");
		System.out.println("More than 2250 calories consumed on days");
		System.out.println("DAY       :     Calories ");
		EnumSet<DayOfWeek> weekDays= EnumSet.allOf( DayOfWeek.class );
		int i=0;
		for(DayOfWeek day:weekDays)
		{
			//comapring with given max calories 2250
			if(a[i]+b[i]+c[i]>2250)
				System.out.println(day.toString()+"  : "+(a[i]+b[i]+c[i]));
			i++;
		}
	}
	/**
	 * this method will printout the average of calories 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void averageCalories(int a[],int b [],int c [])
	{
		System.out.println("\n================================================");
		System.out.println("Average calories consumed from meals  on days");
		System.out.println("DAY        :     Calories");
		EnumSet<DayOfWeek> weekDays= EnumSet.allOf( DayOfWeek.class );
		int i=0;
		for(DayOfWeek day:weekDays)
		{
			System.out.println(day.toString()+"  : "+((double)(a[i]+b[i]+c[i])/3.0));
			i++;
		}
	}
	/**
	 * Main method for reading the file and testing the program
	 * @param arg
	 */
	public static void main(String arg[])
	{
		//3 seprate arrays created
		int breakfast[] = new int [7];
		int lunch[] = new int [7];
		int dinner[] = new int [7];

		try {
			//reading file using scanner
			Scanner sc =  new Scanner(new File("D:/input.txt"));
			int i=0;
			while(sc.hasNextLine())
			{
				//Checking if line has 3 entries
				String temp[] = sc.nextLine().split(" ");
				if(temp.length<3)
				{
					System.out.println("Line no "+(i+1)+" has not enough meals");
					System.exit(1);
				}
				lunch[i]=Integer.valueOf(temp[0]);breakfast[i]=Integer.valueOf(temp[1]);
				dinner[i]=Integer.valueOf(temp[2]);
				i++;
			}
			//checking if file contains 7 entries
			if(i<7)
			{
				System.out.println("Input file has not enough have line"+
						"\n"+i +" lines found and required lines are 7");
				System.exit(1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//printing the information
		CalorieTrack obj = new CalorieTrack();
		obj.listCaloriesEachDay(breakfast, lunch, dinner);
		obj.moreCaloriesConsumedDay(breakfast, lunch, dinner);
		obj.averageCalories(breakfast, lunch, dinner);
	}
}
