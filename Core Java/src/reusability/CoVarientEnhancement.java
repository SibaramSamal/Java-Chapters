package reusability;


class TVS{
	static int c;
	TVS(){
		System.out.println("TVS Constructor");
	}
	TVS run() {
		System.out.println("Bike is running");
		return new TVS();
	}
	{
		System.out.println("TVS init");
	}
}
class Apache extends TVS{
	static int d;
	Apache(){
		// Here JVM places super() implecitely to invoke parent class constructor, so before further executions, it first go for super class constructor.
		System.out.println("Constr");
	}
	Apache run() {
		System.out.println("Apache is running");
		return new Apache();
	}
	{
		System.out.println("Apache");
	}
}
public class CoVarientEnhancement {
	public static void main(String[] args) {
		Apache a = new Apache();
		a.run();
		//System.out.println(a.c+" "+a.d);
	}
}