package cheggAugust;
public interface ILifo{
	public int getLength ( );
	public boolean isEmpty ( );
	public void push(int num);
	public int pop( );
	public int getCapacity( );
	public int setCapacity (int newCapacity);
}