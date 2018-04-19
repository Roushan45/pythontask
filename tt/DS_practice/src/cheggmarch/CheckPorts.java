package cheggmarch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CheckPorts {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//Created and array of 100 elements you can add more 
		int ports[]=new int[100];
		//it will track the no of ports in ffile
		int size=0;
		//file location
		File file =new File("C:\\Users\\Ashmit\\workspace\\DS_practice\\src\\array.txt");
		//reading the file
		FileReader reader = new FileReader(file);
		Scanner scan = new Scanner(reader);
		//reading host name from file
		String hostname=scan.next();
		while(scan.hasNext()){
			//adding element to an array
			ports[size]=scan.nextInt();
			size++;
		}
		//created boolean array of status
		boolean status[]=new boolean[size];
		//checking the port is open or not
		for(int i=0;i<size;i++){
			//it will check if socket is open
			try(Socket socket = new Socket(hostname,ports[i])){
				//if open then it will mark the status to true
				status[i]=true;
			}
			catch(Exception e){
				System.out.println("port not open");
			}
		}
		//writing the status to file
//		PrintWriter fileWriter = new PrintWriter("fports_results.txt","UTF-8");
//		fileWriter.write(hostname+"\n");
//	
//		for(int i=0;i<size;i++){
//			//if status is true then it will write open
//			if(status[i]){
//				fileWriter.append(String.valueOf(ports[i])+"   open\n");
//				//fileWriter.write(String.valueOf(ports[i])+"   open");
//			}
//			//if not true then it will write false
//			else{
//				fileWriter.append(String.valueOf(ports[i])+"   close\n");
//			}
//		}
		//printing the result to console
		System.out.println(hostname);
		for(int i=0;i<size;i++){
			//if status is true then it will print open
			if(status[i]){
				System.out.println(ports[i]+"  open");
			}
			//if not true then it will print close
			else{
				System.out.println(ports[i]+"  close");
			}
		}
		//closing the resources
		scan.close();
		//fileWriter.close();
	}

}
