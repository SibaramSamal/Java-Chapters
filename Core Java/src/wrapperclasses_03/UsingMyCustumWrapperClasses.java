package wrapperclasses_03;

public class UsingMyCustumWrapperClasses {

	public static void main(String[] args) {
		//premitive data type to wrapper class object
		int x = 25688;
		MyInteger iObj = new MyInteger(x);
		System.out.println("Value of the given premitive value is: "+iObj.getValue());
	}

}
