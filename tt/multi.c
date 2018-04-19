#include<stdio.h>

void main(){
    int s=1,t=1,a=2,n=4;
    int i;
    for(i=1;i<4;i++){t=t*10+1;s=s+t;printf("%d %d \n",t,s);}
}
/*
1)
k=3
explanation:
in switch statement s have value of 1
so case 1 will be heated and value of k will be 1;
as there is no break statement it will execute second case statement also
then value of k will be 3 and here break statement is given so program switch statement will
be exited and value of k 3 will be printed

2)You already have selected the correct value

3)S=2468
in this case value of a=2 and n=4
in the for loop value of i is starting at 1 and it will run i<n that is i=3
so three times for loop will run in the first run 
t=t*10+1 here the value of t is 1 so 1*10+1 = 11
and value of s will be s=s+t that is 1+11=12
and second loop value of t will be 11*10+1=111
and value of s will be 123
and final run value of t will be 111*10+1=1111
and value of s will be 1234
and after the loop value of s will be s=s*a that is s=1234*2=2468
so SUM=2468 will be printed
*/