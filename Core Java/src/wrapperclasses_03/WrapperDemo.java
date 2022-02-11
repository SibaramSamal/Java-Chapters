package wrapperclasses_03;

public class WrapperDemo {
	public static void main(String[] args) {
		Integer i = new Integer(5); //wrapping or boxing. After java 4, it becomes automatically means Integer i = 5 also o the same thing.
		int i5 = i.intValue(); //unwrapping or unboxing
		System.out.println(i5); //it will unbox the value 5 from i2 reference variable
		
		Integer i2 = new Integer(5);
		System.out.println(i == i2); // false
		
		Integer i3 = Integer.valueOf(6);	//this method uses objectPooling concept
		Integer i4 = Integer.valueOf(6);
		System.out.println(i3 == i4); //true
				
	}
}
/*
the main difference between constructor based instanciation and method based creation is, valueOf() is maintaining internal cache array. If an object with that value is already present, then it won't create another new object rather it will assign that object reference.
*/