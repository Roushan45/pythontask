package threadRunnableInterfacePackage;

public class TestThread implements Runnable{

	public static void main(String[] args) {
		TestThread t = new TestThread();
		TestThread t1 = new TestThread();
		Thread th1 = new Thread(t);
		Thread th2 = new Thread(t1);
		th1.start();th2.start();

	}
	public synchronized void print(){
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
	}
	@Override
	public void run() {
			print();
			System.out.println(Thread.currentThread().getName());
		
		
	}

	
}
