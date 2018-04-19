#include<stdio.h>
/*Structure of fraction with numerator and denominator*/
struct fraction{
	int numerator;
	int denominator;
};
//main function
int main()
{
	//taken six fraction instances
	struct fraction f1,f2,f3,f4,f5,f6;
	//assign the value to them
	f1.numerator=4;
	f1.denominator=7;
	f2.numerator=4;
	f2.denominator=7;
	f3.numerator=5;
	f3.denominator=9;
	f4.numerator=3;
	f4.denominator=9;
	f5.numerator=1;
	f5.denominator=4;
	f6.numerator=3;
	f6.denominator=4;
	//comaring the fraction and printing the result
	printf("Comapring f1(4/7) with f2(4/7)  :  %d\n",comareFraction(f1,f2));
	printf("Comapring f3(5/9) with f4(3/9)  :  %d\n",comareFraction(f3,f4));
	printf("Comaprinf f5(1/4) with f6(3/4)  :  %d\n",comareFraction(f5,f6));
	return 0;
}
//this method will comapre the fraction and output the 
//result based on calculation
int comareFraction(struct fraction f1, struct fraction f2)
{
	//four int variables declared
	int num1,den1,num2,den2;
	//getting the numerator and 
	//denomiantor of each fraction
	num1=f1.numerator;
	den1=f1.denominator;
	num2=f2.numerator;
	den2=f2.denominator;
	//casting to double data type
	double d1 = (double)num1/den1;
	double d2 = (double)num2/den2;
	//if both fractions equal
	//returning zero
	if(d1==d2)
		return 0;
	//if first fraction is less than
	//second fraction returning -1
	else if(d1<d2)
		return -1;
	//else retuning 1
	return 1;
}
