package cheggsept;
/**
 * this is test class for Utilities
 *
 */
public class UtilitiesDemo {

	public static void main(String[] args) {
		Utilities obj = new Utilities();
		double avg0 = obj.averageRating(3, 4);
		System.out.println("Average of 3,4 : "+avg0);
		System.out.println("Updated rating : "+obj.updateAverage(4.0, 1, 5.0));
		System.out.println("Star  Rating of 3.34 : "+obj.startRating(3.4));
		System.out.printf("Byesian average : %.2f  ",obj.bayesianAverage(5, 1, 5, 3));
	}
}
