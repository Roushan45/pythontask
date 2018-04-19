# include <stdio.h>
#include <stdlib.h>
int main()
{
	double a,b;
	printf("Enter Integer value for a & b : ");
	scanf("%lf %lf",&a, &b);
	if(a==b)
		printf("a and b are equal");
	else if(a<b)
		printf("a is less than b");
	else
		printf("a is less than b");
		
	return EXIT_SUCCESS;
}
