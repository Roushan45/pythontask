package array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserNameAssignmentEX_ArrayList {

	public static void main(String[] args) throws FileNotFoundException {
		//ArrayList that will contains student object
		ArrayList<Student> stuList = new ArrayList<>();
		int id ;
		String name;
		int age=0;
		Scanner scan = new Scanner(new File("C:/Users/Ashmit/student.txt"));
		while(scan.hasNext()){
			//reading attribute from file one by one
			id=scan.nextInt();
			name=scan.next();
			age = scan.nextInt();
			//creating bew student
			Student newStudent = new Student();
			//assigning the attribute id, name, age
			newStudent.id=id;
			newStudent.name=name;
			newStudent.age=age;
			//adding student to arraylist
			stuList.add(newStudent);
		}
		//closing the scanner resource
		scan.close();
		//reading stored student from array list
		for(Student stu : stuList){
			//validating stu age // less than 20
			if(stu.age<20){
				System.out.println("Student ID = "+stu.id);
				System.out.println("Student Name = "+stu.name);
				System.out.println("--------------------------");
			}
		}

	}

}
