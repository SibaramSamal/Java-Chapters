package collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator());
		t.put(108, "ZZZ");
		t.put(101, "XXX");
		t.put(103, "HHH");
		System.out.println(t);
	}
}
class MyComparator implements Comparator{
//Comparator is implemented inorder to achieve customized sorting
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
	
}
