#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{

char line [1000] ;
FILE *file;
float totalweight=0,totalhieght = 0;
int count=0;

file =fopen("foo.txt","r");
    		if (!file)
        		return 1;

    		while (fgets(line,1000, file)!=NULL){
    		//increasing the no of count, that is line in text file
				count++;
    			//data will store the spillited data
    				char *data;
    				int i=0;
    				//using string tokenizer to splitting into 
    				//multiple wordsd by :(given i file)
    				data=strtok(line,":");
    				while(data!=NULL){
    				//as per file given weight is at the 2nd index
    				//note index starting from 0
    					if(i==2){
    						//using atof function to conerting 
    						//scientific nottion data to float
    						//data like 1.502E+2 = 150.200
    						//and adding to total weight
    						totalweight = totalweight+atof(data);
						}
						//as per file given hieght is at the 3nd index
						if(i==3){
							//similar like weight 
							//here adding weight to total weight
							totalhieght=totalhieght+atof(data);
						}
    					data=strtok(NULL,":");
    					i++;
    					
					}
			}
		//printing the data 
		//for average totalweight/totalhieght/count	
		//and whatever the no of line in file count will incrementred as per no line
		 printf("The average weight :   %.2f lb",totalweight/count);
		 
		 printf("\nThe average hieght :   %.2f ft",totalhieght/count);	

	return 0;
}
