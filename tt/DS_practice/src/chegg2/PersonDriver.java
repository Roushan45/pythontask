package chegg2;
//Driver Class/Test class
public class PersonDriver {

	public static void main(String[] args) {
		// creates object of every person
		Student student  = new Student();
		Instructor instructor = new Instructor();
		Hipster hipster = new Hipster();
		
		System.out.println("\n"+student.doesForALiving()+"\n"+student.drinks());
		System.out.println("\n"+instructor.doesForALiving()+"\n"+instructor.drinks());
		System.out.println("\n"+hipster.doesForALiving()+"\n"+hipster.drinks());

	}

}
