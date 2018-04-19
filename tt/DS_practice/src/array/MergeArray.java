package array;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arry = {43,78,322,21,77,9,21,01,0,12};
		int ar []={3};
		int test[]=MergeArray.mergeArray(arry, ar);
		for(int i : test){
			System.out.print(i+"\t");
		}

	}
	public static int [] mergeArray(int array1[], int [] array2){
		int mergeLength = array1.length + array2.length;
		int merge[]=new int[mergeLength];
		int temp = 0;
		for(int i=0;i<array1.length;i++){
			for(int j=i+1;j<array1.length;j++){
				//System.out.println(array1[i]+"\t"+array1[j]);
				if(array1[i]>array1[j]){
					temp = array1[i];
					array1[i]=array1[j];
					array1[j]=temp;

				}
			}
		}
	//	for(int)
		for(int i =0 ;i<array1.length;i++){
			merge[i]=array1[i];
		}

		return merge;
	}


}
