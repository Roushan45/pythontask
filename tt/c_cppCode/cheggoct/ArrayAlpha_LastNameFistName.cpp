#include<iostream>
#include<iomanip>
using namespace std;
//method for initializing array
void InitializeArray(double *array)
{
	for(int i=0;i<50;i++)
	{
		if(i>24)//for index greater than 25
			array[i]=i*3;
		else//for index less than 25
			array[i]=i*i;
	}
}
//output array
void  OutputArray(double *array){
	for(int i=0;i<50;i++)
	{
		if(i%10==0)//new line 
			cout<<endl;
		cout<<setw(4)<<(int)array[i]<<" ";
	}
}
//method will add the letter if devisible by number
void FindMult(double *array, char letter, int multiple)
{
	for(int i=0;i<50;i++)
	{
		if(i%10==0)
			cout<<endl;//new line
		if((int)array[i]%multiple==0)//if divisible by zero
			cout<<setw(5)<<array[i]<<letter<<"\t";
		else
			cout<<setw(5)<<array[i]<<"\t";
	}
}
int main()
{
	//created array of type double
	double *array = (double*)malloc(sizeof(double)*50);
	InitializeArray(array);//initialized the array
	OutputArray(array);//output the array
	int num;char letter;
	cout<<"\n\nPlease enter a number : ";//asking fo  number and letter
	cin>>num;
	cout<<"Please enter a letter : ";
	cin>>letter;
	cout<<"Please place "<<letter<<" by each multiple of "<<num<<endl<<endl;
	FindMult(array,letter,num);//calling the method with number and letter
	return 0;
}
