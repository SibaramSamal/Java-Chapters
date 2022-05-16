package collection.vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());	//initial capacyty is 10 budefault
		for(int i=0 ; i<=10 ; i++)
			v.addElement(i);
		System.out.println(v);
		System.out.println(v.capacity());	// increased vector object size is initial size * 2
	}
}
