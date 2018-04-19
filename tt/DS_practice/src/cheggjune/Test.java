package cheggjune;

public class Test {

	
	public static void main(String[] args) {
		String s="dfjf_f@@z";
		char [] array = s.toCharArray();
		String newStr = "";
		int k=2;
		for(char r : array)
		{
			if(String.valueOf(r).matches("[A-Za-z]+"))
			{
				System.out.println("char");
				newStr += String.valueOf((char)(r+k));
			}
			else
				System.out.println("specl");
			newStr += String.valueOf(r);
		}
		System.out.println(newStr);
	System.out.println("===================");
	System.out.println(Character.valueOf((char) ('c'+3)));
	}
}
