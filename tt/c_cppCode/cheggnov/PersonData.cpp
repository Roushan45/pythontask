#include<string>
using namespace std;
/*PersonData Class is base class*/
class PersonData{
	//private data variables
	private:
		string lastName;
		string firstName;
		string address;
		string city;
		string state;
		long zip;
		string phone;
	//getters and setters or accessors and mutators
	public:
		string getLastName() {
			return lastName;
		}
		 void setLastName(string ln) {
			 lastName = ln;
		}
		 string getFirstName() {
			return firstName;
		}
		 void setFirstName(string fn) {
			 firstName = fn;
		}
		  string getAddress() {
			return address;
		}
		  void setAddress(string add) {
			 address = add;
		}
		  string getCity() {
			return city;
		}
		  void setCity(string c) {
			 city = c;
		}
		  string getState() {
			return state;
		}
		  void setState(string st) {
			 state = st;
		}
		  long getZip() {
			return zip;
		}
		  void setZip(long z) {
			 zip = z;
		}
		  string getPhone() {
			return phone;
		}
		  void setPhone(string ph) {
			 phone = ph;
		}
	
};//end of PersonData
/*class CoustomerData derived from PersonData */
class CoustomerData:public PersonData{
	//two additional varibles
	private:
		int coustomerNumber;
		bool mailingList;
	//accessors and mutators
	public:
		int getCoustomerNumber() {
			return coustomerNumber;
		}
		  void setCoustomerNumber(int cn) {
			coustomerNumber = cn;
		}
		  bool getMailingList() {
			return mailingList;
		}
		  void setMailingList(bool ml) {
			mailingList = ml;
		}
		
};//end of CoustomerData

