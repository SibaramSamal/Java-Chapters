package stringmanipulation;

public class StringDemo {
	private static String name = "Sibaram Samal";
	private static String clg = new String("NIST");
	private static StringBuffer sbr = new StringBuffer("String Buffer contents");
	public static void main(String[] args) {
		System.out.println("Original Data");
		System.out.println(name);
		System.out.println(clg);
		System.out.println(sbr);
		
	System.out.println("Immutability chack");
	name.concat("(sibu)");	//It was assumed to print Sibaram Samal(sibu) but as it is immutable, the data inside it won't change.
	sbr.append(" after appended content");
	System.out.println("After append operation performed...");
	System.out.println(name);
	System.out.println(sbr);
	}
}
