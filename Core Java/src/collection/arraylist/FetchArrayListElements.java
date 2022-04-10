package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	Aim: Testing of different ways of fetching arrayList elements
 	1) Using foor loop
 	2) using for each loop
 	3) iterator()
 	4) listiterator
 	5) enumeration
 
 * */
public class FetchArrayListElements {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add(15);
		obj.add("Sibaram");
		obj.add(56.3);
		obj.add('A');
		obj.add(5l);
		obj.add(15);
		
		//printing these elements using for loop
		System.out.println("Fetching elements using for loop:");
		for(int i=0 ; i<obj.size() ; i++) {
			System.out.println(obj.get(i));
		}
		//printing elements using for each loop
		System.out.println("Fetching elements using for each loop:");
		for(Object o : obj) {
			System.out.println(o);
		}
		//using iterator() which will return Iterator type reference
		System.out.println("Using iterator():");
		Iterator itr = obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}