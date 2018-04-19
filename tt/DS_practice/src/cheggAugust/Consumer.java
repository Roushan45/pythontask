package cheggAugust;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

class Consumer implements Runnable{
	private Channel queue;
	public Consumer(Channel queue)
	{
		this.queue = queue;
	}
	public void run()
	{
		Date message;
		while(true)
		{
			try {
				// nap for awhile
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
			}
			message = queue.receive();
			if (message != null)
				System.out.println("Consumer consumed " + message);
		}
	}
}