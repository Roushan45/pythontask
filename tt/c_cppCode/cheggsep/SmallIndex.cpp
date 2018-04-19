#include<limits.h>
/*program for finding the first index of small no
from given int array*/
	int smallestIndex(int* array,int size)
	{
		//declare two required var for 
		//recording index and small no
		int firstIndex;
		int smallestNo = INT_MAX;
		for(int i=0;i<size;i++)
		{
			if(array[i]<smallestNo)
			{
				//if small no find
				//updating index and smallest no
				smallestNo=array[i];
				firstIndex=i;
			}
		}
		//returning the index
		return firstIndex;
	}
