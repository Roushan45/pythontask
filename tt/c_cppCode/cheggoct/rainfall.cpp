#include<iostream>
#include<limits>
#include<iomanip>
using namespace std;
//required method prototype
void getInput(double*);
void printMax(double*);
void printMin(double*);
double getTotal(double*);
void printRainfall(double*);
//main function
int main(void){
	//array for 12 doubles
	double *array=new double[12];
	//using loop allows user to run program as he much want
	while(1){
	//calling method for getting input
	getInput(array);
	//priting the data
	printRainfall(array);
	cout<<fixed<<setprecision(2);
	//printing total  and average
	cout<<"\nThe total rainfall for the year was "<<getTotal(array)<<" inches."<<endl;
	cout<<"The average rainfall for the year was "<<getTotal(array)/12<<" inches."<<endl;
	//printing max and min
	printMax(array);
	printMin(array);
	char choice;
	cout<<"\n Do you want to continue (y/n)? ";
	cin>>choice;
	if(choice=='N'||choice=='n')
		break;
}
	return 0;
}
void getInput(double* array){
	double input;
	for(int i=0;i<12;i++){
		cout<<"Enter the rainfall for month #"<<(i+1)<<" : ";
		
		cin>>input;
		cin.ignore();
		while(input<0){
			cout<<"Invalid data , Please enter again!";
			cout<<"Enter the rainfall for month #"<<(i+1)<<" : ";
			cin>>input;
		}
		array[i]=input;
	}
}
double getTotal(double* array){
	double total=0;
	for(int i=0;i<12;i++){
		total+=array[i];
	}
	return total;
}
void printMax(double* array){
	double max=INT_MIN;
	for(int i=0;i<12;i++){
		if(max<array[i]){
			max=array[i];
		}
	}
	cout<<"\nThe month(s) that recorded the highest amount of rain of "<<max<<" inch(es) was (were):\n\tMonth #: ";
	for(int i=0;i<12;i++){
		if(array[i]==max)
			cout<<(i+1)<<" ";
	}
	cout<<endl<<endl;
}
void printMin(double* array){
	double min=INT_MAX;
	for(int i=0;i<12;i++){
		if(min>array[i]){
			min=array[i];
		}
	}
	cout<<"\n\nThe month(s) that recorded the lowest amount of rain of "<<min<<" inch(es) was (were):\n\tMonth #: ";
	for(int i=0;i<12;i++){
		if(array[i]==min)
			cout<<(i+1)<<" ";
	}
	cout<<endl<<endl;
}
void printRainfall(double* array){
	cout<<"\nThe rainfalls for the following months were:\n"<<endl;
	for(int i=0;i<12;i++){
		cout<<"Month "<<(i+1)<<" : "<<array[i]<<endl;
	}
}

