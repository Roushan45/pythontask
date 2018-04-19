#include<iostream>
#include<string>
using namespace std;

// employee struct for storing it
// in structured way and sorting further
struct employee{
    string fname;
    string lname;
    int id;
    employee(){}
    employee(string f, string l, int i){
        fname=f;
        lname=l;
        id=i;
    }
};

int main(){
    //Employee array
    employee employees[5];
    //Created employee with given data
    employee e1("Peter","Schmidt",3044);
    employee e2("Mary", "Alson",1234);
    employee e3("Juan", "Lopez",2334);
    employee e4("Xion", "Lee",5556);
    employee e5("Adrian" ,"Boixua",3443);
    //added employee to array
    employees[0]=e1;employees[1]=e2;employees[2]=e3;employees[3]=e4;employees[4]=e5;

    cout<<"Sorted by last name \n\n";
    //sorting the employee by last name by selection sort algo
    for(int i=0;i<4;i++){
        for(int j=i+1;j<5;j++){
            if(employees[i].lname.compare(employees[j].lname)>0){
                employee temp=employees[i];
                employees[i]=employees[j];
                employees[j]=temp;
            }
        }
    }
//printing the sorted by last name employee
    for(int i=0;i<5;i++){
        cout<<"Name : "<<employees[i].fname<<" "<<employees[i].lname<<"  ID : "<<employees[i].id<<endl;
    }

    return 0;
}