package wrapperclasses_03;

public class PremitiveDataToWrapperClassObj {
	//we have a premitive data type let say int type. To represent it as an object we can do it with the help of wrapper class
	public static void main(String[] args) {
		int x = 33000;
		Integer iObj = new Integer(x);
		System.out.println("byte conversion of the given premitive value is: "+iObj.byteValue());
		System.out.println("short conversion of the given premitive value is: "+iObj.shortValue());
		System.out.println("byte conversion of the given premitive value is: "+iObj.longValue());
		System.out.println("long conversion of the given premitive value is: "+iObj.floatValue());
		System.out.println("float conversion of the given premitive value is: "+iObj.doubleValue());
		
		
		/*
		System.out.println("byte conversion of the given premitive value is: "+iObj.charValue());
		System.out.println("byte conversion of the given premitive value is: "+iObj.booleanValue());
		
		charValue() and booleanValue() are invalid for a numeric type,so these methods are undefined in numeric type wrapper classes.
		*/
		
		
	}
}
