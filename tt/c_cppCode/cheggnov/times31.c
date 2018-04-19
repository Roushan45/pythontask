#include<stdio.h>
/*
* times31 - multiplies by 31
* Should exactly duplicate effect of C expression (x*31),
* including overflow behavior.
* Examples: times31(1) = 31
* times31(-1) = -31
* Legal ops: ! ~ & ^ | + << >>
* Max ops: 6
* Rating: 6
*/
int times31(int x) {
//<<5 will result to 2^5 that is 32
//so mutiplying by 32 and 
 int j=(x<<5);
 //later on negating the value of x from j that will be 31
 int k=j + ~x + 1;
 //no of ops - 3
 return k;

}
int main(){

   //testing the above function
    printf("31*-1 = %d\n",times31(-1));
    printf("31*1 = %d\n",times31(1));
    printf("31*4 =%d\n",times31(4));
    printf("31*7 =%d\n",times31(7));
    printf("31*-10 =%d\n",times31(-10));
    return 0;
}