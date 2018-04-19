package cheggapril;
class Rational
{
	private int numerator;
	private int denominator;
	public Rational() //default constructor
	{
		numerator = 0;
		denominator = 1;
	}
	public Rational (int a, int b)//argument constructor
	{
		numerator = a;
		denominator = b;
	}
	public Rational sum (Rational r)
	{
		reduce(); //reduce the sum
		int num, den;
		den = denominator * r.getDenominator();
		num = numerator * r.getDenominator() + r.getNumerator() * denominator;
		return new Rational (num, den);
	}
	public int getNumerator() { return numerator; }
	public int getDenominator() { return denominator; }
	public String toString () { return numerator + "/" + denominator; }
	public void reduce() {
		int factor;
		factor = gcd(numerator, denominator);
		numerator = numerator / factor;
		denominator = denominator / factor;
	}
	private int gcd (int x, int y) {
		int t;
		while (y>0) {
			t = x % y;
			x = y;
			y = t;
		}
		return x;
	}
	public double toDecimal() //convert fractional to decimal
	{
		return (double)numerator/denominator;
	}
	public boolean greaterThan(Rational r) // compare two rational numbers
	{
		if(this.toDecimal() > r.toDecimal())
			return true;
		else
			return false;
	}
	public boolean smallerThan(Rational r) // compare two rational numbers
	{
		if(this.toDecimal() < r.toDecimal())
			return true;
		else
			return false;
	}
}