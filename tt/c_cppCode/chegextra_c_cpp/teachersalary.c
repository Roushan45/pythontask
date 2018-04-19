#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
	const MAX_LINE_SIZE = 256;
	char line[ MAX_LINE_SIZE ];
	int *salary[50];
	char* firstName[50];
	char* lastName[50];
	int count = 0;
	size_t nstr;
	
	for (nstr = 0; nstr < 3; ++nstr) {
		printf("Enter irst name");
      if (fgets( line, MAX_LINE_SIZE, stdin ) != NULL) {
           firstName[ nstr ] = malloc( strlen( line ) );
           strcpy( firstName[ nstr ], line );
      }
      printf( "%s\n", firstName[ nstr ] );
}
	
	return 0;
}
