package cheggsept;
import java.util.Iterator;
import java.util.List;
 
public class HW1<T extends Comparable<T>> {
// Return the smallest item in the array, as defined by
// the compareTo method of the T class.  Use a "for-each" loop.
public T smallest(T[] items) {
return null;  // replace this
}
 
// Return the number of times that an item appears in a list.
// The 2nd parameter is an an instance of a class that 
// implements the built-in Java List interface.  Do NOT
// use a "for-each" loop.
public int occurrences(T item, List<T> items) {
int count = 0;
// fill this in
return count;
}
// Return true if the items in first array appear, in the same order,
// somewhere in the second array.  See the assignment write-up 
// for examples.
public boolean subSequence(T[] sub, T[] items) {
return false;  // replace this
}
// Return an object that can generate the powers of n, 
// from n^0 to n^pMax, as specified in the assignment write-up.
public static Iterable<Integer> powersOfN(int n, int pMax) {
return new Iterable<Integer>() {
// maybe some instance variables?
 
// required method of Iterable interface
public Iterator<Integer> iterator() {
return new Iterator<Integer>() {
// maybe some instance variables?
 
// required methods of Iterator interface
public boolean hasNext() { 
return false;  // replace this
}
 
public Integer next() {
return null;  // replace this
}
};
}
};
}
}