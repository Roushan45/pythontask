package cheggsept;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VWCar {
  /**
   * Special value used when the gas consumption does not allow us to calculate MPG
   */
  public static final int INVALID_MPG = -1; // -1 is used since this is an impossible result for MPG.
  /**
   * Number of miles the car had driven the last time the MPG reading was reset.
   */
  private int odometerAtReset;

  /**
   * Creates a car that has not yet been driven. For purposes of clarity (and to create lines for WebCAT's coverage
   * tool) this explicitly sets the miles driven to 0.
   */
  public VWCar() {
    odometerAtReset = 0;
  }

  /**
   * Resets the instance so that it can begin a new round of mileage calculations.
   *
   * @param milesDriven Number of miles the car has driven when this method was called.
   */
  public void resetReadings(int milesDriven) {
    // Use the current mileage as the new baseline
    odometerAtReset = milesDriven;
  }

  /**
   * Compute the miles per gallon the car has achieved since the last reset. If this cannot be calculated, then an error
   * value is returned instead.
   *
   * @param currentOdometer Current reading on the car odometer.
   * @param gallonsBurnt The whole number of gallons that the car has used since the last reset.
   * @return The car's MPG since the reading was last reset or {@link #INVALID_MPG} if this cannot be calculated.
   */
  public double mpg(int currentOdometer, int gallonsBurnt) {
    if (gallonsBurnt == 0) {
      return INVALID_MPG;
    } else {
      // Calculate how many miles have been driven since the last reset
      int milesDriven = currentOdometer - odometerAtReset;
      // MPG is (REALLY!) calculated as miles driven divided by gallons consumed.
      return (double)milesDriven / (double)gallonsBurnt;
    }
  }
  
  /**
   * Junit test for non -driven car
   * value of odometerAtReset should be 0
   */
  @Test
  public void testForNon_drivenCar()
  {
	  VWCar c = new VWCar();
	 assertEquals(0, c.odometerAtReset);
  }
  /**
   * Junit test case for invalid MPG
   * on entering the 0 value for gallon 
   * it will produce value equal to
   * invalid mpg that is -1
   */
  @Test
  public void testInvalid_MPG()
  {
	  VWCar c = new VWCar();
	  c.resetReadings(200);
	 int mpg= (int) c.mpg(500, 0);
	 assertEquals(mpg, INVALID_MPG);
  }
  /**
   * Junit test case for valid MPG
   * for 100 miles and 10 gallons
   * value sholud be 10 mpg
   */
  @Test
  public void checkValidMPG()
  {
	  VWCar c = new VWCar();
	  c.resetReadings(100);
	  double mpg = c.mpg(200, 12);
	  assertEquals(mpg, new Double(100/12),8);
  }
  /**
   * Junit test case for
   * checking the odometer reset functionality
   */
  @Test
  public void checkResetOdoMeter()
  {
	  VWCar c = new VWCar();
	  c.resetReadings(150);
	  assertEquals(150, c.odometerAtReset);
  }
}