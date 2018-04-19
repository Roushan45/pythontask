package cheggAugust;
import java.util.Date;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factory
{
	public static void main(String args[])
	{
		// creates the message queue
		Channel queue = new Channel();
		// Creates the producer and consumer threads and pass
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		// start the threads
		producer.start();
		consumer.start();
		System.out.println("Number of active threads from the given thread: " + Thread.activeCount());
	}
}