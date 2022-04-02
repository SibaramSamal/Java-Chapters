package reusability;

/**

 * Aim: To check the allowed access modifier pairs of overriden methods
 * eg. If parent class method is private, overriden method can be of default or protected or public
 * It means, weeker to stronger sequence is allowed. But reverse is not allowed.
	Allowed sequence pair of parent class method and child clss method modifier are:
	parent	->	child
	private	->	default
	private	->	protected
	default -> protected
	protected -> public
	but,
		public -> protected xxx not allowed because, we cant reduce the visibility of method
*/

class Pr{
	private void fun() {
		System.out.println("In parent class");
	}
}
class Ch extends Pr{
	protected void fun() {
		System.out.println("In child class");
	}
}
public class OverrideModifierTest {

	public static void main(String[] args) {
		Ch c = new Ch();
		c.fun();
	}
}
