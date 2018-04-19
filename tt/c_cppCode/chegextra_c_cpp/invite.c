#include<stdio.h>

int main()
{
	//declared the required variable
	int i,j,k,l;
	//declared variable to store price of packages 
	//provided by user
	float smallPackagePrice,largePackagePrice,totalcost;
	int noOInvitation;
	//Taking all the input rom user
	printf("What is the cost of a small package (in dollars)?\n");
	scanf("%f",&smallPackagePrice);
	printf("What is the cost of a large package (in dollars)?\n");
	scanf("%f",&largePackagePrice);
	printf("How many invitations are you sending out??\n");
	scanf("%d",&noOInvitation);
	//checking the required valodation asked in solution 
	//like value of packages and no of invitation
	if(noOInvitation<10000&&((smallPackagePrice<500.00&&largePackagePrice<500.00)&&(smallPackagePrice>0.0&&largePackagePrice>0.00)))
	{
		//here i will collect the no of largePackages required
		i=noOInvitation/200;
		//here j will reminder , ie less than 200
		j=noOInvitation%200;
		//if remainder invitation is greater than 0
		if(j>0)
		{
			//finding the no of small packages required
			k=j/50;
			//it will store the reaminder
			l=j%50;
			//if remainder greater than 0 then 
			//it will add one more small packages
			if(l>0)
			{
				k=k+1;
			}
			//here calculating and comparing price for small packages with large packages
			if((k*smallPackagePrice)>=largePackagePrice)
			{
				//if price of small packages greater than large package
				//then it will add one more large packages
				i=i+1;
				//and resetting the value of k
				k=0;		
			}
		}
		//calculating the total price
		totalcost=(k*smallPackagePrice)+(i*largePackagePrice);
		//if required small package more than 0
		if(k>0)
		{
			printf("You should order %d small package(s).\n",k);
		}
		//if required small package more than 0
		if(i>0)
		{
			printf("You should order %d large package(s).\n",i);
		}
		
		printf("Your cost for invitations will be  %.02f$",totalcost);
	}
	//if input doesnot meet the required criteria then it will return to exit
	else{
		printf("something goes wrong, please check the input provided ");
		return -1;
	}
	return 0;
}
