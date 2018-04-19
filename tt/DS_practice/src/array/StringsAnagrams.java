package array;

public class StringsAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcc";
		String b="ccdeh";
		char aa[]=a.toCharArray();
		char bb[]=b.toCharArray();
		int matchcount=0;
		
		int count=0;
		boolean found=false;
		for(int i=0;i<a.length();i++){
			
			for(int j=0;j<b.length();j++){
				if(aa[i]==bb[j]&&(!found)){
					System.out.println("in matched i="+i+"j="+j);
					matchcount += 2;
					bb[j]='|';
					aa[i]='|';
					found=true;
				}
				//System.out.println("Count = "+(++count));
			}
			//notMatched =+ 1;
			found=false;
		}
		int notMatched=(aa.length + bb.length)-matchcount;
		System.out.println("matched count = "+matchcount);
		System.out.println("not mached = "+notMatched);
		System.out.println("size total = "+(aa.length+bb.length));
		//char v= '/254';
		//System.out.println('/254');
	}

}
