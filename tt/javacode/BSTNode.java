class BSTNode
{
	BSTNode left;
	BSTNode right;
	int data;
	
	public BSTNode(int data)
	{
		left=null;
		right=null;
		this.data=data;
	}
	
	public void setRight(BSTNode node)
	{
		this.right=node;
	}
	
	public BSTNode getRight()
	{
		return this.right;
	}
	
	public void setLeft(BSTNode node)
	{
		this.left=node;
	}
	
	public BSTNode getLeft()
	{
		return this.left;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}
	public int getData()
	{
		return this.data;
	}
}