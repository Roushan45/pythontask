#include <stdio.h>

int main()
{
	int array[100];
	int prime[100];
	int i=1,j=0,k,l;
	int count = 0;
	for(i;i<=100;i++){
		array[i]=i;
	}
	for(j;j<=100;j++){
			printf ("\nElement%d",array[j]);
	}
	k = array[1];
	int p;
	for(k;k<=100;k++){
		for(l=2;l<=100;l++){
			if(k%l==0){
				p=0;
				break;
			}
			p=1;
			printf("p",p);
		}
	
		if(p==1){
			int m;
			printf("p=%d",p);
			for(m=0;m<100;m++){
				array[m]=p;
				count++;
			}
		}
	}
	printf ("Count%d",count);
}
