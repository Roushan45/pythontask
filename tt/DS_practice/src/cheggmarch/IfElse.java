package cheggmarch;

import java.util.StringTokenizer;

public class IfElse {
	
	public static void main(String[] args) {
		String time="01:05:45AM";
		String hr="";
		String mn="";
		String sec="";
		//StringBuffer mn,sec;
		StringTokenizer token = new StringTokenizer(time, ":");
		while(token.hasMoreTokens()){
			hr=token.nextToken();
			mn=token.nextToken();
			sec=token.nextToken();
			sec= sec.substring(0,2);
		}
		int hour = Integer.valueOf(hr);
		for(int i=1;i<=12;i++){
			if(hour==24){
				hour=0;
			}
			hour++;
		}
		String h;
		if(hour<10){
			 h = "0"+String.valueOf(hour);
		}
		else{
			h=String.valueOf(hour);
		}
		System.out.println(h +" "+mn+" "+sec );
	}

}
