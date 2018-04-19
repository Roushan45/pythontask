package cheggsept;

import java.util.Random;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

public class DateTest {

	public static void main(String[] args) {
		// Three date object ceated
		Date date1;
		Date date2;
		Date date3;
		int d=0,m=0,y=0;
		String month;
		//getting the value from user
		Scanner sc = new Scanner(System.in);
		//in loop validating the user input
		while(true)
		{
			while(true)
			{
				System.out.println("Enter the Month (1 - 12) ");
				m=sc.nextInt();
				if(m<1||m>12)
				{
					System.out.println("Wrong input ! please try again ");
				}
				else 
					break;
			}
			while(true)
			{
				System.out.println("Enter the Day(1 - 31) ");
				d=sc.nextInt();
				if(d<1||d>31)
				{
					System.out.println("Wrong input ! please try again ");
				}
				else 
					break;
			}
			while(true)
			{
				System.out.println("Enter thar year (yyyy)");
				y = sc.nextInt();
				if(y<1)
				{
					System.out.println("Wrong input ! please try again ");
				}
				else 
					break;
			}
			break;
		}
		date1 = new Date(m, d,y);
		System.out.println(date1);
		while(true)
		{
			System.out.println("Enter the month name (Jan- dec)");
			month=  sc.next();
			while(true)
			{
				System.out.println("Enter the Day(1 - 31) ");
				d=sc.nextInt();
				if(d<1||d>31)
				{
					System.out.println("Wrong input ! please try again ");
				}
				else 
					break;
			}
			while(true)
			{
				System.out.println("Enter thar year (yyyy)");
				y = sc.nextInt();
				if(y<1)
				{
					System.out.println("Wrong input ! please try again ");
				}
				else 
					break;
			}
			break;
		}
		date2 = new Date(month,d,y);
		System.out.println(date2);
		while(true)
		{
			while(true){
				System.out.println("Enter the day no (1-365) ");
				d=sc.nextInt();
				if(d<1||d>365)
					System.out.println("Wrong input ! please try again ");
				else
					break;
			}
			while(true){
				System.out.println("Enter the year (yyyy)");
				y=sc.nextInt();
					if(y<1)
					{
						System.out.println("Wrong input ! please try again ");
					}
					else 
						break;
			}
			while(true)
			{
				if(!Date.isLeapYear(y)&&(d>365)){
					System.out.println("For non leap year day should be less than 365");
					System.out.println("Enter the new Day  ");
					d=sc.nextInt();
				}
				else
					break;
			}
			break;
			
		}
		
		date3 = new Date(d,y);
		System.out.println(date3);
		
		//checking for leap year
		System.out.println("Is 2017 is leap year : "+Date.isLeapYear(2017));
		System.out.println("Is 2016 is leap year : "+Date.isLeapYear(2016));
		System.out.println("Is 2000 is leap year : "+Date.isLeapYear(2000));
		System.out.println("Is 1900 is leap year : "+Date.isLeapYear(1900));
		//displaying the date
		date1.displayDate();
		date2.displayDate(0);
		date3.displayDate(0, 1);
		
		sc.close();
		
	}

}
