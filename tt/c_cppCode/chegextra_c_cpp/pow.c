#include <stdio.h>
#include <math.h>

int main ()
{
   int num;
   printf("Enter an Integer : ");
   scanf("%d",&num);
   printf("f(%d) = %d",num,calPow(num));
   
   return(0);
}
//this recursive function will calculate power
//of upto n^n+1
int calPow(int n)
{
	int power = pow(n,n+1);
	if(n!=0){
		return power+calPow(--n);
	}
	return power;
}
