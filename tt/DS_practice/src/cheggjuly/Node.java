package cheggjuly;
public class Node {
   private String data;
   private Node next;
   public Node(String d, Node n ) {
       data = d;
       next = n;
   }
   // The usual get/set methods, plus toString()
   public void setData(String d) { data = d; }
   public void setNext(Node n) { next = n; }
   public String getData() { return data; }
   public Node getNext() { return next; }
   public String toString() { return data + " --> "; }
}