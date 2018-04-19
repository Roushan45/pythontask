//using embedded struct
#include<string.h>
#include<stdio.h>

struct transporation{ 
    char company[20];
    char model[30];
    int engine_capacity;
    //declare the struct inside the struct
    //that is embedded struct
    struct dateOfManufacturing{
    int day;
    int month;
    int year;
    };
    struct dateOfManufacturing dom;
};

int main(){
     char dom[20];
    //declared the transporation struct
    struct transporation t;
    //getting the details from user
    printf("Enter company name : ");
    gets(t.company);
    printf("Enter model : ");
    gets(t.model);
    printf("Enter engine capacity : ");
    scanf("%d",&t.engine_capacity);
    printf("Enter date of manufacturing [DD MM yy] format : "); getchar();
    gets(dom);
    //splitting the date of manufacturing using tokenizer
    char *token;
    token=strtok(dom," ");
    int count=0;
    while(token!=NULL){
        if(count==0){
            t.dom.day=atoi(token);
        }
        if(count==1){
            t.dom.month=atoi(token);
        }
        if(count==2){
            t.dom.year=atoi(token);
        }
        token=strtok(NULL," ");
        count++;
    }
   // printing the data
   printf("\ncompany : %s\n",t.company);
   printf("model : %s\n",t.model);
   printf("engine_capacity : %d\n",t.engine_capacity);
   printf("Date of Manufacturing : %d/%d/%d\n",t.dom.day,t.dom.month,t.dom.year);
    return 0;
}
   
