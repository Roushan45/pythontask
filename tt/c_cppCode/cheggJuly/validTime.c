#include<stdio.h>
#include<string.h>
#include<stdlib.h>
//global variable declared
static int valid=0;
static int invalid=0;
void readToken(FILE *fPtr);
void checkTime(char *token);
int main(int argc,char *argv[])
{
	//checking the no of command line argument
	if(argc<2)
	{
		//if not valid returning -1
		printf("Improper number of parameters – try again\n");
		return -1;
	}
	FILE *fptr = fopen(argv[1],"r");
	if(!fptr)
	{
		//if invalid file
		printf("invalid file\n");
		return -1;
	}
	//calling the read token with file pointer
	readToken(fptr);
	//printing the sumary using the sttaic int variable
	printf("There were %d tokens in file\n",(valid+invalid));
	printf("%d tokens were valid time\n",valid);
	
	return 0;
}
//readToken function
void readToken(FILE *fPtr)
{
	const size_t line_size = 300;
char* token = malloc(line_size);
//looping the file line by line 
while (fgets(token, line_size, fPtr) != NULL)  {
//passing the line for checking the valid time
    checkTime(token);
}
}
//checktime method
void checkTime(char *token)
{
	//copied the token in copy variable
	//for latter use
	char copy[30];
	strcpy(copy,token);
	char *temp;
	char buf1[10];
	char buf2[10];
	//using strtok for spliting the string
	temp=strtok(token,":");
	int count=0;
	/*if size of string is greater than or equal to 9
	then no need to go further its invalid */
	if(strlen(copy)<9)
	{
	while(temp!=NULL && count<2)
	{
		//copying the splitted string in buf1 and buf2
		if(count==0)
			strcpy(buf1,temp);
		if(count==1)
			strcpy(buf2,temp);
		temp=strtok(NULL,token);
		count++;
	}
	//checking the lenght of buf1 and buf2
	//xx:xxam or xx:xxpm
	if(strlen(buf1)==2&&strlen(buf2)==5)
	{
		//if hour is greater than 0 and 
		//less than 12 else marking invalid
		if(atoi(buf1)>0&&atoi(buf1)<13)
		{
			//cheking for am and pm
			if((buf2[3]=='m'||buf2[3]=='M')&&(((buf2[2]=='a')||buf2[2]=='A')||((buf2[2]=='p')||buf2[2]=='P')))
			{
				//copyinh the numeric digit of buf in t1 array
				char t1[3];
				t1[0]=buf2[0];
				t1[1]=buf2[1];
				t1[3]='\0';
			//convering to int and checking for
			//valid minutes
				if(atoi(t1)>0&&atoi(t1)<=60)
				{
					printf("%s\n",copy);
					//if valid then increasing the count
					valid++;
				}
				else//in case of invalid increasing tje count
					invalid++;
			}
			else
				invalid++;
		}else
			invalid++;
	
		
	}else
			invalid++;
}
else
	invalid++;
	
}
