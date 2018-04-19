#include<stdio.h>

char* strstr1(char *str1 , char *str2);
int main(void)
{
	//sample run 
	char *name = "Rahul";
	char *find = "hul";
	//storing the result
	char *result = strstr1(name,find);
	printf("Does Rahul contains hul : ");
	//based on result printing the result
	if(result==NULL)
		printf("Not Found");
	else
		printf("found ");
	return 0;
	
	
}
char* strstr1(char *str1 , char *str2)
{
	//declare the required variables
	int pos1 = 0, pos2 = 0;
	int i,j,found;
	//looping until reach the null char
	//str1 and str2
	while (str1[pos1] != '\0')
        pos1++;
    while (str2[pos2] != '\0')
        pos2++;
        //usinf nested loop looping through 
        //both str1 and str2
    for (i = 0; i <= pos1 - pos2; i++)
    { 
        for (j = i; j < i + pos2; j++)
        {
            found = 1;
            //if char not equal then breaking the loop
            if (str1[j] != str2[j-i])
            {
                found = 0;
                break;
            }
        }
        if (found == 1)
            break;
    }
    //if not found returning the NULL
    if(found==0)
    	return NULL;
    //returning the first pointer
    return &str1[pos1];
}
