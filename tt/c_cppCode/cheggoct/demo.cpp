#include <stdio.h>
#include <stdlib.h>
int main(){
    char filename [30];
    FILE * ifp = NULL;
    int keys[7], i=0, num, input[7], hasht[101] = {0}, flag = 0;
    int count = 0;
    while(1){//chaged the running status
        printf("What is the name of the file : ");
        scanf("%s", filename);
        ifp = fopen(filename, "r");
       // printf("ifp %d\n",(ifp==0));//for debugging only
        if(ifp)//if not null
        	break;//breaking the loop
        else{
        	printf("Error on opening file !\n");
		}
    }
//    fclose(file);
    printf("To get to me treasure you'll have to figure out which of me 100 \nkeys are used in the 7 locks of me treasure chest.\n");
    while(1){
    printf("Which keys will ye use?\n");
            for(i = 0; i < 7; i++)
            scanf("%d", &input[i]);
        for(i = 0; i < 7; i++){
            if(hasht[(input[i] - 1)] == 0)
            hasht[(input[i] - 1)] = 1;
            else{
            printf("You can only use each key once, matey!\n");
            flag = 1;
            }
        }
    if(flag != 1){
        for(i = 0; i < 7; i++){
            if(hasht[(keys[i] - 1)] != 1)
            break;
            else
            count++;
        }
    if(count != 7)
    printf("%d of those keys are correct, matey! But are they in the right order?\n", count);
    else{
    for(i = 0; i < 7; i++){
        if(input[i] != keys[i])
        break;
        }
    if(i == 7){
        printf("Arr! You've opened me treasure chest and found...\n");
        printf("A map! To the rest of me treasure on Treasure Island.\n");
        printf("Hahaha!\n");
        break;
            }else{
            printf("7 of those keys are correct, matey! But are they in the right order?\n");
            }
        }
    }
}
return 0;
}
