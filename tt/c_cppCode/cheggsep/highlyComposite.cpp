#include<iostream>

using namespace std;

int main()
{
	int noOfDivisors=0;
	int test;
	cout<<"Enter the no for cheking the highly composite or not ? ";
	cin>>test;
	//if invalid input printing the Error
	//and exiting the program
	if(test<=0)
	{
		cout<<"Error";
		exit(1);
	}
	//counting the no of divisors for given input
	for(int i=1;i<=test;i++)
	{
		//if remainder equal to 0
		if(test%i==0)
		{
			//incrementing the count of divisiors
			noOfDivisors=noOfDivisors+1;
		}
	}
	//looping through from 1 to given no-1
	//counting the no of divisiors for
	//each element
	for(int i=1;i<test;i++)
	{
		//it is temp var that count the 
		//divisor for no
		int t=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				t++;
			}
		}
		//if no of divisor is gretaer than or equal 
		//to given number then printing the output
		//and returning from the program
		//case of non-higly composite no
		if(t>=noOfDivisors)
		{
			cout<<"False "<<test<<" "<<i<<" "<<t<<endl;
			return 0;
		}
			
	}
	//if no is highly composite 
	//priting the no and no of divisors
	cout<<"True "<<test<<" "<<noOfDivisors<<endl;
	return 0;
}
