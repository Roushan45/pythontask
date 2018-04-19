#include<iostream>
#include<string>
#include<fstream>
using namespace std;
//formatSSn method it will format the string 
//to required social pattern
void formatSSN(string &number)
{
	//formatting dtring by using substring method of string
	number=number.substr(0,3)+"-"+number.substr(3,2)+"-"+number.substr(5,4);

}
//print method 
void print(string numbers[],int size)
{
	int i;
	for(i=0;i<size;i++)
	{
		cout<<numbers[i]<<"\n";
	}
}
//main metho
int main(){
//input file stream for reading file
ifstream infile;
int i,size=0;
string numbers[100];
//openin the file
	infile.open("numbers.txt",ifstream::in);
	if(infile.is_open())
	{
		//reading line by line and storing into numberes array
		string line;
		while(getline(infile,line))
		{
			numbers[size]=line;
			//increasing the size
			size++;
		}
	}
	//formatting the numsers array by calling loop
	for(i=0;i<size;i++)
	{
		formatSSN(numbers[i]);
	}
	//printing the formatted numbers
	print(numbers,size);

return 0;	
}

