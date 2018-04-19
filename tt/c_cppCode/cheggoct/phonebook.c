#include<stdio.h>
#include<stdlib.h>
#include<string.h>
// create a struct
struct phonebook{
    char fname[20];
    char lname[20];
    char phone[8];
};
void addfriend(struct phonebook **, int *);
void deletefriend(struct phonebook **, int);
void showPhonebook(struct phonebook **);
//four new methods added
void sortByFirstName(struct phonebook **);
void findNumber(struct phonebook **);
void randomSelect(struct phonebook **);
void deleteAll(struct phonebook **);
int main(int argc,char**argv)
{
    int i;
       
    // create an array of type struct phonebook
    struct phonebook **arr = (struct phonebook **)malloc(50 * sizeof(struct phonebook *));
   
    // index at which new entry is to be added
    int index = 0;
   FILE *ftr;
    // set all entries of arr to NULL
    for( i = 0 ; i < 50 ; i++ )
        arr[i] = NULL;
    char line[40];
    if(argc>1){
    	ftr = fopen(argv[1],"r");
    	if(!ftr){
    		perror("Error on opening file!\n");
		}
		else{
			while (fgets(line, sizeof(line), ftr)) {
        	 char* val1 = strtok(line, ",");
        	 char* val2 = strtok(NULL, ",");
        	 char temp[40];
        	 char temp1[40];
        	  char buf[256];
   			sscanf(temp, "%s", temp1);
        	 strcpy(temp,val1);
        	printf("%s %s %s\n",val1,val2,temp1);
    }
		}
	}
	
    while(1)
    {
        printf("Enter one of the following options ...\n");
        printf("1) Add friend\n2) Delete friend\n3) Show phone book\n4) Sort By First Name\n5) Find phone number\n6) Random Friend\n7) Delete all\n8) Quit\n");
       
        int option;
        scanf("%d",&option);
       
        switch(option)
        {
            case 1 : addfriend(arr, &index);
                     break;
                     
            case 2 : deletefriend(arr, index);
                     break;
                    
            case 3 : showPhonebook(arr);
                     break;
            case 4 : sortByFirstName(arr);
					 break; 
			case 5 : findNumber(arr);
					 break; 
			case 6 : randomSelect(arr);
					 break;  
			case 7 : deleteAll(arr);
					 break;  
			case 8 : sortByFirstName(arr);
					 exit(0);      
            default : printf("Invlid choice , try again !\n");
            		   exit(0);
        }
    }
   
   return 0;
}
void addfriend(struct phonebook **arr, int *index)
{
    struct phonebook *temp = (struct phonebook *)malloc(sizeof(struct phonebook));
   
    printf("Enter the name of friend\n");
    scanf("%s%s", temp->fname, temp->lname);
   
    printf("Enter the phone number\n");
    scanf("%s", temp->phone);
   
    arr[*index] = temp;
   
    (*index)++;
}
void deletefriend(struct phonebook **arr, int index)
{
    char f[20], l[20];
    printf("Enter the name of friend\n");
    scanf("%s%s", f, l);
    int i;
   
    // find the required contact
    for( i = 0 ; i < 50 ; i++ )
        // if contact is found
        if(arr[i] && !strcmp(arr[i]->fname, f) && !strcmp(arr[i]->lname, l))
            // set that element to NULL
            arr[i] = NULL;
}
void showPhonebook(struct phonebook **arr)
{
    int i;
   
    for( i = 0 ; i < 50 ; i++ )
        // if element is not NULL
        if(arr[i])
            printf("Name : %s %s\nPhone Number : %s\n\n",arr[i]->fname, arr[i]->lname, arr[i]->phone);
}
//funtion to sort by first name
void sortByFirstName(struct phonebook **arr)
{
	int i,j;
	//three char pointer for storing the temp data
	char *temp1= (char*)malloc(sizeof(char)*20);
	char *temp2=(char*)malloc(sizeof(char)*20);
	char *temp3=(char*)malloc(sizeof(char)*8);
	for(i=0;i<50;i++)
	{
		if(arr[i])
			for(j=i+1;j<50;j++)
			{
				if(arr[j])
					if(strcmp(arr[j]->fname,arr[i]->fname)<0)//comparing the name
					{
						strcpy(temp1,arr[j]->fname);//copying to temp
						strcpy(temp2,arr[j]->lname);
						strcpy(temp3,arr[j]->phone);
						strcpy(arr[j]->fname,arr[i]->fname);//changin array index value
						strcpy(arr[j]->lname,arr[i]->lname);
						strcpy(arr[j]->phone,arr[i]->phone);
						strcpy(arr[i]->fname,temp1);
						strcpy(arr[i]->lname,temp2);
						strcpy(arr[i]->phone,temp3);
					}
			}
	}
	showPhonebook(arr);//printing tha names
}
void findNumber(struct phonebook **arr)
{
	char f[20], l[20];
    printf("Enter the name of friend\n");
    scanf("%s%s", f, l);
    int i;
   
    for( i = 0 ; i < 50 ; i++ ){
	//if name found
       
        if(arr[i] && !strcmp(arr[i]->fname, f) && !strcmp(arr[i]->lname, l)){
		
           //printing the name
            printf("Phone number : %s\n",arr[i]->phone);
            return;
	}

}//if name not found
	printf("Name not found \n");
}
//method to select random friend
void randomSelect(struct phonebook **arr)
{
	int i;
	//in loop
	while(1){
	//generting rand no in between 0-50
	i = rand() % 50;
	if(arr[i])//if not null
	{
		printf("Name : %s %s\nPhone Number : %s\n\n",arr[i]->fname, arr[i]->lname, arr[i]->phone);
		break;
	}
}
}
//method to dlete all names
void deleteAll(struct phonebook **arr){
	int i;
	 for( i = 0 ; i < 50 ; i++ )
        arr[i] = NULL;
}
