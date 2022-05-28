package collection.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		Temp t = new Temp();
		WeakHashMap m = new WeakHashMap();
		m.put(t, "Sibaram");
		System.out.println(m);
		t = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(m);
	}

}
class Temp{
	public String toString() {
		return "Temp class";
	}
	public void finalize() {
		System.out.println("Finalize method is called...");
	}
}