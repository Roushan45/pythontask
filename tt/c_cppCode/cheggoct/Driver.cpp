//For running and executing the program
//Driver.cpp
#include<string>
#include<iostream>
#include "Player.cpp"//imported player

using namespace std;
/*Main function*/
int main()
{
	//Roaster of max 11
	player *roaster[11];
	int count=0;
	string fn,ln;
	int nu,choice;
	
	cout<<"Welcome to Roster Editor!\n";
	//displaying menu for adding , viewing roaster
	while(1)
	{
		cout<<"1) Add New Player\n2) View Player(s)\n3) Exit Program\n";
		cout<<"Plese enter your selection : ";
		cin>>choice;//asking for user choice
		if(choice==1)//based on choice performing the add/view/exit
		{
			if(count>=11)//once the roaster  get full
			{			//printing all player info and terminating the program
			
				cout<<"Roaster full!!\n\n";
				cout<<"\n**IUPUI Football Roaster**"<<endl;
				for(int i=0;i<count;i++)
				{
				cout<<roaster[i]->getNumber()<<") "<<roaster[i]->getFirstName()<<" "<<roaster[i]->getLastName()<<endl;
				}
				cout<<"*****************************\n\n";
				cout<<"\nThanks for using our program - Goodbye!\n";
				exit(0);
			}
			else{
			
			cout<<endl;
			cout<<"Please enter a first name : ";
			cin>>fn;
			cout<<"Please enter a last name : ";
			cin>>ln;
			cout<<"Please enter number (1-99) : ";
			cin>>nu;
			//using index number of player array
			//and creating dynamically 
			roaster[count]=new player();
			roaster[count]->setFirstName(fn);
			roaster[count]->setLastName(ln);
			roaster[count]->setNumber(nu);
			cout<<"**Player Created**\n\n";
			count++;
		}
		}
		else if (choice==2)
		{
			cout<<"\n**IUPUI Football Roaster**"<<endl;
			for(int i=0;i<count;i++)
			{
				cout<<roaster[i]->getNumber()<<") "<<roaster[i]->getFirstName()<<" "<<roaster[i]->getLastName()<<endl;
			}
			cout<<"*****************************\n\n";
		}
		else if(choice==3)
		{//freeing the memory
			for(int i=0;i<count;i++) 
				delete roaster[i];
			cout<<"\nThanks for using our program - Goodbye!\n";
			exit(0);
		}
		else{
			cout<<"Invalid choice! Please select option #1, #2, or #3.\n"<<endl;
		}
	}
	return 0;
}
