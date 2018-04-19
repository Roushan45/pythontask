#include<stdio.h>

char * get_message(){
	char *msg="Aren't pointers fun?";
	return msg;
}
int main(void){

char *string =get_message();
	puts(string);
	return 0;
}
