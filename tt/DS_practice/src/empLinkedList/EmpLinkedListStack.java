package empLinkedList;

import java.util.NoSuchElementException;

//stack implementation
class EmpLinkedListStack
{
	Node head;
	Employee emp;
	private int size;
	private int top;
	public EmpLinkedListStack()
	{
		head=null;
		size=0;
		top=-1;
	}
	
	public void add(Employee emp)
	{
		Node newNode = new Node(emp); 
		
			//top=top+1;
			newNode.setNext(head);
			head=newNode;
			size++;
			
		}
		
	
	
	public Employee pop()
	{
		if(head==null)
			throw new NoSuchElementException("no element to pop");
		emp = head.emp;
		System.out.println(emp.getName()+" removed from list");
		head=head.getNext();
		size--;
		return emp;
	}
	public Employee getTop()
	{
		if(head==null)
			throw new NoSuchElementException("no element in Stack");
		return head.emp;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	public void listNode()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.emp.toString()+" ->");
			temp=temp.getNext();
		}
	}
	
	 public static void main(String []a)
	 {
		 Employee rakesh=new Employee("Rakesh",23,"Atos");
		 Employee rahul = new Employee("Rahul",34,"EBIZ");
		 Employee amit = new Employee("Amit",36,"Oracle");
		 Employee gunjan = new Employee("Gunjan",20,"SP");
		 EmpLinkedListStack list = new EmpLinkedListStack();
		 list.add(rakesh);
		 list.add(rahul);
		 list.add(gunjan);
		 list.add(amit);
		 list.listNode();
		 System.out.println(list.getTop().toString());
		 while(!list.isEmpty()){
			 list.pop();
		 }
	 }
}