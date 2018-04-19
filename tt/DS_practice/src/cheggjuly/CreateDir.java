package cheggjuly;

import java.io.File;

public class CreateDir {
	
	public static void main(String[] args) {
		File theDir = new File("F:/Test/c.dat");

		// if the directory does not exist, create it
			if (!theDir.exists()) {
			    System.out.println("creating directory: " + theDir.getName());
			    boolean result = false;
	
			    try{
			        theDir.mkdir();
			        result = true;
			    } 
			    catch(SecurityException se){
			        //handle it
			    }        
			    if(result) {    
			        System.out.println("DIR created");  
			    }
			}

	}

}
