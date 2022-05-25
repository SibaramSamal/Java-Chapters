package stringmanipulation;

public class StringPoolTest {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		//as s1 and s2 has initialized with assignment, they share same conntent, means they points to same location
		System.out.println(s1 == s2);	//true
		System.out.println(s1.equals(s2));	//true
		
		String s3 = new String("a");
		String s4 = new String("a");
		// as s3 and s4 holding the contents creeated through new keyword, they points towards separate memory locations
		System.out.println(s3 == s4);	//false
		System.out.println(s3.equals(s4));	//true
	}

}
