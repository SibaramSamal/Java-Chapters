package identifiers_02;

/**
 * Aim: I want to convert 
 * 
 * 
 * 
 */

public class SU_IntTypeCasting {
	static void displayInt(int x) {
		System.out.println("Int converted value is:"+x);
	}
	static void displayByte(byte x) {
		System.out.println("Byte converted value is:"+x);
	}

	public static void main(java.lang.String[] args) {
		SU_IntTypeCasting.displayInt((int)4_294_967_3000l);
		/*
		  By deault 2147483700 is considered as int value, but it is exceed the range of regular int
		   range. So we have to pass it as long type. Then our type caste operation will be performed
		    on that number and conver into it's appropreate int value.
		 */
		SU_IntTypeCasting.displayByte((byte)560);
	}
}
