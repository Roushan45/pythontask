/* hpp file that contains declarations of required variables and function*/
#include<string>
#ifndef DYNAMICARRAY_H
#define DYNAMICARRAY_H
using namespace std;
class DynamicArray
{
	private:
		/*count will store the actua no of line in array*/
		int count;
		/*array size will hold the length of array*/
		int array_size;
		/*string array is containes that will hold the string*/
		string *array;
		/*private resize method used to achieve dynamicity of array*/
		void resize(string *array);
	public:
		/*required public methods*/
		DynamicArray();
		void add();
		int size();
		void lineNumber(int index);
		void lineSearch(string key);
};
#endif
