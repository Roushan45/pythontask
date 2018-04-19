package bw;
//class LinkedList (only the first few methods are given here)
public class LinkedList{
	private Node front; private int count;
	//constructor
	public LinkedList(){ front = null; count = 0;
	}
	//add a node to the front of the linked list
	public void addToFront(String d){ Node n;
	n = new Node(d, front); front = n;
	count++;
	}
	//get the current size of the list
	public int size(){ return count;
	}
	//check if the list is empty
	public boolean isEmpty(){ return (count==0);
	}
	//clear the list
	public void clear(){ front = null; count=0;
	}
	//get the content of the first node
	public String getFrontData() {
		if (front==null)
			return "Empty list";
		else
			return front.getData();
	}
	//new method added - get the first node
	public Node getFront() {
		return front; }
	//scan the list and print contents
	public void enumerate() {
		Node curr = front; while (curr!=null) {
			System.out.print(curr);
			curr = curr.getNext(); }
		System.out.println("."); }
	//this will get only nodes with odd indices
	public void enumerateOddNodes(){
		Node curr=front;
		//taking count variable for checking the indices
		int count=0;
		System.out.println("\n printing nodes with odd indices.....\n");
		while (curr!=null) {
			//if count not equal to 0 and remainder not equal to 0 then only it prints
			//logic when we divide any no by 2 except 0 , 
			//if it will give remainder 0 then it will even no
			//when remainder is 1 then it is odd
			if(count!=0&&count%2!=0){
			System.out.print(curr);
			}
			curr = curr.getNext(); 
			count++;
			}
		System.out.println(".");
	}
	//this will get Nodes if Node contains given string
	public void listAllNodesWith(String d){
		Node curr = front; 
		System.out.println("\nprinting nodes that will contain given string "+d+"\n");
		while (curr!=null){
			//here using String API method contains
			//it will return true and print if Node contain requires string
		if(curr.getData().contains(d)){
			System.out.print(curr);
		}
			curr = curr.getNext(); }
		System.out.println("."); 
	}
}