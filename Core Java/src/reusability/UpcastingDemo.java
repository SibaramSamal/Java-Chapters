package reusability;
/**
 * @author Sibaram
 	Aim: Use of upcasting approach to solve the limitations of super keyword
 */
class A{
	int x = 50;
}
class B extends A{
	int x = 100;
	void showData(A obj) {
		System.out.println(obj.x);
	}
}
class C extends B{
	int x = 150;
}
public class UpcastingDemo {
	public static void main(String[] args) {
		A obj = new C();
		B obj2 = new B();
		System.out.println(obj.x);	//50
		obj2.showData((A)obj2);	//upcasting
	}
}
