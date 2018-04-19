package empLinkedList;

public class EmpCircularLinkedList {
	
	Node head;
	Node tail;
	int size;
	public EmpCircularLinkedList(){
		head=null;
		tail=null;
		size=0;
	}

	public void add(Employee emp){
		Node newNode = new Node(emp);
		System.out.println("new Node hash code "+newNode.hashCode());
		if(head==null){
			newNode.setNext(head);
			head=newNode;
			tail=head;
			tail.setNext(head);
		}
		newNode.setNext(head);
		head=newNode;
		tail.setNext(head);
	}
	public void gettail(){
		System.out.println("tail hash code "+tail.hashCode());
		System.out.println("hash code "+System.identityHashCode(tail));
		System.out.println(tail.emp.toString());
		System.out.println();
	}
	public void listNode(){
		Node temp,temp1=head;
		System.out.println(temp1.emp.toString());
		while(true){
			temp1=temp1.getNext();
			System.out.println("---------temp 1 hash "+temp1.hashCode());
			System.out.println(temp1.emp.toString());
			if(temp1==tail){
				System.out.println("temp1 hash code "+System.identityHashCode(temp1));
				System.out.println("temp1 hash code "+temp1.hashCode());
				System.out.println(tail.getNext().emp.toString());
				break;
			}
				
			
		}
	}
	public static void main(String[] args) {
		
		EmpCircularLinkedList circularList = new EmpCircularLinkedList();
		 Employee rakesh=new Employee("Rakesh",23,"Atos");
		 Employee rahul = new Employee("Rahul",34,"EBIZ");
		 Employee amit = new Employee("Amit",36,"Oracle");
		 Employee gunjan = new Employee("Gunjan",20,"SP");
		 
		 circularList.add(gunjan);
		 circularList.add(amit);
		 circularList.add(rahul);
		 circularList.add(rakesh);
		circularList.gettail();
		 
		 circularList.listNode();

	}

}
