package OOPs_Basics.polymorphism;

class Parent{
	Parent(){
		System.out.println("Parent class constructor");
	}
	void test() {
		System.out.println("Inside Parent");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child class constroctor");
	}
	void test() {
		System.out.println("Inside Child");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		Parent p = new Child();
		p.test();
		//((Child)p).test();
	}
}
