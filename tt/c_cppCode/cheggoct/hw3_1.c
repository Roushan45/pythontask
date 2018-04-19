#include<stdio.h>
int main(void)
{
	int length,width;
	printf("Program to calculate are of rectangle\n\n");
	printf("Enter the length : ");
	scanf("%d",&length,&width);
	printf("Enter the width : ");
	scanf("%d",&width);
	printf("\nAre of Rectangle : %.2f ",(double)length*width);
	return 0;
}
