package OOPs_Basics.abstraction;

/*
 * Aim: How can we use abstract keyword in real world program
 * 
 */
abstract class Bike{
	abstract void specification();
}
class YamahaR15 extends Bike{
	@Override
	void specification() {
		System.out.println("Name: R15");
		System.out.println("Engine: 160cc BS4");
		System.out.println("Fuel type: petrol");
	}
}
class ApacheRTR extends Bike{
	@Override
	void specification() {
		System.out.println("Name: 1604v Apache RTR");
		System.out.println("Engine: 160cc bs6");
		System.out.println("Fuel type: petrol");
	}
}
public class RealTimeUseOfAbstract {
	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName(args[0]);
			Bike b = (Bike) c.newInstance();
			b.specification();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
