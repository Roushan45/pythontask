#include<iostream>
#include<string.h>
using namespace std;

class test
{
	private:
		char name[20];
	public:
		void setName(char const *Name)
		{
			strcpy(name,Name);
		}
		
		char* getName(){
			return name;
		}
		virtual void show()
		{
			cout<<name<<endl;;
		}
	//	test()
};

int main()
{
	test t,t1;
	t.setName("Rakesh");
	t1.setName("Roushan");
	t.show();
	t1.show();
	return 0;
}
