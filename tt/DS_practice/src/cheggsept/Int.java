package cheggsept;

public class Int {

	public long val;
	
	Int(long v)
	{
		val=v;
	}
	
	public void prt()
	{
		System.out.println(val);
	}
	
	public static void main(String[] args) {
			final Int f = new Int(2);Int g=f;
			g.val=8;
			f.prt();
			
			//final Int h = new Int(4);h.prt();
			//h=new Int(0);
			
	}
}
