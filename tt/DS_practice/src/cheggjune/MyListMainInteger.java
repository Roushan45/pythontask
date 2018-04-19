package cheggjune;

public class MyListMainInteger {
	
	public static void main(String[] args) {
		//created a list type of string
		System.out.println("testing for string type element");
		MyList<Integer> strlist = new MyList<>();
		//added few entries to list
		strlist.add(231);
		strlist.add(564);
		strlist.add(200);
		strlist.add(786);
		//printing the list
		System.out.println("List after adding few elements ");
		System.out.println(strlist.toString());
		//removing the element from list
		//note that index of arraylist starts from 0
		
		strlist.remove(1);
		System.out.println("List after removed one variable");
		System.out.println(strlist.toString());
		//inserting at index of list
		strlist.insert(2, 540);
		strlist.insert(3, 342);
		System.out.println("List after inserting element at index");
		System.out.println(strlist.toString());
		
	}


}
