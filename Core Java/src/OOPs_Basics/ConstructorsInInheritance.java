package OOPs_Basics;


//Aim: to test how constructors works in inheritance hirarchy

class Vehicle{
	/*Vehicle() {
		super();	//calls it's parent class(Object class's) default contructor
		System.out.println("Vehicle 0 param constructor");
	}*/
	Vehicle(int x){
		System.out.println("Vehicle 1 param constructor");
	}
	
	/*
	 	Here we have created parameterized constructor.So JVM won't create default one. So when it's child
	 	class object will create, at that time JVM implecitely place super() in the first line of it's 
	 	constructor, which will try to invoke o param constructor which is not there. So it will give error.
	 *	To solve this, we have to explecitely add parameterized super() in it's all child class constructors
	 */
}
class Car extends Vehicle{
	Car(){
		this(5,"h");
		//super(5);	//calls it's parent class(Vehicle class's) default contructor
		System.out.println("Car 0 param constructor");
	}
	Car(int x,String y){
		super(5);
		//this();
		System.out.println("Car 2 param constructor");
	}
}

public class ConstructorsInInheritance {
	public static void main(String[] args) {
		Car c = new Car();	// Car class must have 0 param constructor either implecitely or explecitely	

	}
}


/*			Explanation
 *	By default JVM places default constructor in each class in which it places "super()" in the first line
 	then init block lines. So it first invokes it's immidiate parent class default constructor.
 *	As we know, if we make parameterized constructor, JVM won't create default constructor but places 
 	"super()" in the first line of our parameterized constructor.
 *	So it is mendatory to place a parameterized super() in it's child class inorder to solve erro 




*/
