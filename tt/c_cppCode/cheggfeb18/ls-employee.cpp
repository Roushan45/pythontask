#include<iostream>
#include<string>
#include<fstream>
using namespace std;
//this program will read employee data from file
int main(){
    string data;
    int count=1;
    ifstream fin;
    //opened the employee in reading mode
    fin.open("xyz-employee.dat",ios::in);
    if(!fin){//if file opening got error
        cout<<"Opening  file error !\n";
        exit(-1);
    }
    //reading line by line
    while(getline(fin,data)){
        cout<<"Employee "<<count<<endl;
        //displaying the content
        cout<<data<<endl<<endl;
        count++;
    }
}