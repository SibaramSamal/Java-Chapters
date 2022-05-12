package innerclass;

class Outer{
	int x;
	static int y;
	static class Inner{
		int x;
		static int y = 50;
		void display() {
			System.out.println(this.getClass());
			System.out.println(y);
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		Outer.Inner iner = new Outer.Inner(); //creating inner class object
		iner.display();
		Outer o = new Outer();
		System.out.println(o.x);
	}
}

/*
  
  Static nested class :
	- Acts as static data member. So all the keywords can be used that are applicable for a static data member.
	- These classes can have both static and non-static members.
	- In can't acces the non-static members of it's outer class but can access static members.
	- It's object can be created with out creating the object of it's outer class.
	- As static inner classes acts as independent class, they can be inherit, can extend other class or implement interfaces.

  
 */