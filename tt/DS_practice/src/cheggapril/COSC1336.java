package cheggapril;

import java.util.Scanner;

public class COSC1336 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//declared city name in 1D array
		String []cities={"Dallas","Houston","Beaumont","Austin","El Paso",
				"Lubbock","Texarkana","Corpus Christi"};
		//declared no of stations in the city
		//in 1D array
		int stations[]={85,100,20,75,44,59,37,39};
		//Please I apologize i have taken 10 mileage 
		//diff between cities in increasing fashion
		//like starting from Dallas to Houston 10 miles
		//Houston to Beamount 10+10 mount and so on
		//please do fill free to fill your own data
		//In this 2D array there are 7 entries per row
		int [][] mileageBetween2cities={{10,20,30,40,50,60,70},
										{10,10,20,30,40,50,60},
										{10,20,10,20,30,40,50},
										{10,20,30,10,20,30,40},
										{10,20,30,40,10,20,30},
										{10,20,30,40,50,10,20},
										{10,20,30,40,50,60,10},
										{10,20,30,40,50,60,70}};
		//printing the cities database
		System.out.println("City Mileage w/ Gas Stations ver. 1.0 (C) 2017 First Last");
		System.out.println("The cities in database are :");
		for(int i=0;i<cities.length;i++){
			System.out.println(cities[i]+"("+stations[i]+")");
		}
		//Asking for user input for
		//source and destination cities
		System.out.println("Enter the source city");
		String source=scanner.nextLine();
		System.out.println("Enter the destination city");
		String destination=scanner.nextLine();
		//if source and dest cities are same 
		//then terminating with warn message
		if(source.equalsIgnoreCase(destination)){
			System.out.println("you have enterd souce and destination same"
					+" please try with different source and destinatio city");
			scanner.close();
			return;
		}
		int soucreindex=0,destIndex=0;
		boolean sourceound=false,destFound=false;
		for(int i=0;i<cities.length;i++){
			if(source.equalsIgnoreCase(cities[i])){
				sourceound=true;
				soucreindex=i;
			}
			if(destination.equalsIgnoreCase(cities[i])){
				destFound=true;
				destIndex=i;
			}
		}
		
		//if both cities found in data base 
		//printing the output
		if(sourceound&&destFound){
			int mileage=mileageBetween2cities[soucreindex][destIndex-1];
			int noOfStations=(stations[soucreindex]+stations[destIndex])/3;
			System.out.println("Mileage: "+mileage);
			System.out.println("Estimated # of gas stations: "+noOfStations);
		}
		//if city not found in Database
		else{
			System.out.println("Either Source or Destination or both city not found in database"
					+ "please try again with listes city");
		}
		
		scanner.close();
		
	}

}
