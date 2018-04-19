#include<iostream>
#include<string>
#include <ctype.h>
using namespace std;

int main()

{

//using do while loop printing from 1 to 25 both inclusive

cout<<"using do while loop printing from 1 to 25 both inclusive"<<endl;

int i=0;
string input;
do{

//printing the number and increasing by 1

cout<<++i<<" ";

}

while(i<25);//condition for break loop

cout<<endl;


//using do while loop cheking the passphrase
cout<<"\n Profram for guessing pass phrse using do..while"<<endl;
do{

cout<<"Enter the pass phrase : ";

cin>>input;

//if input == to Bucky or bucky

//breaking the loop

if(input=="Bucky"||input=="bucky")

break;

}

while(1);

cout<<"\nEnter the Sentence for printing capital letter : ";
cin.ignore();
getline(cin,input);

cout<<"Printing the capital letters from word \n";

//using for loop printing the capital letter
cout<<"Capital letters \n";
for(int i=0;i<input.length();i++)

{

if(isupper(input[i])){

cout<<input[i]<<" ";

}

}

cout<<"\n\nProgram to display even numbers in between 1 - 1004\n"<<endl;
//using for loop printing even numbers

//between 1 - 1004

//initila value of i taken 2 and

//increasing by 2

for(int i=2;i<=1004;i+=2)

{

//if multiple of 20 then printing new line

if(i%20==0)

{

cout<<endl;

}

cout<<i<<" ";

}


cout<<"\n\nProgram to check given double value is vaid or not ";
double value;

cout<<"Enter the double no :";

cin>>value;

do{

//checking if cin is fail

if(cin.fail())

{

//clearing the result

cin.clear();

cout<<"Invalid!, Enter again : ";

cin.ignore();

cin>>value;

}

}

while(cin.fail());
cout<<"Number "<<value<<endl;

return 0;

}
