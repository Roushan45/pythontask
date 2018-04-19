//Player class implementation
#include "Player.h"
#include<string>
using namespace std;
//constructor
player::player(){
}
// getters
string player::getFirstName()
{
	return firstName;
}
string player::getLastName()
{
	return lastName;
}
int player::getNumber()
{
	return number;
}
//setters
void player::setFirstName(string fname){
	firstName=fname;
}
void player::setLastName(string lname)
{
	lastName=lname;
}
void player::setNumber(int no)
{
	number=no;
}

