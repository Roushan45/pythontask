#include<stdio.h>
int main(void)
{
	//it wii store the no of grades
	int noOfGrades;
	double total=0;
	printf("How many grade items would you like to enter? ");
	scanf("%d",&noOfGrades);
	printf("\n");
	int i;
	//using loop scanning the grades
	for(i=1;i<=noOfGrades;i++)
	{
		double temp;
		printf("Enter the grade for grade item number %d :  ",i);
		scanf("%lf",&temp);
		//adding to total
		total+=temp;
	}
	//calculating average
	double average = (total/(double)noOfGrades);
	//printif the average
	printf("\nAverage Grade : %.2f%% \n",average);
	//calculating grade 
	//for more that 90 grade A
	if(average>=90.0)
		printf("Letter Grade: A");
	//for grade between 80 - 90 grade B
	else if(average<90.0 && average>=80.0)
		printf("Letter Grade: B");
	//for grade between 70 - 80 grade C
	else if(average<80.0 && average>=70.0)
		printf("Letter Grade: C");
		//for grade between 60 - 70 grade D
	else if(average<70.0 && average>=60.0)
		printf("Letter Grade: D");
	//else grade F
	else
		printf("Letter Grade: F");
	return 0;
}
