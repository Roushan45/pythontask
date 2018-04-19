package cheggjune;
/***
 * created race class extended the thread class
 */
public class Races extends Thread{
	//constructor that accept the string name of thread
	public Races(String name)
	{
		super(name);
	}
	//run method
	public void run()
	{
		//running the loop from to 10000
		for(int i=0;i<10000;i++)
		{
			//prinnting the current thread name
			//and value of i
			System.out.println(Thread.currentThread().getName()+" : i = "+i);
			
		}
		//whoever thread which comes after loop will be the
		//winner and exiting the application
		System.out.println("Thread : "+Thread.currentThread().getName()+"  Won");
		System.exit(1);
	}//end of run method
//main method
	public static void main(String[] args) {
		//created 10 thread instances and passes the name 
		//from 1 to 10
		Races t1 = new Races("1");
		Races t2 = new Races("2");
		Races t3 = new Races("3");
		Races t4 = new Races("4");
		Races t5 = new Races("5");
		Races t6 = new Races("6");
		Races t7 = new Races("7");
		Races t8 = new Races("8");
		Races t9 = new Races("9");
		Races t10 = new Races("10");
		//invoked each thread
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();


	}//end of main method

}//end of races class
