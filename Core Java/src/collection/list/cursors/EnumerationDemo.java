package collection.list.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(45);
		v.add("A");
		v.add(null);
		v.add("A");
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
}
