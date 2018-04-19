package cheggsept;
/**
 * Class used to generate exceptions for the weekly assignment problem.
 * 
 */
public class RaiseException {
  /**
   * Method used to test students ability to write and pass on errors.
   * 
   * @param errorNum Identifier of what type of error to be generated. Generate a FixItNowException if this is less than
   *          0; generate a YouAreHosedException if this is greater than 0; and return the answer to life, the universe,
   *          and everything if this equals 0.
   * @return The answer to life, the universe, and everything according to _Hitchhiker's Guide to the Galaxy_
   * @throws MightBeFixableException Exception raised when errorNum is less than 0.
   */
  public static int simpleMethodRaisingException(int errorNum) throws MightBeFixableException {
    if (errorNum < 0) {
      throw new MightBeFixableException("I just learned this; Exception is checked; I will raise it; Fix bug, maybe?");
    } else if (errorNum > 0) {
      throw new FixesNotExpectedException();
    } else {
      return 42;
    }
  }
}
