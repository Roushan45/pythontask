package cheggsept;
/**
 * Fraction class
 *
 */
public class Fraction {
	/*Numerators and denominator*/
	private int numerator;
	private int denominator;
	/**
	 * Default constructor 
	 * that assign numerator to 0 and
	 * denominator to 1
	 */
	public Fraction()
	{
		this.numerator=0;
		this.denominator=1;
	}
	/**
	 * parameterized constructor 
	 * that takes numerator as argument
	 * @param numerator
	 */
	public Fraction(int numerator)
	{
		this.numerator=numerator;
		this.denominator=1;
	}
	/**
	 * Addition method for fractions
	 * @param f
	 * @return
	 */
	public Fraction add(Fraction f)
	{
		int denom = this.denominator*f.denominator;
		int nemo = (denom/this.numerator)*this.numerator+(denom/f.numerator)*f.numerator;
		Fraction newF = new Fraction();
		newF.setNumerator(nemo);
		newF.setDenominator(denom);
		return newF;
	}
	/**
	 * division method for fraction
	 * @param f
	 * @return
	 */
	public Fraction divide(Fraction f)
	{
		//calculating numerator
		int nume = this.numerator*f.denominator;
		//calculating denominator
		int denom = f.numerator*this.denominator;
		//creating new fraction
		Fraction newF = new Fraction();
		newF.setNumerator(nume);
		newF.setDenominator(denom);
		//returning the new fraction
		return newF;
	}
	/**
	 * scale down method
	 * @param factor
	 */
	public void scaleDown(int factor)
	{ 
		//checking if it is zero
		 if(factor==0)
		 {
			 System.out.println("Warning: cannot scale down with 0");
			 return;
		 }
		 //else scaling down
		 this.denominator*=factor;
	}
	/**
	 * scale up 
	 * @param factor
	 */
	public void scaleUp(int factor)
	{ 
		//checking if it 0
		 if(factor==0)
		 {
			 System.out.println("Warning: cannot scale up with 0");
			 return;
		 }
		 //if not then scaling up
		 this.numerator*=factor;
	}
	//scale method
	public void scale(int factor ,boolean flag)
	{
		//if true calls scaleUp
		if(flag)
			scaleUp(factor);
		else//if false calls scale down
			scaleDown(factor);
		
	}
	//setters and getters
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	/**
	 * to string method
	 */
	public String toString()
	{
		return this.numerator+"/"+this.denominator;
	}
	
}
