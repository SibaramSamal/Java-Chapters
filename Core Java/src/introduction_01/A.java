package introduction_01;

public class A {
	public static void main(String[] args) {
		System.out.println("In class A main()");
		m1();
	}
	private static void m1() {
		System.out.println("A m1()");
		main(new String[1]);
	}
	public static void main(int x) {
		System.out.println("In class A main(int)");
	}
}
/*
===================== o/p ===========================
In class A main()
A m1()
In class A main()
A m1()
In class A main()
A m1()
Exception in thread "main" java.lang.StackOverflowError

 */