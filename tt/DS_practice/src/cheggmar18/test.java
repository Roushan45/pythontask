package cheggmar18;

public class test {
	public static void main(String[] args) {
		String str="I am a boy. This is another line.";
		StringBuilder b = new StringBuilder(str);
		b.replace(0, b.indexOf("."),b.substring(0, b.indexOf(".")).toUpperCase());
		b.insert(0,"Rakesh. ");
		b.insert(b.length(), " Roushan.");
		String s1=b.substring(0, b.indexOf("."));
		String s2=b.substring(b.indexOf("Roushan"), b.length()-1);
		System.out.println("s2 = "+s2);
		System.out.println(b);
		int i = 0;
		do {
		  b.replace(i, i + 1, b.substring(i,i + 1).toUpperCase());
		  i =  b.indexOf(" ", i) + 1;
		} while (i > 0 && i < b.length());

		System.out.println(b.toString());
	}

}
