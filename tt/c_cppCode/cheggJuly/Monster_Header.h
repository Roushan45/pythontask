/*This is the header class for monster that have
struct type for Monster and anothers SSRS.*/
/*As per requirent  included the dependies class*/
#include<stdlib.h>
#include <time.h>
#include<string>

#ifndef MONSTER_HEADER_H
#define MONSTER_HEADER_H

using namespace std;
/**Monster struct that will used to monster name and comcat powerl*/
struct Monster{
	string name;
	int combatPower;
};//definition

/*All reuired  method declaration as given problem statement*/
 Monster setMonster(Monster mons);
string randomNameGenerator();
bool captureAttempt(Monster mons);

/*this is the main functionality of this class used for determination
  true  and false variables*/
bool captureAttempt(Monster mons)
{
/*as per given description taken a chnce variable*/
	int Chance;
	/*power is less than 100 than then chances of capturing the moster will be greater that 1 in 2 chances*/
	 if(mons.combatPower<100)
		{
			Chance = rand() % 2 + 0;
		}
	/*if monster combat power  is grater than then the less chance to
	capture the monster and it i in 8 chnces*/
	else if(mons.combatPower>200)
		{
		//generating random no between 0 to 8
		Chance = rand() % 8 + 0;
		}

	else if(mons.combatPower>99&&mons.combatPower<200)
/*combat power greater than 99 and and less than 200
  then chance of capturing the moster is 1 in 4*/
		{
		Chance = rand() % 4 + 0;
		}
	/*checking for chance to be zero
	if yes means we captured the monster else*/
	if(Chance!=0)
		return false;
	/*if chance not zero means havent not capture the monster*/
	return true;

}
/*this method is used for setting the monster name and its variables*/
Monster setMonster(Monster mons)
{
	/*calling the randomNameGenertor */
	mons.name=randomNameGenerator();
	/*setting the compat power beteen the 200 and 450*/
	mons.combatPower=rand() % 450 + 1;
	/*after setting all the variables returning the
	 monster to caller*/
	return mons;

}

//this methos used to aggsign the name
string randomNameGenerator()

{
	srand(time(NULL));
	/*declared and initialize the instance varible at one go*/
	string names[25]={"Abra","Magikarp","Zapdos","Sanshrew","Rattata","Squariltle","Pidgety","Pikachu","Zubat","Bulbasaur","Eevee","Vulpix","Scyther","Jiggylpuff","Geodude","Onix","Staryu","Mewtwo","Oddish","Caterpie","Spearow","Charizard","Mankey","Charmander"};
	//generate rand no between 0 to 24.
	int i= rand() % 24 + 0;
	/*after random index generation returnung the name using index */
	return names[i];
}//end of method


#endif

