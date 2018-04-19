package linkedlist;

public class IntNode {
	private int data;
	private IntNode nextData;
	
	IntNode(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntNode getNextData() {
		return nextData;
	}

	public void setNextData(IntNode nextData) {
		this.nextData = nextData;
	}

	@Override
	public String toString() {
		return ""+data;
	}
	
	

}
