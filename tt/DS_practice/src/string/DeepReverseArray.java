package string;

public class DeepReverseArray {
	
	/*public static int[] deDupAndReverse(int [] list) {
		//if 0 or only 1 element in array then simply returning it
		if(list.length==0||list.length==1)
			return list;
		//creating a temp array with list lenght
		int temp[]=new int[list.length];
		//thus will count the unique values
		int uniqueCount=0;
		for(int i=list.length-1;i>=0;i--) {
			boolean flag=false;
			//filtering the duplicate elements
			for(int j=0;j<uniqueCount;j++) {
				if(list[i]==temp[j]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				temp[uniqueCount++]=list[i];
			}
		}
		//new list with new size it will make sure no extra space
		list=new int[uniqueCount];
		//copy the element from temp to list
		for(int i=0;i<uniqueCount;i++) {
			list[i]=temp[i];
			
		}
		
		return list;
	}
//Testing the above function
	public static void main(String[] args) {
		//
		int array1[]=deDupAndReverse(new int []{4,5,5,5,7});
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		int array2[]=deDupAndReverse(new int[] {});
		System.out.println("\n\nSize of array 2 : "+array2.length);
		
		System.out.println();
		int array3[]=deDupAndReverse(new int [] {11,22,33,44,44,44,44,44,55,55,66,66,77,88});
		for(int i=0;i<array3.length;i++)
			System.out.print(array3[i]+" ");
	}
*/
}
