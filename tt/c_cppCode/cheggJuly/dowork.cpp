#include <iostream>
#include <string>
 
using namespace std;
 
class Automobile
{
private:
 
    string Make;
    int Year;
    string Model;
 
public:
 
    Automobile()
    {
        Make = "";
        Model = "";
        Year = 0;
        cout << "Automobile default constructor is called." << endl;
    }
 
    Automobile(string make, string model, int year) :
        Make(make),
        Model(model),
        Year(year)
    {
        cout << "Automobile constructor is called." << endl;
    }
 
    Automobile(const Automobile & src)
    {
        Make = src.Make;
        Model = src.Model;
        Year = src.Year;
 
        cout << "Automobile copy-constructor is called." << endl;
    }
 
public:
 
    ~Automobile()
    {
        cout << "Automobile destructor is called." << endl;
    }
 
public:
 
    const Automobile & operator=(const Automobile & src)
    {
        Make = src.Make;
        Model = src.Model;
        Year = src.Year;
 
        cout << "Automobile assignment operator (=) is called." << endl;
 
        return *this;
    }
 
public:
 
    static Automobile * CreateAutomobiles(int count)
    {
        return new Automobile[count];
    }
 
    static Automobile * CreateAutomobiles()
    {
        Automobile autoMobiles[3];
        return autoMobiles;
    }
};
 
 
static void DoWork1()
{
    Automobile * p1 = Automobile::CreateAutomobiles(3);
    Automobile * p2 = Automobile::CreateAutomobiles();
}
 
 
static void DoWork2()
{
    Automobile * pAutomobiles = Automobile::CreateAutomobiles(3);
    delete pAutomobiles;
}
 
int main()
{
    DoWork1();
    DoWork2();
}
