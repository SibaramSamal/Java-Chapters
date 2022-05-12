package innerclass;

interface OuterI {
	void myMethod();
	interface Inner extends InterfaceP {
		void show();
	}
}

interface InterfaceP {
	void display();
}

public class NestedInterface implements OuterI.Inner{
	public void show() {
		System.out.println("show()");
	}
	public void display() {
		System.out.println("display()");
	}
	public static void main(String[] args) {
		OuterI.Inner obj = new NestedInterface();
		obj.display();
		NestedInterface o = new NestedInterface();
		o.display();
	}
}
