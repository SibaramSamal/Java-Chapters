package wrapperclasses_03;

public class ComparingWrapperClassObjects {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(5);
		Integer i2 = Integer.valueOf(8);
		System.out.println(i1 == i2);
		//System.out.println(i1.equals(Byte.valueOf(5)));
		//Only two equal types of objects can be comparable with equals().
		//Integer object and Byte objects are not comparable because they are siblings.
		
	}

}
