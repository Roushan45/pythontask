#include<iostream>
#include<string>
using namespace std;
int main(){
    string userString;
    userString = "Quit";
    //comaring userString with string Quit 
    //using if statement
    if(userString == "Quit"){
        //printing the Goodbye
        cout<<"Goodbye"<<endl;
    }
    //in else statement printing the Hello
    else{
        cout<<"Hello"<<endl;
    }
    return 0;
}