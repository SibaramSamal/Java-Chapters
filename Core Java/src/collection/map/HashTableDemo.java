package collection.map;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();	// default buckets = 11
		h.put(new MyTemp(5), "Value 1");	// 5 = Value 1
		h.put(new MyTemp(12), "Value 2");	// 12 = Value 2
		h.put(new MyTemp(15), "Value 3");	// 15 = Value 3
		h.put(new MyTemp(4), "Value 4");	// 4 = Value 4
		h.put(new MyTemp(18), "Value 5");
		System.out.println(h);	// {18=Value 5, 5=Value 1, 4=Value 4, 15=Value 3, 12=Value 2}
	}

}
class MyTemp{
	int i;
	public MyTemp(int i) {
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
}