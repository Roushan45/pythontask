#include <cstdlib>
#include <iostream>
#include <time.h>
#include <cmath>
using namespace std;
int rollDice(void);
bool playGame(void);
int main(int argc, char** argv) {
    unsigned int seed;
    int totalLoose = 0, totalWins = 0;
    cout << "Welcome to Craps" << endl;
    cout << "Please enter a random seed: ";
    cin >> seed;
    char choice;
    //in loop playing game
  		while(1)
  		{
  			//getting redult of game status
  			bool result = playGame();
  			//if wins
  			if(result)
  			{
  				//increasing the count
  				totalWins++;
  				cout<<"You wins! Play again Y/N ?: ";
  				cin>>choice;
  				if(choice == 'n' || choice == 'N')
  				{
  					cout<<"Wins : "<<totalWins<<" Loose : "<<totalLoose;
  					break;
				  }
			  }
			  //if loose
			  else{
			  	totalLoose++;
			  	cout<<"You loose! Play again Y/N ?: ";
			  	cin>>choice;
  				if(choice == 'n' || choice == 'N')
  				{
  					cout<<"Wins : "<<totalWins<<" Loose : "<<totalLoose;
  					break;
				  }
			  }
	}
    return 0;
}
int rollDice(void)
{
    int die1, die2;
    
    die1 = rand()%6 +1;
    die2 = rand()%6+1;
    
    return(die1 + die2);
}
bool playGame(void)
{
	int noOfRolls=1;
	int point;
    while(1)
    {	
    	int firstRoll = rollDice();
    	cout<<"You Rolled : "<<firstRoll<<endl;
    	//first roll status
    	if(noOfRolls==1 && (firstRoll==7||firstRoll==11))
    		return true;
    	if(noOfRolls==1 && (firstRoll==2||firstRoll==3||firstRoll==12))
    		return false;
    	point = firstRoll;
    	cout<<"Your Point : "<<point<<endl;
    	//any other roll
    	while(1)
    	{
    		int roll = rollDice();
    		cout<<"You Roll : "<<roll<<endl;
    		//if matched to point
    		if(point==roll)
    			return true;
    		if(roll==7)
    			return false;
    		noOfRolls++;
		}
	}
	return false;
}
