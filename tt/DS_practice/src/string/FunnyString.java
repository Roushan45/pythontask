package string;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ivvkxq";
		
		StringBuffer revBuffer = new StringBuffer(s).reverse();
		String reverse  = new String(revBuffer);
		
		System.out.println(s +"  " + reverse);
		char [] org = s.toCharArray();
		char [] rev=reverse.toCharArray();
		boolean found = true;
		for(int i=1;i<org.length;i++){
			if(Math.abs(org[i]-org[i-1])!=Math.abs(rev[i]-rev[i-1])){
				found = false;
			}
	}
		if(found){
			System.out.println("Funny");
		}
		else{
			System.out.println("Not Funny");
		}
	} 

}
