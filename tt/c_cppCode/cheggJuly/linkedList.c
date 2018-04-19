//linkedList.c
#include "employee.c"
#include "linkedList.h"
#include "employee.h"
//Add the struct 'emp' to the end of the linked list pointed to
//by 'listHead' (the first node in the list)
//return a pointer to the first node in the list (listHead)
struct employee* append(struct employee* listHead, struct employee* emp)
{
    if(listHead==NULL)
    {
    	emp->next=listHead;
    	listHead=emp;
    	return listHead;
	}
	else
	
}
//Search for an employee in the list who has the name 'name'
//if found, return a pointer to the employee struct
//otherwise return NULL
struct employee* search(struct employee* listHead, char* name)
{
}
//delete all nodes in the list. This means freeing memory
void clearList(struct employee* listHead)
{
}
