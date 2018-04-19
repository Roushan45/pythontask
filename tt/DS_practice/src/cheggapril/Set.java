package cheggapril;

import java.util.ArrayList;

public class Set {
	//declared array of
	//integer elements
	private ArrayList<Integer> array;
	int size;
	int count;
	//constructor
	public Set(int no){
		//initializing instance elements
		array=new ArrayList<>(no);
		size=no;
		count=0;
	}
	
	public void add(Integer elem){
		//checking for SetSize
		//if more than size it will throw exception
		if(count>=size){
			throw new FullSetException("The set is full");
		}
		//checking for negative no
		//if negative throw Negative integer exception
		if(elem<0){
			throw new NegativeIntegerException("you have entered an negative no");
		}
		//adding element to array
		array.add(elem);
		//increasing count
		count++;
		
	}
	//contains method
	public boolean contains(Integer elem){
		//checking for negative no
				//if negative throw Negative integer exception
		if(elem<0){
			throw new NegativeIntegerException("you have entered an negative no");
		}
		return array.contains(elem);
	}
	
	public boolean remove(Integer elem){
		//checking for negative no
				//if negative throw Negative integer exception
		if(elem<0){
			throw new NegativeIntegerException("you have entered an negative no");
		}
		return array.remove(elem);
	}
}
