#include<iostream>
#include<string>
#include<sstream>
using namespace std;

void ReadDate(int &m, int &d, int &y){
	string read_data;
	cout<<"Enter a date value (mm/dd/yyyy) to be converted : ";
	cin>>read_data;//storing the entered data
	stringstream ss(read_data);//using string stream for splitting the data by/
								//to get the m,d,y
	int i=0;
	string temp;
	while(getline(ss,temp,'/')){
		if(i==0)
			m=stoi(temp);//getting the data and converting to integer using string lib
		else if (i==1)
			d=stoi(temp);
		else
			y=stoi(temp);
		i++;
	}
}
//methiod to check if it is lear or not
bool IsLeapYear(int y){
	//base case year should by multiple of 5
	if(y%4 == 0)
    {
    	//if it divided by 100 then its should also divided by 400 for leap year
        if( y%100 == 0)
        {
            if ( y%400 == 0)
                return true;
            else
               return false;
        }
        else
           return true;
    }
    return false;
	
}
int OrdinalDay(int m, int d, int y){
	//arrays for no of days in month
	int noOfDays[]={31,28,31,30,31,30,31,31,30,31,30,30};
	int days=0;
	//looping through month
	for(int i=0;i<m-1;i++)
	{
		if(i==1)//for second month
			if(IsLeapYear(y))//checking for leap year
				days=days+29;//for leap  adding 29
			else 
				days=days+28;//else adding 28
		else
			days=days+noOfDays[i];
	}
	days=days+d;//finally adding days
	return days;
}

int main(void){
	int m,d,y;
	int count;
	cout<<"Enter the number of dates to be processed: ";
	cin>>count;//askign the no of operation to perform
	for(int j=0;j<count;j++)
	{
	
	ReadDate(m,d,y);//calling the method for read data
	//printing the result
	cout<<m<<"/"<<d<<"/"<<y<<"\t=\t"<<y<<"-"<<OrdinalDay(m,d,y)<<endl<<endl;
}
}
