#include<vector>
#include<iostream>
#include<string>
using namespace std;
struct mystruct{
	int x;
	vector<vector<vector<int>>> myvec4;
};
struct mystruct2{
	string name;
	mystruct information;
};
int main()
{
	vector<mystruct2>v8;
	vector<int>v1,v2;
	vector<vector<int>> vv1;
	vector<vector<vector<int>>> vvv1;
	vector<int>::iterator it1;
	vector<vector<int>>::iterator it2;
	vector<vector<vector<int>>>::iterator it3;
	v1.push_back(12);
	v1.push_back(23);
	v2.push_back(34);
	v2.push_back(22);
	vv1.push_back(v1);
	vv1.push_back(v2);
	vvv1.push_back(vv1);
	mystruct struct1;
	struct1.x=100;
	struct1.myvec4=vvv1;
	
	mystruct2 struct2;
	struct2.name="Test_Name";
	struct2.information=struct1;
	
	mystruct struct3 = struct2.information;
	for(int i=0;i<struct3.myvec4.size();i++)
	{
		for(int j=0j<struct3.myvec4[i];j++)
	}
	return 0;
}
