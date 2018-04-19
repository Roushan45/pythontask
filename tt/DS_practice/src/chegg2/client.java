package chegg2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class client {
	
	public static void main(String[] args) {
		try {
			//creating client socket using 
			//local host and port no 7777(same as sever port)
			Socket s = new Socket("localhost",7777);
			//Dataoutput stream will send message to server
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			//hello server will sended to server
			String messageToServer ="Hello Server";
			dout.writeUTF(messageToServer);
			//dataInputStream will read data from server 
			DataInputStream in = new DataInputStream(s.getInputStream());
			//storing the message in string
			String messageFromServer=in.readUTF();
			//displaying the message from client
			System.out.println(messageFromServer);
		
		} catch (Exception e) {
			System.out.println("Error :"+e);
		}
	}

}
