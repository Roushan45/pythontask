#include<iostream>
using namespace std;

template<class T>
class MyArray{
	
	public:
		void getNum(T myArray[], int n)
{
   
    for (int i = 0; i < n; i++)
    {
        cout<< "Enter the "<<i+1<< " number: ";
        cin>> myArray[i];
    }
    
}
T getSum(T myArray[], int n)
{
    T sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += myArray[i];
    }
    return sum;
}
void printNum(T myArray[], int n)
{
    cout << "The numbers are: "<<endl;
    
    for (int i = 0; i < n; i++)
    {
        cout<< myArray[i] << "  ";
    }
    cout<< endl;
}
 
 
};

int main()
{
	MyArray<int>intArray;
	MyArray<float>floatArray;
	const int size = 3;
  //  int myArray[size];  //= { 3, 5, 6, 7, 8 };
    int n;
    int input;
  //  double myArrayD[size];
   // float myArrayF[size];
    //int sum;
    n = size;
    
    do {
        cout<<"\n1. int\n";
        cout<<"2. double\n";
        cout<<"3. floar\n";
        cout<<"4. Exit\n";
        cout << "What type of variables are gonna be uses? ";
        cin>> input;        
switch ( input ) {
            case 1:                
            {
            int myArray[size];
   intArray.getNum(myArray, n);
      intArray.printNum(myArray, n);
    //  cout << "The average number is: "<< intArray.getProm(myArray, n)<< endl;
    cout<< "The sum of the numbers is: "<< intArray.getSum(myArray, n)<<endl;
            }
        break;
     case 2:
       {
       	double myArrayD[size];
       // getNum(myArrayD, n);
          //printNum(myArrayD, n);
       // cout << "The average number is: "<< getProm(myArray, n)<< endl;
        //cout<< "The sum of the numbers is: "<< getSum(myArray, n)<<endl;
    }
        break;
       case 3:
      {
      	float myArrayF[size];
        floatArray.getNum(myArrayF, n);
        floatArray. printNum(myArrayF, n);
      //    cout << "The average number is: "<< getProm(myArray, n)<< endl;
        cout<< "The sum of the numbers is: "<< floatArray.getSum(myArray, n)<<endl;
    }
        break;
}
    }while( input !=5 );
   
	return 0;
}
