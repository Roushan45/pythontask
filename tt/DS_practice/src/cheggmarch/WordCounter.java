package cheggmarch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {
	public static void countWordsLineByLine() throws FileNotFoundException{
		//File location specify full path of file or kept in same
		//directory where java file kept.
		FileReader reader = new FileReader("G:/tt/story.txt");
		//passes the loaded file in scanner object
		Scanner scan = new Scanner(reader);
		//this will track no of lines 
		int lineNo=0;	
		while(scan.hasNext()){
			lineNo++;
			//splitting the words using delimeter and storing in words array
			// "//W" will remove not word characters
			String [] words= scan.nextLine().split("\\W");
			//this for counting words per line
			int wordCount=0;
			for(int ii=0;ii<words.length;ii++){
				//please note here some , the space after . or , 
				//act as a new string(garbage) and not avoided by delimeter and 
				//these types of string has 0 in length , so filtering the 
				//string who have more than 0 length
				if(words[ii].length()!=0){
					wordCount++;
				}
			}
			//printing the no of wordcount per line
			//note blank line also will be counted as valid line
			System.out.println("Line "+lineNo+" contains "+wordCount+" words");

		}
	}
	
	//main method  for executing program
	public static void main(String[] args) throws IOException {
		//calling the above method
		countWordsLineByLine();
		
	}
}
