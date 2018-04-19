#include<iostream>
#include<string>
#include<sstream>
using namespace std;

//student struct that will hold the 
//marks for each term and final calculated grade
struct StudentRecord{
    int student_no;
    int quiz1;
    int quiz2;
    int midterm;
    int finalExam;
    double numericAvg;
    char grade;
};

//this method will take the input and store to student struct
void input(StudentRecord& student){
    int itemp;
    string stemp1,stemp2;
    cout<<"Enter the student number : ";
    cin>>student.student_no;
    //please note that input is one space seprated 
    cout<<"enter two 10 point quizes "<<endl;
    cin.ignore();
    getline(cin,stemp1);
    stringstream ss(stemp1);
    int count=0;
    //splitting the string by space
    while(ss>>stemp2){
        if(count==0){
            student.quiz1=stoi(stemp2);
           
        }
        if(count==1){
            student.quiz2=stoi(stemp2);
           
        }
        count++;

    }
    //same as before taking the input as one space between both marks.
    cout<<"enter the midterm and final exam grades. These are 100 point tests "<<endl;
     getline(cin,stemp1);
    stringstream ss1(stemp1);
    count=0;
    while(ss1>>stemp2){
       
        if(count==0){
          
            student.midterm=stoi(stemp2);
        }
        if(count==1){
             
            student.finalExam=stoi(stemp2);
           
        }
        count++;

    }
}
//this method will calculate the grade.

void computeGrade(StudentRecord& student){
    //as quiz hild for 25 % so dividing by 4
    double quizPercentage=(((student.quiz1+student.quiz2)*100.0)/20.0)/4.0;
    //same as quiz mid term also hold for 25 %
    double midtermPercentage=(student.midterm)/4.0;
    //final exam holds for 50 % so deviding by 2
    double finalPercentage=(student.finalExam)/2.0;
    double avg=quizPercentage+midtermPercentage+finalPercentage;
    student.numericAvg=avg;
    //calculating the grade
    char gd;
    if(avg>90)
        gd='A';
    else if(avg>=80 && avg <90)
        gd='B';
     else if(avg>=70 && avg <80)
        gd='C';
     else if(avg>=60 && avg <70)
        gd='D';
     else if(avg>=50 && avg <60)
        gd='E';
    else gd='f';
    student.grade=gd;
}
//Outputting the result
void output(const StudentRecord student){
    cout<<"The record for student number: "<<student.student_no<<endl;
    cout<<"The Quiz grades are : "<<student.quiz1<<" "<<student.quiz2<<endl;
    cout<<"The midterm and exam grades are : "<<student.midterm<<" "<<student.finalExam<<endl;
    cout<<"The numeric average is: "<<student.numericAvg<<endl;
    cout<<"and the letter grade assigned is "<<student.grade<<endl<<endl;
}
int main(){
    //modify this if you want to alter the number
    //of student recored to process
    int MAX_STUDENT_RECORD=5;
    StudentRecord *records=new StudentRecord[MAX_STUDENT_RECORD];
    //using for loop taking input and calculating the result.
   for(int i=0;i<MAX_STUDENT_RECORD;i++){
       input(records[i]);
       computeGrade(records[i]);
       cout<<endl;
   }
   //printing the student info to console
   for(int i=0;i<MAX_STUDENT_RECORD;i++){
       output(records[i]);
   }
    return 0;
}