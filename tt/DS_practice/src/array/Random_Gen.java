package array;


import java.io.PrintWriter;
//Random generator class without using import
public class Random_Gen
{
	public static void main(String[] args) 
	{
		//imported print writer for writing to file
		PrintWriter writer=null;
		try {
			writer = new PrintWriter("random.txt");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		//using for loop generating 10 number
		for(int i=0;i<10;i++) {
			//generating random number between 0.0 and 1.0
			double temp=Math.random();
			//getting the first number after decimal
			/*
			 * for example 0.899004
			 * then getting 8 from that and adding to val
			 * so it will be 0.899004+8 and it will be between 1 to 10 so adding 1 
			 * will make the requirement complete
			 */
			double val=temp+Double.valueOf(String.valueOf(temp).split("\\.")[1].substring(0, 1))+1;
			//writing to file
			writer.write(val+"\n");
			//calculating total
			
			
		}
		
		//flushing the output and cosing the stream
		writer.flush();
		writer.close();
		System.out.println("Output written to file random.txt");
	}
}