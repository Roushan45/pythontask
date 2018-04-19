package cheggsept;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;
/**
 * This is generic Queue implementation using two stacks
 * that can be used with any data type
 * it supports queue operations like
 * enqueue dequeue 
 * and have some utility methods 
 * isEmpty, peek
 * @author YourName
 *
 * @param <T>
 */
public class MyQueue<T> {
	//two stack used for 
	//one for pushing and one for pop the element
    private Stack<T> s1;    
    private Stack<T> s2;    
    
    //constructor MyQueue that initialize both stacks
    public MyQueue() {
        s1 = new Stack<T>();
        s2 = new Stack<T>();
    }
   /**
    * this method is used for checking the queue
    * if no element return true 
    * @return  if no element return true  else false
    */
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    /**
     * used this method to check size of queue
     * @return summed of both stacks sizes s
     */
    public int size() {
        return s1.size() + s2.size();     
    }
    /**
     * this method for demonstating the 
     * first element in queue
     * @return first element in queue
     */
    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (s2.isEmpty()) moveTemp();
        return s2.peek();
    }
    /**
     * this method is used to move element from
     * s1 to s2 for dequeue 
     */
    private void moveTemp() {
        while (!s1.isEmpty())
            s2.push(s1.pop());
    }
    /**
     * this method for used to enqueue element
     * in the queue
     * @param item
     */
    public void enqueue(T item) {
        s1.push(item);
    }
    /**
     * this method is used to remove element from queue
     * @return dequeued element or first element in queue
     */
    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (s2.isEmpty()) moveTemp();
        return s2.pop();
    }
    /**
     * main method for demonstrating the MyQueue 
     * class 
     * @param args
     */
    public static void main(String[] args) {
    	//created queue for string data type
        MyQueue<String> q = new MyQueue<String>();
        int userChoice;
        Scanner sc = new Scanner(System.in);
        //menu driven program for MyQueue
      while(true)
      {
    	  System.out.println("1.Enqueue the elements");
    	  System.out.println("2.Dequeue the elements");
    	  System.out.println("3.Check the MyQueue Size");
    	  System.out.println("4.Check if MyQueue is empty");
    	  System.out.println("5.See the first element in MyQueue");
    	  System.out.println("6.Exit");
    	  System.out.print("Enter the choice : ");
    	  userChoice=sc.nextInt();
    	  switch(userChoice){
    	  case 1:System.out.print("Enter the element to enqueue : ");
    	  String temp = sc.next();
    	  q.enqueue(temp);
    	  break;
    	  case 2:System.out.println("Dequed Element : "+q.dequeue());
    	  break;
    	  case 3:System.out.println("Size of MyQueue : "+q.size());
    	  break;
    	  case 4:System.out.println("IS MyQueue Empty ? :"+q.isEmpty());
    	  break;
    	  case 5:System.out.println("First element in queue : "+q.peek());
    	  break;
    	  case 6:System.exit(0);
    	  default : System.out.println("Invalid entry , please try again !");break;
    	  }
      }
    }
}