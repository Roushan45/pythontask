package cheggapril;
//this class will throw exception for negative integer
public class NegativeIntegerException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public NegativeIntegerException(String s) {
		super(s);
	}

}
