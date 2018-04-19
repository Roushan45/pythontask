package cheggjuly;

import java.util.NoSuchElementException;

public class StackClass {
	//instance variables
	int topElement,capacity,currentSize;
	int stackArray[] = new int[capacity];
	//constructor that takes capacity
	public StackClass(int capacity)
	{
		this.capacity=capacity;
		topElement=-1;
		currentSize=0;
		stackArray = new int[capacity];
	}
	//constructor without parameter
	public StackClass()
	{
		this.capacity=4;
		topElement=-1;
		currentSize=0;
		stackArray = new int[capacity];
	}
	//push function
	public void push(int n)
	{
		if(isFull())
			throw new StackOverflowError("Stack already full");
		stackArray[currentSize]=n;
		topElement++;
		currentSize++;
	}
	//empty function
	public boolean isEmpty()
	{
		return currentSize==0;
	}
	public int pop()
	{
		if(isEmpty())
			throw new NoSuchElementException("Stack under flow");
		int n= stackArray[topElement];
		topElement--;
		currentSize--;
		return n;
	}
	//it will return the top element
	public int peek()
	{
		if(isEmpty())
			throw new NoSuchElementException("Stack under flow");
		return stackArray[topElement];
	}
	//it will return the capacity
	public int getCapacity()
	{
		return this.capacity;
	}
	//it will return the size
	public int getSize()
	{
		return this.currentSize;
	}
	//check if array is full or not
	public boolean isFull()
	{
		return currentSize==capacity;
	}
	//toString function
	public String toString()
	{
		
		StringBuffer s = new StringBuffer();
		if(isEmpty())
			s.append("Empty Stack\n");
		else{
			int j=topElement;
			for(j=topElement;j>=0;j--)
			{
				s.append(stackArray[j]+"\n");
			}
		}
		
		return "Current elements in Stack \n"+s;
	}
	//this is the bonus section
	//i have implemeneted
	//check for two stack eqaulity
	public boolean equals(StackClass anotherStack)
	{
		boolean flag = true;
		if(this.getCapacity()!=anotherStack.getCapacity())
			return false;
		if(this.getSize()!=anotherStack.getSize())
			return false;
		int index=0;
		int t1[]=new int[this.getSize()];
		int t2[]=new int[anotherStack.getSize()];
		while(!this.isEmpty())
		{
			t1[index]=this.pop();
			t2[index]=anotherStack.pop();
			index++;
		}
			
		for(int i=0;i<t1.length;i++)
		{
			
				if(t1[i]!=t2[i])
				{
					flag=false;
					break;
				}
			
		}
		for(int l=t1.length-1;l>=0;l--)
		{
			this.push(t1[l]);
			anotherStack.push(t2[l]);
		}
		return flag;
	}
	//copy the stack to another stack
	public StackClass(StackClass another)
	{
		this.stackArray=new int[another.getCapacity()];
		this.topElement=-1;
		this.currentSize=0;
		this.capacity=another.capacity;
		int a[] = new int[stackArray.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=another.pop();
		}
		for(int j=a.length-1;j>=0;j--)
		{
			this.push(a[j]);
			another.push(a[j]);
		}
		
	}
	
}
