	public class LinkedList{
	private Node head;
	private Node end;
	private int size;
	
	public LinkedList(){
		head=null;
		end=null;
		size=0;
	}
	public void addFirst(int data){
		Node temp = new Node(data);
		if(head==null){
			end=head;
			head=temp;
			size++;
			displayList();
			return;
		}
		temp.setNext(head);
		head=temp;
		size++;
		System.out.println("\n"+data+" added to head");
		displayList();
		
		
	}
	public int getSize(){
		return size;
	}
	public void displayList(){
		Node temp = head;
		if(head==null){
			System.out.println("empty list");
			return;
		}
		//System.out.println();
		while(temp!=null){
			System.out.print(temp.getData()+"-> ");
			temp = temp.getNext();
		}
		System.out.print("null");
		System.out.println();
	}
	public void addAtIndex(int index, int data){
		Node temp = new Node(data);
		if(index<0||index>size){
			System.out.println("Invalid index");
			return;
		}
		if(index==0){
			if(head==null){
				end=head;
				head=temp;
				displayList();
				size++;
				System.out.println(data+"  Added at index  = "+index);
				return;
			}
			addFirst(data);
			//size++;
			return;
		}
		if(index==size){
			Node temp1=head;
			Node temp2=head;
			while(temp2!=null){
				temp1=temp2;
				temp2 = temp2.getNext();
			}
			temp1.setNext(temp);
			size++;
			System.out.println(data+"  Added at index  = "+index);
			displayList();
			//System.out.println("ddsddd"+temp.getNext());
			return;
		}
		/*if(index==(size-1))
		{
			return;
		}*/
		if(index>0&&index<size){
			int pos;
			Node temp3 = head;
			Node current = head;
			
			/* while(pos<index-1){
				current=current.getNext();
				pos++;
			} */
			for( pos=1;pos<index-1;pos++){
				current = current.getNext();
			}
			temp3=current.getNext();
			current.setNext(temp);
			temp.setNext(temp3);
			size++;
			System.out.println(data+"  Added at index  = "+index);
			displayList();
			return;
		}
		//displayList();
	}
	public void delAtIndex(int index){
		Node temp1 = head;
		Node temp2 = head;
		int count=1;
		if(index<0&&index>size){
			System.out.println("Invalid index");
			return;
		}
		if(index==0){
			if(head==null){
				System.out.println("Empty linked list");
					return;
			}
			head=head.getNext();
			System.out.println(head.getData()+" is new head");
			displayList();
			return;
		}
		if(index==size){
			while(count<size-1){
				temp1 = temp1.getNext();
				count++;
				
			}
			System.out.println("removed "+temp1.getNext().getData());
			temp1.setNext(null);
			size--;
			return;
		}
		if(index>0&&index<size){
			
			while(count<index-1){
				temp1=temp1.getNext();
				count++;
			}
			System.out.println("removed "+temp1.getNext().getData());
			temp1.setNext(temp1.getNext().getNext());
			size--;
			return;
		}
		
	}
	
	public static void main(String []a){
		LinkedList list = new LinkedList();
		list.addFirst(5);
		
		list.addFirst(45);
		
		list.addFirst(32);
		
		list.addFirst(20);
		
		list.addFirst(99);
		
		list.addFirst(75);
		
		list.addAtIndex(6,101);
		
		list.addAtIndex((list.getSize()-1),33);
		
		list.addAtIndex(0,88);
		
		list.addAtIndex(4,44);
		list.addAtIndex(6,54);
		list.addAtIndex(10,666);
		
		list.delAtIndex(5);
		//list.addAtIndex(8,22);
		list.displayList();
		list.delAtIndex(2);
		list.displayList();
		System.out.println("\n Size off linked list = "+list.getSize());
	}
}