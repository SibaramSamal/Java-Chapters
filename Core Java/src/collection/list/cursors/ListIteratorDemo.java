package collection.list.cursors;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Venky");
		v.add("Balakrishna");
		v.add("chiru");
		v.add("nag");
		ListIterator l = v.listIterator();
		while(l.hasNext()) {
			String nm = (String)l.next();
			if(nm.equals("Balakrishna"))
				l.remove();
			else if(nm.equals("chiru"))
				l.set("Chiranjivi");
			else if(nm.equals("nag"))
				l.add(null);
		}
		System.out.println(v); //[ Venky,Chiranjivi,nag,null ]
	}
}
