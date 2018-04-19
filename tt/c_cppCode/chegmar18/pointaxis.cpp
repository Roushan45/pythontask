#include <iostream>
#include <string>
#include <cstring>
using namespace std;

int main()
{
    char a='g',b='f';
    string s(1,a);
    s+=b;
    cout<<s<<endl;
    double array[100][2];
    int size = 0;
    string input;
    cout << "Enter the string : ";
    getline(cin, input);
    char myArray[input.size() + 1]; //as 1 char space for null is also required
    strcpy(myArray, input.c_str());
    int index=0;
    double num1,num2,temp;
    for(int i=0;i<input.size()-1;i++){

    }
    cout<<endl;

    return 0;
}