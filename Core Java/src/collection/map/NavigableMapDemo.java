package collection.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<Integer,Employee> m = new TreeMap<Integer,Employee>();
		m.put(101,new Employee(14,"Sibaram Samal"));
		m.put(102,new Employee(15,"Jeet Bisoi"));
		m.put(103,new Employee(3,"Debasish Panigrahy"));
		
		System.out.println(m); // {101=14,Sibaram Samal, 102=15,Jeet Bisoi, 103=3,Debasish Panigrahy}
		System.out.println(m.ceilingEntry(100)); //101=14,Sibaram Samal
	}
}
class Employee{
	int eid;
	String ename;
	public Employee(int eid,String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	public String toString() {
		return eid+","+ename;
	}
}