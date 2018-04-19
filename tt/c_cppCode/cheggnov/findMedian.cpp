#include<algorithm>
#include<iostream>
/*method for finding the median
it takes array and size of array as argumnent
*/
double findMedian(int array[],int size){
	double median=0;
	//if size of array is even  like 4, 8,10...
	//two it requires two middle most number
	if(size%2==0){
		//getting first number
		double a=array[size/2];
		//and next  number of first as second number
		double b=array[(size/2)-1];
		//cacculating average of two medians
		median = (a+b)/2.0;
}
	else{
		/*if size of array is an odd like 3,5,7,9...
		then getting the haly element like 7/2=3 int will never output the decimal
		and adding 1 to get middle 3+1=4 which will be middlw of 7 
		
		*/
		median=array[(size/2)+1];
	}
	return median;
}
int main(){
	//initializing the array
	 int array[] = {23, 5, -10, 0, 0, 321, 1, 2, 99, 30};
	 //size of an array 
  int size = 10; 
  std::sort(array, array + size);
  //sorting using inbuilt sort method from algorithm
  for (int i = 0; i < size; i++) 
     std::cout << array[i] << ' ';
//finding the median and printing to display
	std::cout<<std::endl<<std::endl<<"Median of array : "<<findMedian(array,size)<<std::endl;
    return 0;
}
