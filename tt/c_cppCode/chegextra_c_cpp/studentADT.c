#include<stdio.h>
#include<string.h>
#include<stdlib.h>
//defined student struct with required 
//fields
struct Student
{
	int id;
	char name[255] ;
	int age;
	float gpa;	
};
//constructor for creating object
struct Student* newStudent(char n[],int i)
{
	//created empty object
	struct Student *temp =	malloc(sizeof(struct Student));
	//checking required validation
	if(strlen(n)>0 && i>0)
	{
		strcpy(temp->name,n);
		temp->id=i;
		return temp;
	}
	printf("returning null\n");
	//if required validation fails then return NULL
	return NULL;
}
//set age method that takes student and age
struct Student* SetAge(struct Student* stu,int age)
{
	//cheking if stu not equalt to equal
	if(stu!=NULL)
	{
//checked required validation for age
	if(age>0)
	{
		stu->age=age;
	}
	else
	{
		stu=NULL;
	}
}
return stu;
}
//set age method that takes student and age
struct Student* setGPA(struct Student *stu,float gpa)
{	//cheking if stu not equalt to equal
	if(stu!=NULL)
	{
		if(gpa>0.0 && gpa<=4.0)
		{
			stu->gpa=gpa;
		}
		else
		{
			stu=NULL;
		}
	}
	return stu;
}
int main()
{
	char name[255];
	int id,age;
	float gpa;
	char filename[30];
	FILE *file;
	int records=100;
	 struct Student *students=(struct Student*)malloc(sizeof(struct Student)*records);
	const size_t len=250;
	char *line=(char*)malloc(sizeof(len));
	char *token;
	ssize_t read;
	int count=0;
	file = fopen("student.txt","r");
	if (file == NULL)
        exit(EXIT_FAILURE);
        while (fgets(line, len, file) != NULL)  {
   // printf("%s",line);
    token=strtok(line," ");
    int i=0;
    while(token!=NULL)
    {
    	//printf("%s\n",token);
    	
    	if(i==0)
    	{
    		strcpy(name,token);
		}
		if(i==1)
		{
			
			id=atoi(token);
			printf("con %d",id);
		}
		if(i==2)
		{
			age=atoi(token);
		}
		if(i==3)
		{
			char *t=strtok(token,"\n");
		//	printf("gpa %s",t);
			gpa=atof(t);
		}
		i++;
		token=strtok(NULL," ");
		
	}
	struct Student * stu = newStudent(name,id);
		stu=SetAge(stu,age);
		stu=setGPA(stu,gpa);
	//	printf("after gpa\n");
		
			*(students+count)=*stu;
			count++;
		
		
   
}
int j;
for(j=0;j<count;j++)
{
	struct Student temp=*(students+j);
	printf("\n%s\n",temp.name);
	printf("%f\n",temp.gpa);
		printf("%f\n",temp.age);
	
}
		//printf("Enter the name : ");
//fgets(name,30,stdin);
//	printf("Enter the ID : ");
	//scanf("%d",&id);
	//using constructor created new student
//	struct Student * _1st = newStudent(name,id);
//	printf("Enter the Age : ");
	//scanf("%d",&age);
//	printf("Enter the GPA b/w 0.0 to 4.0 : ");
	//scanf("%f",&gpa);
	//setting age and gpa
//	SetAge(_1st,age);
	//setGPA(_1st,gpa);
	//printing the student information
	//	printf("NAME : %s ID : %d  AGE : %d  GPA : %f",_1st->name,_1st->id,_1st->age,_1st->gpa);
		return 0;

}
