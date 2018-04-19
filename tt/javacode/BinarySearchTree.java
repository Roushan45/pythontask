class BinarySearchTree
{
	BSTNode root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public void insert(int data)
	{
		BSTNode newNode = new BSTNode(data);
		if(root==null)
		{
			root=newNode;
			return;
		}
		BSTNode current = root;
		BSTNode parent = null;
		
		while(true)
		{
			parent=current;
			if(data<current.data)
			{
				current=current.left;
				if(current==null)
				{
					parent.left=newNode;
					return;
				}
			}
			else
			{
				current=current.right;
				if(current==null)
				{
					parent.right=newNode;
					return;
				}
			}
		}
	}
	
	public void display(BSTNode node)
	{
		if(node!=null)
		{
			display(node.left);
			System.out.print(" "+node.data);
			display(node.right);
		}
	}
	private void preorder(BSTNode r)
     {
         if (r != null)
         {
             System.out.print(r.getData() +" ");
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }
	public static void main(String [] a)
	{
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(26);
	bst.insert(20);
	bst.insert(37);
	bst.insert(15);
	bst.insert(18);
	bst.insert(27);
	bst.insert(41);
	bst.insert(22);
	
	bst.display(bst.root);
	System.out.println();
	bst.preorder(bst.root);
	}
}