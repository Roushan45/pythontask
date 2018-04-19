#include <iostream>
#include <vector>
using namespace std;
int main()
{
vector<int> jerseyNumber;
vector<int> rating;
int temp;
for(int i = 1; i <= 5; i++)
{
cout<<"Enter player "<<i<<"'s jersey number: " << endl;
cin>>temp;
jerseyNumber.push_back(temp);
cout<<"Enter player "<<i<<"'s rating: " << endl;
cin>>temp;
rating.push_back(temp);
cout<<endl;
}
cout<<"\nROSTER"<<endl;
for (int i = 0; i < 5; i++)
cout<<"Player "<<i+1<<" -- "<<"Jersey number: "<<jerseyNumber.at(i)<<", Rating: "<<rating.at(i)<<endl;
char option;
while(true)
{
cout<<"\nMENU"<<endl;
cout<<"a - Add player"<<endl;
cout<<"d - Delete player"<<endl;
cout<<"u - Update player rating"<<endl;
cout<<"r - Output players above a rating"<<endl;
cout<<"o - Output roster"<<endl;
cout<<"q - Quit\n"<<endl;
cout<<"Choose an option: "<< endl;
cin>>option;
switch(option)
{
case 'a':
case 'A':
cout<<"Enter anoter player's jersey number: \n";
cin>>temp;
jerseyNumber.push_back(temp);
cout<<"Enter another player's rating: \n";
cin>>temp;
rating.push_back(temp);
break;
case 'd':
case 'D':
cout<<"Enter a jersey number: ";
cin>>temp;
int i;
for(i = 0; i < jerseyNumber.size(); i++)
{
if(jerseyNumber.at(i) == temp)
{
jerseyNumber.erase (jerseyNumber.begin()+i);
rating.erase(rating.begin()+i);
break;
}
}
break;   
case 'u':
case 'U':
cout<<"Enter a jersey number: ";
cin>>temp;
for(int i = 0; i < jerseyNumber.size(); i++)
{
if(jerseyNumber.at(i) == temp)
{
cout<<"Enter a new rating for player: ";
cin>>temp;
rating.at(i) = temp;
break;
}
}
break;
case 'r':
case 'R':
cout<<"Enter a rating: ";
cin>>temp;
cout<<"\nABOVE "<<temp<<endl;
for(int i = 0; i < jerseyNumber.size(); i++)
if(rating.at(i) > temp)
cout<<"Player "<<i+1<<" -- "<<"Jersey number: "<<jerseyNumber.at(i)<<", Rating: "<<rating.at(i)<<endl;
break;
case 'o':
case 'O':
cout<<"ROSTER"<<endl;
for (int i = 0; i < jerseyNumber.size(); i++)
cout<<"Player "<<i+1<<" -- "<<"Jersey number: "<<jerseyNumber.at(i)<<", Rating: "<<rating.at(i)<<endl;
break;
case 'q': return 0;
default : cout<<"Invalid menu option. Try again."<<endl;
}
}
}
