	package cheggapril;
	
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	
	public class server {
		public static void main(String[] args) {
			try {
				ServerSocket s = new ServerSocket(7777);
				Socket ss=s.accept();
				DataInputStream dis = new DataInputStream(ss.getInputStream());
				DataOutputStream dout= new DataOutputStream(ss.getOutputStream());
				//getting the message from client
				String client = dis.readUTF();
				//displaying message which sent by client
				System.out.println(client);
				//Sending message to client
				dout.writeUTF("i got your meggage");
			} catch (Exception e) {
				System.out.println("Error "+e);
			}
			
			
		}
	
	}
