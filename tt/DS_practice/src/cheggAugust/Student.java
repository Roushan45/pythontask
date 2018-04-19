package cheggAugust;
/**
 * Student class with name and grades
 *
 */
public class Student
{
	private String name;
	private char grade;
	
	/*
	 * Constructor for creating Student with name
	 */
	public Student(String name)
	{
		this.name = name;
	}
	/**
	 * Mutators for setting the grade
	 */
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	/**
	 * Acessor for getting the grade
	 * @return
	 */
	public char getGrade()
	{
		return this.grade;
	}
	/**
	 * Accessor for student name
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * Main function
	 */
	public static void main(String args[])
	{
		//created two student and assign them grades
		//using grade mutator
		Student s1 = new Student("Smith");
		s1.setGrade('B');
		Student s2 = new Student("Mike");
		s2.setGrade('A');
		//printing the student name and
		//grade using accessor
		System.out.println("Student Name     Student Grade\n");
		System.out.println(s1.getName()+"\t\t\t"+   s1.getGrade());
		System.out.println(s2.getName()+"\t\t\t"+  s2.getGrade());
	}
	
}