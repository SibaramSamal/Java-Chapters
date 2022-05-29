package collection.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(108, "ZZZ");
		t.put(101, "XXX");
		t.put(103, "HHH");
		// t.put(null, "ABC"); Null pointer exceptionn because of null
		//t.put("104", "GGG");	// ClassCasteException
		System.out.println(t);	// {101=XXX,103=HHH,108=ZZZ}
		// by default default sorting order is performed i.e in assending order
	}

}
