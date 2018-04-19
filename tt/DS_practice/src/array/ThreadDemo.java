package array;

public class ThreadDemo extends Thread {
	
	public void run(){
		for(int i =0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"\t"+i);
			try {
				//System.out.println(Thread.currentThread().getName()+" is sleeping");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		t1.setName("First");t2.setName(("second"));t3.setName("third");//t1.setPriority(MAX_PRIORITY);
		t1.start();
		t1.join(1500);
		t2.start();
		t3.start();
		
	}

}
