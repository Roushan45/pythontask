package array;

import java.util.List;

public class LeftShitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};
		int index=0;
		int temp=a[0];
		for(int i=0;i<2;i++){
			
			
			for(int j=index+1;j<a.length;j++){
				
//				if(index==a.length){
//					a[index]=temp;
//				}
//				else{
				a[index++]=a[j];
				
				
//				}
			}
			a[a.length-1]=temp;
			index=0;
			temp=a[0];
		}
		//while()
		for(int m=0;m<a.length;m++){
			System.out.print(a[m]+" ");
		}
		
		//List list = new List();

	}

}
