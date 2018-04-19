package cheggmarch;

import java.util.Scanner;

public class BinaryToDecimal {
 
	public static int binaryToDecimal (String binaryString){
         //converted string to array
        char ch[] = binaryString.toCharArray();
        //it will store the converted binary no
        int convertedBinaryNo = 0;
        //declared the decimal no and initialzed to zero
        int decimalNo=0;
        int remainder=0;
       //ASCII value of zero 
        int asciiValueOfzero = (int)'0';
        //iterating through each char in string
        for(char temp:ch){
        	//casting each char to int
            int tempValue = (int)temp;
            convertedBinaryNo = (convertedBinaryNo*10)+(tempValue-asciiValueOfzero);
        }
        int j=0;
        //converting binary to decimal no 
        while (convertedBinaryNo!=0)  
        {  
            remainder = convertedBinaryNo%10;  
            convertedBinaryNo /= 10;  
            decimalNo += remainder*Math.pow(2,j);  
            j++;  
        } 
        //returning converted decimal no
        return decimalNo;
    }

    public static void main(String a[]){
    	String binaryNo;
    	while(true){
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter a binary No : ");
    	 binaryNo=scan.nextLine();
    	 if(binaryNo.equals("-1")){
    		 System.out.println("All set!");
    		 break;
    	 }
    	System.out.println("Conversion to decimal : "+binaryToDecimal(binaryNo));
    	}
    	
    }
}
