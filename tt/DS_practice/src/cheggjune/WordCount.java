package cheggjune;

import java.util.ArrayList;

import java.util.HashSet;

/***

 * WordCount class

 */

public class WordCount {

	//declared array list 

	private ArrayList<String> wordList;

	//constructor , in which initializing the array list

	//and adding the given words in arraylist

	public WordCount()

	{

		wordList=new ArrayList<>();

		//adding the words in array list

		wordList.add("alcazar");

		wordList.add("bawbee");

		wordList.add("chiliad");

		wordList.add("disembogue");

		wordList.add("ergometer");

		wordList.add("bawbee");

		wordList.add("chiliad");

	}

	/***

	 * countWords() will iterate over each word in arraylist

	 * and add the words in hashset

	 * @return  the no of elements in hashset

	 */

	public int countWords()

	{

		//declared a hashset

		//as per property of hash set it do not allow the 

		//duplicate element in this or it doesnt store the 

		//same value again

		HashSet<String> set = new HashSet<>();

		//iterating through arraylist

		for(String word: wordList)

		{
			//adding the words to arraylist
			set.add(word);

		}

		//returning the size of arraylist

		return set.size();

	}

	//main method for testing the implemented logic

	public static void main(String[] args) {
		//created object of above class

		WordCount object = new WordCount();

		//getting the no of elements in hashset by 

		//calling the countWords() function

		int i = object.countWords();

		//printing the data to console

		System.out.printf("Number of items in hashset : %d",i);

	}

}