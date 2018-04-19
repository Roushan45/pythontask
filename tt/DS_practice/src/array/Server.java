package array;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server
{
 
    private static Socket socket;
   
    public static void main(String[] args)
    {
        try
        {
 
            int port = 28000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started and listening to the port 25000");
 
            //Server is running always. This is done using this while(true) loop
//            while(true)
//            {
                //Reading the message from the client
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String number = br.readLine();
                System.out.println("Message received from client is "+number);
 
                //Calculating the square of no and send back to client
                String returnMessage;
                try
                {
                	//parsing the string to no
                    int numberInIntFormat = Integer.parseInt(number);
                    //calculating square
                    int returnValue = numberInIntFormat*numberInIntFormat;
                    //before sending to server converted to string
                    returnMessage = String.valueOf(returnValue) + "\n";
                }
                catch(NumberFormatException e)
                {
                    //Input was not a number. Sending proper message back to client.
                    returnMessage = "Please send a proper number\n";
                }
 
                //Sending the response back to the client.
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(returnMessage);
                
                //flushed the buffer Reader
                bw.flush();
                
           // }
            serverSocket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
            	//Closed all the resources
                socket.close();
               // serverSocket.close();
            }
            catch(Exception e){}
        }
    }
}