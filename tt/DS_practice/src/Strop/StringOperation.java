package Strop;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("qwerty"));
		System.out.println(checkPalidrone("Mauiam"));
		System.out.println(checkIntPelidrone(423));
	}
	
	public static String reverse(String string){
		char []revrs = new char[string.length()];
		String rvrs="";
		for(int i = string.length()-1;i>=0;i--){
			rvrs = rvrs+string.charAt(i);
//			for(int j=0;j<string.length();j++){
//				revrs[j]=string[i];
//				int s = string[i];
//			}
		}
		return rvrs;
	}
	public static boolean checkPalidrone(String s){
		 boolean isPalidrone=true;
		 for(int i=0;i<s.length();i++){
			
			 if(s.toLowerCase(). charAt(i)  !=s.toLowerCase().charAt(s.length()-i-1)){
				 isPalidrone = false;
				 break;
			 }
		 }
		 
		 return isPalidrone;
	}
	
	public static boolean checkIntPelidrone(int no){
		//boolean isPaldronint = false;
		
		int i =0;
		i = no;
		int sum=0;
		int count =1;
		int reminder = 0;
		int multiplier=1;
		while(i>0){
			reminder  = i%10;
			if(count>1){
				multiplier = multiplier*10;
			}
			sum = sum +(reminder*multiplier);
			i= i/10;
			count++;
		}
		System.out.println("\nsum = "+sum);
		return sum==no;
	}

}
