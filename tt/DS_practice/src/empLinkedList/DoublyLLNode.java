package empLinkedList;

public class DoublyLLNode {

	DoublyLLNode next;
	DoublyLLNode prev;
	Employee emp;
	public DoublyLLNode(Employee emp)
	{
		this.prev=null;
		this.next=null;
		this.emp=emp;
	}

	public void setNext(DoublyLLNode node)
	{
		this.next=node;
	}
	public DoublyLLNode getNext()
	{
		return next;
	}
	public void setData(Employee emp)
	{
		this.emp=emp;
	}
	public Employee getData()
	{
		return this.emp;
	}
	public void setPrev(DoublyLLNode node){
		this.prev=node;
	}
	public DoublyLLNode getPrev(){
		return prev;
	}
}
