package cheggjune;

import java.util.ArrayList;
import java.util.NoSuchElementException;
/***
 * stack implementation using arraylist
 * @param <E>
 */
public class Stack<E> {

	//declared the instance variable
	private int size;
	private int top;
	//arraylist for storing the elements of stack
	private ArrayList<E> array;
	//default constructor 
	public Stack(){
		//initialize the size of stack to 10
		size=10;
		//index of top element to -1
		top=-1;
		//created the new array list of size
		array=new ArrayList<>(size);
	}
	//default constructor will initialize the array 
	//of coustom size
	public Stack(int n){
		size=n;
		top=-1;
		array=new ArrayList<>(size);
	}
	//push method for stack 
	//takes generic element as argument
	public void push(E e) {
		//if list already full throw an exception
		if(isFull())
			throw new IndexOutOfBoundsException("Stack overflow");
		//if list not full added the element to stack
	      array.add(e);
			top++;
	   }
	//pop method 
	//pop the top element from statck
	public E pop() {
		//if stack is empty will throw stack under flow exception
		if(isEmpty())
			throw new NoSuchElementException("stack under flow");
		//else remove the element from stack
	      return array.remove(top--); 
	   }
	//return the top most element from stack
	//without removing
	public E peek() {
		if(isEmpty())
			throw new NoSuchElementException("No element in stack");
	      return array.get(top);
	   }
	//method will check if stack is empty or not
	//if return true-> stack is empty
	//if return false->stack is not empty
	public boolean isEmpty() {
	      return (top == -1);
	   }
	//method will check if stack id full or not
	public boolean isFull() {
	      return (top == size - 1);
	   }
	
}
