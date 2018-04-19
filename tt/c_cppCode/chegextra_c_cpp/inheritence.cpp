#include<iostream>
#include<string>
using namespace std;

class A
{
	private:
		string name;
	public:
		void setname(string n)
		{
			name=n;
		}
};
class B:public A{
};
class C:public A{
};
class D:public B,public C{
};
int main()
{
	A A1;
	B B1;
	C C1;
	D D1;
	A1.setname("Anne");
	B1.setname("Bob");
	C1.setname("Char");
	
	//this will cause ambiguity
	D1.setname("David");
	
	//below code will work
	//D1.B::setname("David");
//	D1.C::setname("David");

	system("pause");
	return 0;
}
