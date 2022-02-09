package introduction_01;

public class B {
	public static void main(String[] args) {
		System.out.println("In B class main()");
		A.main(new String[0]);	// Works fine
		A.main(0);
		B.main(new String[0]);	// will lead to StackOverflow error
		/*
			Hre I have called the main() of another class.
		As main is a static method, we can call it without creating an object of that class but we have to maintain the signature of main() i.e. "main(String[])"
		
		*/
	}
}

/*
 		================			Interview tips			===============
 		
	1. We can't call the main() of same class inside that class. It wont give error but leads to java.lang.StackOverflowError.	refer line# 7.
	
	2. We can overload main() but the one with argument String[] will be called by the JVM automatically.
	
*/
