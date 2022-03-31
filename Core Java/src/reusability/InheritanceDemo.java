package reusability;
class Parent{
	int x = 10;
	static int y = 15;
	void displayInstanceData() {
		System.out.println(x);
	}
	static void displayStaticData() {
		System.out.println(y);
	}
}
class Child extends Parent{
	// all the properties of parent class is available in child through inheritance property
}
public class InheritanceDemo {

	public static void main(String[] args) {
		//testing the ways to calling datamembers and methods
		
		//Approaches to calling non-static datamembers of a class
		Parent p = new Parent();
		System.out.println(p.x);	//way-1
		System.out.println(new Parent().x);	//way-2
		Child c = new Child();
		System.out.println(c.x); 	//way-3
		System.out.println(new Child().x); 	//way-4
		
		//Approaches to calling static datamembers of a class
		Parent ps = new Parent();
		System.out.println(p.y);	//way-1
		System.out.println(new Parent().y);	//way-2
		Child cs = new Child();
		System.out.println(c.y); 	//way-3
		System.out.println(new Child().y); 	//way-4
		System.out.println(Parent.y);	//way-5
		System.out.println(Child.y); 	//way-6
		// Similarly the memberFunctions are also be called in this manner and all the data members can be accessed inside these methods directly from the class itself.
		
		Child.displayStaticData();

	}

}
