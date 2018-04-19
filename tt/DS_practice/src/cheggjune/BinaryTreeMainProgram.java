package cheggjune;
public class BinaryTreeMainProgram
{
  public static void main(String[] args)
  {
    
    MyBinaryTree<Integer> myTree = new MyBinaryTree<Integer>();
    myTree.add(12);
    myTree.add(10);
    myTree.add(5);
    myTree.add(9);
    myTree.add(11);
    myTree.add(3);
    myTree.add(12);
    myTree.add(13);
    myTree.add(14);
    myTree.add(15);
    
    System.out.print("The tree contains : ");
    System.out.println(myTree) ;
    System.out.println();
    System.out.println("The tree looks like : ");
    myTree.printSideways();
    
    // New Code Part 1
    System.out.println("******* New Code Part 1 *************");
    System.out.print("Does the tree contian 9? : ");
    System.out.println(myTree.contains(9) );
    System.out.print("Does the tree contian 20? : ");
    System.out.println(myTree.contains(20) );    
    // New Code Part 2
    System.out.println("******* New Code Part 2 *************");    
    System.out.print("The minimum value is ? : ");
    System.out.println(myTree.getMin() );
    // New Code Part 3
    System.out.println("******* New Code Part 3 *************");    
    System.out.print("Removing  : ");
    myTree.remove(13);
    System.out.println(myTree);
    System.out.println("The tree looks like : ");
    myTree.printSideways();
    // New Code Part 4
    System.out.println("******* New Code Part 4 *************");    
    System.out.print("The size of the tree is  : " + myTree.size() );
  
  }
}