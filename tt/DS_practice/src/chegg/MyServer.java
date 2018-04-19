package chegg;
import java.io.*;  
import java.net.*;  
public class MyServer {  
public static void main(String[] args){  
try{  
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection   
DataInputStream dis=new DataInputStream(s.getInputStream());  
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
String  str=(String)dis.readUTF();  
System.out.println(str);
int no = dis.readInt();

System.out.println("message= "+no); 
dout.writeInt(no*no);
 
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  