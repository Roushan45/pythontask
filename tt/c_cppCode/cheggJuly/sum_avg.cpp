#include <iostream>  
using namespace std;
 
template <class T>
T getSum(T myArray[], int n)
{
    T sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += myArray[i];
    }
    return sum;
}
 
template <class T>
 void getNum(T myArray[], int n)
{
   
    for (int i = 0; i < n; i++)
    {
        cout<< "Enter the "<<i+1<< " number: ";
        cin>> myArray[i];
    }
    
}
 
 
template <class T>
T getProm(T myArray[], int n)
{
    T sum = 0; /*fixed here changed it from num to T*/
    for (int i = 0; i < n; i++)
    {
        sum += myArray[i];
    }
    return sum /(T) n; /*for returning the average n should be cast 
						to same as template type variable*/
}
 
 
 
template <class T>
void printNum(T myArray[], int n)
{
    cout << "The numbers are: "<<endl;
    
    for (int i = 0; i < n; i++)
    {
        cout<< myArray[i] << "  ";
    }
    cout<< endl;
}
 
 
int main()
{
const int size = 5;
    int myArray[size];  //= { 3, 5, 6, 7, 8 };
    int n;
    int input;
    double myArrayD[size];
    float myArrayF[size];
    //int sum;
    n = size;
    
    do {
        cout<<"\n1. int\n";
        cout<<"2. double\n";
        cout<<"3. float\n";
        cout<<"4. Exit\n";
        cout << "What type of variables are gonna be uses? ";
        cin>> input;        
switch ( input ) {
            case 1:                
            {
    getNum(myArray, n);
        printNum(myArray, n);
      cout << "The average number is: "<< getProm(myArray, n)<< endl;
    cout<< "The sum of the numbers is: "<< getSum(myArray, n)<<endl;
            }
        break;
     case 2:
       {
        getNum(myArrayD, n);
          printNum(myArrayD, n);
          /*You were previously calling below two methods using array
		  type of int that is  getProm(myArray, n)  getSum(myArray, n)
		  thats why getting the amiguity same for the float also
		  some time copy paste become hard :P 
		  rest fiene*/
        cout << "The average number is: "<< getProm(myArrayD, n)<< endl;
        cout<< "The sum of the numbers is: "<< getSum(myArrayD, n)<<endl;
    }
        break;
       case 3:
      {
        getNum(myArrayF, n);
         printNum(myArrayF, n);
          cout << "The average number is: "<< getProm(myArrayF, n)<< endl;
        cout<< "The sum of the numbers is: "<< getSum(myArrayF, n)<<endl;
    }
        break;
        case 4:/*added one case for option 4 and added one default method.*/
        	{
        		exit(0);
			}
		default : cout<<"Invalid input ";break;
}
    }while( input !=5 );
    return 0;
   
}
