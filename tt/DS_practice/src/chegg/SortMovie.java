package chegg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SortMovie {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	//Method CriticsPick that will accept Map and return set of movie names
	//Note In Set there is no insertion order guranteed so order may suffle from top to bottom
	//and you can sort it by alphabetically but still rank will not achieved
	
	public  static Set<String> CriticsPick(Map<String, Double> movieList){
		int count=0;
		Set<String> sortedMovieName = new HashSet<>();
		Object[] a = movieList.entrySet().toArray();
		//sorting the map using Comparator interface
		Arrays.sort(a, new Comparator() {
		    
			public int compare(Object o1, Object o2) {
		        return ((Map.Entry<String, Double>) o2).getValue()
		                   .compareTo(((Map.Entry<String, Double>) o1).getValue());
		    }
		});
		System.out.println("\nhere is list of movies with top rating...\nprinting from map");
		for (Object e : a) {
			//here checking and restricting to not more than 10 movie will be added to set
			if(count<10){
				//here i am printing the top ten rating movie name from top rating to bottom rating
				//its for understanding purpose only feel free to comment or omit prinln statement
				
		    System.out.println("\n"+((Map.Entry<String, Double>) e).getKey() + " : "
		            + ((Map.Entry<String, Double>) e).getValue());
		    //adding the movie name to set
		    sortedMovieName.add(((Map.Entry<String, Double>) e).getKey());
			}
		    count++;
		}
		//returning  the set with top ten or less movie name
		return sortedMovieName;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		//here created Map which contain Movie name as a key and rating as a value
		Map<String, Double> movieList = new HashMap<String, Double>();
		//added random value to map with ratings
		movieList.put("ddlg", 10d);
		movieList.put("transformer", 7.0);
		movieList.put("teen", 9.6);
		movieList.put("rockstar", 3.9);
		movieList.put("madhoshi", 9.99);
		movieList.put("firangi", 9.98);
		movieList.put("smurfs", 6.67);
		movieList.put("war", 8.09);
		movieList.put("ronions", 9d);
		movieList.put("Time", 8.90);
		movieList.put("twirk", 8.77);
		
		//Created set 
		Set<String> set= new HashSet<>();
		//calling the critickPick method and storing the return element to set
		Set<String> moviename = CriticsPick(movieList);
		System.out.println("======================================================");
		System.out.println("\nTop Ten or less Movie .....printing from set\n");
		for(String movieName : moviename){
			//printing the movie name
			//Note In Set there is no insertion order guranteed so order may suffle means 
			//it may not print the movie name as per ranking
			//and you can sort it by alphabetically but still rank will not achieved
			System.out.println(movieName+" \n");
		}
		
		
	}

}
