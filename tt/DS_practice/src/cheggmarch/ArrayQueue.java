package cheggmarch;

import java.util.NoSuchElementException;

public class ArrayQueue {
	int queueSize=12;
	int queue[] = new int[queueSize];
	int size=0,front=-1,rear=-1;
	//it will enqueue the element
	public void enqueue(int n){
		if(isEmpty()){
			if(rear==-1){
				rear=0;
				front=0;
				}
			queue[rear]=n;
			size++;
			System.out.println("Added to empty queue "+n);
			return;
		}
		if(rear+1>=queueSize){
			System.out.println("sorry ,queue is full");
		}
		else if(rear+1<queueSize){
			queue[++rear]=n;
			size++;
			System.out.println("enqueued "+n);
		}
		
	}
	//it will return top element
	public int peak(){
		if(isEmpty()){
			System.out.println("Empty Queue");
			return -1;
		}
		else{
			return queue[front];
		}
	}
	public int returnFront(){
		return front;
	}
	//it will remove front element
	public int dequeue(){
		
		if(isEmpty()){
			System.out.println("No element to remove, under flow");
			throw new NoSuchElementException("Under flow");
		}
		
		else{
			int removed=queue[front];
			size--;
			if(front==rear){
				front=-1;
				rear=-1;
			}
			else
			front++;
		return removed;
		}
		
	}
	//it will return queue is empty or not
	public boolean isEmpty(){
		return size==0;
	}
	
	//Main method for testing functionality
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue();
		for(int i=0;i<8;i++){
			queue.enqueue(i);
		}
		System.out.println("@@@@@@@@peaking "+queue.peak());
		System.out.println("*********Removing "+queue.dequeue());
		System.out.println("*********Removing "+queue.dequeue());
		
		for(int i=10;i<23;i++){
			queue.enqueue(i);
		}
		while(!queue.isEmpty()){
			System.out.println("************removing "+queue.dequeue());
		}
		System.out.println("final value of front index  "+queue.returnFront());
	}

}
