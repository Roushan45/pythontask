/*header file Coin class*/
#include<string>
using namespace std;
#ifndef COIN_H
#define COIN_H	
//static variable for total value
static double totalValue;
class Coin{
	//data members
	private:
		int year;
		double faceValue;
		string description;
		int quantity;
		double marketValue;
		//functions
	public:
		Coin(int y,double fv,string desc,int q,double mv);
		Coin();
		~Coin();
		void setYear(int y);
		void setFaceValue(double fv);
		void setDescription(string desc);
		void setQuantity(int q);
		void setMarketValue(double mv);
		int getYear();
		double getFaceValue();
		string getDescription();
		int getQuantity();
		double getMarketValue();
};
#endif
