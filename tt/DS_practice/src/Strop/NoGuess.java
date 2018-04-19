package Strop;

import java.util.Random;
import java.util.Scanner;

public class NoGuess {

	public static void main(String[] args) {
		int max=10000;
		int min=1000;int i=3;
		//declared two array for storing the digits of no 
		int array1[]=new int [4];
		int array2[]=new int [4];
		//random no generation 
		Random rn = new Random();
		int range = max - min + 1;
		//random no will generate and store into randomNum
		int randomNum =  rn.nextInt(range) + min;
		//random no generation ends
		//copying the random no into temp variable for doing calculation
		int temp=randomNum;
		//if you want to display generated random no then uncomment it
		System.out.println(randomNum);
		//these two variable for getting the unit digit of no
		int remainder=0,remainder1=0;
		//this will ask user to input four digit no
		System.out.println("Please enter the 4 digit no to guess");
		Scanner sc = new Scanner(System.in);
		//storing the guess no in guessNo
		int guessNo=sc.nextInt();
		//checking for if whole no is matching
		boolean wholeNoMatch = guessNo==randomNum;
		//this while loop will find the unit digit of both no
		//and stored into the both respective array
		
		while(temp>0){
			remainder=temp%10;
			remainder1=guessNo%10;
			temp=temp/10;
			guessNo=guessNo/10;
			//here storing the no into array
			array1[i]=remainder;
			array2[i]=remainder1;
			i--;
		}
		boolean found=false;
		int sum=0;
		//here comparing the all digits of array using for loop
		for(int j=0;j<array1.length;j++){
			for(int k=0;k<array2.length;k++){
			//if any no found matched it will turn found to true 
				if(array1[j]==array2[k]){
					found=true;
				}
			}
			//calculating sum of its digit
			sum=sum+array1[j];
		}
		//if whole no match 
		if(wholeNoMatch){
			System.out.println("Wow! You guess exactly same no as to be guessed");
			System.out.println("Original no that to be guessed is "+randomNum);
			System.out.println("Sum of its digits is "+sum);
			return;
			
		}
		//if any specific digit matched
		 else if(found){
		System.out.println("One of your digit matched to Guessed no");
		System.out.println("Original no that to be guessed is "+randomNum);
		System.out.println("Sum of its digits is "+sum);
		return;
		}
		//if no digit match
		else{
			System.out.println("No match found");
		}
		

	}

}
