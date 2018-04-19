#ifndef PERSON_H_
#define PERSON_H_
#include <string>
using namespace std;

struct PersonDetails
{
   string name, phone, address, email, website;
};
class Person
{
private:
   string _name;
   string _phone;
   string _address;
   string _email;
   string _website;
public:
   Person();
   Person(PersonDetails p1);
   virtual ~Person();
   string get_name();
   friend ostream & operator << (ostream &, Person &);
};
#endif /* PERSON_H_ */
