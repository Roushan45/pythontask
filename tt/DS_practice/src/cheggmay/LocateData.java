package cheggmay;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class LocateData {

	//method locateData with one argument array type
	public static void locateData(Hashtable<Integer,Integer> array)
	{
		//here we need sorted data structure in order to 
		//provide the details of closest data in array
		//so copying the hashtable data to the Treemap and it 
		//will sort the data
		TreeMap<Integer,Integer> sorted=new TreeMap<>(array);
		//asking for user input
		Scanner sc = new Scanner(System.in);
		System.out.print("What key number do you want to search for?  ");
		Integer no=sc.nextInt();
		//searching for value in data
		Integer value=sorted.get(no);
		//if data found 
		if(value!=null)
			System.out.println("That is present.");
		//if data not found 
		//printing the closest data
		else{
			for(Integer entry : sorted.keySet()){
				if(entry>no)
				{
					//printing the closest key
					System.out.println("The closest key is " + entry);
					break;
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		// declare hashtable with key and value as a integer
		Hashtable<Integer, Integer> data = new Hashtable<>();
		//generating random numbers in range of 20 and 1000
		Random rand = new Random();
		for(int i=0;i<1000;i++){
			Integer r = rand.nextInt(1000-100+1)+20;
			//putting the data into hashtable with
			//same key and value
			data.put(r,r);
		}
	//running the locateData method in loop
		while(true){
			locateData(data);
		}
	}

}
