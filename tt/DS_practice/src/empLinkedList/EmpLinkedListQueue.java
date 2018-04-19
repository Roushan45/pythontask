package empLinkedList;

import java.util.NoSuchElementException;

public class EmpLinkedListQueue {
	
	private int size;
	private Node head;
	private Node rear;
	public EmpLinkedListQueue(){
		head=null;
		rear=null;
		size=0;
	}
	
	public void enqueue(Employee emp){
		Node newNode = new Node(emp);
		if(head==null){
			newNode.setNext(head);
			head=newNode;
			rear=newNode;
			size++;
			System.out.println("Added to front "+emp.toString());
		}
		else{
			newNode.setNext(head);
			head=newNode;
			System.out.println("Added "+emp.toString());
			size++;

		}
			}

	public Employee dequeue(){
		if(rear==null||size<=0)
			throw new NoSuchElementException("No element in queue");
		Employee emp = rear.emp;
		
		size--;
		System.out.println("Removed "+emp.toString());
		System.out.println("Size= "+size);
		
		
		if(size<=0)
			head=null;
		Node temp=head;
		Node temp1=head;
		if(head==null)
			rear=head;
		while(temp!=null&&temp!=rear){
			temp1=temp;
			temp=temp.getNext();
		}
		if(temp1!=rear)
			rear=temp1;
		if(rear!=null)
			System.out.println("new front "+rear.emp.toString());
		else
			System.out.println("Queue got empty now");
		return emp;
	}
	public void listQueue(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.emp.toString());
			temp=temp.getNext();
		}
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	public Employee getFront(){
		if(rear==null)
			throw new NoSuchElementException("No element in queue");
		return rear.emp;
	}
	
	public void sort(){
		Node temp=head;
		Node temp1=head;
		
		while(temp!=null&&temp.getNext()!=null){
			
			if(temp.emp.getId()>temp.getNext().emp.getId()){
				
			}
				
			temp=temp.getNext();
			
		}
		
	}
	public static void main(String[] args) {
		 Employee rakesh=new Employee("Rakesh",23,"Atos");
		 Employee rahul = new Employee("Rahul",34,"EBIZ");
		 Employee amit = new Employee("Amit",36,"Oracle");
		 Employee gunjan = new Employee("Gunjan",20,"SP");
		 
		 EmpLinkedListQueue queue = new EmpLinkedListQueue();
		 queue.enqueue(rahul);
		 queue.enqueue(amit);
		 queue.enqueue(rakesh);
		 queue.enqueue(gunjan);
		 queue.listQueue();
		 while(!queue.isEmpty()){
			 queue.dequeue();
			// System.out.println("front after deque "+queue.getFront().toString());
			// System.out.println();
		 }
	//	 queue.dequeue();
		 
		
	}
}
