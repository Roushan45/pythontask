package array;

public class GenericNode {
	Node<String>  head;
	
	public GenericNode(){
		head=null;
	}
	//this will add element add header and return added node data
	public Node<String> addNodeafter(String s){
		Node<String> temp = new Node<String>(s);
		Node<String> current = head;
		if(head==null){
			head=temp;
			//print statement for understanding only feel free to remove
			System.out.println("below data added");
			return temp;
		}
		else{
			current.addNodeAfter(head);
			head = temp;
		}
		//print statement for understanding only feel free to remove
		System.out.println("Below data added");
		return temp;
	}
	//this will remove element rom header and return deleted node data
	public Node<String> delAfter(){
		Node<String> temp = head;
		if(head==null){
			//print statement for understanding only feel free to remove
			System.out.println("Nothing to remove");
			return null;
		}
		temp.addNodeAfter(head);
		//print statement for understanding only feel free to remove
		System.out.println("below data removed");
		return temp;
	}
	public static void main(String[] args) {
		
		GenericNode list = new GenericNode();
		
		System.out.println(list.addNodeafter("Robert"));
		System.out.println(list.addNodeafter("Perkiya"));
		System.out.println(list.delAfter());
	}

}
