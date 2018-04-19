package cheggjune;
/***
 * class for test stack class methods
 */
public class StackClient {
//main method
	public static void main(String[] args) {
		//created stack object of Integer type
		Stack<Integer> myStack = new Stack<>();
		//adding the values to stack
		System.out.println("Adding element to stack ....\n");
		myStack.push(121);
		myStack.push(334);
		myStack.push(230);
		myStack.push(367);
		myStack.push(436);
		//checking for full of stack
		System.out.println("Is Stack full : "+ myStack.isFull());
		
		System.out.println("Top element in stack : "+myStack.peek());
		//removing from stack
		while(!myStack.isEmpty()){
			System.out.println("Popped element : "+myStack.pop());
		}

	}

}
