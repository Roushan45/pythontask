#include<iostream>
#include<string>
using namespace std;
//base class Person
class Person
{
	//declared the required attributes as private
	private:
		string firstname;
		string lastname;
		string email;
	//constructors and member function
	public:
		//parameterized constructor
		Person(string f, string l, string e)
		{
			firstname=f;
			lastname=l;
			email=e;
		}
		//default constructor
		Person()
		{	}
		//accessor and mutators
		string getFirstName()
		{
			return firstname;
		}
		string getLastName()
		{
			return lastname;
		}
		string getEmail()
		{
			return email;
		}
		void setFirstName(string f)
		{
			firstname=f;
		}
		void setLastName(string l)
		{
			lastname=l;
		}
		void setEmail(string e)
		{
			email=e;
		}
};//end of person class

//Patient class derived from Person
class Patient:public Person
{
	//Patient class have its own attributes
	private:
		int patientid;
		string condition;
		//constructors and member functions
	public:
		//parameterized constructor
		Patient(string f, string l, string e, int id, string c) : Person(f,l,e)
		{
			patientid=id;
			condition=c;
		}
		//default constructor
		Patient()
		{
		}
		//accessor and mutators
		int getPatientId()
		{
			return patientid;
		}
		string getCondition()
		{
			return condition;
		}
		void setpatientId(int id)
		{
			patientid=id;
		}
		void setCondition(string c)
		{
			condition=c;
		}
};//end of patient class

//Doctor class derived from Person
class Doctor : public Person
{
	//Doctor class have its own attributes
	private:
		string specialization;
		//constructors and member functions
	public:
		Doctor(string f, string l, string e, string s) : Person(f,l,e)
		{
			specialization=s;
		}
		Doctor(){
		}
		string getSpecialization()
		{
			return specialization;
		}
		void setSpecialization(string s)
		{
			specialization=s;
		}
};//end of derived class

//main method
int main()
{
	
	//created the Ptient object
	Patient patient("PatientFirstName","PatientLastName","PatientEmail@g.com",234,"Normal");
	cout<<"Printing the patient Info....\n"<<endl;
	cout<<"First Name : "<<patient.getFirstName()<<endl;
	cout<<"Last Name : "<<patient.getLastName()<<endl;
	cout<<"Email : "<<patient.getEmail()<<endl;
	cout<<"ID : "<<patient.getPatientId()<<endl;
	cout<<"Condition : "<<patient.getCondition()<<endl;
	//created the doctor object
	Doctor doctor("DoctorFirstName","DoctorLastName","doctorEmail@g.com","Kidney");
	cout<<"\nPrinting the Doctor Info....\n"<<endl;
	cout<<"First Name : "<<doctor.getFirstName()<<endl;
	cout<<"Last Name : "<<doctor.getLastName()<<endl;
	cout<<"Email : "<<doctor.getEmail()<<endl;
	cout<<"Specialization : "<<doctor.getSpecialization()<<endl;
	return 0;
}
