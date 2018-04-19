#include<stdio.h>
#include<assert.h>
void triangleTest(double a, double b, double c)
{
	assert(a>0 &&"msg");
}
int main(void)
{
	triangleTest(-3,5,6);
	return 0;
}
