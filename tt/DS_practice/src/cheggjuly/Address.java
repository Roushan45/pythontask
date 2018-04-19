package cheggjuly;
/*ADDRESS CLASS */
public class Address {
	/*AS IN PROBLEM STATTED FOR SOME ANOTHER IMPLEMENTATION OF ADDESSS
	  SO HERE TAKES A STRINGBUFFER FOR LOCALITY THAT CONTAINS STREET,APARTMENT,COUNTRY
	  AND HAVE ONE STRING FOR POSTAL CODE  */
	private StringBuffer locality;
	private String postalCode;
	/*CONSTRUCTOR*/
	public Address(StringBuffer locality,String postalcode)
	{
		this.locality=locality;
		this.postalCode=postalcode;
	}
	public Address(String postalcode)
	{
		locality = new StringBuffer();
		this.postalCode=postalcode;
	}
	/*HERRE ASKING USER THE INDIVIDUAL VALUE OF ADDRESS
	 * AND APPENDING THEM TO LOCALITY*/
	public void setStreet(String street)
	{
		locality.append(street+"\n");
	}
	public void setApartment(String apart)
	{
		locality.append(apart+"\n");
	}
	public void setCountry(String local)
	{
		locality.append(local);
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public StringBuffer getLocality() {
		return locality;
	}

	@Override
	public String toString() {
		return "Address\n" +locality + "\nPostal Code = " + postalCode;
	}
	
	
	
}
