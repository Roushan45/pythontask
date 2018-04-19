package cheggoct;

public class RecursionMystery {
	
	public static int mystery(int n)
	{
		if(n<=0)return 0;
		else if (n==1) return 1;
		else return n + mystery(n-2);
	}
	public static void main(String[] args) {
		System.out.println(mystery(1));
		System.out.println(mystery(-6));
		System.out.println(mystery(3));
	}
}
