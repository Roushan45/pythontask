package cheggapril;
abstract class InjectOpCls<E>
{
	//unimplemented methods in 
	//queue  here listed imp 
	//methods you can add any
	//no of required methods
	public abstract void enqueue(E item);
	
	public abstract E dequeue();
	
	public abstract int size();
	
	public abstract boolean hasItems();
}