package cheggmarch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WritePharases {
	static ArrayList<String> Q2(String filename) throws IOException {
		// created array list for adding modified pharases
		ArrayList<String> list = new ArrayList<>();
		String line;
		//Using file reader to open file
		FileReader fileReader = new FileReader(filename);
		//File loaded to buffer reader
		BufferedReader br  = new BufferedReader(fileReader);
		//reading line by line
		while((line=br.readLine())!=null){
			//Splitted the line and stored to array of words
			String [] wordArray=line.split(" ");
			//it will be added to array list
			String modifiedPhrase ="";
			//checking the required pre condition
			if(wordArray.length>1 && wordArray.length!=0){
				//please note that rfom here accessing array from
				//index 1 so it will not include first word
				for(int i=1;i<wordArray.length;i++){
					//appending the word to string 
					modifiedPhrase=modifiedPhrase+wordArray[i]+" ";
				}
				//adding modified phrases to arraylist
				list.add(modifiedPhrase);
			}
		}
		for(String str : list){
			System.out.println(str);
		}
		//returning the list
		return list;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*ArrayList<String> list = new ArrayList<>();
		String line;
		FileReader fileReader = new FileReader("G:/tt/pharase.txt");
		BufferedReader reader  = new BufferedReader(fileReader);
		while((line=reader.readLine())!=null){
			String [] wholeLine=line.split(" ");
			String write ="";
			if(wholeLine.length>1 && wholeLine.length!=0){
				for(int i=1;i<wholeLine.length;i++){
					write=write+wholeLine[i]+" ";
				}
				list.add(write);
			}
		}
		for(String str : list){
			System.out.println(str);
		}*/
		WritePharases.Q2("G:/tt/pharase.txt");

	}

}
