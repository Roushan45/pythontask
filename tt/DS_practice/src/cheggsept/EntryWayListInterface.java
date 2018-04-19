package cheggsept;
/**
 * <h1>Interface EntryWayListInterface</h1>
 * this is a list based interface and have all the 
 * required abstract methods to operate in lists.
 * used for insert data at tail and head 
 * and access data also from tail and head only
 * @author YourName
 *
 * @param <T> type of data 
 */
public interface EntryWayListInterface<T> {
	/**
	 * use this method to insert data at head to
	 * the list
	 * @param newEntry
	 * @return true if data inserted successfully else false
	 */
	boolean insertHead(T newEntry);
	/**
	 * use this method to insert data at tail to
	 * the list
	 * @param newEntry
	 * @return true if data inserted successfully else false
	 */
	boolean insertTail(T newEntry);
	/**
	 * use this method to delete data from head to
	 * the list
	 * @return true if data deleted successfully else false
	 */
	T deleteHead();
	/**
	 * use this method to delete data from tail to
	 * the list
	 * @return true if data deleted successfully else false
	 */
	T deleteTail();
	/**
	 * use this method to display the contents 
	 * of the list
	 */
	void display();
	/**
	 * use this method to check if entry exists
	 * in the list
	 * @param anEntry
	 * @return the index of entry
	 */
	int contains(T anEntry);
	/**
	 * use this method to check if list is 
	 * empty or not or check if list contains any entry
	 * @return true if no any data in list else false
	 */
	boolean isEmpty();
	/**
	 * use this method to check if list is full
	 * full means no next element can be inserted 
	 * to the list already exhausted max limit to insert
	 * @return true if list is full else false
	 */
	boolean isFull();
	
}
