#include <iostream>
#include <vector>
using namespace std;
//template class with parameterized type T
template <class T> class Simple
{
	//data member  val of type T
	private:
 		vector<T> val;
 	public:
 		//constructor with T type parameter
 		Simple(vector<T> v)
 		{
 		val=v;	
		}
		//accessors / gets that return t ype
		T getVal()
		{
			//more code can be added
			return val;
		}
		//mutators sets for T type
		void set(vector<T> v)
		{
			
			val = v;
		}
	
};

