package cheggapril;
//this class will throw exception for Full set
public class FullSetException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public FullSetException(String s) {
		super(s);
	}

}
