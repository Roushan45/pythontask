class DLList{

	private DLLNode head;
	private int size;

	public DLList(){
		head=null;
		size=0;
	}

	public void addHead(int data){
		DLLNode node = new DLLNode(data);
		if(head==null){
			head=node;
			System.out.println("Head added");
			size++;
			return;
		}
		node.setNext(head);
		head.setPrev(node);
		head=node;
		size++;
		System.out.println("A new Hade replaced old head");
		return;
	}

	public static void main(String [] a){
		DLList list = new DLList();
		list.addHead(23);
	}
}