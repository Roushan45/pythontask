package empLinkedList;
public class Node
{
	private static int ID=1000;
	Node next;
	Employee emp;
	public Node(Employee emp)
	{
		this.next=null;
		this.emp=emp;
	}
//	@Override
//	public int hashCode(){
//		
//		 return ID+1;
//	}
	public void setNext(Node node)
	{
		this.next=node;
	}
	public Node getNext()
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
}