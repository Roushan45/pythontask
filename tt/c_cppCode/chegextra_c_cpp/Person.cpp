#include "Person.h"
#include <iostream>
Person::Person()
{
   // Init all
   _name = "";
   _phone = "";
   _address = "";
   _email = "";
   _website = "";
}
Person::Person(PersonDetails pd1)
{
   _name = pd1.name;
   _phone = pd1.phone;
   _address = pd1.address;
   _email = pd1.email;
   _website = pd1.website;
}
Person::~Person()
{}
string Person::get_name()
{
   return this->_name;
}
ostream & operator << (ostream &os, Person &p1)
{
   os << p1._name;
   return os;
}
