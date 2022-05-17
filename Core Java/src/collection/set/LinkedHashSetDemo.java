package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		// rule: no duplicate values allowed but insertion order maintained
		hs.add("A");
		hs.add(45);
		hs.add(null);
		System.out.println(hs.add(45));	//false because of duplicate entry
		System.out.println(hs);
	}
}
