#include<string>
#include<iostream>
using namespace std;

//Date class
class Date{
    //have private member day , month and year
    private:
        int day;
        int month;
        int year;
    public:
    //date constructor for creating date 
        Date(int d,int m,int y){
            day=d;
            month=m;
            year=y;
    }
        Date(){}
    //method for printing the date
    void printDate(){
      cout<<day<<"/"<<month<<"/"<<year<<endl;
    }
};

//customer class
class customer{
    //private varibales
    private:
        string name;
        string address;
        string tel;
        //Date of birth refers to above Date class
        Date dob;
    public:
    //dfault constructor
        customer(){}
        //parameterized constructor
        //that initialize the private variables
        customer(string n,string a,string t,Date d){
            name=n;
            address=a;
            tel=t;
            dob=d;
        }
        //desctuctor
        ~customer(){}
        //method for changing the address
        void changeAddress(){
            cout<<"Enter the new Address : "<<endl;
            cin.ignore();
            getline(cin,address);
            cout<<"Address updated successfully.....\n\n";
        }
        //method for changing the telephone number
        void changeTelephone(){
            cout<<"Enter the new telephone number : ";
            cin.ignore();
            getline(cin,tel);
            cout<<"updated telephone number successfully....\n\n";
        }
        //method for changing thr dob
       void changeDOB(){
           //getting the day, year and month
            int d,m,y;
            cout<<"Enter the date : ";
            cin>>d;
            cout<<"Enter the month : ";
            cin>>m;
            cout<<"Enter the year : ";
            cin>>y;
            //creating new date object and assigning to dob
            Date date(d,m,y);
            dob=date;
            cout<<"Date of birth updated successfully...\n\n";

        }
    //this method will print data
        void printInformation(){
            cout<<"Name : "<<name<<endl;
            cout<<"Address : "<<address<<endl;
            cout<<"Telephone : "<<tel<<endl;
            cout<<"DOB : ";
            dob.printDate();
        }

};

int main(){


int choice;
Date d(3,4,1990);
//created customer with initial data
customer c("Rakesh","1/4 street Newyork,USA","478393",d);
c.printInformation();
//presenting user to menu
while(1){
    cout<<"1.Update address\n2.Update Telephone\n3.Update DOB\n4.Print customer\n5.Exit\n";
    //reading the user choice
    cin>>choice;
    if(choice==1){
        c.changeAddress();
    }
    else if(choice==2){
        c.changeTelephone();
    }
    else if(choice==3){
        c.changeDOB();
    }
    else if(choice==4){
        c.printInformation();
    }
    else if(choice==5){
        exit(0);
    }
    else{
        cout<<"invalid choice\n";
    }
}
return 0;
}