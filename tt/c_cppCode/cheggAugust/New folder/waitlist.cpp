//waitlist.cpp

#include<iostream>

#include<string>

using namespace std;

//class waitlist

class waitlist{

public:

string name;

int number;

//next in queue

waitlist *next;

//constructor

waitlist(string n,int no)

{

name=n;

number=no;

}

//required methods

waitlist *add(string n,int no);

waitlist *firstGuest();

waitlist *lastGuest();

void deleteGuest();

};

//queue front and rear

waitlist *front,*rear;

//adding duest to queue

waitlist *waitlist:: add(string n,int no)

{

waitlist *temp=new waitlist(n,no);

temp->next=NULL;

if(front==NULL)

{

front=rear=temp;

rear->next=NULL;

}

else{

rear->next=temp;

rear=temp;

rear->next=NULL;

}

return front;

}

//returning first guest in queue

waitlist *waitlist::firstGuest()

{

return front;

}

waitlist *waitlist::lastGuest()

{

return rear;

}

//deleting from list

void waitlist::deleteGuest()

{

if(front==NULL)

{

cout<<"Empty Queue";

return;

}

cout<<"Enter the name of Guest : ";

string deleteName;

cin>>deleteName;
//if name equat to first guest

if(front->name==deleteName)

{

if(front==rear)

{

rear=NULL;

}

front=front->next;

cout<<"Guest "<<deleteName<<" deleted from list\n";

return;

}

waitlist *temp=NULL,*temp1=NULL;

temp=front;

temp1=front->next;

while(temp1!=NULL)

{

if(temp1->name==deleteName)

{

temp->next=temp1->next;

if(temp1==rear)

{

rear=temp;

}

cout<<"Guest "<<deleteName<<" deleted from list\n";

delete temp1;

return;

}

temp=temp1;

temp1=temp1->next;

}

cout<<"Guest Name not found in list\n";

}

int main()

{

waitlist *root;

//program menu

do{

cout<<"1.Add Guest\n";

cout<<"2.View First Guest\n";

cout<<"3.View Last Guest\n";

cout<<"4.Delete Guest\n";

cout<<"5.Exit\n";

int choice;

cin>>choice;

switch(choice)

{

case 1:{

string name;

int no;

cout<<"Enter name of guest: ";

cin>>name;

cout<<"Enter no of guest : ";

cin>>no;

root->add(name,no);

cout<<"Guest added \n";

break;

}

case 2:{

waitlist *first = root->firstGuest();

if(first==NULL)

{

cout<<"No guest found\n";

}

else{

cout<<"Guest Name : "<<first->name<<endl;

cout<<"No of guests : "<<first->number<<endl;

}

break;

}

case 3:{

waitlist *last = root->lastGuest();

if(last==NULL)

{

cout<<"No guest found\n";

}

else{

cout<<"Guest Name : "<<last->name<<endl;

cout<<"No of guests : "<<last->number<<endl;

}

break;

}

case 4:{

root->deleteGuest();

break;

}

case 5:{

exit(0);

break;

}

default :{

cout<<"Inavlid choice\n";

break;

}

}

}

while(1);

}
