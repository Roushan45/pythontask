#include<iostream>
//#include "Monster.h"
#include<string>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct Monster{
	string name;
	int combatPower;
};
string randomNameGenerator();
bool captureAttempt(Monster monster);
Monster setMonster(Monster monster)
{
	monster.name=randomNameGenerator();
	monster.combatPower=rand() % 450 + 1;
}
string randomNameGenerator()
{
	/*"Zubat","Mankey","Abra","Magikarp","Eevee","Rattata","Vulpix","Scyther","Jiggylpuff","Geodude","Onix","Staryu","Mewtwo","Oddish","Caterpie","Spearow","Charizard",*/
//	srand(time(NULL));
	string name[7]={"Charmander","Bulbasaur","Squariltle","Pidgety","Pikachu","Sanshrew","Zapdos"};
	int n = rand() % 6 + 0;
	cout<<"N = "<<n<<endl;
	return name[n];
}
bool captureAttempt(Monster monster)
{
	cout<<"Monster name : "<<monster.name<<endl;
	cout<<"Monster power : "<<monster.combatPower<<endl;
	int chance=1;
	if(monster.combatPower<100)
	{
		chance = rand() % 2 + 0;
	}
	else if(monster.combatPower>99&&monster.combatPower<200)
	{
		chance = rand() % 4 + 0;
	}
	else if(monster.combatPower>200)
	{
		chance = rand() % 8 + 0;
	}
	cout<<"chance = "<<chance<<endl;
	return (chance==0);
}
int main()
{
	Monster monster;
	bool didCatch = false;
	int pokeBalls=5;
	char input[2];
	monster = setMonster(monster);
	cout<<monster.name;
	while(!didCatch && pokeBalls>0)
	{
		didCatch=captureAttempt(monster);
		pokeBalls--;
		if(!didCatch)
		{
			cout<<"you have "<<pokeBalls<<" left "<<endl;
			cout<<"broke free ! Attempt to catch again : (y/n)"<<endl;
			cin>>input;
			if(input[0]=='n')
			{
				cout<<"Got away safety "<<endl;
				break;
			}
			else{
				if(pokeBalls<1)
				{
					cout<<"You dont have enough pokeballs, got ran away and safety \n";
					break;
				}
			}
				
		}
		else if(didCatch)
		{
			cout<<"you caught the monster name : "<<monster.name<<endl;
		}
	}
	
	return 0;
}
