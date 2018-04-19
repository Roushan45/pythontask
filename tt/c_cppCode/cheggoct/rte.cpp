//encrypt.cpp

#include<bits/stdc++.h>

using namespace std;

//method for encrypting string

string encrypt(string str)

{

char result[str.length()];

transform(str.begin(), str.end(), str.begin(), ::toupper);//converting each letter to upper case

for(int i=0;i<str.length();i++)

{

if(str[i]>='A' && str[i]<='z')/*shifting only A-Z (as per question only letter ned to shifted)*/

result[i]=(char)(((str[i] - 'A') + 3) % 26 + 'A');//shifting the letter to 3 bits

else

result[i]=str[i];

}

return result;//returning converted string

}

int main(void)

{

string input;

while(1)//in loop asking input

{

cout<<"Enter the string for encrypt, press enter without char to exit!\n";

getline(cin,input);

if(input.length()<1)break;//on blank line exiting the program

else//else displaying the result

cout<<"Encrypted string : "<<encrypt(input)<<endl<<endl;

}

return 0;

}
