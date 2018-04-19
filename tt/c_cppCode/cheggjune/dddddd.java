//abstract class A
public abstract class A {
	//have one abstarct method
	abstract public void print();

}
//Concrete class b that extends abstract class A
public class B extends A{
//overirded the method from abstarct class
	@Override
	public void print() {
		System.out.println("Class B");
		
	}

}
/*abstarct class C that extends another abstarct class and implements interface I*/
public abstract class C extends A implements I{
	public void print()
	{
		System.out.println("C class");
	}
}
/*concrete class D that extends abstarct claas A*/
public class D extends A{

	@Override
	public void print() {
		System.out.println("Method of class D");
	}

}
/*concrete claas E that extends C*/
public class E extends C{

//overirded the method from abstract class
	@Override
	public void print() {
		System.out.println("Class C");
		
	}
//overirded the method from interface I
	@Override
	public void testMethod() {
		// TODO Auto-generated method stub
		
	}

}
//concrete class F that implements interface I
public class F extends D implements I{

	@Override
	public void testMethod() {
		
		
	}

}
/*Interface I */
public interface I {
//define three fields
 int year=2017;
 String country = "USA";
 String city = "New York";
 void testMethod();
		 
}
//main class
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
