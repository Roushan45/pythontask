#include<stdio.h>

int main()
{
 	int trafficFlow[7]={23, 55, 64, 52, 79, 66, 30};
	int maxTrafic=trafficFlow[0];
	int minTraffic=trafficFlow[0];
	int i,choice,sumOfTrafficFlow=0,averageTraffic=0;
	for(i=0;i<7;i++)
	{
		sumOfTrafficFlow=sumOfTrafficFlow+trafficFlow[i];
	//	printf("arra i %d \n",trafficFlow[i]);
		if(trafficFlow[i]>maxTrafic){
			maxTrafic=trafficFlow[i];
		}
		if(trafficFlow[i]<minTraffic){
			minTraffic=trafficFlow[i];
		}
	}
	bool flag=true;
	averageTraffic = sumOfTrafficFlow/7;
	do
	{
		printf("enter 1 for max traffic flow in week \n");
		printf("enter 2 for min traffic flow in week \n");
		printf("enter 3 for average traffic flow in week \n");
		printf("enter 4 for exit \n");
		scanf("%d",&choice);
		switch(choice){
			case 1: printf("maximun trafic in week : %d\n",maxTrafic);break;
			case 2: printf("minimum trafic in week : %d\n",minTraffic);break;
			case 3: printf("average trafic in week : %d\n",averageTraffic);break;
			case 4: flag=false;break;
		}
	}while(flag);

	return 0;
}
