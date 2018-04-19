#include<stdio.h>
#include<limits.h>

int overflow(int n)
{
	if(n>=INT_MAX)
		return n;
	printf("%d\n",n);
	return overflow(n+1);
} 

int main()
{
	overflow(1);
	return 0;
}
