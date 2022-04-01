package reusability;

/**
 * @author Sibaram
 * Aim:
 	1. To understand the data hiding case
 	2. Solutions(different approaches to solve it) 
 */
class Parent0{
	int x = 50;
}
class Parent1 extends Parent0{
	int x = 100;
}
class Child1 extends Parent1{
	int x = 150;
	void showData() {
		System.out.println(x); 	//will print 150
		// If we want to use parent class data member-"x" here, we have to follow these approaches below
		//Approach 1: By creating Parent class object here
		Parent1 p = new Parent1();
		System.out.println(p.x);
		
		//Approach 2: Through super keyword
		System.out.println(super.x);
		
		//we can't get Parent0's data members through super. We have to get it through it's object or through upcasting concept.
		Parent0 pp = new Parent0();
		System.out.println(pp.x);
	}
}
public class DataHiding {
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.showData();
	}
}
