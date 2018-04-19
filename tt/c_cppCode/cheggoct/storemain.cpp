#include<iostream>
#include "store.cpp"
//testing for shop
int main(void)
{
	
	//created one object using constructor
	store<int> object(23);
	//printing the value using getter
	std::cout<<"Stored Value "<<object.getValue();
	return 0;
}
