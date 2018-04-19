package cheggsept;
/**
 * NOTE: this is for testing and checking the implemented methods.
 * as per requirement you don't have to submit
 * @author yourName
 *
 */
public class FractionTest {

	public static void main(String[] args) {
		//created two fraction class
		Fraction _first  = new Fraction();
		Fraction _second = new Fraction(8);
		//setting numerator and denominators
		_first.setNumerator(10);
		_first.setDenominator(12);
		_second.setDenominator(4);
		//performing operations
		System.out.println("The addition result is : "+_first.add(_second));
		System.out.println("The division result is : "+_first.divide(_second));
		_first.scale(4, true);
		System.out.println("Scaling up first fraction : "+_first);
		_second.scale(2, false);
		System.out.println("Scaling down second frction : "+_second);
		_first.scale(0, false);
		

	}
}
