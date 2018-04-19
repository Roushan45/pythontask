package cheggjuly;

public class TestStack {

	public static void main(String[] args) {
		//created a stack
		StackClass stack = new StackClass();
		//pushed some values
		stack.push(34);
		stack.push(23);
		stack.push(90);
		stack.push(12);
		//created one more stack  by using constructor
		StackClass another = new StackClass(stack);
		//checking for equality of
		//it should return true 
		//because another is created using copy constructor
		System.out.println("Is stack equal to another stack : "+stack.equals(another));
		//getting the peek element
		System.out.println("Stack peek element : "+stack.peek());
		System.out.println("another Stack peek element : "+another.peek());
		
		System.out.println("Is  stack full : "+ stack.isFull());
		
		System.out.println("Removing the top element from stack : "+stack.pop());
		
		System.out.println("Checking the top element after removing : "+ stack.peek());
		
		System.out.println("Capacity of stack : "+another.getCapacity());
		//it will call toString method:
		System.out.println(stack);
	}
}
