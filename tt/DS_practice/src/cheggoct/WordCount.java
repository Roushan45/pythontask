package cheggoct;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		//name of file that have words
		String fileName = "words.txt";
		Scanner sc = new Scanner(new File(fileName));//using scanner reading the words
		ArrayList<String> words = new ArrayList<>();//adding to array list
		while(sc.hasNext())
			words.add(sc.next());
		Collections.sort(words);//sort by  alphabetically using collections
		System.out.println("Printing the total words in alphabetically ");
		for(String s : words)//printing the all words alphabetically
			System.out.println(s);
		Map<String,Integer> map = new HashMap<>();//hash map for counting the frequency
		Set<String> set = new TreeSet<>(words);//added to treeset for removing duplicate
		System.out.println("\n*******************************************");
		System.out.println("Words and and count sorted by alphabetically");
		for(String s:set){
			int no = Collections.frequency(words, s);
			 System.out.println(s + ": " + no);//printing the words and frequency
			  map.put(s, no);
		
		}
		System.out.println("\n*******************************************");
		map =sortByWordFrequency(map);//sorted the map by value
		System.out.println("Sorted by frequency of words");
		//printing the map
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  : " + entry.getValue());
        }
	}
	//helper function for sorting the map by word frequency
	  private static Map<String, Integer> sortByWordFrequency(Map<String, Integer> map) {
		  //first added all value to list
	        List<Map.Entry<String, Integer>> list =
	                new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
	        //using collections sorting value and comapring
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> object1,
	                               Map.Entry<String, Integer> object2) {
	                return (object1.getValue()).compareTo(object2.getValue());
	            }
	        });

	        Map<String, Integer> sorted = new LinkedHashMap<String, Integer>();
	        for (Map.Entry<String, Integer> entry : list) {
	            sorted.put(entry.getKey(), entry.getValue());
	        }

	        return sorted;//returning the sorted map
	    }

}
