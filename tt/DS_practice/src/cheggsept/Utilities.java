package cheggsept;
/**
 * This class contains a variety of methods that will be used throughout the Ratings
 * and Reviews Project
 */
public class Utilities {

	/**
	 * Computes the average of two rating
	 * @param rating0 An integer rating in the range of 1-5 inclusive
	 * @param rating1 An integer rating in the range of 1-5 inclusive
	 * @return the average of ration 0 and rating1 as double
	 */
	public double averageRating(int rating0,int rating1)
	{
		return (double)(rating0+ rating1 )/2.0;
	}
	/**
	 * Computes the average of three rating 
	 * @param rating0 An integer rating in the range of 1-5 inclusive
	 * @param rating1 An integer rating in the range of 1-5 inclusive
	 * @param rating2 An integer rating in the range of 1-5 inclusive
	 * @return the average of ration 0 , rating1 and rating1 as double
	 */
	public double averageRating(int rating0,int rating1,double rating2)
	{
		return (double)(rating0+ rating1 + rating2 )/3.0;
	}
	/**
	 * Compute the number of stars
	 * @param rating
	 * @return
	 */
	public double startRating(double rating)
	{
		return (double) (Math.ceil(rating * 2) / 2);
	}
	/**
	 * this will update the current average
	 * @param average
	 * @param numberOfRatings
	 * @param newRatingValue
	 * @return
	 */
	public double updateAverage(double average, int numberOfRatings, double newRatingValue)
	{
		double total = (average*(double)numberOfRatings);
		double newTotal = total+newRatingValue;
		double totalNumberOfRatings = numberOfRatings+1;
		return newTotal/totalNumberOfRatings ;
	}
	/**
	 * Computes the Bayesian Average for the given inputs
	 * @param average
	 * @param numberOfRatings
	 * @param numberOfExtraRatings
	 * @param extraRatingValue
	 * @return
	 */
	public double bayesianAverage(double average, int numberOfRatings,int numberOfExtraRatings,double extraRatingValue)
	{
		//implemented it without calling the updateAverage method
		//
		double extra_value = extraRatingValue*numberOfExtraRatings;
		double cur_value  = average*(double)numberOfRatings;
		double total_val = extra_value+cur_value;
		return total_val/(double)(numberOfExtraRatings+numberOfRatings);
	}
	
}
