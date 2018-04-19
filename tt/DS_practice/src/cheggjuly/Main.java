package cheggjuly;

public class Main {
	/*Method that accepts two I type object*/
	public  static void sm( I obj1,I obj2)
	{
		//printing from object1
		System.out.println(obj1.city);
		System.out.println(obj1.year);
		System.out.println(obj1.country);
		//casting I object to D
		//and printing from it
		D d = (D)obj2;
		d.print();
	}

	public static void main(String[] args) {
		//created two I types
		I obj1 = new F();
		I obj2 = new F();
		/*calling the sm static methods with two I types of parametrs*/
		sm(obj1,obj2);

	}

}
