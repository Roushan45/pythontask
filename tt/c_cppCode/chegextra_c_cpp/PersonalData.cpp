#include<iostream>

using namespace std;

class PersonalData{
	//private function declaration
	private:
		string name;
		string address;
		int age;
		string phone;
	
	public:
		//accessor and mutator functions.
		void setName(string name1);
		string getName();
		void setAge(int age1);
		int getAge();
		void setAddress(string address1);
		string getAddress();
		void setPhone(string phone1);
		string getPhone();
		//default constructor
		PersonalData(){
		}
		//parameterized constructor
		PersonalData(string name1, string address1, int age1, string phone1){
			name=name1;
			age=age1;
			address=address1;
			phone=phone1;
		} 
		
};
//member function initilization
void PersonalData::setName(string name1){
	name=name1;
}
string PersonalData::getName(){
	return name;
}
void PersonalData::setAge(int age1){
	age=age1;
}
int PersonalData::getAge(){
	return age;
}
void PersonalData::setAddress(string address1){
	address=address1;
}
string PersonalData::getAddress(){
	return address;
}
void PersonalData::setPhone(string phone1){
	phone=phone1;
}
string PersonalData::getPhone(){
	return phone;
}
//Main function
int main(){
	//Created instance using default contructor
	PersonalData myInfo;
	//setting properties user accessors
	myInfo.setName("Rakesh");
	myInfo.setAge(23);
	myInfo.setAddress("pune");
	myInfo.setPhone("755-3223-2388");
	//Printing Values
	cout<<"\n";
	cout<<"My  Info "<<endl;
	cout<<"Name :  "<<myInfo.getName()<<endl;
	cout<<"Address : "<<myInfo.getAddress()<<endl;
	cout<<"Age : "<<myInfo.getAge()<<endl;
	cout<<"Phone : "<<myInfo.getPhone()<<endl;
	cout<<"\n\n\n";
	//family memeber instance using parameterized cinstructor
	PersonalData mom("Lita","New City",45,"345-3234-3232");
	cout<<"My family member Info "<<endl;
	cout<<"Name :  "<<mom.getName()<<endl;
	cout<<"Address : "<<mom.getAddress()<<endl;
	cout<<"Age : "<<mom.getAge()<<endl;
	cout<<"Phone : "<<mom.getPhone()<<endl;
	cout<<"\n\n\n";
	//friend memeber instance using parameterized cinstructor
	PersonalData myFriend("Roy","245 street, Njersey",24,"025-3784-3282");
	cout<<"My Friend Info "<<endl;
	cout<<"Name :  "<<myFriend.getName()<<endl;
	cout<<"Address : "<<myFriend.getAddress()<<endl;
	cout<<"Age : "<<myFriend.getAge()<<endl;
	cout<<"Phone : "<<myFriend.getPhone()<<endl;
	
}
