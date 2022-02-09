package introduction_01;

public class CallingMethodsOfMainMethodLessClass {
	public static void main(String[] args) {
		System.out.println("Inside main() of caller class");
		NonEmptyClassWithoutMain.displayClassDetails();
	}
}



