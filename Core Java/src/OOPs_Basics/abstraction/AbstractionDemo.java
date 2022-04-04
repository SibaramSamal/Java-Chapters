package OOPs_Basics.abstraction;

/*
 * Aim: To test all rules of abstraction using abstract class
 * rule 1 : abstraction can ony apply on methods not data members and constructors
 * rule 2 : abstract methods can't have body.
 * rule 3 : it is not mendatory to have anstract methods for an abstract class
 * rule 4 : abstract methods must be inside an abstract class
 * rule 5 : we can't create object of it
 * rule 6 : was used to achieve run time polymorphism
 * rule 7 : child class of abstract class must implement the abstract() body not all the member functions
 * rule 8 : if failed to implement all the abstract methods, child class must become abstract
 */

abstract class Generic{
	/*abstract void xyz() {
	 * rule - 2
	 * 
		abstract method can't have body
		error: Abstract methods do not specify a body
	}*/
	void abc() {
		System.out.println("Inside normal method of parent class");
	}
}
abstract class Implimentor extends Generic{
	// rule - 8
	// because of xyz() in parent class
	
	// No need to override abc method, as it is not abstract
}
class Implimentor2 extends Generic{
	void abc() {
		System.out.println("Inside implementor class ");
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		//Generic obj = new Generic(); rule 5
		Generic obj = new Implimentor2();
		obj.abc();
	}

}
