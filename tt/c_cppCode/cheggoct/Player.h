//Player class declaration
#include<string>
#ifndef _PLAYER_H_
#define _PLAYER_H_
class player{
	
	private://private variables
		std::string lastName;
		std::string firstName;
		int number;
	public:
		//constructor and setter/getters 
		player();
		void setNumber(int);
		void setFirstName(std::string);
		void setLastName(std::string);
		std::string getFirstName();
		std::string getLastName();
		int getNumber();
};
#endif
