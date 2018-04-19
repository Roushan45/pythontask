#include <stdio.h>
#include <string.h>
void plurals(char* noun, char* plural);
int main()
{
	char choice;
	
	do{
	//declared the noun char array 
	char noun[50];
	//asking for input
	printf("Supply Noun : ");	
	//scanning input
	scanf("%s",&noun);
	//finding length of string
	int l = strlen(noun);
	//matching the last letter
	//and accordingly using plurals
	if(noun[l-1]=='y')
	//calling plurals with ies
		plurals(noun, "ies");
	//if last char s, ch, or sh
	else if(noun[l-1]=='s'||(noun[l-1]=='h'&&noun[l-2]=='c')||(noun[l-1]=='h'&&noun[l-2]=='s'))
		//calling plurals with es
		plurals(noun, "es");
	else
	//if last char others
			plurals(noun, "s");
	//asking for another input
	printf("\nDo Another (y/n)?");
	//scannin the choice
	scanf(" %c", &choice);
   }
   while(choice=='y'||choice=='Y');
}
//plurals method
void plurals(char* noun, char* plural)
{
	int l = strlen(noun);
	//in case of y
	if(plural=="ies")
	{
		//removing y by marking last chat to null
		noun[l-1]='\0';
		//adding \0 at last
		plural="ies\0";
		//concating two string  noun and plural
		char *newNoun = strcat(noun,plural);
		//printing the plural
		printf("The plural is :");
		puts(newNoun);
	}
	else if(plural=="es"){
	
		plural = "es\0";
		char *newNoun = strcat(noun,plural);
		printf("The plural is :");
		puts(newNoun);
	}
	else{
		plural="s\0";
		char *newNoun = strcat(noun,plural);
	
		printf("The plural is :");
		puts(newNoun);
	}
}
