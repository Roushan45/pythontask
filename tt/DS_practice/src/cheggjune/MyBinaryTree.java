package cheggjune;
import java.util.NoSuchElementException;
/****************************************************
 * Main Class MyBinaryTree
 ****************************************************/
public class MyBinaryTree<E extends Comparable<E> >
{

       /****************************************************
        * Helper Class TreeNode
        * Note that this is a class inside the tree
        ****************************************************/
        private class TreeNode<E>
        {
          public E payload;
          public TreeNode<E> left;
          public TreeNode<E> right;
          
          public TreeNode (E data)
          {
            payload = data;
          }
        }  

  // Root of the Main tree
  private TreeNode<E> root;
  
  /************************************
   * Constructor (Default)
   ************************************/
   
  public MyBinaryTree()
  {
    root = null;
  }
  
  /*****************************************************
   * toString Method (starter method)
   *****************************************************/
 
  public String toString()
  {
    if (root == null)
    {
      return "";
    }
    
    return toString(root);
   }
  /*****************************************************
   * toString Method (recursive method)
   *****************************************************/
  private String toString(TreeNode<E> tempRoot)
  {
     if (tempRoot == null)  return "";
     
     return toString(tempRoot.left) + " " 
          + tempRoot.payload.toString() + " " 
          + toString(tempRoot.right);
          
    
  }   
  /*****************************************************
   * printSideways Method (starter method)
   ***************************************************/
public void printSideways()
{
  if (root == null)
  {
     System.out.println("Null Tree");
     return;
  }
  printSideways(root,"");
}
  /*****************************************************
   * printSideways Method (recursive method)
   ***************************************************/
private void printSideways(TreeNode<E> tempRoot, String indent)
{
  if (tempRoot == null) return;  
  printSideways(tempRoot.right,"    "+indent);
  System.out.println(indent + tempRoot.payload.toString() );
  printSideways(tempRoot.left,"    "+indent);
}
  
  
  
  /*****************************************************
   * add Method (starter method)
   ***************************************************/
  public void add(E data)
  {
    root = add(root, data);
  }
  
  /*****************************************************
   * printSideways Method (recursive method)
   ***************************************************/
  
  private TreeNode<E> add(TreeNode<E> tempRoot, E data)
  {
      if (tempRoot == null)
      {
        TreeNode<E> temp = new TreeNode<E>(data);
        return temp;
      }
      
      if (tempRoot.payload.compareTo(data) > 0)
      {
        tempRoot.left = add(tempRoot.left,data);
      }
      if (tempRoot.payload.compareTo(data) < 0)
      {
        tempRoot.right = add(tempRoot.right,data);
      }          
      return tempRoot;
  }
  /*****************************************************
   * contains Method (starter method)
   ***************************************************/
  public boolean contains(E lookFor)
  {
    // Need to implement this.
   // System.err.println("NOT IMPLEMENTED");
	  boolean find=contains(lookFor,root);
    return find;
  }  
 
  /*****************************************************
   * contains Method (recursive method)
   ***************************************************/
  public boolean contains(E lookFor, TreeNode<E> temproot)
  {
    // need this to help with above
	  if(temproot==null)
	  {
		  return false;
	  }
    return false;
  }   
  /*****************************************************
   * getMin Method (starter method)
   ***************************************************/
  public E getMin()
  {
    // Need to implement this.
    System.err.println("NOT IMPLEMENTED");
    return null;
  }  
 
  /*****************************************************
   * remove Method (recursive method)
   ***************************************************/
  public E getMin(TreeNode<E> temproot)
  {
    // need this to help with above
    return null;
  }  
  /*****************************************************
   * remove Method (starter method)
   ***************************************************/
  public void remove(E lookFor)
  {
    // Need to implement this.
    System.err.println("NOT IMPLEMENTED");
  }  
 
  /*****************************************************
   * remove Method (recursive method)
   ***************************************************/
  public void remove(E lookFor, TreeNode<E> temproot)
  {
    // need this to help with above
  }  
  
  /*****************************************************
   * size Method (starter method)
   ***************************************************/
  public int size()
  {
    // Need to implement this.
    System.err.println("NOT IMPLEMENTED");
    return 0;
  }  
 
  /*****************************************************
   * size Method (recursive method)
   ***************************************************/
  public int size(TreeNode<E> temproot)
  {
    // need this to help with above
    return 0;
  }  
     
}