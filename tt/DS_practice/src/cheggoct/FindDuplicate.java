package cheggoct;

public class FindDuplicate {

	public static boolean DuplicateBinaryFind(int[] arr, int left, int right)
	{
	   boolean dup =false;

	   if(left==right)
	   {
	      dup = true;
	   }
	   else
	   {
	        int middle = (left+right)/2;
	        if(arr[middle]<middle)
	        {
	          dup = DuplicateBinaryFind(arr,left, middle-1);

	        }
	        else
	        {
	           dup = DuplicateBinaryFind(arr, middle+1, right);
	        }
	   }

	   return dup;

	}
	public static int first(int arr[], int low, int high, int x, int n)
    {
        if(high >= low)
        {
            int mid = low + (high - low)/2;
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
             else if(x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid -1), x, n);
        }
    return -1;
    }
	public static void main(String[] args) {
		int array[] = {2,3,5,7,8,9,9};
		System.out.println(DuplicateBinaryFind(array, 0, array.length));
		System.out.println(first(array, 0, array.length, 9, array.length));
	}
}
