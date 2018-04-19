package cheggsept;

import java.io.IOException;
/**class for checked exception
*IOException in java is checked exception
*/
public class MightBeFixableException extends IOException{

	/**
	 *Constructor with string message
	 * @param message
	 */
	public MightBeFixableException(String message)
	{
		//sending exception message to super class
		super(message);
	}
}
