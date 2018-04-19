package cheggsept;

import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 * Generic implementation of Bags class which support any data type
 * @author yourName
 *
 * @param <T>
 */
public class Bags <T>{
	//ArrayList for storing the items of bag
	private ArrayList <T>bag;
	//constructor
	public Bags()
	{
		bag = new ArrayList<>();
	}
	/**
	 * method to add item to bad
	 * @param item
	 */
	public void addItem(T item)
	{
		bag.add(item);
	}
	/**
	 * method to get number of items in bag
	 * @return size of bag
	 */
	public int getNoOfItems()
	{
		return bag.size();
	}
	/**
	 * method to print as string
	 */
	public String toString()
	{
		return bag.toString();
	}
	//this method to get the item from bag
	public T getItem(int i)
	{
		if(i>=bag.size())
			throw new NoSuchElementException("Item not found");
		T obj = bag.get(i);
		bag.remove(i);
		return obj;
	}
	
}