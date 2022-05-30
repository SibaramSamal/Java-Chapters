package collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet t = new TreeSet();
		t.add(1000);
		t.add(1500);
		t.add(800);
		t.add(3000);
		t.add(4000);
		System.out.println(t);
		System.out.println(t.ceiling(900));	//1000
		System.out.println(t.floor(3000)); //1500
		
		/*
		 * ceilling(e) means smallest element among all the elements greater or equals from e 
		 * floor(e) means biggest elemet among all the smallest or equals elemets from e 
		 * 
		 */
	}
}
