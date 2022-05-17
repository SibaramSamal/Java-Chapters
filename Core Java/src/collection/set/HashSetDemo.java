package collection.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		// rule: duplecates are not allowed and insertion order is not preserved.
		hs.add("A");
		hs.add(45);
		hs.add(null);
		System.out.println(hs.add(45));	//false because of duplicate entry
		System.out.println(hs);
	}
}
