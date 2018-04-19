#include<stdio.h>
int cal(int a,int b);
int main()
{
	int result=120;
	printf("%d",cal(cal(23,-32),23),8);
	return 0;
}
int cal(int a,int b){
	return(a>b?a:b);
}
