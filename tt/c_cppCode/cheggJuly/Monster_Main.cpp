/*This class will used to test the functionality of
monster header methods implementation*/
//included the headed file
#include "Monster_Header.h"
#include<iostream>
using namespace std;
/*starting of main method or can say entry
 point of of monster game app*/
int main()
{
	/*didcatch variable will store the return
	  of captureAttempt true/false*/
	bool didcatch = false;
	/*declared and initialized the pokeball
	 variable with 5 of int data type*/
	int pokeball=5;
	/*using Monster struct variable monster declared
	  with default values */
	Monster monster;
	/*input variable of char data type declared
	  that actually stores the user choice y/n*/
	char Input;
	/*from monster header calling the setMonster function with
	 monster parameter this function will assign the name and
	 combat power to monster variable*/
	monster = setMonster(monster);
	/*After monster initialization printing the monster name and
	  and its assigned combat power*/
	cout<<"A wild "<<monster.name<<" Appeard!\n"<<endl;
	cout<<monster.name<<endl;cout<<monster.combatPower<<endl;

	/*using the loop that run until we caught not caught monster or
	  have sufficient pokeball that is atleast should have 1 pokeball left */
while(pokeball>0&& !didcatch )

{
	cout<<"in while loop"<<endl;
	/*if value of didcatch variable is false then it will ask for user to retry
	  and shows the no of pokeball left*/
	if(!didcatch)
		{
		/*prints the no to console how many pokeball left*/
		cout<<endl;
			cout<<"You  have "<<pokeball<<" Pokeballs left. "<<endl;
			/*asking from user if he want to attemp again*/
			cout<<"Attempt to Capture (n/y) ? ";
			/*using cin stream storing the user input to
			  Input variable of char data type*/
			cin>>Input;
			//comparing the values with n or N
			if(Input=='n'||Input=='N')
				{
				//if user do not want to attemp againg
				//then priting the message
				cout<<"Got away safety "<<endl;
				//breaking the loop
				break;
				}
			/*if user still wants to capture the monster
			 and have atleast 1 poke ball left*/
			else{
				/*checking if user have atleast 1 pokeball left
				  in order to attempt again*/
				if(1>pokeball)
				{
					/*if not have sufficient poke ball then print out
					 the message and break the loop*/
					cout<<"You dont have any left pokeballs."<<endl;
					break;
				}
				/*if user have suffiecint pokeballs then calling the function
					and storing the valur to didcatch*/
				didcatch=captureAttempt(monster);
				/*Every time user trie then it should
				  decrease the poke balls count*/
				pokeball--;
				if(!didcatch)
				{
					cout<<"Broke free,  Attempt to catch again! "<<endl;
				}
			}
		}
		/*if monster get caught then the didcatch should true value*/
	if(didcatch)
	{
		cout<<"Gothcha ! you caught the "<<monster.name;
		system("pause");
	}

}
//at end 0 will return
return 0;

}//end of main

