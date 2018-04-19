package cheggapril;
//Driver class for test Cat
public class TestCat {

	public static void main(String[] args) {
		//two objects created
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		//calling the setter methods
		cat1.setName("Pussy");
		cat1.setgender('M');
		cat2.setName("Pony");
		cat2.setgender('F');
		//printing the cat info 
		//by calling the getter methods
		System.out.println("Cat1 Name : "+cat1.getName());
		System.out.println("Cat1 Gender : "+cat1.getGender());
		System.out.println("==============================");
		System.out.println("Cat2 Name : "+cat2.getName());
		System.out.println("Cat2 Gender : "+cat2.getGender());
	}//End main Function

}//end TestCat class
