package string;

import java.util.Scanner;

public class PanagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pangram = "We promptly judged antique ivory buckles for the prize";
		Scanner scan = new Scanner(System.in);
        String input = pangram;
        boolean flag = false;
        outerloop:
        for(char c='a';c<='z';c++){
           // char caps = Character.toUpperCase(c);
            innerloop:
            for(int i=0;i<input.length();i++){
            	//System.out.println(input.charAt(i));
            	
            	char dd = Character.toLowerCase(input.charAt(i));
            //	System.out.println(c==dd);
                if(c != dd){
                	flag=false;
                    continue;
                }
                else{
                    flag=true;
                    break innerloop;
                }
                
                
            }
        if(!flag){
        	 System.out.println("not pangram");
        	break;
        }
        }
        if(flag){
            System.out.println("pangram");
        }
//        else{
//            System.out.println("not pangram");
//        }
	}

}
