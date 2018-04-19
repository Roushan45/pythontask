#include<iostream>
#include<string>
#include <climits>
using namespace std;
//function prototype declared for required functionality
void add_ticket(string*,string*,double*,int &);
void display_ticket(string*,string*,double*,int &);
void display_ticket_by_budget(string*,string*,double*,int &);
double cheapest_price_by_event(string*,string*,double*,int &);
//main function
int main(){
	//array declared for tickets for max 100 storing
	string *team_name = new string[100];
	string *section_no = new string[100];
	double *price = new double[100];
	int index=0;//count the current ticket number
	while(1){//displaying menu
		cout<<"1)Add New Ticket\n2)Display All Tickets\n3)Display Tickets By Budget\n4)Display Cheapest Price By Event\n5)Exit\n";
		cout<<"\nSelect option : ";
		int choice;
		cin>>choice;//getting user choice
		if(choice==1)//calling add ticket 
			add_ticket(team_name,section_no,price,index);
		else if(choice==2)//calling display method
			display_ticket(team_name,section_no,price,index);
		else if(choice==3)//calling method for budget accordingly
			display_ticket_by_budget(team_name,section_no,price,index);
		else if(choice==4){//getting cheapest price for team
			double result=cheapest_price_by_event(team_name,section_no,price,index);
			if(result==-1){//if team/event not found
				cout<<"Team Name not found \n";
			}
			else
				cout<<"Cheapest Price : "<<result<<endl;
		}
		else if(choice==5)
			exit(0);//exitting the program
		else
			cout<<"Invalid choice !\n";
	}
	return 0;
}
//method implementation for add
//method accepts all array var as param and current array index
void add_ticket(string* name,string* section,double* price,int &index){
	//asking all value and storing to temp
	string n,s;
	double p;
	cout<<"Enter the Team's Name : ";
	cin>>n;
	cout<<"Enter the section number : ";
	cin>>s;
	cout<<"Enter the price : ";
	cin>>p;
	//adding to array
	name[index]=n;
	section[index]=s;
	price[index]=p;
	index++;//incrementing index
	cout<<"Ticket added successfully !!\n";
}
//method implementation for display ticket
//method accepts all array var as param and current array index
void display_ticket(string* name,string* section,double* price,int &index){
	//using for loop displaying the ticket info
	for(int i=0;i<index;i++){
		cout<<"Team Name : "<<name[i]<<endl;
		cout<<"Section number : "<<section[i]<<endl;
		cout<<"Price : "<<price[i]<<endl;
	}
}
//method implementation for display ticket by budget
//method accepts all array var as param and current array index
void display_ticket_by_budget(string* name,string* section,double* price,int &index){
	double budget;
	cout<<"Enter the budget : ";//getting the budget
	cin>>budget;
	for(int i=0;i<index;i++){
		if(budget>=price[i]){//comparing the price with budget
		cout<<"Team Name : "<<name[i]<<endl;//displaying ticket info
		cout<<"Section number : "<<section[i]<<endl;
		cout<<"Price : "<<price[i]<<endl;
		}
	}
}
//method implementation for get cheapest ticket by event
//method accepts all array var as param and current array index
double cheapest_price_by_event(string* name,string* section,double* price,int &index){
	string n;
	cout<<"Enter the name of team : ";
	cin>>n;//getting the team name
	int low=INT_MAX;//initialize the low to max
	int found=0;//found flag
	for(int i=0;i<index;i++){
		if(name[i]==n){//if team name found
			found=1;
			if(low>price[i]){//comparing the low price to price
				low=price[i];
			}
		}
	}
	if(found)
		return low;//if found returning low price
	return -1;//if team not found returning -1
}
