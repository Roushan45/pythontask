#include<iostream>
#include<string.h>
#include<fstream>
#include<stdio.h>
#include<iomanip>
#define strSize 100
using namespace std;
//structure defines as global
struct exerciseData {
  char name[strSize];
  char date[strSize];
  char note[strSize];
  int time;
  int calories;
  int maxHeartRate;
};
//function load data
int loadData(exerciseData exerciseList[])
{
	//file stream and other varibles
	//using char array instead of string
	FILE *fin;
	char input[30];
	cout<<"Enter the input file : ";
	cin.getline(input,100);
	fin = fopen(input, "r");
	char line[100];
	int i=0;
	//reading line by line
	while (fgets(line, sizeof(line), fin))
	{
		int no=0;
		//cout<<line;
		char * temp;
		//spliting the string using , delimeter
		temp = strtok (line,",");
		while(temp!=NULL)
		{
			//copying the data accordingly
			if(no==0)
			{
				strcpy(exerciseList[i].name,temp);
			}
			if(no==1)
			{
				strcpy(exerciseList[i].date,temp);
			}
			if(no==2)
			{
				strcpy(exerciseList[i].note,temp);
			}
			if(no==3)
			{
				exerciseList[i].time=atoi(temp);
			}
			if(no==4)
			{
				exerciseList[i].calories=atoi(temp);
			}
			if(no==5)
			{
				exerciseList[i].maxHeartRate=atoi(temp);
			}
			no++;
			temp=strtok(NULL,",");
		}
		i++;
	}
	//returning the no of data found
    return i;
}
//search method
int search(exerciseData exerciseList[], int count)
{
	//storing the no of found value
	int noOfFound=0;
	//storing the found index in array
	int a[20];
	char activity[50];
	cout<<"What activity would you like to search for? ";
	cin.getline(activity,256);
	for(int i=0;i<count;i++)
	{
		if(strcmp(exerciseList[i].name,activity)==0)
		{
			noOfFound++;
			a[noOfFound]=i;
		}
	}
	if(noOfFound==0)
	{
		cout<<"NO record found for "<<activity<<endl;
	}
	//if data found printing them
	else{
		
		cout<<"Here are the activities matching "<<activity<<endl;
		cout<<"Date"<<setw(10)<<"Time"<<setw(10)<<"Calories"<<setw(10)<<"Max Heartrate"<<setw(10)<<"Note"<<endl;
		for(int i=0;i<noOfFound;i++)
		{
			int no=a[i];
	
			cout<<exerciseList[no].date<<setw(10)<<exerciseList[no].time<<setw(10)<<exerciseList[no].calories
			<<exerciseList[no].maxHeartRate<<setw(10)<<exerciseList[no].note<<endl;
		}
	}
	return noOfFound;
}
//this method will list the data
void list(exerciseData exerciseList[], int count)
{
	cout<<"The exercises are as follows:\n";
	cout<<"Name             Date      Time  Calories   Max Heartrate  Note"<<endl;
	for(int i=0;i<count;i++)
	{
		cout<<exerciseList[i].name<<setw(10)<<exerciseList[i].date<<setw(10)<<exerciseList[i].time<<setw(10)<<exerciseList[i].calories
		<<setw(10)<<exerciseList[i].maxHeartRate<<setw(10)<<exerciseList[i].note<<endl;
	}
}
int main()
{
	//declared the array 0f 100 struct
	exerciseData exerciseList[100];
	int k=loadData(exerciseList);
	char choice[5];
	while(1)
	{
		cout<<"What would you like to do: (l)ist all, (s)earch by name, (a)dd an exercise, or (q)uit?"<<endl;
		cin.getline(choice,256);
		//scanning the user input
		if(strcmp(choice,"l")==0)
		{
			list(exerciseList,k);
		}
		else if(strcmp(choice,"s")==0)
		{
			int found=search(exerciseList,k);
			cout<<"Found a total of"<<found<<" entries."<<endl;
		}
		else	if(strcmp(choice,"a")==0)
		{
			char temp[50];
			cout<<"What exercise activity did you do? ";
			cin.getline(exerciseList[k].name,256);
			cout<<"What was the date (mm/dd/yy):";
			cin.getline(exerciseList[k].date,256);
			cout<<"How many minutes? ";
			cin.getline(temp,256);
				exerciseList[k].time=atoi(temp);
			cout<<"How many calories did you burn? ";
			cin.getline(temp,256);
			exerciseList[k].calories=atoi(temp);
			cout<<"What was you max heart rate?";
			cin.getline(temp,256);
			exerciseList[k].maxHeartRate=atoi(temp);
			cout<<"Do you have any notes to add";
			cin.getline(exerciseList[k].note,256);
			cout<<"OK "<<exerciseList[k].name<<" on"<<exerciseList[k].date<<". Time :"<<exerciseList[k].time<<", Calories: "
			<<exerciseList[k].calories<<", Max heartrate : "<<exerciseList[k].maxHeartRate<<", Note : "<<exerciseList[k].note<<endl;
			k++;
		}
	else	if(strcmp(choice,"q")==0)
		{
			break;
		}
		else
		{
			cout<<"Invalid choice ! try again \n";
		}
		
	}
	
	return 0;
}
