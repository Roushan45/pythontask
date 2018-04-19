#include <iostream>
#include <cstdlib>

using namespace std;
/*
 * 
 */
//Declare class TheDate
class TheDate{
public:
    //Member function declaration 
    void input();
    void output();
    void output1();
    void output2();
    void output3();
    void output4();
    void set(int newDay, int newMonth, int newYear);
    //Precondition: newMonth, newDay, and newYear form a possible date.
    void set(int newMonth);
    //Precondition: 1<= newMonth <= 12
    //Postconditon: The date is set to the first day of the given month
    
    int getMonthNumber(); //Return 1 for January, 2 for February, etc.
    int getDay();// Return the day 
    int getYear();// Return the year
private:
    //Private members month day , year , symbol for "/"
    int month;
    int day;
    int year;
    char symbol;
};
//Use string to call out the name of the month depending on the number inputed for month
string monthName[12] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
int main() {
    // char variable to see if user wants to run program again.
    char runprogram;
    //while loop to allow the programmer to run program again if he/she wishes
    while (runprogram != 'n'){
     TheDate today;
    cout << "The program displays a valid date in three different formats.\n"
         <<"Note: All junk data will be rejected!\n";
             //call the input void function  
    today.input();
    cout<<"The Date: ";
    //call the output void function (US form)  
    today.output();
    cout<<" is valid\n";
    //call the output1 void function  (US Form) 
    today.output1();
    cout<< endl; 
    //call the output2 void function  (US Expanded Form) 
    today.output2();
    cout<< endl;
        //call the output3 void function (US Military Form)
    today.output3(); 
    cout<< endl;
    //call the output4 void function  (US International Form) 
    today.output4();
    cout<<endl;
    cout<< "Would you like to run the program again? (y/n): ";
    // ask user to input value for runprogram if inputed y it will run again 
    cin>> runprogram;
    
   if ( runprogram == 'y' || runprogram  == 'Y')
        continue;
     }
    
     cout << endl;
    cout << "Programmer: Francisco Gallego"<<endl << "That's all! \n";
     return 0;
} 
//Uses iostream and cstdlib:
//void set function to calculate requirment for the inputed values 
void TheDate::set(int newDay, int newMonth, int newYear){
    // if newmonth is between 1 and 12 establish  variable from private month
    // Else the screen will prompt out that the month you displayed is invalid 
    
    //for testing method that you are in test method
    //please do comment when you not needed
    cout<<"\n In set method\n";
        if((newMonth >=1) && (newMonth <=12))
        month = newMonth;
    else{
        cout << "Illegal month value! Program aborted.\n";
        exit(1);
    }               
        //switch statement to declare requirment for each month depending on the inputed
    switch (month){
        case 1: 
            //requirements for January 
            if ((newDay >= 1) && (newDay <=31)){
                    day = newDay;                 
            }
            else
                cout <<newDay << " invalid day in January";
            break;
        case 2: 
            //Declare leap year, figure out that if the year inputed could be considered
            //a leap year, if it is febuary can have a total of 29 days, if not it can only have 28
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                cout << year << "-> Leap Year";
               if((newDay >= 1 && newDay <=29))
                    day = newDay; 
            }
                else {
                    cout << year<< "-> Not Leap Year";
                if((newDay >= 1 && newDay <=28))
                day = newDay;
                }          
            break;
        case 3: 
            //requirements for March 
            if ((newDay >= 1 && newDay <=31)){
                    day = newDay;   
            }
            else
                cout <<newDay<< " invalid day in March";
            break;
        case 4: 
            //requirements for April
            if((newDay >= 1) && (newDay <=28)){
                    day = newDay;   
            }
            else
                cout <<newDay<< " invalid day in April";
            break; 
        case 5: 
            //requirements for May 
            if ((newDay >= 1) && (newDay <=31)){
                    day = newDay;   
            }
            else
                cout <<newDay << " invalid day in May";
            break;       
        case 6: 
            //requirements for June 
            if ((newDay >= 1) && (newDay <=30)){
                    day = newDay;   
            }
            else
                cout<< newDay << " invalid day in June";
            break; 
        case 7: 
            //requirements for July 
            if ((newDay >= 1) && (newDay <=31)){
                    day = newDay;   
            }
            else
                cout <<newDay << " invalid day in July";
            break; 
        case 8: 
            //requirements for August 
            if ((newDay >= 1) && (newDay <=31)){
                    day = newDay;   
            }
            else
                cout <<newDay<< " invalid day in August";
            break; 
        case 9: 
            //requirements for September 
            if ((newDay >= 1) && (newDay <=29)){
                    day = newDay;   
            }
            else
                cout << newDay<<" invalid day in September";
            break;
        case 10: 
            //requirements for October 
            if ((newDay >= 1) && (newDay <=31)){
                    day = newDay;   
            }
            else
                cout <<newDay<< " invalid day in October";
            break; 
        case 11: 
            //requirements for November 
            if ((newDay >= 1) && (newDay <=30)){
                    day = newDay;   
            }
            else
                cout <<newDay<< " invalid day in November";
            break; 
        case 12: 
            ////requirements for December 
            if ((newDay >= 1) && (newDay <=31)){
                    day = newDay;   
            }
            else
                cout <<newDay<< "invalid day in December";
            break; 
            //declare a default of option if a case could not be chosen
            default:
           cout << "Error in DayOfYear::output.";
    }
  }
//Declare Accessor function getMonthNumber
int TheDate ::getMonthNumber(){
return month;
}
//Declare Accessor function getDay
int TheDate ::getDay(){
    return day;
}
//Declare Accessor function getYear
int TheDate ::getYear(){
    return year;
}
//Uses iostream and cstdlib:
//void function were all the program will ask you to input the date 
// in a certain format of (mm/dd/yyyy) or -1 to end the program.
void TheDate::input(){
    cout<< "Enter a date (mm/dd/yyyy) or n to end: ";
    cin>> month;
    
    
    //here i commneted the unncessary code this work already done by set method
    // if month was == -1 the program will exit
//    if (month == -1)
//    exit(1);
    cin>> symbol;
    cin>> day;
    cin>> symbol;
    cin >> year; 
    
    //this also not requied bcz validatio is doing by set method
    
    //if month does not follow the requirment to be a valid date screen will output that there is a error
    // and ask you to try again 
//  if ((month < 1) || (month > 12) || (day < 1) || (day > 31) || (year<0))
//     {
//     cout << "Error!!! The entered date is invalid! Re-Enter, Please!\n";
//   cout << "Enter a date (mm/dd/yyyy) or -1 to end: ";
//    cin>> month;
//    if (month == -1)
//    exit(1);
//    cin>> symbol;
//    cin>> day;
//    cin>> symbol;
//    cin >> year; 
//    }

//##### see here i am calling set method with above inputs day, month, year
    set(day,month,year);
}
//output function for the US format Date
void TheDate ::output(){
    cout<<month<<"/";
    cout << day<<"/";
    cout << year;
}
//output function for the US format Date
void TheDate ::output1(){
    cout<<month<<"/";
    cout << day<<"/";
    cout << year<<" (US)";
}
//output function for the US Expanded format Date
void TheDate ::output2(){
    cout<<monthName[month-1]<<" ";
    cout << day<<", ";
    cout << year<<" (US expanded)";
}
//output function for the US Military format Date
void TheDate ::output3(){
      cout << day<< " ";
      cout<<monthName[month-1]<<" ";
      cout << year<<" (US Military)";
}
//output function for the US International format Date
void TheDate ::output4(){
    cout << year<<"-";
    cout<<month<<"-";
    cout << day<<" (International)";
      
}
