package cheggsept;

import java.util.Random;

public class RandomMatrix {

//main method
	public static void  main(String []a)
	{
		Random rand = new Random();
		final int MAX = 3;
		//3 X 3 MAtrix declared
		//MAX =3 define above
		int matrix[][]=new int[MAX][MAX];
		int i,j;
		//looping through variables
		for(i=0;i<MAX;i++)
		{
			for(j=0;j<MAX;j++)
			{
				//in loop checking if Random generated 
				//is multiple of 20
				while(true)
				{
					
					int s = rand.nextInt(1000);
					if(s%20==0)
					{
						//if multiple of 20 found breaking the loop
						matrix[i][j]=s;
						break;
					}
				}
			}
		}
		//printing the Matrix
		System.out.print("==========================================\n");
		System.out.print("------3X3 Matrix Multiple of 20-------------\n\n");
		System.out.print("              ");
		for(i=0;i<MAX;i++)
		{
			for(j=0;j<MAX;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n              ");
		}
		
		
	}
}
