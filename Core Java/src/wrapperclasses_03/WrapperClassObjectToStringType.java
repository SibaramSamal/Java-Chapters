package wrapperclasses_03;

public class WrapperClassObjectToStringType {
	public static void main(String[] args) {
		//step-1 declare and initialise a wrapper class object
		Integer i = Integer.valueOf(56);
		//Now we will store this value to a string type object.
		//String str = i; //we can't directly assign in to it
		String str = i.toString();
		System.out.println(str);
	}
}
