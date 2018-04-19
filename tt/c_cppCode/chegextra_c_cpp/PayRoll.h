//Header file conatins class definition
#ifndef PayRoll_H
#define PayRoll_H	
class PayRoll{
	private:
		int HPR;
		int NHW;
	public:
		PayRoll(float HPR);
		PayRoll(int NHW);
		PayRoll(int HPR, int NHW);
		PayRoll();
		void setHPR(int HPR);
		void setNHW(int NHW);
		int getHPR();
		int getNHW();
		double getGrossPay();
	
	
};
#endif
