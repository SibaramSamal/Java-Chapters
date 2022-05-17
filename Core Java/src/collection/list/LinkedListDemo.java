package collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("a");
		list.add(10);
		System.out.println(list);
		list.add("Software");
		list.addFirst("First");
		System.out.println(list);
		list.set(0, "1st");
		System.out.println(list);
	}
}
