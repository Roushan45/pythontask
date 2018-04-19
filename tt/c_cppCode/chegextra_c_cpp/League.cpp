#include<iostream>
#include<string>
using namespace std;
//class League as per problem 3
class League
{
	//single attribute name
	private:
		 string name;
	public:
		//constructor that contains only name param
		League(string name);
		//Virtual accessor function for getName
		virtual string getName()=0;
};
//Problem 4 solution starts here
//class Team which is derived from class League
class Team : public League
{
	//nickname attribue
	private:
		string nickname;
	public:
		//constructor which accepts name and nick name
		Team(string name, string nickName);
		//accessor function that will return nickname
		string getName(){
			return nickname;
		}
		virtual int getData()=0;
		
};
//main function not asked in your statement 
//included for only compiling purpose
int main(){
	return 0;
}
