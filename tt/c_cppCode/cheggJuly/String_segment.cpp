#include<iostream>
#include<string>

using namespace std;

int main()
{
	string dict[10]={"pear","salmon","foot","prints","footprints","leave","you","sun","girl","enjoy"};
	string input ="youleavefootprints";
//	cout<<"Enter the String : ";
//	getline(cin,input);
	string temp=input;
	int position[20];
	int noOfFound=0;
	string s="";
	for(int i=0;i<10;i++)
	{
		if(temp.find(dict[i])!= string::npos)
		{
			cout<<"word "<<dict[i]<<endl;
			
			size_t pos = input.find(dict[i]);
			string last=input.substr(pos+dict[i].length());
			s=" "+s+last;
			cout<<"last : "<<last<<endl;
			temp.erase(pos,dict[i].length());
			
		}
	
	}
cout<<"\n"<<s;

	return 0;
}
