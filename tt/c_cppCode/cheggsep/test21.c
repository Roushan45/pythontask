#include<stdio.h>
//#include<stdlib.h>
int main(void)
{
	//char input[5];
	int input;
	int neg_no_count=0;
	printf("Please enter numbers, or q to quit \n");
	while(1)
	{
		int i=scanf("%d",&input);
		if(!i)
		break;
		if(input<0)
			neg_no_count++;
	}
	printf("Number for negative-number-entered = %d",neg_no_count);
	return 0;
}
