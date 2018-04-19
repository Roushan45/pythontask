package cheggoct;

public class SimpleGeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public SimpleGeometricObject()
	{
		dateCreated = new java.util.Date();
		
	}
	public SimpleGeometricObject(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}

	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public boolean isFilled()
	{
		return this.filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	
	public java.util.Date getDateCreated()
	{
		return this.dateCreated;
	}
	
	public String toString()
	{
		return "Created on "+ dateCreated+" \nColor : "+color+" and filled : "+filled;
	}
}
