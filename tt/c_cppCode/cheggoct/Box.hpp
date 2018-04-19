#ifndef BOX_HPP
#define BOX_HPP
//Box class have declaration of private variables
//and methods and constructors
class Box{
	private:
		double height;
		double width;
		double length;
	public:
		Box(double,double,double);
		Box();
		void setHeight(double);
		void setWidht(double);
		void setLength(double);
		double calcVolume();
		double calcSurfaceArea();
};
#endif
