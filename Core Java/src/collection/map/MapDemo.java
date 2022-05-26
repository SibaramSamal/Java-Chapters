package collection.map;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Sibaram", 101);
		m.put("Jeet", 102);
		m.put("Debasish", 103);
		
		System.out.println(m);	//{key=value, key=value,...}
		System.out.println(m.put("Sibaram", 105));	//returns old value
	}

}
