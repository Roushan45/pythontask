package cheggoct;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SaleAnalysis {

	public static void main(String[] args) throws FileNotFoundException {
		//declared the required variables
		double totalSale=0;
		double minSale=Double.MAX_VALUE,maxSale=Double.MIN_VALUE;
		int min_sale_week_no=-1,max_sale_week_no=-1;
		//opening the file for reading
		Scanner sc = new Scanner(new File("SalesData.txt"));
		System.out.println("Opening file for reading........");
		int count=0;
		System.out.println("Analyzing the record..............\n\n");
		//reading each of line
		while(sc.hasNextLine())
		{
			//incrementing the count that is no of 
			//weeks record in file
			count++;
			//splitting the line by ,
			String str[] = sc.nextLine().split(",");
			double sum = 0;
			//calculating the sum of days
			for(String s:str)
			{
				sum+=Double.valueOf(s);
			}
			//comapring the min sale
			//updating the week no
			if(minSale>sum)
			{
				minSale=sum;
				min_sale_week_no=count;
			}
			//comapring the max sale
			//updating the week no
			if(maxSale<sum)
			{
				maxSale=sum;
				max_sale_week_no=count;
			}
			//adding total sum
			totalSale+=sum;
			//printing the info
			System.out.println("Total sale for week "+count +" : "+sum);
			System.out.printf("Average sale for week "+count +" : %.2f\n",(sum/7.0));
		}
		//after processing all the data in files printing info
		System.out.println("Total Sales for all of the weeks : "+totalSale);
		System.out.printf("The Average weekly sales : %.2f\n",(totalSale/(double)count));
		System.out.println("The week number that had the highest amount of sales : "+max_sale_week_no);
		System.out.println("The week number that had the lowest amount of sales : "+min_sale_week_no);
		sc.close();
	}

}
