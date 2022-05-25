package stringmanipulation;

public class StringObjectCreationCount {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		String s3 = "a";
		String s4 = "b";
		
		String s5 = new String("a");
		String s6 = new String("a");
		
		String s7 = "ab";
		String s8 = s1 + "b";
		
		String s9 = "a" + "b";
		
		System.out.println(s1 == s2);	//true
		System.out.println(s1 == s3);	//true
		System.out.println(s5 == s6);	//false
		System.out.println(s7 == s8);	//false
		System.out.println(s7 == s9);	//true
	}
}
/*
 	Rules for object creation in String handling
 	rule 1 :
 		If direct String literal is assigned to a String reference variable, Object is created in pool area
 		iff already that is not there. If already available, they will share that common value
 	rule 2 :
 		If object is created using new leyword and constructors, then also object will be created
 	rule 3 :
 		If reference variable is there in an expression, then also new object will be created  
 */
