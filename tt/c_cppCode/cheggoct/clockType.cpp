#include<iostream>
#include <string>
#include<iomanip>
using namespace std;

class clockType
{
public:
        void setTime(int,int,int);
        void getTime(int&,int&,int&)const;
        void printTime()const;
        void setH(int);
        void setM(int);
        void setS(int);
        int getH()const;
        int getM()const;
        int getS()const;
        void incrementSeconds();
        void incrementMinutes();
        void incrementHours();
        bool equalTime(const clockType& other) const;

private:
        int hr;
        int min;
        int sec;
};
//------------------------ clockType class function implementation

void clockType::setTime(int i, int j, int k){
        hr = i;
        min = j;
        sec = k;
}
void clockType::setH(int h){
        hr = h;
}
void clockType::setM(int m){
        min = m;
}
void clockType::setS(int s){
        sec = s;
}
void clockType::getTime(int& i, int& j, int& k)const{
        i = hr;
        j = min;
        k = sec;
}
int clockType::getH() const{
        return hr;
}
int clockType::getM() const{
        return min;
}
int clockType::getS() const{
        return sec;
}

void clockType::printTime() const{
        cout << "The time is: " << hr << " : " << min << " : " << sec << endl;
}

void clockType::incrementHours(){
        hr += 1;
}

void clockType::incrementMinutes(){
        min += 1;
}

void clockType::incrementSeconds(){
        sec += 1;
}


bool clockType::equalTime(const clockType& other) const {
        return (hr == other.hr && min == other.min && sec == other.sec);
}
//----------------------------------------------------extClocktype
//Start from here
//derived the extClockType class from clockType
class extClockType: public clockType{
	
	private://one extra required variable added
		 int tz;
	public:
		//default constructor 
		//also calling the super class constructor
		extClockType():clockType(){
		}
		//overiding the print time by adding timezone info
		void printTime() const{
        cout << "The time is: " <<clockType::getH() << " : " << clockType::getM() << " : " << clockType::getS() << "  Time Zone: "<<tz<<endl;
}
		//overloaded setTime that accept one more param timezone
		void setTime(int i, int j, int k,int t){
       		clockType::setTime(i,j,k);//calling super class set time
        	 tz = t;
}
		void incrementTimeZones(){/*added method for incrementing  the timezone for 1 hr*/
			tz+=1;
		}
};

//-----------------------------------Driver Program
int main()
{
        clockType c1, c2;
        int i = 0, j = 0, k = 0;
        c1.setTime(10, 23, 11);
        c2.setTime(2, 23, 12);
        c1.getTime(i, j, k);
        cout << "Following are outputs from the base class clockType!\n\n";
        c1.printTime();
        c2.printTime();
        cout << endl;
        
        extClockType c3, c4;
        c3.setTime(11, 12, 13, 10);
        c4.setTime(14, 15, 16, 20);
        cout << "Following are outputs from the derived class extClockType!\n\n";
        c3.printTime();
        c4.printTime();
        c3.incrementTimeZones();
        c4.incrementTimeZones();
        c3.incrementHours();
        c4.incrementHours();
        c3.printTime();
        c4.printTime();
        cout << endl;
        return 0;
}
