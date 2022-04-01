/*package reusability;
class X{
	
}
class Y extends X{
	
}
class TVS{
	X run() {
		System.out.println("Bike is running");
		return new X();
	}
}
class Apache extends TVS{
	Y run() {
		System.out.println("Apache is running");
		return new Y();
	}
	
}
public class CovarientMethodOverride {
	public static void main(String[] args) {
		Apache a = new Apache();
		a.run();
	}
}
*/