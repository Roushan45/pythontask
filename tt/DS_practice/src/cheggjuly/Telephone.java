package cheggjuly;
/*TELEPHONE CLASS*/
public class Telephone {
	/*TWO INSTANCE VARIABLE*/
	private String areaCode;
	private String localNo;
	/*CONSTRUCTORS FOR TELEPHONE CLASS*/
	public Telephone(String areacode,String localNo)
	{
		this.areaCode = areacode;
		this.localNo=localNo;
	}
	public Telephone(Integer areacode,String localNo)
	{
		String s=""+areacode;
		this.areaCode=s;
		this.localNo=localNo;
	}
	/*GETTERS AND SETTERS*/
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getLocalNo() {
		return localNo;
	}
	public void setLocalNo(String localNo) {
		this.localNo = localNo;
	}
	/*TOSTRING METHOD THAT WILL RETURN STRING REPRESENTATION OF INSTANCE*/
	@Override
	public String toString() {
		return "Telephone : areaCode=" + areaCode + ", localNo=" + localNo ;
	}
	
}
