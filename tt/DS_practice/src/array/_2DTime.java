package array;

public class _2DTime {

	public static void main(String[] args) {
		int j[][]={{1, 1 ,1 ,0 ,0, 0},
				   {0 ,1 ,0 ,0 ,0 ,0},
				   {1 ,1 ,1, 0, 0, 0},
				   {0 ,0 ,2 ,4 ,4 ,0},
				   {0, 0 ,0, 2, 0 ,0},
				   {0, 0 ,1 ,2, 4, 0}};
		
		int max=0,count=0;
		for(int i=0;i<=j.length-3;i++){
			for(int k=0;k<=j[0].length-3;k++){
				int sum=0;
				int m=i,n=k;
				//System.out.print(j[i][k]+" ");
				for(int no=0;no<3;no++){
					sum=sum+j[m][n]+j[m+2][n];
					n++;
				}
				sum=sum+j[i+1][k+1];
				if(count<=0){
                    max=sum;
               }
              
				if(count>0){
                   if(max<sum)
                       max=sum;
               }
               count++;
			}
			//System.out.println();
		}
		System.out.println(max);
	}

}
