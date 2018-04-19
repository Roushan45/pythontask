#include "PayRoll.h"
#include<iostream>
using namespace std;
PayRoll::PayRoll()
{
	HPR = 10;
	NHW = 40;
}
PayRoll::PayRoll(int nhw)
{
	HPR=10;
	NHW=nhw;
}
PayRoll::PayRoll(float hpr)
{
	HPR=int(hpr);
	NHW=40;
}
PayRoll::PayRoll(int hpr, int nhw)
{
	HPR=hpr;
	NHW=nhw;
}
void PayRoll::setHPR(int hpr)
{
	if(hpr<1&&hpr>20)
	{
		cout<<"value of hpr not matching";
	}
	if(hpr>0&&hpr<20)
	{
		HPR=hpr;
	}
}
void PayRoll::setNHW(int nhw)
{
	if(nhw<1&&nhw>60)
	{
		cout<<"value of nhw not matching";
	}
	if(nhw>0&&nhw<60)
	{
		NHW=nhw;
	}
}
int PayRoll::getNHW()
{
	return NHW;
}
int PayRoll::getHPR()
{
	return HPR;
}
double PayRoll::getGrossPay()
{
	return HPR*NHW;
}

