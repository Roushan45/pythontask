package array;

public class Chegg2104 {
	
	static void print(int arr[],int size, int curNode)
	{
		int leftChild, rightChild;
		leftChild = curNode * 2 + 1;
		rightChild = curNode * 2 + 2;
		if(leftChild >= size && rightChild >= size)
		{
			System.out.print(arr[curNode]+" ");
			return;
		}
		print(arr,size,rightChild);
		print(arr,size,leftChild);
		
		return;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,5,3,7,6,2,4};
		print(arr,7,0);

	}

}
