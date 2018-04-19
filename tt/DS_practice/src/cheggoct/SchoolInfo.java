package cheggoct;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SchoolInfo {

	public static void main(String[] args) throws FileNotFoundException {
		//file name as given in question
		//make sure to put in same directory as program kept in
		String fileName = "NCuniversity.dat";
		//using scanner reading the file
		Scanner sc = new Scanner(new File(fileName));
		//Variables required for storing the processed data
		double best_retention_rate=Double.MIN_VALUE,worst_retention_rate=Double.MAX_VALUE;
		String best_retention_school="",worst_retention_school="";
		int low_in_state_cost=Integer.MAX_VALUE,high_in_state_cost=Integer.MIN_VALUE;
		String low_in_state_cost_school="",high_in_state_cost_school="";
		int i=0;
		//flag variable for checking if BS in CS for
		boolean flag=false;
		int t=0;
		double d=0;
		String n="";
		while(sc.hasNext())
		{
			if(i==0)
			{
				//if first value is equal to 1 then only process data for line
				if(Integer.valueOf(sc.next())==1)
					flag=true;
			}
			//reading second entry on line in cost
			if(i==1)
			{
				t=Integer.valueOf(sc.next());
			}
			//reading third entry on line 
			//it not reuires to process so not storing the data
			if(i==2)
			{
				sc.next();
			}
			//reading the fourth value //retention rate
			if(i==3)
			{
				d=Double.valueOf(sc.next());
			}
			//reading fifth value
			if(i==4)
			{
				//using nextLine to reading the school name
				n=sc.nextLine().trim();
				if(flag){
					//if missing data then not procesing
					if(d!=-9999){
						//calculating the value and storing the relevant data
						if(best_retention_rate<d)
						{
							best_retention_rate=d*100.0;
							best_retention_school=n;
						}
						if(d<worst_retention_rate)
						{
							worst_retention_rate=d*100.0;
							worst_retention_school=n;
						}
					}
					if(t!=-9999)
					{
						if(t<low_in_state_cost)
						{
							low_in_state_cost=t;
							low_in_state_cost_school=n;
						}
						if(high_in_state_cost<t)
						{
							high_in_state_cost=t;
							high_in_state_cost_school=n;
						}
					}


				}
				//resetting the count for second line
				i=0;
				flag=false;
				continue;
			}

			i++;

		}
		//finally printing the processed data
		System.out.printf("Best Retention Rate is %.2f%%  at %s \n", best_retention_rate,best_retention_school);
		System.out.printf("Worst Retention Rate is %.2f%% at %s \n", worst_retention_rate,worst_retention_school);
		System.out.printf("Lowest in state cost is $%d at %s \n", low_in_state_cost,low_in_state_cost_school);
		System.out.printf("Highest in state cost is $%d at %s \n", high_in_state_cost,high_in_state_cost_school);
		sc.close();
	}

}
