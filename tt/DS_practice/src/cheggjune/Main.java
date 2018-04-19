package cheggjune;

public class Main {

	public static void main(String[] args) {
		String s2="001100111";
		String s="1001001";

		String com="";
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();){
			if(i==0){
				if(s.charAt(0)=='1')
					com=com+"0,";
			}
			
			if(s.charAt(i)=='1'){

				while(s.charAt(i)!='0'){
					count++;
					i++;
					if(i==s.length())break;
				}
				com=com+count+",";
				System.out.println("1 count ="+count);
				count=0;
			}
			if(i==s.length())break;
			if(s.charAt(i)=='0'){

				while(s.charAt(i)!='1'){
					count++;
					i++;
					if(i==s.length())break;
				}
				com=com+count+",";
				System.out.println("0 count ="+count);
				count=0;
			}
		}
		System.out.println(com);

		//System.out.println(com);
	}
}
