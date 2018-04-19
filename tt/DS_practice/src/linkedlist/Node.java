package linkedlist;

public class Node {
	Node next;
	String data;
	Node (String data){
		this.data = data;
	}
	public String toString(){
		return data;
	}
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return this.data;
	}
	public void  setNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return this.next;
	}

}
