#include<iostream>
#include<string>
using namespace std;

//product struct for storing the product
struct product{
    string name;
    string PID;

    product(){}
    product(string n, string p){
        name=n;
        PID=p;
    }
};

int main(){
    //product array
    product products[4];
    //created product with given data
    product p1("Wireless keyboard","A31");
    product p2("Wireless mouse","A42");
    product p3("Software", "B07");
    product p4("Printer","P45");
    //added them to array
    products[0]=p1;products[1]=p2;products[2]=p3;products[3]=p4;
    string searchPid;
    //getting PID for searching the product
    cout<<"Enter the PID : ";
    cin>>searchPid;
    bool found =false;
    //searching for PID
    for(int j=0;j<4;j++){
        if(products[j].PID==searchPid){
            //if match found 
            cout<<"Product : "<<products[j].name<<endl;
            //marking the found true and above printing the name 
            found=true;
        }
    }//in case no pid found
    if(!found){
        cout<<"No product found for PID : "<<searchPid<<endl;
    }
    return 0;
}