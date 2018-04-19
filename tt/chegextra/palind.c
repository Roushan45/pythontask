#include <stdio.h>
#include <ctype.h>
int main()
{
	char sentence[100], ch;
    int j,k,i = 0;
    printf("Enter a message : ");
    while(ch != '\n')    // terminates if user hit enter
    {
    	//reading one by one char using getchar
        ch = getchar();
        //checking the if charater is only albhabets
        if(isalpha(ch)){
        sentence[i] = tolower(ch);
        //using normal int to keep track of
        //array value at index
        i++;	
		}
        
    }
    sentence[i] = '\0';       // inserting null character at end
   // printf("Name: %s", sentence);
    int isPalidrone = 1;
    k=i;
    for(j=0;j<i;j++)
    {
    	//checking for palindrome
    	//here logic is just comapring the 
    	//first char to last char
    	//first char is in increasing fashion
    	//and last char in decreasing fashion
    	if(sentence[j]!=sentence[--k])
    	{
    		//if not then marking the value 0
    		//and breaking the loop
    		isPalidrone=0;
    		break;
		}
	}
	//printing the output
	if(isPalidrone==1)
		printf("Palindrome");
	else
		printf("Not a palidrone");
    return 0;
}
