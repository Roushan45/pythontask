#include <iostream>
using namespace std;

int main() {
    char* b[2][3];
    char c[2][3];
    double d[2][3];
    double* dd[2][3];
    cout <<"Size of char array(without pointer) :"<< sizeof(c) << endl;//print 6
    cout <<"Size of char pointer array          :"<< sizeof(b) << endl;//prints 24
    cout <<"Size of double pointer array        :"<< sizeof(dd) << endl;//prints 24
    cout <<"Size of double array(without pointer):"<< sizeof(d) << endl;//prints 48
    cout << sizeof(b + 0) << endl;//prints 4
    cout << sizeof(*(b + 0)) << endl;// prints 12
     cout << sizeof(char) << endl;
    //assume the new line prints 003EF7D0
    cout << "the address of b is: " << b << endl;// prints 003EF7D0
    cout << "the address of b + 1: " << b + 1 << endl;//prints 003EF7DC
    cout << "the address of &b is: " << &b << endl;// prints 003EF7D0
    cout << "the address of &b + 1" << &b + 1 << endl;//prints 003EF7E8

    return 0;
}
