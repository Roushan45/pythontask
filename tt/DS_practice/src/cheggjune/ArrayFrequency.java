package cheggjune;

public class ArrayFrequency {
	
	public static void main(String[] args) {
		int array[]={3,45,2,3,4,4,23,3,3,5,8,67,6,5,75,5,45,5,75,44,75};
		System.out.println("Array klength = "+array.length);
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[i])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i : array)
			System.out.print(i+" ");
		System.out.println();
		int a[]=new int [20];
		int index=0;
		int count=1;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				//System.out.println("arra[j] = "+array[j]+" array[i] = "+array[i]);
				if(array[j]==array[i])
				{
					count++;
					System.out.println("array [j]  "+array[j]+" & i ="+i+"& j="+j
							+" count = "+count);
					//System.out.println("increasing the count");
					
					continue;
				}
				i=i+count;
				//System.out.println(i);
				//System.out.println("count = "+count);
				a[index]=count;
				count=1;
				index++;
			}
		}
		System.out.println();
		for(int i=0;i<index;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
