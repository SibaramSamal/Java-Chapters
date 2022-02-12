package wrapperclasses_03;

public class PremitiveStringTypeToWrapperClassObj {

	public static void main(String[] args) {
		Byte b = Byte.parseByte("40");
		//Byte b2 = Byte.parseByte("128");	//Runtime error java.lang.NumberFormatException as 128 is out of range of byte value
		System.out.println("b="+b);
			
		//Integer i = Integer.parseInt("10.2");//Runtime error java.lang.NumberFormatException as 10.2 is out of range of int value
		
		Boolean bool = Boolean.parseBoolean("tRue");
		System.out.println(bool); //o/p - true as irrespective of case, if the input string is true, it return true otherwise false.
		Boolean bool2 = Boolean.parseBoolean("Sibaram");
		System.out.println(bool2); // o/p - false
		
	}
}
