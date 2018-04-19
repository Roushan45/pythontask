//employee.c
#include <stdio.h>
#include "employee.h"
#include "linkedList.c"
#include <stdlib.h>
#include<string.h>
struct employee* buildEmployeeList(char* filename)
{
//Scan each line of file "filename" using fscanf and create a struct
//containing the data that you get back. You should initialize the
//other members which you did not get data for (netIncome, taxesWitheld, next pointer)
//to some known value. It would be wise to set 'next' to NULL!
char name[15];
char buffer[100];
int id;
int hoursWorked;
float perHour;
FILE *fin;
fin = fopen(filename, "r");
struct employee *listHead=NULL;
if (fin == NULL)
{
    {
        printf ("Error opening the file\n\n'");
        exit(EXIT_FAILURE);
    }
}
else{
     while (EOF != fscanf(fin, "%s %d %d %f\n", name,id,hoursWorked,perHour))
    {

        struct employee* emp=(struct employee*)malloc(sizeof(struct employee));
        strcpy(emp->name,name);
        emp->id=id;
        emp->netIncome=hoursWorked*perHour;
        emp->taxes=emp->netIncome*0.15;
        listHead=append(listHead,emp);
    }
    
}
return listHead;
}
void writeSalaryInfoToFile(struct employee* listHead, char* filename)
{
}
