#include<stdlib.h>
#include<stdio.h>
#define fileName "prog01.txt"
int main(){
	FILE* fp;
	int n;
	printf("Number of iteration : ");
	scanf("%d",&n);
	float array[n][3];
	int i,j;
	for(i=0;i<n;i++){
			array[i][0]=(float)i+1;
		for(j=0;j<2;j++){
		
			while(1){
				char temp[6];
				//atoi
				printf("Enter Experiment %d: ",j+1);
				scanf("%s",&temp);
				int status=atof(temp);
				if(status){
					array[i][j+1]=atof(temp);
					break;
				}
				else{
					printf("invalid number !\n");
				}
			}
		}
		//array[i][0]=i+1;
	}
	float avg[n];
	printf("\nAverage of data sets ...\n");
	for(i=0;i<n;i++){
		float t = (array[i][1]+array[i][2])/2;
		avg[i]=t;
		printf("Iteration %d Average : %.2f\n",i+1,t);
	}
	
	printf("\nPercent diff between two averages : \n");
	for(i=0;i<n-1;i++){
	
		printf("percent diff of 1 and %d is : %ld \n",i+2,(abs(abs(avg[0]-avg[i+1])/(abs(avg[0]+avg[i+1])/2.0)*100.0)));
	
	}
	
	printf("1)Print to display\n2)Write to file");
	char choice[3];
	while(1){
		scanf("%s",&choice);
		int st = atoi(choice);
		if(st){
			if(st==1){
				printf("\nIteration Experiment 1  Experiment 2\n");
				for(i=0;i<n;i++){
					
					printf("%d       %.2f         %.2f\n",(int)array[i][0],array[i][1],array[i][2]);
					
				}
				break;
			}
			else if (st==2){
				fp = fopen(fileName,"w");
				if(!fp){
					printf("Error opening file for writting \n");
					exit(-1);
				}
				fprintf(fp,"%d\n",n);
				for(i=0;i<n;i++){
					fprintf(fp,"%d  %.2f  %.2f\n",(int)array[i][0],array[i][1],array[i][2]);
				}
				break;
			}
			else{
				printf("Invalid choice !\n");
			}
		}
		else{
			printf("Invalid choice ! try again !\n");
		}
	}
	return 0;
}
