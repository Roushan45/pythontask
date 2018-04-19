#include<stdio.h>
int main()
{
	int daffy=-8, porky=6;
	
	daffy=porky--;

	printf(" %d %4d\n ",daffy,porky);//output = 6    5
	
	return 0;
}
