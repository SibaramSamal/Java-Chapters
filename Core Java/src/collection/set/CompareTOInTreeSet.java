package collection.set;

import java.util.TreeSet;

public class CompareTOInTreeSet {
	/*
		compareTo(Object obj) is the only method of Comparable interface
		eg. obj1.compareTo(obj2) will return -ve value if obj1 comes before obj2.
		- return +ve value if obj1 comes after obj2.
		- return 0 if obj1 equals to obj2.
	*/
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		System.out.println("D".compareTo("S")); // -ve value
		System.out.println("Z".compareTo("F"));
		System.out.println("D".compareTo("D"));
	}
	
}
