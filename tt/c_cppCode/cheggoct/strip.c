#include<stdio.h>
#include<string.h>
int strip_q_marks( char* c)
{
	//char c[40];
	//strcpy(c,str);
//	const char *c=&str;	
//	printf("copy done %s %d\n",strlen(const c));
	
	int count=0;
	int i;
	for(i=6;i>0;i--)
	{
		if(c[i]=='?')
		{
			count++;
			c[i]='\0';
		}
		else break;
	}
	//strcpy(str,result);
	//	printf("all done");
	return count;	
}
int main(int argc, char **argv)
{
	char *test={"kjdfhn?"};
	int result = strip_q_marks(test);
	printf("%s %d ",test,result);
	return 0;
}


