package bw;
//class LinkedListDemo1
public class LinkedListDemo1 {
public static void main(String[] args) {
LinkedList myList = new LinkedList(); myList.addToFront("Toronto");
myList.addToFront("New York"); myList.addToFront("Calgary");
myList.addToFront("Halifax");
myList.addToFront("St.John's");
System.out.println("Number of nodes in the list: "+ myList.size()); myList.enumerate();
myList.addToFront("Vancouver");
myList.addToFront("Montreal");
myList.enumerate();
//printing nodes with odd indices
myList.enumerateOddNodes();
//printing nodes that contains given string
myList.listAllNodesWith("New");
//printing nodes that contains given string
myList.listAllNodesWith("a");
}
} 