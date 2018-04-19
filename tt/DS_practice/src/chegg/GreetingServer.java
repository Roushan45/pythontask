package chegg;
// File Name GreetingServer.java
import java.net.*;
import java.io.*;

public class GreetingServer extends Thread {
   private ServerSocket serverSocket;
   
   public GreetingServer(int port) throws IOException {
      serverSocket = new ServerSocket(port);
      serverSocket.setSoTimeout(10000);
   }

//   public void run() {
//      while(true) {
//         try {
//            System.out.println("Waiting for client on port " + 
//               serverSocket.getLocalPort() + "...");
//            Socket server = serverSocket.accept();
//            
//            System.out.println("Just connected to " + server.getRemoteSocketAddress());
//            DataInputStream in = new DataInputStream(server.getInputStream());
//            
//            System.out.println(in.readUTF());
//            System.out.println(in.readInt());
//            DataOutputStream out = new DataOutputStream(server.getOutputStream());
//            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
//               + "\nGoodbye!");
//            server.close();
//            
//         }catch(SocketTimeoutException s) {
//            System.out.println("Socket timed out!");
//            break;
//         }catch(IOException e) {
//            e.printStackTrace();
//            break;
//         }
//      }
//   }
   
   public static void main(String [] args) throws IOException {
      ServerSocket server = new ServerSocket(6066);
      Socket socket =server.accept();
      DataInputStream in = new DataInputStream(socket.getInputStream());
      int no = in.readInt();
      System.out.println("client says "+no);
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      out.writeInt(45);
     // socket.close();
     // server.close();
   }
}