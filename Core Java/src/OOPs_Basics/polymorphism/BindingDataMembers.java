package OOPs_Basics.polymorphism;
class P{
	int x = 10;
	static int y = 60;
	void show() {
		System.out.println("Inside child class show method");
	}
	static void showStatic() {
		System.out.println("Inside parent class static method");
	}
}
class C extends P{
	int x = 50;
	void show() {
		System.out.println("Inside child class show method");
	}
	static void showStatic() {
		System.out.println("Inside chld class static method");
	}
}
public class BindingDataMembers {
	public static void main(String[] args) {
		P obj = new C();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.show();	//As show is non-static(), it will call the child class show() not the parent class show() but will check in parent class that show() is there or not. If not there, it will give error.
		obj.showStatic();
	}
}
