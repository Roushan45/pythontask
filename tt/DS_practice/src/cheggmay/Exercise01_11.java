package cheggmay;

public class Exercise01_11 {

	public static void main(String[] args) {
		// declared the current population as per given data
		long currentPopulation=312032486;
		//getting the no of seconds in a year
		long noOfSecondsInYear=365*24*60*60;
		//calculating no of birth in year
		double noOfBirthInYear=((float)noOfSecondsInYear/7.0);
		//calculating no of death in year
		double noOfDeathInYear=((float)noOfSecondsInYear/13.0);
		//calculating no of immigration in year
		double noOfImmigrationInYear=((float)noOfSecondsInYear/45.0);
		//getting final increased population for a year
		double increasePopulationInOneYear=(noOfBirthInYear+noOfImmigrationInYear)-noOfDeathInYear;
		//rounding of the value to nearest
		int a = (int)Math.round(increasePopulationInOneYear);
		//printing the population for coming 5 years
		System.out.println("*****Population Projection : The US census bureau*****\n");
		for(int i=1;i<=5;i++)
		{
			//adding the increased population to current population
			currentPopulation=currentPopulation+a;
			System.out.println("Population after " +i +" year : "+currentPopulation);
			System.out.println();
		}

	}

}
