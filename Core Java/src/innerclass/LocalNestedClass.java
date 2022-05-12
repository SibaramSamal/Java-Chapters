package innerclass;

class OuterL{
	int x = 20;
	static int y = 50;
	InterClass display() {
		int v = 600; //if we use for making any change
		//inside any method if a class exist, that will be treated as local nested class
		//local nested class begins here
		
		class InnerL implements InterClass{
			public void display() {
				System.out.println(v);
			}
		}
		//Object of this class can not directly created outside of this class.
		//so we have to make it from here
		InnerL i = new InnerL();
//		System.out.println(v);
		i.display();
		return i;
	}
}

public class LocalNestedClass {
	public static void main(String[] args) {
		OuterL o = new OuterL();
		InterClass i = o.display();
		i.display();
		System.out.println(i);
	}
}
interface InterClass{
	void display();
}
/*

	- Treated as local variable.
	- can't be declasred as static as we can't have static local variables in java.
	- We can implement interface from this class.
	- 
	- Can access only final variables of it's enclosing scope.

*/