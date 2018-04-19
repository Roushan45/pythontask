package string;

public class ReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabssdfw";
		StringBuffer r =new StringBuffer(s);
		
		for(int i=0;i<r.length()-1;i++){
			if(r.charAt(i)==r.charAt(i+1)){
				r=r.deleteCharAt(i);
				r=r.deleteCharAt(i+1);
			}
		}
		System.out.println(r);

	}

}
