//package cheggapril;
//public class MyOrderedLinkedList<E> extends MyAbstractList<E> {
//private Node<E> head, tail;
///**
//* Create a default list
//*/
//public MyOrderedLinkedList() {
//}
///**
//* Create a list from an array of objects
//*/
//public MyOrderedLinkedList(E[] objects) {
//super(objects);
//}
//// **************************************************************
//// **************************************************************   
///**
//* Add a new element to the list in order.
//*/
//// **************************************************************
//// **************************************************************
//  
//public void add(E e) {
//Node newNode = new Node(e);// Create a new node
//if (head == null || tail == null) { // the new node is the only node in list
//newNode.next = head; // link the new node with the head
//head = newNode; // head points to the new node
//if (tail == null) {
//tail = head;
//}
//} else if (newNode.element >= tail.element) { // new node is greater then tail
//tail.next = newNode; // Link the new with the last node
//tail = tail.next; // tail now points to the last node
//} else if (newNode.e <= head.element) { // new node is smaller then head
//newNode.next = head; // link the new node with the head
//head = newNode; // head points to the new node
//} else {
//Node current = head;
//for (int i = 1; i <= size; i++) {
//if (current.element >= e) {
//break;
//}
//current = current.next;
//}
//Node temp = current.next;
//current.next = new Node(e);
//(current.next).next = temp;
//}
//size++; // Increase size
//}
//
///**
//* Return the head element in the list
//*/
//public E getFirst() {
//if (size == 0) {
//return null;
//} else {
//return head.element;
//}
//}
///**Return the last element in the list*/
//public E getLast() {
//if (size == 0) {
//return null;
//} else {
//return tail.element;
//}
//}
//  
//// **************************************************************
//// **************************************************************   
///**Must be rewritten to add a new element to the list in order.*/
//// **************************************************************
//// **************************************************************   
//public void addFirst(E e) {
//Node<E> newNode = new Node<E>(e); // Create a new node
//newNode.next = head; // link the new node with the head
//head = newNode; // head points to the new node
//size++; // Increase list size
//if (tail == null) // the new node is the only node in list
//{
//tail = head;
//}
//}
//// **************************************************************
//// **************************************************************   
///**Must be rewritten to add a new element to the list in order.*/
//// **************************************************************
//// **************************************************************   
//public void addLast(E e) {
//Node<E> newNode = new Node<E>(e); // Create a new for element e
//if (tail == null) {
//head = tail = newNode; // The new node is the only node in list
//} else {
//tail.next = newNode; // Link the new with the last node
//tail = tail.next; // tail now points to the last node
//}
//size++; // Increase size
//}
//@Override
//// **************************************************************
//// **************************************************************   
///**
//* Must be rewritten to add a new element to the list in order.
//*/
//// **************************************************************
//// **************************************************************   
//public void add(int index, E e) {
//if (index == 0) {
//addFirst(e);
//} else if (index >= size) {
//addLast(e);
//} else {
//Node<E> current = head;
//for (int i = 1; i < index; i++) {
//current = current.next;
//}
//Node<E> temp = current.next;
//current.next = new Node<E>(e);
//(current.next).next = temp;
//size++;
//}
//}
//// **************************************************************
//// **************************************************************   
///**Must be rewritten to do nothing and return null.*/
//// **************************************************************
//// **************************************************************   
//public E removeFirst() {
//if (size == 0) {
//return null;
//} else {
//Node<E> temp = head;
//head = head.next;
//size--;
//if (head == null) {
//tail = null;
//}
//return temp.element;
//}
//}
//// **************************************************************
//// **************************************************************   
///**Must be rewritten to do nothing and return null.*/
//// **************************************************************
//// **************************************************************   
//public E removeLast() {
//if (size == 0) {
//return null;
//} else if (size == 1) {
//Node<E> temp = head;
//head = tail = null;
//size = 0;
//return temp.element;
//} else {
//Node<E> current = head;
//for (int i = 0; i < size - 2; i++) {
//current = current.next;
//}
//Node<E> temp = tail;
//tail = current;
//tail.next = null;
//size--;
//return temp.element;
//}
//}
//@Override
///**
//* Remove the element at the specified position in this list. Return the
//* element that was removed from the list.
//*/
//public E remove(int index) {
//if (index < 0 || index >= size) {
//return null;
//} else if (index == 0) {
//return removeFirst();
//} else if (index == size - 1) {
//return removeLast();
//} else {
//Node<E> previous = head;
//for (int i = 1; i < index; i++) {
//previous = previous.next;
//}
//Node<E> current = previous.next;
//previous.next = current.next;
//size--;
//return current.element;
//}
//}
//@Override
///**
//* Override toString() to return elements in the list
//*/
//public String toString() {
//StringBuilder result = new StringBuilder("[");
//Node<E> current = head;
//for (int i = 0; i < size; i++) {
//result.append(current.element);
//current = current.next;
//if (current != null) {
//result.append(", "); // Separate two elements with a comma
//} else {
//result.append("]"); // Insert the closing ] in the string
//}
//}
//return result.toString();
//}
//@Override
///**
//* Clear the list
//*/
//public void clear() {
//size = 0;
//head = tail = null;
//}
//@Override
///**
//* Return true if this list contains the element e
//*/
//public boolean contains(E e) {
//if (size == 0) {
//return false;
//} else {
//Node<E> current = head;
//while (current != null) {
//if (current.element == e) {
//return true;
//}
//current = current.next;
//}
//}
//return false;
//}
//@Override
///**
//* Return the element at the specified index
//*/
//public E get(int index) {
//if (index < 0 || index >= size) {
//return null; // Out of range
//} else if (index == 0) {
//return getFirst();
//} else if (index == size - 1) {
//return getLast();
//} else {
//Node<E> current = head.next;
//for (int i = 1; i < index; i++) {
//current = current.next;
//}
//return current.element;
//}
//}
//@Override
///**
//* Return the index of the head matching element in this list. Return -1
//* if no match.
//*/
//public int indexOf(E e) {
//if (head.element == e) {
//return 0;
//} else if (tail.element == e) {
//return size - 1;
//} else {
//Node<E> current = head.next;
//int index = 1;
//while (current != null) {
//if (current.element == e) {
//return index;
//}
//current = current.next;
//index++;
//}
//}
//return -1;
//}
//@Override
///**
//* Return the index of the last matching element in this list. Return -1
//* if no match.
//*/
//public int lastIndexOf(E e) {
//int index = -1;
//Node<E> current = head;
//for (int i = 0; i < size; i++) {
//if (current.element == e) {
//index = i;
//}
//current = current.next;
//}
//return index;
//}
//@Override
///**
//* Replace the element at the specified position in this list with the
//* specified element.
//*/
//public E set(int index, E e) {
//if (index < 0 || index > size - 1) {
//return null;
//} else {
//Node<E> current = head;
//for (int i = 0; i < index; i++) {
//current = current.next;
//}
//current.element = e;
//return current.element;
//}
//}
//@Override
///**
//* Override iterator() defined in Iterable
//*/
//public java.util.Iterator<E> iterator() {
//return new LinkedListIterator();
//}
//private void checkIndex(int index) {
//if (index < 0 || index >= size) {
//throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//  
//}
//}
//private class LinkedListIterator
//implements java.util.Iterator<E> {
//private Node<E> current = head;// Current index
//private Node<E> previous = null;
//private Node<E> previous2 = null;
//private boolean removeCalled = false;
//@Override
//public boolean hasNext() {
//return (current != null);
//}
//@Override
//public E next() {
//E e = current.element;
//previous2 = previous;
//previous = current;
//current = current.next;
//removeCalled = false;
//return e;
//}
//@Override
//public void remove() {
//
//}
//} // end of LinkedListIterator
//private static class Node<E> {
//E element;
//Node<E> next;
//public Node(E element) {
//this.element = element;
//}
//} // end of Node
//}