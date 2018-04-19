#include<iostream>
#include<string>
#include<fstream>
#include<sstream>
using namespace std;
//declare the struct of record 
struct record{
	int stu_no;
	int stu_grade;
};

int main()
{
	//declared array of struct
	record array[100];
	//declared input and outputfile
	char input[30]="input.txt";
	char output[30]="output.txt";
	int count=0;
	string line;
	ifstream fin;
	ofstream fout;
	//calculating the grade while reading the data
	float gradesum=0;
	//opening the file for reading
	fin.open(input,ifstream::in);
	while(getline(fin,line))
	{
	//	cout<<line<<endl;
		int i=0;
		string s;
		int id,grade;
		stringstream ss(line);
		//using space delimeter breaking the id and grade
		while(getline(ss,s,' '))
		{
			if(i==0)
			{
				id=stoi(s);
				
			}
			else{
				grade=stoi(s);
				gradesum=gradesum+stof(s);
			}
			i++;
		}
	//storing the grade into record strucutre
		record r;
			r.stu_no=id;
			r.stu_grade=grade;
	
			array[count]=r;
			count++;
	}
//sorting the data based on grade
	for(int k=0;k<count-1;k++)
	{
		
		for(int l=k+1;l<count;l++)
		{
		
			if(array[l].stu_grade<array[k].stu_grade)
			{
			
				record temp=array[k];
				array[k]=array[l];
				array[l]=temp;
			}
		}
	}
	//printing average grade on console
	cout<<"Average of grade : "<<gradesum/count<<endl;
	fout.open(output);
	//writting the sorted to file
	for(int k=0;k<count;k++)
	{
		
		fout<<array[k].stu_no<<" "<<array[k].stu_grade<<endl;
	}
	return 0;
}
