#include<string.h>
#include<stdio.h>

int main()
{
	char d[30][40];
	char line[30];
	int count=0;
	char *token;
		
	const char delim[2] = "/";
	while(count<2)
	{
	
		printf("Enter date %d (MM/DD/YYYY) : ",count+1);
		fgets(line,30,stdin);
		token = strtok(line, delim);
		char str[40];
		char tt[40];
		int j=0;
		while( token != NULL ) 
		{
			char t[40];
	
			strcpy(t,token);
			if(j<2){
				strcat(str,t);
			strcat(str,"    ");
			}
			if(j==2){
				t[strlen(t) - 1] = '\t';
				str[0]=' ';
				strcat(t,str);
				strcat(tt,t);
			strcpy(d[count],tt);
			t[0]='\0';
			tt[0]='\0';
			}
			token = strtok(NULL, delim);
			j++;
		}
		count++;
	//	puts(t);
	}
	int i;
	for(i=0;i<count;i++)
	{
		printf("%s\n",d[i]);
	}
	return 0;
}
