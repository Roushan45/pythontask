package bw;

public class Bw2 extends Bw1{
	
	int i=100;
	public static void main(String[] args) {
		int i=0;
		BWInterface bwobj = new Bw2();
		Bw1 obj = new Bw2();
		obj.getData();
		System.out.println(i);
		
	}

}
