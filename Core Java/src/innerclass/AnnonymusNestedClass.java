package innerclass;

class OuterA{
	Inter myMethod() {	// Here we are wanting to return Inter type data
		/*
		 	We can do it either by implementing that interface from a class and return it's object or
		 	we can create an object of Inter type through annonymus class.
		 */
		
		
		/*return new Inter() {
			public void show() {
				System.out.println("inside annonymus class");
			}
		};*/
				//		(or)
		Inter i = new Inter() {
			public void show() {
				System.out.println("inside annonymus class");
			}
		};
		return i;
	}
}

public class AnnonymusNestedClass {
	public static void main(String[] args) {
		Inter i = new OuterA().myMethod();
		i.show();
	}
}
interface Inter{
	void show();
}
/*
- Annonymus classes does not have any name.
- Object of such classes created only once and created by JVM.
- It can't have static variables as it is treated as local variable.
- It can inherit a class or implement another class.
- Annonymus classes always initialized by a single statement.
- All annonymus class must have a parent either a class or an interface.
*/