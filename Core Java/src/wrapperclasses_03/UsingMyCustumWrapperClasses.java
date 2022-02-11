package wrapperclasses_03;

public class UsingMyCustumWrapperClasses {

	public static void main(String[] args) {
		//premitive data type to wrapper class object
		int x = 33000;	// premitive dataType
		MyInteger iObj = new MyInteger(x); //now x will be represented by Wrapperclass object iObj
		
		System.out.println("Value of the given premitive value is: "+iObj.getValue());
		System.out.println("byte conversion of the given premitive value is: "+(byte)iObj.getValue());
		System.out.println("byte conversion of the given premitive value is: "+(short)iObj.getValue());
		System.out.println("byte conversion of the given premitive value is: "+(long)iObj.getValue());
		System.out.println("byte conversion of the given premitive value is: "+(float)iObj.getValue());
		System.out.println("byte conversion of the given premitive value is: "+(double)iObj.getValue());
		// Here the programmer has to type caste the value to get the desired type value.
		// so sun has provided predefined methods to get the values. I have implemented those methods in MyNumber class. Now we just have to call them.
		System.out.println();
		System.out.println("byte conversion of the given premitive value is: "+iObj.byteValue());
		System.out.println("short conversion of the given premitive value is: "+iObj.shortValue());
		System.out.println("byte conversion of the given premitive value is: "+iObj.longValue());
		System.out.println("long conversion of the given premitive value is: "+iObj.floatValue());
		System.out.println("float conversion of the given premitive value is: "+iObj.doubleValue());
		
		
		//similarly other wrapper classes also implemented
		
	}

}
