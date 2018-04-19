//this class for testing
#include "employee.cpp"
#include<string>
#include<iostream>
#include<fstream>
#include<sstream>

using namespace std;
//main module
int main(){
    ifstream fin;
    //opened the file for reading
    fin.open("project3.txt",ios::in);
    if(!fin){
        cout<<"Opening file error!"<<endl;
        exit(-1);
    }
    string line,temp,n;
    int i,hw,hr;
    //reading the file line by line
    while(getline(fin,line)){
        int count=0;
        stringstream ss(line);
        //splitting string by space
        while(ss>>temp){
            if(count==0){
                n=temp;
            }
            if(count==1){
                i=stoi(temp);
            }
            if(count==2){
                hw=stoi(temp);
            }
            if(count==3){
                hr=stoi(temp);
            }
            count++;
        }
    //making employee object
    employee e(n,i,hr,hw);
    //printing the information
    e.print();
    //calculating the wage
    cout<<"Calculated Wage : "<<e.calculateWage(e)<<endl<<endl;
    }
    return 0;
}