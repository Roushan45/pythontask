#include<stdio.h>

void main(){
    int s=1,t=1,a=2,n=4;
    int i;
    for(i=1;i<4;i++){t=t*10+1;s=s+t;printf("%d %d \n",t,s);}
}