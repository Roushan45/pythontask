package cheggAugust;

import java.util.Arrays;
import java.util.NoSuchElementException;
/**
 * This is custom data structure implementation
 * of stack of integer data type.
 * Class have implemented the ILIfo interface
 * which have basic abstract methods like push pop.
 * @author User
 *
 */
public class IntStack implements ILifo{
	/*
	 * array is of type that will store the 
	 * int variables of stack
	 * size is use for tracking the actual no of 
	 * element added till now
	 */
	private int array [];
	private int size;
	
	//default constructor
	public IntStack()
	{
		//initializing the array size of 
		//10 element that can hold
		array = new int[10];
	}
	//parameterized constructor that 
	//initialize the array with custom size
	public IntStack(int initialCapacity)
	{
		array = new int[initialCapacity];
	}
	/***
	 * this method will return the actual size of array
	 * or no of elements that pushed till now.
	 * @return size
	 */
	@Override
	public int getLength() {
		
		return size;
	}
	/***
	 * this method will return true or false 
	 * based on the array size
	 * if size  is equal to 0 then it return false
	 */
	@Override
	public boolean isEmpty() {
		
		return size==0;
	}
	/***
	 * this method push the element to array
	 * and increase the size of array by 1
	 */
	@Override
	public void push(int num) {
		//before pushing the int in array
		//checking if it is full
		if(size>=array.length)
		{
			System.out.println("Capacity full, no further elements can be pushed");
			return;
		}
		//if size remain then pushing the elements in 
		//array and increasing the size
		array[size++]=num;
	}
	/***
	 * this method will return the latest element added to stack
	 * array and same time removing the element from array
	 * @return recently pushed element
	 */
	@Override
	public int pop() {
		//before poping check if element available or not
		if(isEmpty())
		{
			throw new NoSuchElementException("List is empty");
		}
		int poped = array[size-1];
		//decreasing the size of array
		size--;
		return poped;
		
	}
	/***
	 * this method will return the actual capacity of array
	 *that array can hold up to maximum.
	 */
	@Override
	public int getCapacity() {
		
		return array.length;
	}
	/***
	 * this method will used to increase the capacity of array
	 * this is also responsible copying the current array element and returning
	 * the new size of array
	 * @return new CApacity of array
	 */
	@Override
	public int setCapacity(int newCapacity) {
		array = Arrays.copyOf(array, newCapacity);
		return newCapacity;
	}
	/***
	 * this method will list out the elements of stack array
	 * last elements will printed first and so on.
	 */
	public String toString()
	{
		String stackData="";
		for(int i=0;i<size;i++)
		{
			stackData += array[i]+" ";
		}
		return stackData;
	}
	
	
}
