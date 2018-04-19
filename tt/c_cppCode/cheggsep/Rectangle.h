/*headed file or interface for Rectangle class*/
#ifndef RECTANGLE_H
#define RECTANGLE_H
class Rectangle{
	private:
		int length,breadth;
	public:
		Rectangle();
		void set_values(int l,int b);
		int area();
};
#endif
