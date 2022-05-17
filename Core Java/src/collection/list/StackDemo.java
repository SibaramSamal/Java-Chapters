package collection.list;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(56);
		st.push("A");
		st.push("569A");
		System.out.println(st.peek());
		st.add("Sibaram");
		System.out.println(st.search("Sibaram"));
		st.pop();
		System.out.println(st);
	}
}
