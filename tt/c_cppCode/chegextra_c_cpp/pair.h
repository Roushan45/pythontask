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
