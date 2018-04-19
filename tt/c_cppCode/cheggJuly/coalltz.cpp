#include<iostream>
using namespace std;

int Collatz(int n,int k)
{
	cout<<n<<" "<<k<<endl;
	if(n==1)
		return k;
	if(n%2==0)
		return Collatz(n/2,k+1);
	else
		return Collatz(3*n+1, k+1);
}
int main()
{
	cout<<Collatz(1,0)<<endl;
	cout<<Collatz(8,0)<<endl;
	cout<<Collatz(6,0)<<endl;
	return 0;
}
