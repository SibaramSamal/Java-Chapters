package trickyconcepts;

/* Aim of this program is to test:
  	1. Can we call main() explecitely?
  	2. if yes, test all possible ways to call	
 */

class A{
	public static void main(String[] args) {
		System.out.println("Class A main() called");
	}
}
class B{
	//public static void main(String[] args) {
	public static void main(String ... args) {	//variable args for main() signature call from other classes
		System.out.println("Class B main() called");
	}
}
public class MainMethodExplicitCall {

	public static void main(String[] args) {
		A.main(args); //A class main(-) called explecitely from out side of the class
		
		//From here I'll call main(-) of class B in all possible ways
		//way-1:
		String[] str = {"Sibaram","samal","0","56.3"};
		B.main(str);
		//way-2:
		B.main(args);
		//way-3:
		B.main(null);
		B.main();//this method can only be called if the main() arguments are of varargs type
	}

}
