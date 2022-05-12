package innerclass;

class OuterN{
	int x;
	static int y;
	void display() {
		System.out.println("Inside outer class");
	}
	class InnerN{
		void display() {
			System.out.println(x);
			System.out.println(y);
		}
	}
}
public class NonStaticInnerClass {
	public static void main(String[] args) {
		OuterN.InnerN iner = new OuterN().new InnerN();	//syntax is: outer.inner ref = ref. of outer. new inner();
		/* or
			OuterN o = new OuterN();
			OuterN.InnerN in = o.new InnerN();
		*/
		iner.display();
	}
}

/*
	- Acts as non static data member.
	- It can have only non-static data members inside it.
	- By the help of it's object, we can access all static and non static data members of it's enclosing outer class.
	- It's object can only be created using it's outer class.
	- It can also inherit other classes.

*/