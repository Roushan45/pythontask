#include<stdio.h>
#include<stdlib.h>
struct points{
	int x;
	int y;
};
int main(int argc,char**argv){
	if(argc<2)
		exit(-1);
	FILE *ftr;
	ftr = fopen(argv[1],"r");
	char ch;
	if (ftr == NULL)
    {
        printf("Error on opening file \n");
        exit(0);
    }
    ch = fgetc(ftr);
    int noOFLine = ch-'0';
    ch = fgetc(ftr);
    char *line=(char*)malloc(sizeof(char)*10);
    struct points *point=(struct points*)malloc(sizeof(struct points)*noOFLine);
    int count=0;
    while (fgets(line, sizeof(line), ftr)) {
        const char* val1 = strtok(line, " ");
        const char* val2 = strtok(NULL, " ");
        point[count].x=atoi(val1);
        point[count].y=atoi(val2);
        count++;
    }
    int i;
    for(i=count-1;i>=0;i--)
    {
    	printf("%d %d\n",point[i].x,point[i].y);
	}
	return 0;
}
