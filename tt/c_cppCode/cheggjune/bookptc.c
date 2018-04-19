#include<stdio.h>
//book struct is defined
typedef struct book
{
	double price;
};

int main()
{
	//created book structure
	struct book *bookptr=(struct book*)malloc(sizeof(struct book)*1);
	//printing the data
	printf("printed by *bookptr->price %d\n\n",bookptr->price);
	//using another way to print from struct pointer 
	printf("printed by (*bookptr).price) %d",(*bookptr).price);
	return 0;
}
