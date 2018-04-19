package cheggAugust;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

class Producer implements Runnable
{
	private Channel queue;
	public Producer(Channel queue)
	{
		this.queue = queue;
	}
	public void run()
	{
		Date message;
		while (true)
		{
			try {
				// nap for awhile
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
			}
			// produces an item and enter it into the buffer
			message = new Date();
			System.out.println("Producer produced " + message);
			queue.send(message);
		}
	}
}