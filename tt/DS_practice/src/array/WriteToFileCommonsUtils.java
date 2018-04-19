package array;

import java.io.File;
import java.io.IOException;


public class WriteToFileCommonsUtils {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:/Rakesh/eclipse_workspace/DS_practice/src/array/demofile.txt");
		System.out.println(file.exists());
		//FileUtils.writeStringToFile(file, "Second\n", "UTF-8", true);
	}

}
