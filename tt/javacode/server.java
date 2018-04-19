import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(7777);
			//System.out.println("server connection");
			Socket ss=s.accept();
			DataInputStream dis = new DataInputStream(ss.getInputStream());
			DataOutputStream dout= new DataOutputStream(ss.getOutputStream());
			//getting the message from client
			String number = dis.readUTF();
			//displaying message which sent by client
			System.out.println("String number read from  client : "+number);
			try{
				//converting from string to integer
				Integer.valueOf(number);
				//writting ewsponse to server
				dout.writeBoolean(true);
			}
			catch(Exception e)
			{
				//if parsing fails 
				//writting boolean values false to clent
				dout.writeBoolean(false);
			}
			//Sending message to client
			//dout.writeUTF("i got your meggage");
		} catch (Exception e) {
			System.out.println("Error "+e);
		}
		
		
	}

}
