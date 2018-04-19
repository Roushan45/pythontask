package cheggmarch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SeekPosition2 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the file name");
		String fileName = scanner.nextLine();
		System.out.println("Please inter the position from where you want to read");
		int positionStart = scanner.nextInt();
		System.out.println("please  enter the position that want to read until");
		int positionEnd =  scanner.nextInt();
		//loading the file
		File file = new File("G:/tt/pharase.txt");
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();
		//converted read data to string
		String str = new String(data, "UTF-8");
		//in loop using positionstart-1 beause index start from in string
		for(int i=positionStart-1;i<positionEnd;i++){
			//if no more extra char to read in string
			if(i>str.length()){
				System.out.println("no more extra char in file, reached end of the file");
				return;
			}
			System.out.print(str.charAt(i)+",");
		}

	}

}
