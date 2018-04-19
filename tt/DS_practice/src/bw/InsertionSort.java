package bw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsertionSort {
	
	
	public static void insertionsort(double [] list, int count){
		//if count will 0 then it will return to exit
		if(count<=0){
			System.out.println("No any value in list");
			return;
		}
		//insertion sort
		  double sum=0.0;
		  for (int j = 1; j < count; j++) {  
	            double key = list[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( list [i] > key ) ) {  
	                list [i+1] = list [i];  
	                i--;  
	            }  
	            list[i+1] = key;  
	        } 
		  
		  //printing the sorted array and calculating sum of its values
		  System.out.println("\nSorting array...........");
		  for(int x=0;x<count;x++){
			  System.out.print(list[x]+" ");
			  sum=sum+list[x];
		  }
		  //find the median values
			  int median1,median2;
			  //if count will one
			  if(count==1){
				  System.out.println("\nMedian of the value is "+list[0]);
				  System.out.println("Average of value is "+list[0]);
				  System.out.println("Average of smallest and largest "+list[0]);
				  return;
			  }
			  //if count will even no then in this we have 2 medians
			  if(count%2==0){
				  //finding the medians
				  median1=count/2;
				  median2=(count/2)+1;
				  //here i am using like that list[median1-1] because array index always start 
				  //with 0
				  System.out.println("\nMedian of the values "+(list[median1-1]+list[median2-1])/2);
				  System.out.println("Average of the values is "+(sum/count));
				  System.out.println("Average of smallest and largets "+(list[0]+list[count-1])/2);
				
				  return;
			  }
			  //if count will odd no then in this we have only 1 median
			  if(count%2!=0){
				  median1 = count/2;
				  System.out.println("\nMedian of the values "+list[median1]);
				  System.out.println("Average of the values is "+(sum/count));
				  System.out.println("Average of smallest and largets "+(list[0]+list[count-1])/2);
			  }
		//  }
		
	}

	public static void main(String[] args) {
		
		//creating and initializing the array of 100 elements
		//as per problem stated value can be upto 100 
		double array[]=new double[100];
		//this will track the actual no of values readen from file
		int count=0;
		System.out.println("Enetr the name of file");
		Scanner read = new Scanner(System.in);
		
		//reading the file name
		String fileName=read.nextLine();
		//loaded the file
		File file =new File(fileName);
		try {
			//reading file data using scanner
			Scanner sc=new Scanner(file);
			while(sc.hasNext()){
				//storing the value from file to array
				array[count]=sc.nextDouble();
				count++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//calling the insertion sort method
		insertionsort(array, count);
	}

}
