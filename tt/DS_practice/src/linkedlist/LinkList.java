package linkedlist;

public class LinkList {
	Node first;
	private int length ;
	LinkList (){
		first = null;
		length = 0;
	}
	public int getSize(){
		return length;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	public void addFirst(String data){
		Node _1st = new Node(data);
		_1st.setNext(first);
		first = _1st;
		length++;
	}
	public void addLast(String data){
		Node lastNode = new Node(data);
		Node current = first;
		while(current.next!=null){
			current = current.next;
		}
		lastNode.setNext(current.next);
		current.setNext(lastNode);
		length++;
	}
	public void display(){
		Node temp = first;
		if(temp==null){
			System.out.println("Empty");
			
		}
		else{
			while(temp!=null){
				System.out.println("Current name : "+temp+" |  Next name : "+ temp.getNext());
				temp = temp.next;
			}
		}
	}
	public String toString(){
		return first.toString();
	}
	public Node getFirst(){
		return first;
	}
	public void addAtSpecific(String data, int index){
		Node temp = new Node(data);
		Node current = first;
		if(index <0){
			index=0;
		}
		if(index>length){
			index = length;
		}
		if (index == 0){
			temp.setNext(first);
			first = temp;
			length++;
		}
		else 
		{
		for(int i = 0;i<index && current.next!=null;i++){
			current = current.next;
		}
//		System.out.println(current.getNext().getNext());
		temp.setNext(current.next);
		current.setNext(temp);
		length++;
		}
		
	}
	public Node removeFirst(){
		Node current = first;
		if(current==null){
			System.out.println("list empty");
			
		}
		else {
			first = first.getNext();
			length--;
		}
		return current;
	}
	public String removeAtSpecific(int index){
		Node temp = first;
		if(index<0 | index>length){
			return "invalid index";
		}
		 if(index==0){
			first = first.getNext();
			length--;
			System.exit(0);
		}
		if(index==length){
			Node p=first, q = first;
			while(q!=null){
				p=q;
				q=q.getNext();
			}
			p.setNext(null);
		}
		else {
			for(int i=0;i<index;i++){
				temp=temp.next;
			}
			temp.setNext(temp.getNext().getNext());
			length--;
			return temp.toString();
		}
		return temp.toString();
	}

	public static void main(String[] args) {
		
		LinkList ll = new LinkList();
		ll.addFirst("Roushan");
		//ll.addFirst("Amit");
		ll.addLast("Gunjan");
		ll.addAtSpecific("Rahul",0);
		System.out.println(ll.getSize());
		ll.display();
		ll.removeAtSpecific(3);
//		System.out.println("first element removed  -> "+ll.removeFirst());
		ll.display();
		System.out.println("first Element : "+ll.getFirst()+" |  size of linklist : "+ ll.getSize());

	}

}
 