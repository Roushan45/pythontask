package cheggsept;
/**class for unchecked exception
*Runtime exception in java is unchecked exception
*/
public class FixesNotExpectedException extends RuntimeException{

	/**
	 * Constructor without parameter
	 */
	public FixesNotExpectedException()
	{
		//using super sending message to parent
		super("TIFU: This exception was raised.");
	}
}
