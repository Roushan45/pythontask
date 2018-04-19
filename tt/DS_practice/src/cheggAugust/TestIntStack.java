package cheggAugust;

public class TestIntStack {

	public static void main(String[] args) {
		//created object of IntStack
		IntStack stack = new IntStack();
		//pushed few elements
		stack.push(23);
		stack.push(12);
		stack.push(54);
		stack.push(86);
		stack.push(65);
		stack.push(75);
		stack.push(34);
		stack.push(54);
		//removing top element
		System.out.println("removing the recemt element : "+stack.pop());
		System.out.println("Printing the list after removing \n"+stack);
		System.out.println("Stack Capacity : "+stack.getCapacity());
		System.out.println("Stack Length : "+stack.getLength());
		System.out.println("Checking if stack is emepty : "+stack.isEmpty());
		System.out.println("Increasing the capacity : "+stack.setCapacity(20));
		stack.push(56);
		stack.push(12);
		System.out.println("Printing new stack : "+stack);

	}

}
