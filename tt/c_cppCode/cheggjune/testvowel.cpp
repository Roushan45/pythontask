#include <cctype>
#include <iostream>
//#include <cstring>

using namespace std;

int main()
{
   // char str[] = "This Program Converts ALL LowerCase Characters to UpperCase";
	string str;
	cin>>str;
    for (int i=0; i < 5; i++)
    {
        if (islower(str[i]))
            /*  Converting lowercase characters to uppercase  */
            str[i] = str[i] - 32;
    }

    cout << str;
    return 0;
}
