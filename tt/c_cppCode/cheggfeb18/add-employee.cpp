#include<iostream>
#include<string>
#include<fstream>
using namespace std;

int main(){
    //variables for storing the data
    string firstname;
    string lastname;
    ofstream fout;
    string wage;
    //getting the data from user
    cout<<"New employee \n";
    cout<<"First Name : ";
    cin>>firstname;
    cout<<"Last Name : ";
    cin>>lastname;
    cout<<"Wage : ";
    cin>>wage;
    //opened the file in append mode
    fout.open("xyz-employee.dat",ios_base::app);
    //writting to file
    fout<<firstname<<" "<<lastname<<" ("<<wage<<")"<<endl;
    return 0;
}