#include<iostream>
using namespace std;
int main(void)
{
	//variables for storing the respective count
	int neg_count=0,pos_count=0;
	double sum=0;//for storing the sum
	cout<<"Enter the integers (press enter after each integer), 0 to exit \n";
	int temp;
	while(1)//unspecified no of loops
	{
		cin>>temp;
		if(temp==0)break;//if user enter 0 breaking the loop
		else if(temp<0)
		{
			neg_count++;//in case of negative count
		}
		else if(temp>0)
		{
			pos_count++;//in case if positive count
		}
		sum+=temp;//adding the sum
	}
	cout<<endl;
	//printing the analysis
	cout<<"No of Positive Integers : "<<pos_count<<endl;
	cout<<"\nNo of Negative Integers : "<<neg_count<<endl;
	cout<<"\nTotal sum of Integers : "<<sum<<endl;
	cout<<"\nAverage of  Integers : "<<sum/(double)(neg_count+pos_count)<<endl;
	return 0;
}
