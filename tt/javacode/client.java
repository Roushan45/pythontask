import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			//creating client socket using 
			//local host and port no 7777(same as sever port)
			Socket s = new Socket("localhost",7777);
			//Dataoutput stream will send message to server
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			//whole number asking from user
			System.out.print("Enter the whole number : ");
			String messageToServer =sc.next();
			//sending message to server
			dout.writeUTF(messageToServer);
			//dataInputStream will read data from server 
			DataInputStream in = new DataInputStream(s.getInputStream());
			//storing the message in string
			//Reading boolean response message from server 
			boolean msg = in.readBoolean();
			//displaying the message from client
			System.out.println("Response read from server : "+msg);
		
		} catch (Exception e) {
			System.out.println("Error :"+e);
		}
	}

}
