#include<vector>
#include<string>
#include<fstream>
#include<sstream>
#include<iostream>
using namespace std;

int main(void)
{
	//name of  the file
	char fileName[30]="random.txt";
	ifstream fin;//input stream for open file
	vector<int> vec;//vector of type int for storing value
	int noOfRows = 3;//no of rows to read
	int noOfCol = 5;//no of col to read
	fin.open(fileName,ios::in);
	int count=0;//this is temp count
	string line;
	while(getline(fin,line)&&count<noOfRows)//reading the file until the 
	{								//count is less than no of rows
		count++;
		int count1=0;
		string line1;
		stringstream ss(line);//now here each line has 100 int so need to split and read 5 value
							//assuming file have space seprated ints 
		while(getline(ss,line1,' ') && count1<noOfCol)
		{
			count1++;
			vec.push_back(stoi(line1));//using stoi parsing string to int
									//and pushing the value to vector
		}
	}
	vector<int>::iterator it; //iterator for vector
	int i=0;
	for(it = vec.begin(); it != vec.end(); it++ )    {//using for loop
   		i++;
        cout<< *it <<" ";  // printing the vector
	if(i==5)
	{
		cout<<endl<<endl;
		i=0;
	}
}

	return 0;
}
