//employee.h

//employee class declaration
#include<string>
using namespace std;
class employee{
    //private variables
    private:
        string name;
        int id;
        int hourly_rate;
        int hours_worked;
    //constructors , setters , mutators 
    public:
        employee();
        employee(string,int,int,int);
        void setName(string);
        string getName();
        void setId(int);
        int getId();
        void setHourlyRate(int);
        int getHourlyRate();
        void setHoursWorked(int);
        int getHoursWorked();
        int calculateWage(employee);
        void print();
};