package cheggmarch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write2File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("fports_result.txt");
		PrintWriter fw = new PrintWriter(file);
		for(int i=9;i<34;i++){
			fw.append(String.valueOf(i)+"\n");
		}
		fw.close();
	}

}
