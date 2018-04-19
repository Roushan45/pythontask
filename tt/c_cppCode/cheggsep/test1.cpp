#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;
 
void search(char a[])
{
	//for counting the matched char
int count =0;
char c;
//storing the firat found index
int first_index = -1;
cout << "\nPlease enter the character to search for :";	
cin >> c;
for (int i = 0; a[i] != '\0'; i++)
{
if (a[i] == c)
{
	count++;
	if(first_index==-1)
	first_index = i;
}
	

}
//if char found
if(first_index!=-1)
cout << "There are "<<count<<" "<<c<<"'s in "<<"\""<<a<<"\""<<" with the 1st one at index "<<first_index<<endl;
else
cout<<"There are no "<<c<<"'s in "<<"\""<<a<<"\""<<endl;
}
void change(char a[])
{
int x;
char y;
cout << "What is the index of the character you want to change? ";
cin >> x;
cout << "What character do you want in that position? ";
cin >> y;
for(int i=0;a[i]!='\0';i++)
{
	//if char found
	if(i==x)
	{
		//changing the cchar
		a[i]=y;
		cout<<"The new string is "<<a<<endl;
		return;
	}
}
cout<<"That position is outside the bounds of the string. String unchanged."<<endl;
}
void disN_(char a[])
{
int n;
cout << "How many characters from the end of the string do you want to display? ";
cin >> n;
//first checking the length
if(n>strlen(a))
{
	cout<<"Error: too many characters."<<endl;return;
}
//printing the result
for (int i = strlen(a)-n; i<n, i<strlen(a); i++)
	cout << a[i];
cout<<endl;
}

void disN(char a[])
{
int n;
cout << "How many characters from the beginning of the string do you want to display? ";
cin >> n;
//first checking the length
if(n>strlen(a))
{
	cout<<"Error: too many characters."<<endl;return;
}
else{
	for(int i=0;i<n;i++)
	{
		//printing the result
		cout<<a[i];
	}
	cout<<endl;
}
}
void disp(char a[])
{
int x, y;
cout << "Please enter the beginning index : ";
cin >> x ;
cout << "Please enter the ending index : ";
cin >> y ;
//first checking the valid of range
if(x<0||y>strlen(a)-1)
{
	cout<<"Error: one or more indices are outside the bounds of the array."<<endl;
	return;
}
for (int i = x; i<=y, i<strlen(a); i++)
cout << a[i];
cout<<endl;
}
//making the string nul
void nullStr(char a[])
{
if(a[1]=='\0')
cout<<"The string was already Null. Nothing was changed."<<endl;
else
{
	a=NULL;
	cout<<"The string is now Null."<<endl;
}

}
 
int main() 
 
{
	while(1){
	
int ch;
char str[50];
cout << "Please enter a string: ";
cin.ignore();
//for scanning the string with space fgets needed
fgets(str,60,stdin);
cout << "Make a selection:\n1. Search for a character in the string.";
cout << "\n2. Change a character within the string.";
cout << "\n3. Display the first n characters of the string.";
cout << "\n4. Display the last n character of the string.";
cout << "\n5. Display all characters that lie between two given indices.";
cout << "\n6. Null the string.";
cout << "\n7. Exit.";
cout << "\n Type the number to make a choice: ";
 
cin >> ch;
switch (ch)
{
case 1:{search(str);
break;
}
case 2:{change(str);
	break;
};
case 3:{
	disN(str);
	break;
};
case 4:{
	disN_(str);
	break;
};
case 5:{
	disp(str);
	break;
}
case 6:{
	nullStr(str);
	break;
}
case 7:exit(0);
default:{
	cout<<"Invalid choice "<<endl;break;
};
}
}
return 0;
}
