package string;

public class TwoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "daddfjjkk";
//		char []array = s.toCharArray();
//		for(int i=0;i<array.length;i++){
//			if(array[i]==array[i+1]){
//				
//			}
//		}
		StringBuffer sb = new StringBuffer(s);
		for(int j=0;j<sb.length()-1;j++){
			if(sb.charAt(j)==sb.charAt(j+1)){
				sb.delete(j, j+2);
			}
			if(sb.charAt(sb.length()-1 )==sb.charAt(sb.length())){
				sb.deleteCharAt(sb.length()-1);
				sb.deleteCharAt(sb.length()-2);
			}
		}
		System.out.println(sb.toString());
	}

}
