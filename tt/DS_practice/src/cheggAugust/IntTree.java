package cheggAugust;

import java.util.Stack;

public class IntTree {
	
	private IntTreeNode overAllRoot;

	/*
	 * This method will return the size of tree
	 * internally in method using the stack
	 * for counting the no of node in tree
	 */
	public int getTreeSize() { 
		//if root is null returning 0
		if(overAllRoot==null)
			return 0;
		//assigning the root node value to temp node
		IntTreeNode temp = overAllRoot; 
		//initialize the count to zero
		int count = 0; 
		//taken tempStack for pushing the node
		Stack<IntTreeNode> tempStack = new Stack<IntTreeNode>();
		
		while (!tempStack.isEmpty() || temp != null) { 
			//here pushing the value to stack
			//moving the node to next
			if (temp != null) { 
				tempStack.push(temp); 
				temp = temp.leftIntNode; 
			} 
			else { 
				count++;
				//popping the node from stack
				temp = tempStack.pop(); 
				//moving to another node
				temp = temp.rightIntNode; 
			}
		}
		//returning the count of tree
		return count;
	}//end of method

	//method for inserting the new node to tree
	 public void insertNode(int number)
     {
		 //calling the insert method with
		 //root node and data
         overAllRoot = insert(overAllRoot, number);
     }//end of  method
	private IntTreeNode insert(IntTreeNode node, int number)
	{//if root node == null
		if (node == null)
			node = new IntTreeNode(number);
		else
		{
			//inserting the value in proper position
			//by comparing the existing node value
			if (number <= node.n)
				node.leftIntNode = insert(node.leftIntNode, number);
			else
				node.rightIntNode = insert(node.rightIntNode, number);
		}
		//returning the root node
		return node;
	}//end of method
	//private inner class for  node
	private class IntTreeNode{
		int n;
		//branch of tree
		private IntTreeNode leftIntNode,rightIntNode;
		//constructor of root node tree
		public IntTreeNode(int data)
		{
			this.n=data;
			leftIntNode=null;
			rightIntNode=null;
		}
	}//end of private class
//main method for executing and testing the 
	//method functionality
	public static void main(String[] args) {
		//as per given diagram in question 
		//inserting the element
		IntTree intTree = new IntTree();
		intTree.insertNode(6);
		intTree.insertNode(3);
		intTree.insertNode(2);
		intTree.insertNode(1);
		intTree.insertNode(4);
		intTree.insertNode(6);
		intTree.insertNode(4);
		intTree.insertNode(0);
		//printing the size of tree
		System.out.println("Size of given tree in Question : "+intTree.getTreeSize());
		
		//created one more tree 
		IntTree anotherTree = new IntTree();
		//added some random data to tree
		anotherTree.insertNode(6);
		anotherTree.insertNode(12);
		anotherTree.insertNode(9);
		anotherTree.insertNode(10);
		anotherTree.insertNode(26);
		anotherTree.insertNode(25);
		anotherTree.insertNode(15);
		anotherTree.insertNode(8);
		anotherTree.insertNode(7);
		anotherTree.insertNode(13);
		anotherTree.insertNode(11);
		anotherTree.insertNode(22);
		System.out.println("\nSize of another tree : "+anotherTree.getTreeSize());
		
		
	}//end of main method

}//end of class
