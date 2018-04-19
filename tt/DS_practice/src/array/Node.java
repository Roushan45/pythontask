package array;
public class Node<E>
{
// Invariant of the Node class:
// 1. Each node has one reference to an E Object, stored in the instance
// variable data.
// 2. For the final node of a list, the link part is null.
// Otherwise, the link part is a reference to the
// next node of the list.
private E data;
private Node<E> link;   
/**
* Initialize a node with a specified initial data and link to the next
* node. Note that the initialLink may be the null reference,
* which indicates that the new node has nothing after it.
* @param initialData
* the initial data of this new node
* @param initialLink
* a reference to the node after this new node--this reference may be null
* to indicate that there is no node after this new node.
* @postcondition
* This node contains the specified data and link to the next node.
**/   
//Modified the constructor for new node next element always should be null
public Node(E initialData)
{
data = initialData;
link = null;
}
//modified below method to set only Node E data should be given by Node Constructor
//as it is best practices
public Node<E> addNodeAfter(Node<E> e)   
{
	this.link = e;
	return link ;
}
public Node<E> getNode(){
	return link;
}

//added a toString method
@Override
public String toString() {
	return "Node [data=" + data +"]";
}

}