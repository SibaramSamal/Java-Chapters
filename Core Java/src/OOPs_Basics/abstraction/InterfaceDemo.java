package OOPs_Basics.abstraction;

/*
 * Aim: To test how interface works
 */

interface Inter{
	int x = 25; // must be initialised because it is public static final
	void fun();	//no body and bydefault public abstract
	
}
class ImplCls implements Inter{
	public void fun() {	//we can't reduce visibility of abstract methods. So we must use public here
		System.out.println("Inside implementor class");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		ImplCls obj = new ImplCls();
		obj.fun();
	}
}
