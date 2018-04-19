package Strop;

public class DemoRecursive {
	
	static int sum(int n){
		int sum1=0;
		if(n<=0){
			return 0;
		}
		sum1=sum1+n;
		return sum1 + sum(--n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(9));
	}

}
