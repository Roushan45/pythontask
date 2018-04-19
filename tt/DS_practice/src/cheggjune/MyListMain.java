package cheggjune;

public class MyListMain {

	public static void main(String[] args) {
		System.out.println("testing for string type element");
		//created a list type of string
		MyList<String> strlist = new MyList<>();
		//added few entries to list
		strlist.add("Java");
		strlist.add("PHP");
		strlist.add("Python");
		strlist.add("Haskell");
		//printing the list
		System.out.println("List after adding few elements ");
		System.out.println(strlist.toString());
		//removing the element from list
		//note that index of arraylist starts from 0
		
		strlist.remove(1);
		System.out.println("List after removed one variable");
		System.out.println(strlist.toString());
		//inserting at index of list
		strlist.insert(2, "C++");
		strlist.insert(3, "Erlang");
		System.out.println("List after inserting element at index");
		System.out.println(strlist.toString());
		
		System.out.println("\n\ntesting for Integer type element");
		//created a list type of String
		MyList<Integer> intlist = new MyList<>();

		//added few entries to list

		intlist.add(231);

		intlist.add(564);

		intlist.add(200);

		intlist.add(786);

		//printing the list

		System.out.println("List after adding few elements ");

		System.out.println(intlist.toString());

		//removing the element from list

		//note that index of arraylist starts from 0

		strlist.remove(1);

		System.out.println("List after removed one variable");

		System.out.println(intlist.toString());

		//inserting at index of list

		intlist.insert(2, 540);

		intlist.insert(3, 342);

		System.out.println("List after inserting element at index");

		System.out.println(intlist.toString());
		
	}

}
