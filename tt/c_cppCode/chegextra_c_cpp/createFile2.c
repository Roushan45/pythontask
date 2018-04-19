# include<stdio.h>

int main()
{
    int number;
    int copy;
    //declared one file pointer
    FILE *file;
       while(1)
   {    printf("Enter a number:");
       scanf("%d",&number);
       printf("Hexadecimal: %x\n",number);
       //copy the number to a variable because
       //in below steps you are modifying the file
       copy=number;
       //Convert Decimal to Binary
       int bin[100], c=1, i;
       while(number != 0)
       {
           bin[c++] = number % 2;
           number = number/2;
       }
      
      for(i=c-1; i>0; i--)
         printf("%d",bin[i]);
       printf("\n");
       //this will store the user choice
       char choice;
       //file name will store in this
       char fileName [50] ; 
       printf("Do you wish to save to file : y\n");
       scanf(" %c",&choice);
       if(choice=='y'|| choice=='Y'){
       	printf("Enter the file name : ");
       	scanf("%s",&fileName);
       	//opening the file in write mode
        file = fopen(fileName,"w");
        //writtig the variable to file
        fprintf(file, "Number =  %d \n" ,copy);
        fprintf(file,"Hexadecimal = %x \n",copy);
        fwrite(bin, sizeof(int), c, file);
        printf("\nfile is saved\n");
        //closing the file
        fclose(file);
	   }
   }
    return(0);
}
