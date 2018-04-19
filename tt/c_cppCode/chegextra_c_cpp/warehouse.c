#define _GNU_SOURCE
#include<stdio.h>
#include <stdlib.h>
#include<string.h>

typedef struct goods{
	char name[100];
	int number;
	int quantity;
}Item;
void display (Item items[],int count);
int main(void)
{
	Item items[100];
	FILE *fp;
	int count=0;
	const size_t line_size = 300;
	char * line = malloc(line_size);
    size_t len = 0;
    ssize_t read;
	char fileName[30];
	printf("Enter the file name : ");
	scanf("%s",&fileName);
	fp = fopen(fileName,"r");
	char name[100];
	int q,n;
	if(!fp)
	{
		printf("File %s not found \n",fileName);
	}
	
	else{
		while (fgets(line, line_size, fp) != NULL) {
       char *p;
       int x=0;
       Item newItem;
        for (p = strtok(line," "); p != NULL; p = strtok(NULL, " "))
			{
  			//	puts(p);
  				if(x==0)
  				newItem.number=atoi(p);
  				if(x==1)
  				strcpy(newItem.name,p);
  				if(x==2)
  				newItem.quantity=atoi(p);
  				x++;
			}
			items[count++]=newItem;
			//newItem.
    }
	}
	display(items,count);
	return 0;
}
void display (Item items[],int count)
{
	int i1;
	
	for(i1=0;i1<count;i1++)
	{
		printf("%s %d %d \n",items[i1].name,items[i1].number,items[i1].quantity);
	}
}
