package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("Sibaram", 101);
		m.put("Jeet", 102);
		m.put("Debasish", 103);
		
		System.out.println(m);	//{key=value, key=value,...}
		System.out.println(m.put("Sibaram", 105));	//returns old value
		
		Set st = m.keySet();
		System.out.println(st); // collection view of Map object will display keys of each entry
		
		Collection c = m.values();
		System.out.println(c); // collection view of Map object will display values of each entry
		
		Set s = m.entrySet();
		// logic to display and change "Entry" data of a map object 
		Iterator iter = s.iterator();
		while(iter.hasNext()) {
			Map.Entry ent = (Map.Entry)iter.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
			if(ent.getKey().equals("Sibaram"))
					ent.setValue(10000);
		}
		System.out.println(m);
	}

}
