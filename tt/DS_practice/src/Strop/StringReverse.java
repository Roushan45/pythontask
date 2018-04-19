package Strop;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Apple";
		char orgnl [] = str.toCharArray();
		char [] rvrs = new char[orgnl.length];
		for(int i = orgnl.length-1;i>=0;i--){
			for(int k= 0;k<rvrs.length;k++){
				rvrs[k]=orgnl[i];
			}
		}
		for (int i=0;i<rvrs.length;i++){
			System.out.println(rvrs[i]);
		}
	}

}
