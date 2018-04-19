package cheggsept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file1 = new File("file1.txt");
		PrintWriter pw = new PrintWriter(file1);
		Random rn = new Random();
		for(int i=1;i<=50000;i++)
		{
			pw.write(rn.nextInt(50000)+"\n");
		}

	}

}
