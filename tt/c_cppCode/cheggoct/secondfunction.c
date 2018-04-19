#include <stdio.h>/*Include library*/
//added parameters ;in functions
int function(int a, int b, int c, int d, int e, int f);
int secondfunction(int a, int b, int c, int d, int e, int f);

int main(void)
{
	//asking the user inputs 
  printf("Enter three points back to back like this: (1,2) enter it like 1 2.\n");/*Output*/
  
  int a, b, c, d, e, f;/*Initialize variables*/
  scanf("%d%d%d%d%d%d", &a, &b, &c, &d, &e, &f);/*Store public value for 6 integers*/
  //calling functions with parameter
  function(a,b,c,d,e,f);/*Calling function in the main function*/
  secondfunction(a,b,c,d,e,f);/*Calling function in the main fucntion*/
  return 1;/*Return exit value*/
}
int function(int a, int b, int c, int d, int e, int f)/*New function*/
{
  int area;/*Intialize variables*/
  area = ((0.5) * abs((a * (d - b)) + (c * (f - b)) + (e * (b - d))));/*Area formula, abs used as absolute value brackets*/
  printf("Triangle points: (%d,%d), (%d,%d), and (%d,%d)\n", a, b, c, d, e, f);/*Ouptut of the points*/
  printf("Area = %d\n\n", area);/*Ouput area computed from the area formula*/ 
  return 1;/*Return exit value*/
}
int secondfunction(int a, int b, int c, int d, int e, int f)/*New function*/
{
  
  double side;/*Type double*/
  double perimeter;/*Type double*/
  side = sqrt((c - a) * (c - a) + (d - b) * (d - b));/*Side formula*/
  perimeter = (side + side + side);/*Perimeter formula, side added three times*/
  printf("Perimeter = %.2f", perimeter);/*Output the perimeter computed from the perimeter formula*/
  return 1;/* Return exit value*/
}
