#include <iostream>
#include <iomanip>
#include <vector>

using namespace std;
void PrintSBackward(vector<char> v);
void PrintSBackward(vector<char> v,int i );
int main()
{
	vector<char> s(20);
	char c;int count=0;
	while(count<5)
	{
		//cout<<c;
		cin>>c;
		s.push_back(c);
		count++;
	}
		
	PrintSBackward(s);
	return 0;
}
void PrintSBackward(vector<char> v)
{
	for()
}
