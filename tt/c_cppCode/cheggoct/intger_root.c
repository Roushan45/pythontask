#include<stdio.h>
/*
Method to calculate integer square root of given natural number
without using any math function
*/
int iroot(int n) 
{    
   /*
   if value of n is 0 or 1 so no need to calculate square root
   */
    if (n == 0 || n == 1) 
       return n;
/*
Run time of Binary search is O(log (n)) and it is the requiremnt 
of program
*/
    //variables required for performing calculation
    int _first = 1;
	int temp = n;
	int result;  
	//using while loop 
    while (_first <= temp) 
    {   
	    //calculating mid of value     
        int mid = (_first + temp) / 2;
 
        // if value n is already square roor
        //then no need to calculate
        //simply return the value
        if (mid*mid == n)
            return mid;
 
        //if sqrt is less than given value n
        if (mid*mid < n) 
        {
            _first = mid + 1;
            result = mid;
        } 
        else /*
		         else have high value than n*/
            temp = mid - 1;        
    }
    return result;//returning the calculated square root
}
int main()
{
	int no;
	printf("Please input a positive integer : \n");
	scanf("%d",&no);
	printf("The integer root of %d is %d.\n",no,iroot(no));
}
