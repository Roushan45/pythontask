package cheggjune;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommunityData {
	//declare three array for storing the data
	String []column = new String[20];
	long []population=new long[20];
	float []percent = new float[20];
	int count=0;
	//this method will read data from text file
	public void readData() throws FileNotFoundException
	{
		//please do specify the file location as per ur local
		//system
		String fileName="C:/Rakesh/CommunityData.txt";
		Scanner sc = new Scanner(new File(fileName));
		int i=0;
		while(sc.hasNext()){
			String line = sc.nextLine();
			//saving header data to array
			if(i<2)
			{
				column[count]=line;
				count++;
			}
			else
			{
				//splitting the string and saving them to array
				String []temp=line.split("years");
				column[count]=temp[0]+" years";
				long l = Long.valueOf(temp[1].split(" ")[1]);
				float f=Float.valueOf(temp[1].split(" ")[2]);
				population[count]=l;
				percent[count]=f;
				count++;
			}
			i++;
		}
	}
	//this method will print the data
	public void printArrays()
	{
		//initialize the required variable
		long max=Long.MIN_VALUE,min=Long.MAX_VALUE,sum=0,avg;
		float max1=Float.MIN_NORMAL,min1=Float.MAX_VALUE,sum1=0,avg1;
		System.out.println("Community Data..\n");
		System.out.println(column[0]);
		System.out.println(column[1]);
		int i=0;
		for( i=2;i<count;i++)
		{
			//calculating max and min for each numeric data
			if(max<population[i])
				max=population[i];
			if(min>population[i])
				min=population[i];
			if(max1<percent[i])
				max1=percent[i];
			if(min1>percent[i])
				min1=percent[i];
			System.out.println(column[i]+"  "+population[i]+"  "+percent[i]);
			sum=sum+population[i];
			sum1=sum1+percent[i];
		}
		//printing the calculated data
		System.out.println("Max Population : "+max);
		System.out.println("Min Population : "+min);
		System.out.println("Average of population : "+sum/(long)i);
		System.out.println("Max Population percent : "+max1);
		System.out.println("Min Population Percent : "+min1);
		System.out.println("Average of population percent : "+sum1/(float)i);
	}
	//this method will sort the data on per population data
	public void sortData()
	{
		for(int i=2;i<count-1;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(population[j]<population[i])
				{
					long temp=population[i];
					population[i]=population[j];
					population[j]=temp;
					//after sorting the population
					//changing the another element index as
					//per sorted data
					String tempcolumn=column[i];
					column[i]=column[j];
					column[j]=tempcolumn;
					float tempPercent=percent[i];
					percent[i]=percent[j];
					percent[j]=tempPercent;
				}
			}
		}
	}
	//amin method
	public static void main(String[] args) throws FileNotFoundException {
		CommunityData cd =new CommunityData();
		//reading the data
		cd.readData();
		System.out.println("Printing unsorted data...");
		//printing the data
		cd.printArrays();
		cd.sortData();
		System.out.println("Sorting the data as per Population column...");
		System.out.println("\nPrinting sorted data...\n");
		cd.printArrays();
	}
}
