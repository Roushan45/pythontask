#include<vector>
#include<iostream>

using namespace std;
	
void foo(const vector<int> &v);
int main()
{
	vector<int> v1;
	v1.push_back(12);
	v1.push_back(56);
	v1.push_back(34);
	foo(v1);
	return 0;
}
void foo(const vector<int> &v)
{
	vector<int> w;
	copy(v.begin(),v.end(),back_inserter(w));
	//printing the vector w element
	cout<<"Element of w \n";
	for (auto i = w.begin(); i != w.end(); ++i)
    std::cout << *i << ' ';
}
