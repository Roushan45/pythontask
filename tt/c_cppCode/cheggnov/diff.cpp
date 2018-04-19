#include<iostream>
using namespace std;
int difference(int n)
{
    int diff = 0;
    int num=n, temp, rem, reverse = 0;
    //using while converting to reverse by dividing 10
   while (num > 0)
    {
        rem = num % 10;
        reverse = reverse * 10 + rem;
        num /= 10;
    }
   //finding absolute the difference 
    diff=abs(n-reverse);
    return diff;
}
int main()
{
    int num, s = 0;
    //using while asking input
    while(1){
    	cout<<"Enter the number : ";
    	cin>>num;
    	if(num<0)//on ebtering -ve value breaking the loop
    		break;
    	s+=difference(num);//adding to sum
	}
	//displaying the sum
    cout << "\n\nThe Sum of difference is :  " << s << endl;
}
