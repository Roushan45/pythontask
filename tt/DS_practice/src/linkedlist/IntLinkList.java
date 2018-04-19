package linkedlist;

public class IntLinkList {
	private IntNode first;
	private int count;
	IntLinkList(){
		first = null;
		count = 0;
	}
	public int getCount(){
		return this.count;
	}
	
	public void addAtIndex(int data, int index){
		IntNode temp = new IntNode(data);
		IntNode current = first;
		if(index<0){
			index=0;
			
		}
		if(index>count){
			index=count;
		}
		if(index==0){
			temp.setNextData(current);
			first = temp;
			count++;
		}
		else {
			for(int i=0;i<index;i++){
				current = current.getNextData();
			}
			temp.setNextData(current.getNextData());
			current.setNextData(temp);
			
		}
	}
	public void addFirst(int data){
		IntNode temp= new IntNode(data);
//		IntNode current = first;
		temp.setNextData(first);
		first = temp;
		count++;
	}
	public void display(){
		IntNode current = first;
		while(current!=null){
			System.out.println("current data => "+ current.getData()+ "  | next data => " + current.getNextData());
			current = current.getNextData();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntLinkList ll = new IntLinkList();
		ll.addFirst(23);
		ll.addFirst(56);
		ll.addFirst(4);
		ll.display();

	}

}
