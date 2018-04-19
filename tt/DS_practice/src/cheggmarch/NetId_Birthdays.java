package cheggmarch;

import java.util.Random;

public class NetId_Birthdays {

	public static void main(String[] args) {
		//declared aeray for storing 18765 records
		int daysArray[]=new int[18765];
		//random no generation between 1 to 365
		Random rn = new Random();
		//here max=365, min =1
		int range = 365 - 1 + 1;
		//int randomNum =  rn.nextInt(range) + 1;
		for(int i=0;i<daysArray.length;i++){   //loop 1
			//stored the value in array
			daysArray[i]= rn.nextInt(range) + 1;
		}
		
		//this will find the max no of people have same days birthdays
		int noOfPeopleBornMax = 1, tempCount;
		  int maxbornOnDay = daysArray[0];
		  int temp = 0;
		  for (int i = 0; i < (daysArray.length - 1); i++) //loop2
		  {
		    temp = daysArray[i];
		    tempCount = 0;
		    for (int j = 1; j < daysArray.length; j++)  //loop 3
		    {
		      if (temp == daysArray[j])
		        tempCount++;
		    }
		    if (tempCount > noOfPeopleBornMax)
		    {
		      maxbornOnDay = temp;
		      noOfPeopleBornMax = tempCount;
		    }
		  }
		  //printing the max no of  people on born same days
		  System.out.println("The following days have "+noOfPeopleBornMax+" people \n"+maxbornOnDay);
		//this will find the min no of people have same days birthdays
		    int minbornOnDay=0;
		    int noOfPeopleBornMin=Integer.MAX_VALUE;
		    int count1=0;

		    
		        for(int i = 0; i < daysArray.length; i++) //loop4 
		        {
		             count1 = 0;

		            for(int j = 0; j < daysArray.length; j++) //loop5
		            {
		                if(daysArray[j] == daysArray[i]) 
		                {
		                    count1++;
		                }
		            }

		            if(count1 < noOfPeopleBornMin)
		            {
		                noOfPeopleBornMin = count1;
		                minbornOnDay = daysArray[i];
		            }
		        }
		        //printing the min no of people on born same days
		        System.out.println("The following days have "+noOfPeopleBornMin+" people \n"+minbornOnDay);
	}

}
