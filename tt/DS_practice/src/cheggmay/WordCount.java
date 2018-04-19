package cheggmay;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
	
	
	public static void main(String[] args) {
		System.out.println("Enter the words seprate by single space : ");
		Scanner sc = new Scanner(System.in);
		//reading user input into string
		String line=sc.nextLine();
		//seprating the words by space
		String s[]=line.split(" ");
		//getting the no of words count by adding the
		//value to the hashmap
		Map<String, Integer> hashmap = new HashMap<>();
	    for (String word : s) {
	        Integer no = hashmap.get(word);
	        no = (no == null) ? 1 : ++no;
	        hashmap.put(word, no);
	    }
	    //printing the words ans its count
	    System.out.println("Words\t\tCount\n");
		for(Map.Entry<String, Integer> entry:hashmap.entrySet()){
			System.out.println(entry.getKey()+"  \t\t"+entry.getValue());
		}
		sc.close();
	}

}
