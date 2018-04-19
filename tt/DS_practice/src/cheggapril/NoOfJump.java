package cheggapril;

public class NoOfJump {
	
	public static int GetJumpCount(int input1,int input2,int[] input3)
    {
//		int sumOfarray=0;
		int count=0;
//		int sum=0;
//		for(int i=0;i<input3.length;i++){
//			sumOfarray = sumOfarray+input3[i];
//		}
//		while(sum<sumOfarray){
//			sum = sum+input1;
//			count++;
//			if(sum<sumOfarray){
//				sum=sum-input2;
//			}
//		}
//		
		for(int j=0;j<input3.length;j++){
			if(input1>=input3[j]){
				count = count+1;
			}
			else{
				int sum=0;
				while(true){
					sum=sum+input1;
					count++;
					if(sum>=input3[j]){
						break;
					}
					else{
						sum=sum-input2;
					}
				}
			}
		}
	

	
	
	
	
	
	
	
		return count;
	
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={3,9,10,26};
	System.out.println(GetJumpCount(5, 1, input));	//GetJumpCount(5, 1, input);

	}

}
