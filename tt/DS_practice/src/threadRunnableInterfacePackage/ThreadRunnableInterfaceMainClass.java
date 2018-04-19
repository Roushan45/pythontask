package threadRunnableInterfacePackage;
/***
 *this class will demonstrate implementation
 *of methods.
 *
 */
public class ThreadRunnableInterfaceMainClass {

	public static void main(String[] args) {
		//six singer class object created 
		SingerClass singer1 = new SingerClass();
		SingerClass singer2 = new SingerClass();
		SingerClass singer3 = new SingerClass();
		SingerClass singer4 = new SingerClass();
		SingerClass singer5 = new SingerClass();
		SingerClass singer6 = new SingerClass();
		//six thread created for above six targets
		//and started the thread by invoking the strat method
		Thread t1 = new Thread(singer1,"First Singer");
		t1.start();
		Thread t2 = new Thread(singer2,"Second Singer");
		t2.start();
		Thread t3 = new Thread(singer3,"Third Singer");
		t3.start();
		Thread t4 = new Thread(singer4,"Fourth Singer");
		t4.start();
		Thread t5 = new Thread(singer5,"Fifth Singer");
		t5.start();
		Thread t6 = new Thread(singer6,"Sixth Singer");
		t6.start();
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		// when all singer done with singing 
		//printing the info
		System.out.println("All singer singed , exiting the application");

	}

}
