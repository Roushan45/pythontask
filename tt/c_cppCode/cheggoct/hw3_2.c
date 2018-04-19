#include<stdio.h>
int main(void)
{
	int nu;
	printf("Enter the number : ");
	scanf("%d",&nu);
	int i;
	int sum=0;
	for(i=1;i<=nu;i++)
		sum+=i;
	printf("The sum from 1 to %d is %d ",nu,sum);
	return 0;
}
