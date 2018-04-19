#include<string>

using namespace std;
class DynamicArray
{
	private:
		int count;
		string [count];
		int size;
		void resize();
	public:
		DynamicArray();
		void add();
		int size();
		void lineNumber(int index);
		void lineSearch(string key);
};
