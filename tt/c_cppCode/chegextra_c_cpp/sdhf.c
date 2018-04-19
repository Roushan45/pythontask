#include<stdio.h>

int main(void)
{
	int a[5]={2,4,8,9,5};
	int i;
	//printing the value using  pointer arithmetic
	for(i=0;i<5;i++)
	{
		printf("%d\n",*(a+i));
	}
	
	return 0;
}
