#include "PersonData.cpp"
#include<iostream>
using namespace std;
//Test program
int main(void){
	//crreated object of CoustomerDtaa
	CoustomerData obj;
	//setting the values using mutators 
	//it can be done by constructor also but not 
	//instructed to use now 
	obj.setFirstName("Rohit");
	obj.setLastName("Kumar");
	obj.setAddress("2/2 New Link Road");
	obj.setCity("Pune");
	obj.setZip(444009);
	obj.setState("Maharashtra");
	obj.setPhone("+91(xxxx556788)");
	obj.setCoustomerNumber(9091);
	obj.setMailingList(true);
	
	//Printing the data using accessors
	cout<<"First Name : "<<obj.getFirstName()<<endl;
	cout<<"Last Name : "<<obj.getLastName()<<endl;
	cout<<"Address : "<<obj.getAddress()<<endl;
	cout<<"City : "<<obj.getCity()<<endl;
	cout<<"State : "<<obj.getState()<<endl;
	cout<<"ZIP : "<<obj.getZip()<<endl;
	cout<<"Phone : "<<obj.getPhone()<<endl;
	cout<<"Coustomer Number : "<<obj.getCoustomerNumber()<<endl;
	cout<<"Mailing list subscribed : "<<obj.getMailingList()<<endl;
	return 0;
}
