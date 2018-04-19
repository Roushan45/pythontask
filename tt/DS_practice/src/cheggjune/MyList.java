package cheggjune;

import java.util.ArrayList;
/***
 * this class implemented the methods of list
 *
 * @param <T>
 */
public class MyList<T> implements List<T>{
	//created a arraylisyt for adding the elements into it
	private ArrayList<T> al = new ArrayList<>();
	@Override
	public void add(T element) {
		al.add(element);
		
	}

	@Override
	public void insert(int index, T element) {
		al.add(index, element);
	}

	@Override
	public T remove(int index) {
		if(index<size())
			return al.remove(index);
		return null;
	}

	@Override
	public T get(int index) {
		if(index<size())
			return al.get(index);
		return null;
	}

	@Override
	public int size() {
		return al.size();
	}
//to string method
	public String toString(){
		String temp="[";
		int index=0;
		//using size and get 
		while(index<size()){
			temp=temp+al.get(index)+", ";
			index++;
		}
		temp=temp+"]";
		return temp;
	}
}
