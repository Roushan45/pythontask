#include <iostream>
#include <string.h>
using namespace std;
class Employee
{
    private:
  	  char name[20];
      long saalry;
    protected:
    	char* degree;
    	char* position;
    public:
    //constructors
    long getSalary()
    {
    	return this.saalry;
	}
    // virtual function
    virtual void show_info ()
    {
       // cout << "Name "<<name << endl;
    }
      
    char const * getName() 
    {
        return name;
    }
      
    Employee(char const *empName,long salary, ) 
    {
        strcpy(name, empName);
    }
};
