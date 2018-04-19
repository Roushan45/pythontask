#include<stdio.h>
//method for comparing string
int strCompare(const char *str,const char *str2)
{
	int equal=0;
	int index=0;
//iterating through string while not have null character
	while(str[index]!='\0' && str2[index]!='\0')
	{
		//at any index if char are not equal
		if(str[index]!=str2[index])
		{
			//changing the equal value
			equal=1;
			//breaking the loop
			break;
		}
		index++;
	}
	//if equal ==0 and both string last index was null then
	//string are equal
	if(equal==0 && str[index]=='\0' && str2[index]=='\0')
	{
		//and returning 0
		return 0;
	}
	//if not equal returning 1
	return 1;
}

int main()
{
	//two char array 
	char s1[100];
	char s2[100];
//asking user to enter  string
	printf("Enter string1 : ");
	scanf ("%[^\n]%*c",&s1);
	printf("Enter string2 : ");
	scanf ("%[^\n]%*c",&s2);
	//comparing the string by calling the function
	//and storing the result in i
	int i=	strCompare(s1,s2);
	//if i=0 string are equals
	//if i=1 string not eaual
	printf("string comapre result %d ",i);
	return 0;
}
