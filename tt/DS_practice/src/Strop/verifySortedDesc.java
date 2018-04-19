package Strop;

public class verifySortedDesc {

	public static void main(String[] args) {
		int a[] = {45,43,42,60,13,12};
		System.out.println(isSorted(a));

	}

	public static boolean isSorted(int []a)
	{
		for(int i=1;i<a.length;i++)
		{
			System.out.println("a i+1 : "+a[i-1]+" ai "+a[i]);
			if(a[i-1]<a[i])
				return false;
		}
		return true;
	}
}
