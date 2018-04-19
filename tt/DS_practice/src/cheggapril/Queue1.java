package cheggapril;

public class Queue1<E> extends InjectOpCls<E>{
	//here all methods overiding the methods 
	//of abstract class
	//you noticed there @Override annotation 
	//on the top of methods

	@Override
	public void enqueue(E item) {
		//Code will go  here for 
		//adding the item in Queue
		
	}

	@Override
	public E dequeue() {
		//code will here for removing the item 
		//from queue
		
		return null; //return the type E that
					//removed from queue
	}

	@Override
	public int size() {
		//code for returning size of queue
		return 0;
	}

	@Override
	public boolean hasItems() {
		//code for returning 
		//status of next element in queue
		//true if has Next item in queue
		//false if no item
		return false;
	}

}
