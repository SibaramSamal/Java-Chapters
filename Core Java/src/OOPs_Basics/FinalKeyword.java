package OOPs_Basics;
/*
 Aim: To test different use of final keyword in different places
1) Members can't be re assigned
2) Classes can't be inherit
3) methods can't be overriden
*/
class Parent{
//final class Parent{	final class can't be parent of other class
	//final int x;  The blank final field x may not have been initialize
	// we can only initialize at declaration time
	final void finalTest() {
	//final void finalTest() {	=> Cannot override the final method from Parent
		
	}
}
class Child extends Parent{
	/*void finalTest() {
		can't override, because parent class method is final
	}*/
}
public class FinalKeyword {

	public static void main(String[] args) {
		

	}

}
