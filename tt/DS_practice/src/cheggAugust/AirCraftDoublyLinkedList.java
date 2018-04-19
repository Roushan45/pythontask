package cheggAugust;
import cheggAugust.AirCraftNode;

public class AirCraftDoublyLinkedList
{
	// define the AirCraftNode with a head node
	protected AirCraftNode head = null;
	/* Default constructor and putting Aircraft value into HashMap */
	public AirCraftDoublyLinkedList()
	{
	}
	// addAirCraft() method will add a node to the linked list
	public void addAirCraft(String name, int ID, int altitude, int speed)
	{
		// create a new node of AirCraftNode by using the
		// parameterized constructor
		AirCraftNode newNode = new AirCraftNode(name, ID, altitude, speed);
		// if head is null(no values in the list)
		if (head == null)
		{
			// assign the newNode to the head(list)
			head = newNode;
		}
		// otherwise add the nodes the front
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	// deleteAircraft() accepts the name and searches for the name
	// and if found deletes the node from the list
	public boolean deleteAircraft(String name)
	{
		if(head==null)
			return false;
		// set the temp to head
		AirCraftNode temp = head;
		// set the previous node to head
		AirCraftNode prevNode = head;
		// check for the match with the head node
		if (head.getName().equalsIgnoreCase(name))
		{
			head = null;
			return true;
		}
		// if not loop through each node
		while (temp.next != null && temp.next!=head)
		{
			// search for the name in the list
			// if found, set the links to the
			if (temp.getName().equalsIgnoreCase(name))
			{
				prevNode.next = temp.next;
				temp.next.prev = prevNode;
				return true;
			}
			// move to the next node
			prevNode = temp;
			temp = temp.next;
		}
		// if the temp is the last node then try to match with the
		// name
		if (temp.next == null)
		{
			if (temp.getName().equalsIgnoreCase(name))
			{
				prevNode.next = null;
				return true;
			}
		}
		// if not found return false
		return false;
	}
}