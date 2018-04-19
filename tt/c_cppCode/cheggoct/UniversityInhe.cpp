#include<iostream>
#include<string>
using namespace std;
//Base class/Super class
class Person{
	//class attributes
	private:
		string firstName;
		string lastName;
		string dob;
	public:
		//default constructor
		Person(){
		}
		//param constructor
		Person(string f, string l,string d){
			firstName=f;
			lastName=l;
			dob=d;
		}
		//stters for altering values
		void setFirstName(string f){
			firstName=f;
		}
		void setLastName(string l){
			lastName=l;
		}
		void setDOB(string d){
			dob=d;
		}
		//getters for retrieves values
		string getFirstName(){
			return firstName;
		}
		string getLastName(){
			return lastName;
		}
		string getDOB(){
			return dob;
		}
		//print method for display info
		void print(){
			cout<<"First Name : "<<firstName<<"\nLast Name : "<<lastName<<"\nDOB: "<<dob<<endl;
		}
};
//sub class of Person
class Student:public Person{
	private:
		//class variables
		double gpa;
		int numberOfCredits;
		string startDate;
		string graduationDate;
	public:
		//default constructor
		Student(){
		}
		//constructor with param for first name, last name, dob, and start date
		//and calling parent class constructor
		Student(string f,string l,string d,string sd):Person(f,l,d){	
			startDate=sd;
		}
		//setters for altering
		void setGpa(double g){
			gpa=g;
		}
		void setNumberOfCredits(int n){
			numberOfCredits=n;
		}
		void setStartDate(string d){
			startDate=d;
		}
		void setGraduationDate(string d){
			graduationDate=d;
		}
		double getGpa(){
			return gpa;
		}
		//getters
		int getNumberOfCredits(){
			return numberOfCredits;
		}
		string getStartDate(){
			return startDate;
		}
		string getGraduationDate(){
			return graduationDate;
		}
		//overridden print mehod
		void print(){
			Person::print();
			cout<<"GPA : "<<gpa<<"\nNumber of Credits : "<<numberOfCredits<<"\nStart Date : "<<startDate<<"\nGraduation Date : "<<graduationDate<<endl;
		}
};
int main(){
	//created person class obj
	Person p1("Rakesh","Roushan","12/10/1990");
	//created student class obj
	Student s1("John","Smith","11/12/1991","12/10/2012");
	//using setters setting values 
	s1.setGpa(7.6);
	s1.setNumberOfCredits(5);
	s1.setGraduationDate("3/05/2017");
	//printing the info using overridden method
	p1.print();
	cout<<endl;
	s1.print();
	return 0;
}
