#include<bits/stdc++.h>
using namespace std;
string ROT13(string str)
{
char result[str.length()];
transform(str.begin(), str.end(), str.begin(), ::toupper);//converting each letter to upper case if lower any
for(int i=0;i<str.length();i++)
{
if(str[i]>='A' && str[i]<='z')/*shifting only A-Z*/
result[i]=(char)(((str[i] - 'A') + 13) % 26 + 'A');//shifting the letter to 13 bits
else
result[i]=str[i];
}
return result;//returning converted string

}
/*method to write this to file 
note that ifstream used to read file
and ofstream used to write to file
*/
void writeTranslatedChar(string translated,ofstream& fout)
{
	fout<<translated<<"\n";//writting to file
}

int main(void)
{
	//both stream declared
	ifstream fin;
	ofstream fout;
	char inputFile[30];
	char outputFile[30]="output.rot13";//output file
	cout<<"Enter the name of file : ";
	cin>>inputFile;
	fin.open(inputFile,ios::in);//opened for reading
	if(!fin)
	{
		cout<<"Error on opening file\n";
		exit(-1);//if file reading error
	}
	fout.open(outputFile,ios::out);//opened the file
	string line;
	while(getline(fin,line,'\n'))//reading line by line
	{
		string translated=ROT13(line);//translating the word
		writeTranslatedChar(translated,fout);//writting to file
	}
	cout<<"\nTranslating and writting to file done..\n";
	return 0;
}
