#include<iostream>
#include<math.h>
using namespace std;
double windChillCalculator(double temp,double speed);
void printWindChill(double temp,double low_wind_speed,double high_wind_speed,double wind_speed_step);
int main()
{
	//declared  variables for user input
	double temp,low_wind_speed, high_wind_speed, wind_speed_step;
	cout<<"Enter the Temperature : ";
	cin>>temp;
	cout<<"Enter the low Wind speed : ";
	cin>>low_wind_speed;
	cout<<"Enter the high Wind speed : ";
	cin>>high_wind_speed;
	cout<<"Enter the  Wind speed step : ";
	cin>>wind_speed_step;
	//caling printWindChill with given parameters
	printWindChill(temp,low_wind_speed,high_wind_speed,wind_speed_step);
	return 0;
}
double windChillCalculator(double temp,double speed)
{
	//by using the given formula for wind chill
	//and using pow from math.h computing the wind chill
	return (35.74+(0.6215*temp)-(35.75*pow(speed,0.16))+(0.4275*temp*pow(speed,0.16)));
}

void printWindChill(double temp,double low_wind_speed,double high_wind_speed,double wind_speed_step )
{
	//in loop calucating and printing the result
	for(double i = low_wind_speed;i<=high_wind_speed;i+=wind_speed_step)/*increasing the speed by adding step*/
	{
		double wind_chill = windChillCalculator(temp,i);
		cout<<"The wind chill is "<<wind_chill<<"  degrees F. for an airtemperature of "<<temp<<" degrees F  and a wind speed of "<<i <<" mph."<<endl;
	}
}
