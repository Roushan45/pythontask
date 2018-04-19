class DLLNode{

	private DLLNode prev;
	private DLLNode next;
	private int data;

	public DLLNode(int data){
		prev=null;
		next=null;
		data=data;
	}

	public void setNext(DLLNode node){
		this.next=node;
	}
	public void setPrev(DLLNode node){
		this.prev=node;
	}
	public void setData(int data){
		this.data=data;
	}
	public DLLNode getNext(){
		return this.next;
	}
	public DLLNode getPrev(){
		return this.prev;
	}
	public int getData(){
		return this.data;
	}
}