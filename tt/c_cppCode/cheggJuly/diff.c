#include<stdio.h>
int main()
{
	
	int x,y;
	x=5;y=5;
//	x-=y+2;
	if((x % 2 == 1)||(y >= 0))
	{
		y++,x/=2;
	}
	printf("%d %d",x,y);
	return 0;
}

