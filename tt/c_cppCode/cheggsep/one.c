#include<stdio.h>
#include <stdlib.h>
int main(int argc , char**argv)
{
	FILE *fp;
	//open file for reading
	fp = fopen(argv[1],"r");
	if(!fp)
	{
		printf("Error on opening file ");
		exit(1);
	}
	char c;
	//delared the five vowels
	float a=0,e=0,i=0,o=0,u=0,total=0;
       do 
    {
    	//reading char by char from file
      c = (char)fgetc(fp);
      //comaring to respective vowel
      //and increasing the count
	if(c=='A'||c=='a')
	{		
		a+=1;
		total+=1;
	}
	else if(c=='E'||c=='e')
	{
		e+=1;
		total+=1;
	}
	else if(c=='I'||c=='i')
	{
		i+=1;
		total+=1;
	}
	else if(c=='O'||c=='o')
	{
		o+=1;
		total+=1;
	}
	else if(c=='U'||c=='u')
	{
		u+=1;
		total+=1;
	}
    } while(c != EOF);
    //calculating and printing sum
    printf("%f percent, were a/A\n",((a/total)*100));
    printf("%f percent, were e/E\n",((e/total)*100));
    printf("%f percent, were i/I\n",((i/total)*100));
    printf("%f percent, were o/O\n",((o/total)*100));
    printf("%f percent, were u/U\n",((u/total)*100));
	return 0;
}
