package reusability;

/**
 * @author Sibaram
 Aim:
 	Demonstration of method override
 */

class Bike{
	int x;
	void run() {
		System.out.println("Bike is running");
	}
}
class Splender extends Bike{
	int x = 15;
	void run() {
		//super.run();
		System.out.println("Splender is running");
	}
}
class SuperSplender extends Splender{
	void run() {
		((Bike)this).run();
		System.out.println("Super-Splender is running");
	}
}
public class MethodOverrideDemo {
	public static void main(String[] args) {
		Bike obj = new Splender();
		System.out.println(obj.x);
		obj.run();
	}
}
