package collection.set;

import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();	//here empty constructor is used, so default natural sorting order must be followed
		t.add("A");
		t.add("K");
		t.add("Z");
		t.add("R");
		//t.add(new Integer(15));	// java.lang.ClassCastException:
		 	
		//If we try to insert null in non-empty TreeSet,it will give null pointer exception
		//t.add(null);	//java.lang.NullPointerException		
		
		System.out.println(t); //[A,K,R,Z]
	}
}
