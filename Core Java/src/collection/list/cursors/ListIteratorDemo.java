package collection.list.cursors;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		ListIterator l = v.listIterator();
		v.addElement("Venky");
		v.add("Balakrishna");
		v.add("chiru");
		v.add("nag");
		while(l.hasNext()) {
			String nm = (String)l.next();
			if(nm.equals("Balakrushna"))
				l.remove();
			else if(nm.equals("chiru"))
				l.set("Chiranjivi");
			else if(nm.equals("nag"))
				l.add(null);
		}
		System.out.println(l);
	}
}
