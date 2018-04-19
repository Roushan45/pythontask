#include<stdio.h>
#define MAX 3
void average();
int main()
{
	average();
	return 0;
}
void average()
{
	int scores1[MAX];
	int scores2[MAX];
	int sum1,sum2;
	
	printf("Enter the team shannon scores \n");
	int i;
	for(i=0;i<MAX;i++)
	{
		printf("enter %d Score : ",i+1);
		scanf("%d",&scores1[i]);
	}
	printf("\nEnter the team jasmine scores \n");
	for(i=0;i<MAX;i++)
	{
		printf("enter %d Score : ",i+1);
		scanf("%d",&scores2[i]);
	}
	printf("\nTeam Shannon Scores and average score \n");
	for(i=0;i<MAX;i++)
	{
		printf("Score %d : %d\n",i+1,scores1[i]);
		sum1+=scores1[i];
	}
	printf("Average Score for Shannon Team : %f \n",(float)sum1/3.0);
	printf("\nTeam jasmine Scores and average score \n");
	for(i=0;i<MAX;i++)
	{
		printf("Score %d : %d\n",i+1,scores2[i]);
		sum2+=scores2[i];
	}
	printf("Average Score for jasmine Team : %f \n",(float)sum2/3.0);
	
	printf("Average Score for both Team : %f \n",((float)(sum1+sum2))/2.0);
}
