package cheggjune;

public interface List<T> {
	void add(T element);
	void insert(int index,T element);
	T remove(int index);
	T get(int index);
	int size();	
}
