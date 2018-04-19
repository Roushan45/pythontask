package cheggjuly;
public class Flower
{
	private String flowername;
	private String fcolor;
	private String presence_of_thorns;
	private String smell;
	public String getName()
	{
		return this.flowername;
	}
	public String getcolor()
	{
		return this.fcolor;
	}
	public String getthorns()
	{
		return this.presence_of_thorns;
	}
	public String getsmell()
	{
		return this.smell;
	}
	public boolean setName(String name)
	{
		this.flowername = name;
		return true;
	}
	public boolean setcolor(String color){
		this.fcolor=color;
		return true;
	}
	public boolean setthorns(String thorns){
		this.presence_of_thorns = thorns;
		return true;
	}
	public boolean setsmell(String fsmell){
		this.smell= fsmell;
		return true;
	}
}