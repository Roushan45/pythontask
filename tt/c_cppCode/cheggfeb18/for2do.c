#include<stdio.h>
/*convertion of for loop to do loop*/
void main(){
    //in below example will print 1 to 10 using for loop
    //and do while loop
    int i,j=1;
    printf("For loop started.... \n");
    /*in for loop i=1 is the initial value of i
      and have the condition i<=10 of termination of loop when value of i will be grerater than
      10 and after each execution value of i will be increased by 1 i++ */
    for(i=1;i<=10;i++){
        printf("i = %d\n",i);
    }
    printf("\ndo while loop started.... \n");
    /* 
        in do while loop , do block will run until while satisfies the 
        condition for example in do loop it is printing the value of j and 
        increasing the value of j after j+=1 and after checking the condtion 
        in while block j<=10 if value of j will greater than 10 then it will not go
        to do bock any more
    */
    do{
        printf("j = %d\n",j);
        j+=1;
    }
    while(j<=10);
}