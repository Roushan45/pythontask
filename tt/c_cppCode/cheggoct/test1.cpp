#include <iostream>
#include <iomanip>
#include <fstream>
float celsius(int Fahrenheit){
return (5.0/9*(Fahrenheit - 32));
}
int main()
{
int i;
//for user input storing
int inputNu;
//no of conversation want to user  perform
int noOfConversion;
//c++ ofs to write to file
std::ofstream fout;
//output file name output.txt
//will generate in same folder
fout.open("output.txt",std::ios::out);
//asking the numbr of conversations user want to perform
std::cout<<"How many conversions would you like to do? ";
std::cin>>noOfConversion;
fout<<std::setprecision(2)<<std::fixed;
fout<<"Fahrenheit\tCelsius\n";
//in a loop looping until the user wants
for(i=1;i<=noOfConversion;i++){

std::cout<<"Enter the "<<i<<" number : ";
std::cin>>inputNu;
//writting to file in tabular format
fout<<"------------------------\n| ";
//writting user input value and 
//out put result to file
fout<<inputNu<<"\t  |\t"<<celsius(i)<<" |\n";
fout<<"------------------------\n";
}
std::cout<<"Data written to file sucessfully ! \n";
return 0;
}
