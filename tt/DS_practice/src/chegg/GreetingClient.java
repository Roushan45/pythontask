package chegg;
// File Name GreetingClient.java
import java.net.*;
import java.io.*;

public class GreetingClient {

   public static void main(String [] args) {
      String serverName = "localhost";
      int port = 6066;
      try {
         System.out.println("Connecting to " + serverName + " on port " + port);
         Socket client = new Socket(serverName, port);
         
         System.out.println("Just connected to " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(client.getOutputStream());
         
        // out.writeUTF("Hello from " + client.getLocalSocketAddress());
         out.writeInt(4);
        //InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(client.getInputStream());
         
         System.out.println("Server says " + in.readInt());
         client.close();
      }catch(IOException e) {
         e.printStackTrace();
      }
   }
}