package collection.list.cursors;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(45);
		l.add("Sibaram Samal");
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
