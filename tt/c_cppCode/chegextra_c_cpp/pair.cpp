#include<iostream>
//#include "pair.h"
#include<string>
#ifndef _HOUSE_H_
#define _HOUSE_H_
template<class T>
class House
{
	private:
		T item1;
		T item2;
	public:
		House(T a, T b);
		T getMax();
		T getMin();
		T getItem1();
};
#endif
using namespace std;
template <class T>
T House::getMax()
{
	return item1 < item2 ? item2 : item1;
}
template <class T>
T House::getMin()
{
	return item1 > item2 ? item2 : item1;
}
template <class T>
House::House(T a, T b)
{
	item1 = a;
	item2 = b;
}
int main()
{
	House<int>(5,7) h1;
	cout<<h1.getMax();
	return 0;
}
