#include<stdio.h>
int main()

{

/*Variables required for computing*/

int noOfDays;

double miles,tax,total,subtotal;

//asking for no of days and storing to noOfDays

printf("Enter the number of days the car was rented: ");

scanf("%d",&noOfDays);

//asking for miles and storing to miles

printf("Enter the number of miles the car was driven: ");

scanf("%lf",&miles);

//using if condition cheking how was driven

if(miles>=200.0){//if more than 400

subtotal=(miles*0.35)+(15*noOfDays);//calculating subtotal

tax = subtotal*(6.0/100.0);//6 percent tax

total=subtotal+tax;//adding subtotal and tax

}

if(miles<200){//if less than 200 miles driven

subtotal=(miles*0.40)+(15*noOfDays);

tax = subtotal*(6.0/100.0);

total=subtotal+tax;

}


//printing the result

printf("Subtotal:\t\t$%.2f\n",subtotal);
printf("Tax Amount:\t\t$%.2f\n",tax);
printf("Total:\t\t\t$%.2f\n",total);


return 0;

}
