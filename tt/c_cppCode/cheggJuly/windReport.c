#include<stdio.h>
#include<string.h>

int main()
{
	char inputFile[30]="wind.txt";
	char outputFile[30]="wind_report.txt";
	char cityName[50];
	int data[5][12];
	int max=0;
	int min=0;
	int avg=0;
	FILE *fptr = fopen(inputFile,"r");
	const size_t line_size = 300;
	char* line = malloc(line_size);
	int lineNo=0;
	int k=-2;
	while(fgets(line,line_size,fptr)!=NULL)
	{
		if(line[strlen(line)-1]=='\n')
		{
			//printf("line conatine ne line");
			line[strlen(line)-1]=='\0';
		}
	//	printf("line %s",line);
		if(lineNo==0)
		{
			strcpy(cityName,line);
		}
		if(lineNo>1)
		{
			//int k=lineNo-2;
			//printf("k = %d  ",k);
			char *temp = strtok(line," ");
			while(temp!=NULL)
				{
					//printf("temp %s\n",temp);
					int j;
					for(j=0;j<5;j++)
					{
						if(temp==NULL)
							break;
						printf("temp %s\n",temp);
						data[j][k]=atoi(temp);
						temp=strtok(NULL,line);
					}
				}
		}
		lineNo++;
		k++;
	}
	int l,m;
	printf("\n");
	for(l=0;l<5;l++)
	{
		for(m=0;m<12;m++)
		{
			printf("%d  ",data[l][m]);
		}
		printf("\n");
	}
	return 0;
}
