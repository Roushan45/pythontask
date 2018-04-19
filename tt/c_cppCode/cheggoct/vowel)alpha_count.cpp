#include<iostream>//no string lib included
using namespace std;
int main(void)
{
	//empty string
	char str[100];
	cout<<"Enter string : ";
	cin>>str;//user input stored
	int vowelCount=0,consonantsCount=0;//intial count of 0
	for(int i=0;str[i]!='\0';i++)//looping through string char by char
	{
	
		char c = str[i];//current char
			if(((int)c>=97 &&(int)c<=122) || ((int)c>=65 &&(int)c<=97)){//ASCII range of alphabets
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y'
			   ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='Y' )/*condition for alphabets and here y also included as
												solutions required*/
				vowelCount++;//increasing the vowel count
			else
				consonantsCount++;//increasing the consonant count
			}
	}
	cout<<"\n"<<vowelCount<<" vowel(s) and "<<consonantsCount<<" consonant(s)\n";//result printing 
	return 0;
}
