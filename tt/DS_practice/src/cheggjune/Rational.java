package cheggjune;
class Rational{ 
	int numerator; int denominator; // Fields 
	Rational(int n, int d){ // Constructor 
		if(d==0) throw new RuntimeException("zero denominator"); 
		numerator = n; denominator = d; 
	} 
	Rational plus(Rational Q){
		//getting the LCM by multiplying 
		//both deniminator
		int d=this.denominator*Q.denominator;
		//calculating numerartor by dividing the numerator
		//to d and multiplying to numerator
		//after getting both values adding those
		int n=((d/this.denominator)*this.numerator)+((d/Q.denominator)*Q.numerator);
		 //returning a rational object
		return new Rational(n, d);

	} 
	Rational times(Rational Q){
		//getting the LCM by multiplying 
		int d=this.denominator*Q.denominator;
		//getting the numerator by multiplying 
		//both numerator
		int n = this.numerator*Q.numerator;
		 //returning a rational object
		return new Rational(n, d);

	} 
	public String toString(){
		//string represenation of object
		return this.numerator+"/"+this.denominator; 
	} 
	//equal method
	public boolean equals(Object x){
		//checking if x is null
		if(x==null)
			throw new NullPointerException("Null value used for comarision");
		//if not null casting to rational
		Rational r = (Rational) x;
		//checking both are equal or not
		return ((this.numerator/this.denominator)==(r.numerator/r.denominator));
	} 

} // end of class Rational 