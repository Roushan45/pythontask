#include<stdio.h>
//#include<stdlib.h>
int main(void)
{
	int input;
	int neg_no_count=0;
	printf("Please enter numbers, or q to quit \n");
	//in while asking the input
	while(1)
	{
		int i=scanf("%d",&input);
		//if i false or valie 0 it means user enters wrong non-numeric
		if(!i)
		break;//breaking the loop
		//if input is negative incrementing the count
		if(input<0)
			neg_no_count++;
	}
	//printing the result
	printf("Number for negative-number-entered = %d",neg_no_count);
	return 0;
}
