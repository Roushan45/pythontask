package Strop;

public class Recursive {
	//declared a digit and initialize with max value
	 static int  smallDigit  =Integer.MAX_VALUE;
	public static int smallestDigit(int NaturalNumber){
		
		int reminder;
		int temp;
		//it will store the remainder i.e, last digit of no
		reminder=NaturalNumber%10;
		temp=reminder;
		
	//	if()
		//it will track the small no
		if(smallDigit>reminder){
			smallDigit=reminder;
		}
		//after each step dividing by 10
		if(NaturalNumber>0){
			NaturalNumber=NaturalNumber/10;
		}
		//if NaturalNumber become 0 or less than it will return the less no
		if(NaturalNumber<=0){
			//returning small no
			return smallDigit;
		}
		return smallestDigit(NaturalNumber);
	}

	public static void main(String[] args) {
		
		System.out.println("Small NO in 23454 : "+smallestDigit(23454));
		System.out.println("\nSmall NO in 10822 : "+smallestDigit(10822));
		System.out.println("\nSmall NO in 18875 : "+smallestDigit(18875));

		System.out.println("\nSmall NO in 1953 : "+smallestDigit(1953));
	}

}
