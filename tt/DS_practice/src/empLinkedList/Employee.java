package empLinkedList;
class Employee
{
	private String name;
	private int id;
	private String company;
	
	
	public Employee(String name, int id, String company)
	{
		this.name=name;
		this.id=id;
		this.company=company;
	}
	
	public String getName()
	{
		return name;
	}
	@Override
	public int hashCode(){
		 final int ID = 2000;
		 return ID+1;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getCompany()
	{
		return company;
	}
	@Override
	public String toString()
	{
		return "[ Name = "+getName()+" , ID = "+getId()
				+ " , Comapny = "+getCompany()+"]";
	}
}