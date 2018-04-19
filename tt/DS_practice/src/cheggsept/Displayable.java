package cheggsept;
public interface Displayable {
	//changed to default method
    default String getDisplayText() {
    	//returning the toString()
		return toString();
	}
}