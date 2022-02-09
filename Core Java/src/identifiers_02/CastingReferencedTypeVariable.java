package identifiers_02;

/*
			java.lang.Object
					|
				A		D
				|
				B
				|
				C	
		To caste referenced type variables, the variables must be compatible to each other. Means, they must be satisfying IS-A relationship
		Here A,B,C,D are the child classes of Object class. So Object class reference variable can hold all of it's child class objects but viseversa is not possible.
*/
class A{}
class B extends A{}
class C extends B{}
class D{}
public class CastingReferencedTypeVariable {
	public static void main(java.lang.String[] args) {
		// Testing compatibility
		Object ob1 = new Object();
		Object ob2 = new A();
		Object ob3 = new B();
		Object ob4 = new C();
		Object ob5 = new D();
		
		B bObj1 = (B)new A(); 	//can't convert from A to B but B to A is possible
		//D dObj = new A();//type mismatch. We can't even typecaste it.
		D dobj2 =   (D) ob2; // but in this case we are trying to assign Object type variable. So it is allowing to typecaste but at runtime it will give error java.lang.ClassCastException
		System.out.println(dobj2);
	}
}
